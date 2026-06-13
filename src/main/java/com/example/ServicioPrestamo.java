/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example;

/**
 *
 * @author User
 */
public class ServicioPrestamo {
    public double calcularCuotaMensual(double monto, int cuotas) {
        return monto / cuotas;
    }

    public boolean esAprobado(double ingresoMensual, double cuotaMensual) {
        return cuotaMensual <= (ingresoMensual * 0.30);
    }

    public String obtenerResultado(boolean aprobado) {
        return aprobado ? "Préstamo aprobado" : "Préstamo rechazado";
    }
}
