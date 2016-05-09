    package Controlador;

import Modelo.ConexionBD;
import Vista.FRM_RegistroCursos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import Modelo.Cursos;
/**
 *
 * @author Tata
 */

public class Controlador_FRM_RegistroCursos implements ActionListener {

   FRM_RegistroCursos registroCursos;
 ConexionBD conexion;
    public Controlador_FRM_RegistroCursos(FRM_RegistroCursos registroCursos) {
        this.registroCursos = registroCursos;
        conexion= new ConexionBD();
      //cargarArchivo();
    }    
    
    public void actionPerformed(ActionEvent e){
        if(e.getActionCommand().equals("Agregar")){
            conexion.agregarCurso(registroCursos.devolverSigla(),registroCursos.devolverNombre(),Integer.parseInt(registroCursos.devolverCreditos()),registroCursos.devolverHorario());
            System.out.println("consultar cursos");
            registroCursos.limpiarVentana();
            registroCursos.estadoIncial();
        }
        if(e.getActionCommand().equals("Buscar")){
           buscar();
        }
        if(e.getActionCommand().equals("Modificar")){
            conexion.actualizarCurso(registroCursos.devolverSigla(),registroCursos.devolverNombre(),Integer.parseInt(registroCursos.devolverCreditos()),registroCursos.devolverHorario());
            registroCursos.estadoIncial();
            registroCursos.limpiarVentana();
            System.out.println("Se modificó cursos");
        }
        if(e.getActionCommand().equals("Eliminar")){
            conexion.eliminarCurso(registroCursos.devolverSigla());
            registroCursos.estadoIncial();
            registroCursos.limpiarVentana();
            System.out.println("Eliminar cursos");
        }
        
    }
    public void buscar(){
         if(conexion.consultarCurso(registroCursos.devolverSigla())){
                //registroCursos.mostrarInformacion(metodos.getArregloInformacion());
                registroCursos.cuandoHayCurso();
            }else{
                System.out.println("no se encontro curso");
                registroCursos.cuandoNoCurso();
            }
    }
}
