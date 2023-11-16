package uni.edu.pe.tiendaback.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import uni.edu.pe.tiendaback.dto.Informe;

import java.sql.*;

@Repository
public class EnviarInformeDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    private Connection conexion;

    // Se define un método para iniciar la conexión con la base de datos por medio de un try catch
    private void obtenerConexion(){
        try {
            this.conexion = jdbcTemplate.getDataSource().getConnection();
        } catch (SQLException throwables) {
            throw new RuntimeException(throwables);
        }
    }
    // Se define otro método para cerrar la conexión con la base de datos por medio de otro try catch
    private void cerrarConexion(ResultSet resultado, Statement sentencia){
        try {
            if(resultado != null) resultado.close();
            if(sentencia != null) sentencia.close();
            this.conexion.commit();
            this.conexion.close();
            this.conexion = null;
        } catch (SQLException throwables) {
            throw new RuntimeException(throwables);
        }
    }
    public Informe enviarInforme(Informe informe) {
        try {
            obtenerConexion();
            String sql = "INSERT INTO informe(id_informe, id_usuario, tipo, asunto, descripcion, estado) VALUES(?, ?, ?, ?, ?, ?);";
            PreparedStatement st = conexion.prepareStatement(sql);
            st.setInt(1, informe.getId_informe());
            st.setInt(2, informe.getId_usuario());
            st.setString(3, informe.getTipo());
            st.setString(4, informe.getAsunto());
            st.setString(5, informe.getDescripcion());
            st.setString(6, "Enviado");

            st.executeUpdate();

            st.close();
            cerrarConexion(null, st);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return informe;
    }
}

