
package Controlador;

import Modelo.ArchivoMatricula;
import Modelo.ConexionBD;
import Modelo.Matricula;
import Modelo.MetodosMatricula;
import Vista.FRM_Matricula;
import Vista.FRM_RegistroCursos;
import Vista.FRM_RegistroEstudiantes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Controlador_FRM_Matricula implements ActionListener {
    MetodosMatricula metodosMatricula;
    ArchivoMatricula archivoMatricula;
    FRM_Matricula matricula;
    ConexionBD conexion;
    boolean encontroEstudiante=false;
    boolean encontroCurso=false;
    
    public Controlador_FRM_Matricula(FRM_RegistroEstudiantes estudiantes, FRM_RegistroCursos cursos, FRM_Matricula matricula){
       this.metodosMatricula=new MetodosMatricula();
       this.matricula=matricula;
       conexion=new ConexionBD();
    }
   
    public void actionPerformed(ActionEvent e){
          if(e.getActionCommand().equals("Estudiantes")){
              System.out.println("entro");
              if(conexion.consultarEstudiantes(matricula.devolverCedula())){
                  
                 //String arreglo[]=this.metodosEstudiantes.getArregloInformacion(); 
                 //System.out.println("entro1"+arreglo[0]);
                // this.matricula.mostrarNombreEstudiante(arreglo[1]);
                 encontroEstudiante=true;
              }else{
                  matricula.mostrarMensaje("El estudiante consultado consultado no se encuentra, favor dirigirse al módulo de registro estudiantes");
              }
          }
            if(e.getActionCommand().equals("Curso"))
            {
                 
               if(conexion.consultarCurso(matricula.devolverSigla()))
               {
                    //String arreglo[]=this.metodosCursos.getArregloInformacion();
                    // System.out.println("entro aqui "+arreglo[0]);
                      //this.matricula.mostrarNombreCurso(arreglo[0]);
                      encontroCurso=true;
               }else{
             matricula.mostrarMensaje("El curso consultado consultado no se encuentra, favor dirigirse al módulo de registro curso");
            }
            }
               if(e.getActionCommand().equals("Agregar")){
                   matricula.cargarTabla();
                   encontroCurso=false;
                   matricula.estadoInicial();
                   matricula.limpiarCurso();
                   //metodosMatricula.mostrarInformacion();
               }
               if(encontroEstudiante&&encontroCurso){
                   matricula.habilitarAgregar();
               }
               if(e.getActionCommand().equals("Finalizar Matricula")){
                  for(int contador=0;contador<matricula.getCantidadDeCursosMatriculador();contador++){
                   conexion.agregarMatricula(matricula.getInformacionTabla(contador));
               }
                  matricula.resetearInterfaz();
                 // metodosMatricula.mostrarInformacion();
                  
               }
               if(encontroEstudiante&&encontroCurso){
                   matricula.habilitarAgregar();
               }
    }
   
    public String colocarCodigo(){
        return this.metodosMatricula.devolverCodigo();
    }
    
    }
