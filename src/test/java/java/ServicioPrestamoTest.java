/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.example.ServicioPrestamo;
/**
 *
 * @author User
 */
public class ServicioPrestamoTest {
     private final ServicioPrestamo servicio = new ServicioPrestamo();

    @Test
    public void testCalcularCuotaMensual() {
        assertEquals(600.0, servicio.calcularCuotaMensual(6000, 10), 0.001);
    }

    @Test
    public void testPrestamoAprobado() {
        assertTrue(servicio.esAprobado(3000, 600));
    }

    @Test
    public void testPrestamoRechazado() {
        assertFalse(servicio.esAprobado(3000, 1000));
    }

    @Test
    public void testMensajeAprobado() {
        assertEquals("Préstamo aprobado", servicio.obtenerResultado(true));
    }

    @Test
    public void testMensajeRechazado() {
        assertEquals("Préstamo rechazado", servicio.obtenerResultado(false));
    }
}
