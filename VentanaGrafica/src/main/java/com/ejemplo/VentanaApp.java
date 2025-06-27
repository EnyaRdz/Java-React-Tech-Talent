package com.ejemplo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaApp {

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            JFrame frame = new JFrame("Mi Ventana Gráfica");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cierra completamente la app
            frame.setSize(400, 300); // Tamaño inicial
            frame.setResizable(true); // Permite cambiar el tamaño
            frame.setLocationRelativeTo(null); // Centrar en pantalla

            JLabel etiqueta = new JLabel("Hola, esta es una etiqueta", JLabel.CENTER);
            frame.add(etiqueta);

            frame.setVisible(true);
        });
    }
}