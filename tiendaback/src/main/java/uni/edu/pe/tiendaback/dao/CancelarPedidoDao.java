package uni.edu.pe.tiendaback.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.*;

@Repository
public class CancelarPedidoDao {
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

    public String cancelarPedido(int id_objeto) {
        try {
            obtenerConexion();
            String sql = "DELETE FROM pedido \n" +
                    "WHERE id_pedido} = ? \n" +
                    "AND id_usuario = 1;";
            PreparedStatement st = conexion.prepareStatement(sql);
            st.setInt(1, id_objeto);
            st.executeUpdate();
            st.close();
            cerrarConexion(null, st);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "Eliminado";
    }
}
