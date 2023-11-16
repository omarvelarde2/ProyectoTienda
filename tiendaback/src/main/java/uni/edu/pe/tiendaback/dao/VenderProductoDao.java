package uni.edu.pe.tiendaback.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import uni.edu.pe.tiendaback.dto.Producto;

import java.sql.*;

@Repository
public class VenderProductoDao {
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
    public Producto venderProducto(Producto producto) {
        try{
            obtenerConexion();
            String sql = "INSERT INTO producto(id_producto, id_vendedor, nombre, descripcion, precio) \n" +
                    "VALUES(?, ?, ?, ?, ?);";
            PreparedStatement st = conexion.prepareStatement(sql);
            st.setInt(1, producto.getId_producto());
            st.setInt(2, producto.getId_vendedor());
            st.setString(3, producto.getNombre());
            st.setString(4, producto.getDescripcion());
            st.setDouble(5, producto.getPrecio());

            st.executeUpdate();
            st.close();
            cerrarConexion(null, st);
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
        return producto;
    }
}
