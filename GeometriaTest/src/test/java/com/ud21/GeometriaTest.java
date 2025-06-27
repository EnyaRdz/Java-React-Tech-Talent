package com.ud21;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GeometriaTest {

    Geometria geo = new Geometria();

    @Test
    void testAreaCuadrado() {
        int resultado = geo.areacuadrado(5);
        assertEquals(25, resultado);
    }

    @Test
    void testAreaCirculo() {
        double resultado = geo.areaCirculo(3);
        assertEquals(28.2743, resultado, 0.0001);  // delta por decimales
    }

    @Test
    void testAreaTriangulo() {
        int resultado = geo.areatriangulo(4, 6);
        assertEquals(12, resultado);
    }

    @Test
    void testAreaRectangulo() {
        int resultado = geo.arearectangulo(3, 7);
        assertEquals(21, resultado);
    }

    @Test
    void testAreaPentagono() {
        int resultado = geo.areapentagono(6, 4);
        assertEquals(12, resultado);
    }
}