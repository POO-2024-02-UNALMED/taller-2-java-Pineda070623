package test;

public class Asiento {
    String color;
    int precio;
    int registro;

    public Asiento(String color, int precio, int registro) {
        this.color = color;
        this.precio = precio;
        this.registro = registro;
    }

    // Método cambiarColor
    public void cambiarColor(String nuevoColor) {
        if (nuevoColor.equals("rojo") || nuevoColor.equals("verde") || nuevoColor.equals("amarillo") ||
            nuevoColor.equals("negro") || nuevoColor.equals("blanco")) {
            this.color = nuevoColor;
        }
    }
}