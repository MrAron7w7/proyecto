/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.example.ServicioNotas;

/**
 *
 * @author User
 */
public class ServicioNotasTest {
     private final ServicioNotas servicio = new ServicioNotas();

    @Test
    public void testCalcularPromedio() {
        double promedio = servicio.calcularPromedio(15, 14, 16, 17);
        double esperado = 15*0.20 + 14*0.20 + 16*0.25 + 17*0.35;
        assertEquals(esperado, promedio, 0.001);
    }

    @Test
    public void testEstudianteAprobado() {
        assertEquals("Aprobado", servicio.obtenerEstado(15));
    }

    @Test
    public void testEstudianteDesaprobado() {
        assertEquals("Desaprobado", servicio.obtenerEstado(12));
    }

    @Test
    public void testRequiereRecuperacion() {
        assertTrue(servicio.requiereRecuperacion(11));
    }

    @Test
    public void testNoRequiereRecuperacion() {
        assertFalse(servicio.requiereRecuperacion(8));
    }
}
