package uni.edu.pe.tiendaback.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import uni.edu.pe.tiendaback.dto.Usuario;

import java.sql.*;

@Repository
public class CrearCuentaDao {
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

    public Usuario crearCuenta(Usuario usuario) {
        try{
            obtenerConexion();
            String sql = "INSERT INTO usuario(id_usuario, nombre, tarjeta, saldo, telefono, direccion) \n" +
                    "VALUES(?, ?, ?, ?);";
            PreparedStatement st = conexion.prepareStatement(sql);
            st.setInt(1, usuario.getId_usuario());
            st.setString(2, usuario.getNombre());
            st.setInt(3, usuario.getTelefono());
            st.setString(4, usuario.getDireccion());

            st.executeUpdate();
            st.close();
            cerrarConexion(null, st);
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
        return usuario;
    }
}
