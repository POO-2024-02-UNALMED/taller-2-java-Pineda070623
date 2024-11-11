package test;

public class Asiento {
    static String[] colores= {"rojo", "verde", "amarillo", "negro", "blanco"};

    String color;
    int precio;
    int registro;

    void cambiarColor(String color) {
    for (String c :colores) {
        if (c.equals(color)) {
            this.color=color;
            break;
        }
    }
  }
}
    
    