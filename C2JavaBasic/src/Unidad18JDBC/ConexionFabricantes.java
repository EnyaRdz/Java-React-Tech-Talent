package Unidad18JDBC;
import java.sql.*;

public class ConexionFabricantes {
    public static void main(String[] args) {
        // Configura la conexión
        String url = "jdbc:mysql://localhost:3306/tiendainformatica";
        String user = "root"; // o tu usuario de MySQL
        String password = ""; // tu contraseña de MySQL (si tienes)

        try (Connection conexion = DriverManager.getConnection(url, user, password)) {
            System.out.println("✅ Conexión exitosa a la base de datos Tiendainformatica.");

            // Ejemplo de inserción
            String sql = "INSERT INTO fabricantes (Nombre) VALUES ('Xiaomi')";
            Statement stmt = conexion.createStatement();
            stmt.executeUpdate(sql);

            System.out.println("✔️ Datos insertados correctamente.");
        } catch (SQLException e) {
            System.out.println("❌ Error de conexión: " + e.getMessage());
        }
    }
}
