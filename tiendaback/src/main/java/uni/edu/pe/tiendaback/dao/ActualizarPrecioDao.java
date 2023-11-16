package uni.edu.pe.tiendaback.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import uni.edu.pe.tiendaback.dto.ObjUs;

import java.sql.*;

@Repository
public class ActualizarPrecioDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    private Connection conexion;
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
    public ObjUs actualizarPrecio(ObjUs objus) {
        try {
            obtenerConexion();
            String sql = "UPDATE producto AS pro \n" +
                    "INNER JOIN usuario AS us \n" +
                    "ON pro.id_vendedor = us.id_usuario \n" +
                    "SET pro.precio = ? \n" +
                    "WHERE pro.nombre LIKE ?;";
            PreparedStatement st = conexion.prepareStatement(sql);
            st.setDouble(1, objus.getPrecio());
            st.setString(2, objus.getNombre());
            st.executeUpdate();
            st.close();
            cerrarConexion(null, st);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return objus;
    }
}
