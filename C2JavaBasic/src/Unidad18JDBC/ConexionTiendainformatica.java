package Unidad18JDBC;

import java.sql.*;

public class ConexionTiendaInfo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/tiendainformatica";
        String user = "root";
        String password = "";

        try (Connection conexion = DriverManager.getConnection(url, user, password)) {
            System.out.println("✅ Conexión exitosa a TiendaInformatica.");

            Statement stmt = conexion.createStatement();

            // 1. Insertar fabricante
            String insertFabricante = "INSERT INTO fabricantes (Nombre) VALUES ('Xiaomi')";
            try {
                stmt.executeUpdate(insertFabricante);
                System.out.println("✔️ Fabricante insertado.");
            } catch (SQLIntegrityConstraintViolationException e) {
                System.out.println("ℹ️ El fabricante ya existe.");
            }

            // 2. Insertar artículo asociado
            String insertArticulo = "INSERT INTO articulos (Nombre, Precio, Fabricante) VALUES ('Xiaomi Pad 6', 300, 1)";
            stmt.executeUpdate(insertArticulo);
            System.out.println("✔️ Artículo insertado.");

        } catch (SQLException e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
    }
}
