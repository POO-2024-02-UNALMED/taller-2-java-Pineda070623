package test;

import java.util.ArrayList;

public class Auto {
    String modelo;
    int precio;
    ArrayList<Asiento> asientos;
    String marca;
    Motor motor;
    int registro;
    static int cantidadCreados = 0;

    public Auto(String modelo, int precio, String marca, Motor motor, int registro) {
        this.modelo = modelo;
        this.precio = precio;
        this.marca = marca;
        this.motor = motor;
        this.registro = registro;
        this.asientos = new ArrayList<>();
        cantidadCreados++;
    }

    // Método para agregar asientos al Auto
    public void agregarAsiento(Asiento asiento) {
        asientos.add(asiento);
    }

    // Método cantidadAsientos
    public int cantidadAsientos() {
        int contador = 0;
        for (Asiento asiento : asientos) {
            if (asiento != null) {
                contador++;
            }
        }
        return contador;
    }

    // Método verificarIntegridad
    public String verificarIntegridad() {
        if (motor.registro != this.registro) {
            return "Las piezas no son originales";
        }
        for (Asiento asiento : asientos) {
            if (asiento != null && asiento.registro != this.registro) {
                return "Las piezas no son originales";
            }
        }
        return "Auto original";
    }
}