
package clase_automovil;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

public class Clase_automovil {

    public static void main(String[] args) {
        int opcion = 0;
        Scanner ent = new Scanner(System.in);
        class_llanta llantasAuto[] = new class_llanta[4];
        class_renta rentas[] = new class_renta[20];
        class_faros farosAuto[] = new class_faros[2];
        
        ArrayList<class_renta> listaRenta = new ArrayList<class_renta>();
        ArrayList<class_automovil> listaAutomoviles = new ArrayList<class_automovil>();
        
        //class_automovil autosDisponibles[] = new class_automovil[5];
        llantasAuto[0] = new class_llanta(15, "Pirelli", "Deportiva");
        llantasAuto[1] = new class_llanta(15, "Pirelli", "Deportiva");
        llantasAuto[2] = new class_llanta(15, "Pirelli", "Deportiva");
        llantasAuto[3] = new class_llanta(15, "Pirelli", "Deportiva");
        
        farosAuto[0] = new class_faros("Zenon", "BMW");
        farosAuto[1] = new class_faros("Zenon", "BMW");
        
        listaAutomoviles.add(new class_automovil(1, 1234, "Deportivo", 550, true, new class_motor(4567, 200, 8), llantasAuto, farosAuto));
        listaAutomoviles.add(new class_automovil(1, 1234, "Deportivo", 550, true, new class_motor(4567, 200, 8), llantasAuto, farosAuto));
        listaAutomoviles.add(new class_automovil(1, 1234, "Deportivo", 550, true, new class_motor(4567, 200, 8), llantasAuto, farosAuto));
        listaAutomoviles.add(new class_automovil(1, 1234, "Deportivo", 550, true, new class_motor(4567, 200, 8), llantasAuto, farosAuto));
        listaAutomoviles.add(new class_automovil(1, 1234, "Deportivo", 550, true, new class_motor(4567, 200, 8), llantasAuto, farosAuto));
        
        /*
            1.- Mostrar automoviles
            2.- Mostrar usuarios que tienen renta
            3.- Registrar renta
            4.- Terminar renta
            5.- Mostrar precios de automoviles
            6.- Mostrar rentas a vencer (dia actual)
        */
        
        System.out.println("Renta de Automoviles S.A de C.V");
        
        do {
            System.out.println("Opciones disponibles 1.-");
            opcion = ent.nextInt();
            switch (opcion) {
                case 1:
                    for (int r = 0; r < listaAutomoviles.size(); r++) {
                        System.out.println(listaAutomoviles.get(r).getIdAutomovil() + " " + listaAutomoviles.get(r).getPrecioRentaDiario());
                    }
                    break;
                case 2:
                    /*
                    int conteo = 0;
                    for (int i = 0; i < rentas.length; i++) {
                        if (rentas[i]!=null) {
                            if(rentas[i].getStatusRenta()==true){
                                class_persona usuario = rentas[i].getPersona();
                                System.out.println(usuario.getNombre()+" "+usuario.getNumeroLicencia());
                                conteo++;
                            }
                        }
                    }
                    if(conteo==0){
                        System.out.println("No hay rentas registradas.");
                    }
                    */
                    if(listaRenta.isEmpty()){
                        System.out.println("No hay rentas registradas.");
                    }else{
                        Iterator<class_renta> lrentas = listaRenta.iterator();
                        while(lrentas.hasNext()){
                            class_renta r = (class_renta) lrentas;
                            if(r.getStatusRenta() == true){
                                class_persona usuario = r.getPersona();
                                System.out.println(usuario.getNombre() + " " + usuario.getNumeroLicencia());
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("Datos de renta");
                    class_persona usuario_renta = new class_persona();
                    System.out.println("Nombre de persona");
                    usuario_renta.setNombre(ent.nextLine());
                    System.out.println("Indique dirección");
                    usuario_renta.setDireccion(ent.nextLine());
                    System.out.println("Indique teléfono");
                    usuario_renta.setNumeroTelefono(ent.nextInt());
                    System.out.println("Indique tipo de sangre");
                    usuario_renta.setTipoSangre(ent.nextLine());
                    
                    class_automovil automovilRenta = null;
                    
                    do{
                        System.out.println("Indique id de automovil");
                        int idAutomovil = ent.nextInt();
                        Iterator<class_automovil> lautos = listaAutomoviles.iterator();
                        while(lautos.hasNext()){
                            class_automovil autoActual = (class_automovil) lautos;
                            if(autoActual.isStatus() == true && autoActual.getIdAutomovil() == idAutomovil){
                                automovilRenta = autoActual;
                            }
                        }
                    }while(automovilRenta != null);
                    System.out.println("Indique dias de renta");
                    int diasRenta = ent.nextInt();
                    class_renta rentaActual = new class_renta(usuario_renta, automovilRenta, new Date(), diasRenta, true);
                    
                    listaRenta.add(rentaActual);
                    
                    break;
                case 4:
                    System.out.println("Indique id de automovil");
                    int idAutomovil = ent.nextInt();
                    boolean verificar = false;
                    for(int r = 0; r < listaRenta.size(); r++){
                        if(listaRenta.get(r).getAutoRenta().getIdAutomovil() == idAutomovil){
                            listaRenta.get(r).setStatusRenta(false);
                            System.out.println("La renta se ha finalizado correctamente");
                            verificar = true;
                        }
                    }
                    
                    break;
                case 5:
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Opción no disponible, intente con otra opción");
                    break;
            }
        } while(opcion != 0);
        
    }
    
}
