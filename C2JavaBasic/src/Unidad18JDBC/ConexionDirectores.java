package Unidad18JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionDirectores {
    public static void main(String[] args) {
        // Configura la conexión
        String url = "jdbc:mysql://localhost:3306/directoresdespachos";
        String user = "root"; // o tu usuario de MySQL
        String password = ""; // tu contraseña de MySQL (si tienes)

        try (Connection conexion = DriverManager.getConnection(url, user, password)) {
            System.out.println("✅ Conexión exitosa a la base de datos Directoresdespachos.");

            // Ejemplo de inserción
            String sql = "INSERT INTO directores (dni, nombre_completo, dni_jefe, despacho) VALUES ('11111111A', 'Luis Pérez', '83927248F', 111)";
            Statement stmt = conexion.createStatement();
            stmt.executeUpdate(sql);

            System.out.println("✔️ Datos insertados correctamente.");
        } catch (SQLException e) {
            System.out.println("❌ Error de conexión: " + e.getMessage());
        }
    }
}