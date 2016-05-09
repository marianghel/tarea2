package Controlador;

import Modelo.ConexionBD;
import Modelo.Estudiante;
import Vista.FRM_RegistroEstudiantes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Controlador_FRM_RegistroEstudiantes implements ActionListener {

   FRM_RegistroEstudiantes registroEstudiantes;
   ConexionBD conexion;
     public Controlador_FRM_RegistroEstudiantes(FRM_RegistroEstudiantes registroEstudiantes){
         conexion= new ConexionBD();
         this.registroEstudiantes=registroEstudiantes;
     }
            
    
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Consulta"))
        {
          buscar();
        }
       if(e.getActionCommand().equals("Buscar")){
            buscar();
       }
         if(e.getActionCommand().equals("Agregar")){
          conexion.agregarEstudiante(registroEstudiantes.devolverCarnet(),registroEstudiantes.devolverNombre());
          
          this.registroEstudiantes.mostrarMensaje("Estudiante agregado");
         this.registroEstudiantes.limpiaInterfaz();
         this.registroEstudiantes.estadoInicial();
       }
         if(e.getActionCommand().equals("Modificar"))
         {
          conexion.actualizarEstudiante(registroEstudiantes.devolverCarnet(),registroEstudiantes.devolverNombre());
           this.registroEstudiantes.mostrarMensaje("Estudiante modificado");
           this.registroEstudiantes.estadoInicial();
            this.registroEstudiantes.limpiaInterfaz();
         }
          if(e.getActionCommand().equals("Eliminar")){
           conexion.eliminarEstudiante(registroEstudiantes.devolverCarnet());
           this.registroEstudiantes.mostrarMensaje("Estudiante eliminado");
           this.registroEstudiantes.estadoInicial();
            this.registroEstudiantes.limpiaInterfaz();
       }
          
    }
    
          public void buscar(){
              
              if(conexion.consultarEstudiantes(registroEstudiantes.devolverCarnet())){
                  //this.registroEstudiantes.mostrarInformacion(conexion.getArregloInformacion());
                  this.registroEstudiantes.habilitarExiste();
                 this.registroEstudiantes.mostrarMensaje("Estudiante encontrado");
              }else{
                 this.registroEstudiantes.habilitarDesconocido(); 
                 this.registroEstudiantes.mostrarMensaje("Estudiante no encontrado");

              }
              
          }
}
