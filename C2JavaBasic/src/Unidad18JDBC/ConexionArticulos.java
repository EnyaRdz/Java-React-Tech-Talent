package Unidad18JDBC;
import java.sql.*;

public class ConexionArticulos {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/tiendainformatica";
        String user = "root";
        String password = ""; // tu contraseña

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            System.out.println("✅ Conexión exitosa a TiendaInformatica.");

            String sql = "INSERT INTO articulos (Nombre, Precio, Fabricante) VALUES ('Ratón inalámbrico', 25, 11)";
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);

            System.out.println("✔️ Artículo insertado correctamente.");
        } catch (SQLException e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
    }
}
