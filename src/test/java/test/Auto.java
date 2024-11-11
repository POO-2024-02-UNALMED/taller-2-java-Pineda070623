package test;

public class Auto {
    static int cantidadCreados;

    String modelo;
    int precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    int registro;

    int cantidadAsientos() {
        int contador = 0;
        for (Asiento i: this.asientos) {
            if (i instanceof Asiento) {
                ++contador;
            }
        }
        return contador;
    }

    String verificarIntegridad() {
        for (Asiento i: this.asientos) {
            if (i instanceof Asiento) {
                if (i.registro != this.motor.registro) {
                    return "Las piezas no son originales";
                } else if (i.registro !=this.registro) {
                    return "Las piezas no son originales";
                } else if (this.registro != this.motor.registro) {
                    return "Las piezas no son originales";
                }
            }
        }
        return "Auto original";
    }
}


                
            