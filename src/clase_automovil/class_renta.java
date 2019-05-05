
package clase_automovil;

import java.util.Date;

public class class_renta {
    private class_persona persona;
    private class_automovil autoRenta;
    private Date fecha_registro;
    int diasRenta;
    boolean statusRenta;

    public class_renta(class_persona persona, class_automovil autoRenta, Date fecha,int diasRenta, boolean statusRenta) {
        this.persona = persona;
        this.autoRenta = autoRenta;
        this.diasRenta = diasRenta;
        this.statusRenta = statusRenta;
    }

    public class_persona getPersona() {
        return persona;
    }

    public void setPersona(class_persona persona) {
        this.persona = persona;
    }

    public class_automovil getAutoRenta() {
        return autoRenta;
    }

    public void setAutoRenta(class_automovil autoRenta) {
        this.autoRenta = autoRenta;
    }

    public Date getFecha() {
        return fecha_registro;
    }

    public void setFecha(Date fecha) {
        this.fecha_registro = fecha;
    }

    public int getDiasRenta() {
        return diasRenta;
    }

    public void setDiasRenta(int diasRenta) {
        this.diasRenta = diasRenta;
    }

    public boolean getStatusRenta() {
        return statusRenta;
    }

    public void setStatusRenta(boolean statusRenta) {
        this.statusRenta = statusRenta;
    }
    
    
}
