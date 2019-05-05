
package clase_automovil;

public class class_motor {
    private int numero_serie;
    private int potencia;
    private int numero_cilindros;

    public class_motor(int numero_serie, int potencia, int numero_cilindros) {
        this.numero_serie = numero_serie;
        this.potencia = potencia;
        this.numero_cilindros = numero_cilindros;
    }

    public int getNumero_serie() {
        return numero_serie;
    }

    public int getPotencia() {
        return potencia;
    }

    public int getNumero_cilindros() {
        return numero_cilindros;
    }

    public void setNumero_serie(int numero_serie) {
        this.numero_serie = numero_serie;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public void setNumero_cilindros(int numero_cilindros) {
        this.numero_cilindros = numero_cilindros;
    }
    
    
}
