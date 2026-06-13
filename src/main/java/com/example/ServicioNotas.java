/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example;

/**
 *
 * @author User
 */
public class ServicioNotas {
    public double calcularPromedio(double pc1, double pc2, double parcial, double finalExamen) {
        return pc1 * 0.20 + pc2 * 0.20 + parcial * 0.25 + finalExamen * 0.35;
    }

    public String obtenerEstado(double promedio) {
        if (promedio >= 13) {
            return "Aprobado";
        }
        return "Desaprobado";
    }

    public boolean requiereRecuperacion(double promedio) {
        return promedio >= 10 && promedio <= 12.99;
    }
}
