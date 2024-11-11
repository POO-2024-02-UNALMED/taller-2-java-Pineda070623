package test;

public class Motor {
    static String[] tiposPosibles ={"electrico", "gasolina"};

    int numeroCilindros;
    String tipo;
    int registro;
    
    void cambiarRegistro(int registro) {
        this.registro = registro;
    }

    void asignarTipo(String tipo) {
            for (String t : tiposPosibles) {
        if (t.equals(tipo)) {
            this.tipo = tipo;
            break;
        }
    }
    }
}
