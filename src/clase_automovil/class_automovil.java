
package clase_automovil;

public class class_automovil {
    private int idAutomovil;
    private int identificador;
    private String tipoAutomovil;
    private double precioRentaDiario;
    private boolean status;
    private class_motor motor;
    private class_llanta[] llantas;
    private class_faros[] faros;

    public class_automovil() {
    }

    public class_automovil(int idAutomovil, int identificador, String tipoAutomovil, double precioRentaDiario, boolean status, class_motor motor) {
        this.idAutomovil = idAutomovil;
        this.identificador = identificador;
        this.tipoAutomovil = tipoAutomovil;
        this.precioRentaDiario = precioRentaDiario;
        this.status = status;
        this.motor = motor;
        llantas = new class_llanta[4];
        faros = new class_faros[2];
    }
    
    public class_automovil(int idAutomovil, int identificador, String tipoAutomovil, double precioRentaDiario, boolean status, class_motor motor, class_llanta[] llantas, class_faros[] faros) {
        this.idAutomovil = idAutomovil;
        this.identificador = identificador;
        this.tipoAutomovil = tipoAutomovil;
        this.precioRentaDiario = precioRentaDiario;
        this.status = status;
        this.motor = motor;
        this.llantas = llantas;
        this.faros = faros;
    }

    public int getIdAutomovil() {
        return idAutomovil;
    }

    public void setIdAutomovil(int idAutomovil) {
        this.idAutomovil = idAutomovil;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getTipoAutomovil() {
        return tipoAutomovil;
    }

    public void setTipoAutomovil(String tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }

    public double getPrecioRentaDiario() {
        return precioRentaDiario;
    }

    public void setPrecioRentaDiario(double precioRentaDiario) {
        this.precioRentaDiario = precioRentaDiario;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public class_motor getMotor() {
        return motor;
    }

    public void setMotor(class_motor motor) {
        this.motor = motor;
    }

    public class_llanta[] getLlantas() {
        return llantas;
    }

    public void setLlantas(class_llanta[] llantas) {
        this.llantas = llantas;
    }

    public class_faros[] getFaros() {
        return faros;
    }

    public void setFaros(class_faros[] faros) {
        this.faros = faros;
    }
    
    
}
