package uni.edu.pe.tiendaback.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import uni.edu.pe.tiendaback.dto.RptaPedido;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ObtenerPedidosDao {
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

    // Haciendo uso de los métodos obtener y cerrar conexión además de un extractReport() definido al final
    // Se obtiene los pedidos en una lista con un SELECT gracias a un while(.next), ejecutando el Statement
    public List<RptaPedido> obtenerPedidos() {
        List<RptaPedido> list = new ArrayList<>();
        String sql = " SELECT * \n" +
                "FROM usuario us \n" +
                "INNER JOIN pedido ped \n" +
                "ON us.id_usuario = ped.id_usuario \n" +
                "INNER JOIN producto pro \n" +
                "ON pro.id_producto = ped.id_producto;";
        try {
            obtenerConexion();
            Statement sentencia = conexion.createStatement();
            ResultSet resultado = sentencia.executeQuery(sql);
            while (resultado.next()){
                list.add(extractReport(resultado));
            }
            cerrarConexion(resultado,sentencia);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }

    // Método para extraer un único reporte de pedido
    private RptaPedido extractReport(ResultSet resultado) throws SQLException {
        RptaPedido report = new RptaPedido(
                resultado.getInt("id_pedido"),
                resultado.getInt("id_usuario"),
                resultado.getInt("id_producto"),
                resultado.getString("estado")
        );
        return report;
    }
}
