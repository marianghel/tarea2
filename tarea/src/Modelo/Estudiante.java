
package Modelo;

import java.io.Serializable;

public class Estudiante implements Serializable{
    
    private String nombre;
    private String carnet;

    /**
     * @return the nombre
     */
    public Estudiante(String carnet, String nombre){
       
        this.setCarnet(carnet);
         this.setNombre(nombre);
    }
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   
    public String getCarnet() {
        return carnet;
    }

    
    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getInformacion(){
        return "Carnet: "+getCarnet()+"\nNombre: "+getNombre(); 
    }
}
