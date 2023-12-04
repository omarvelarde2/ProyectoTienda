package uni.edu.pe.tiendaback.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import uni.edu.pe.tiendaback.dto.Pedido;

import java.sql.*;

@Repository
public class RealizarPedidoDao {
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

    public Pedido realizarPedido(Pedido pedido) {
        try{
            obtenerConexion();
            String sql = "INSERT INTO pedido(id_pedido, id_producto, id_usuario, estado, fecha) \n" +
                    "VALUES(?, ?, ?, ?);";
            PreparedStatement st = conexion.prepareStatement(sql);
            st.setInt(1, pedido.getId_pedido());
            st.setInt(2, pedido.getId_producto());
            st.setInt(3, pedido.getId_usuario());
            st.setString(4, "Nuevo");

            st.executeUpdate();
            st.close();
            cerrarConexion(null, st);
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
        return pedido;
    }
}