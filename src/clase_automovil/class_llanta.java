
package clase_automovil;

public class class_llanta {
    private int rodada;
    private String marca;
    private String tipoLlanta;

    public class_llanta(int rodada, String marca, String tipoLlanta) {
        this.rodada = rodada;
        this.marca = marca;
        this.tipoLlanta = tipoLlanta;
    }

    public int getRodada() {
        return rodada;
    }

    public void setRodada(int rodada) {
        this.rodada = rodada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipoLlanta() {
        return tipoLlanta;
    }

    public void setTipoLlanta(String tipoLlanta) {
        this.tipoLlanta = tipoLlanta;
    }
    
    
}
