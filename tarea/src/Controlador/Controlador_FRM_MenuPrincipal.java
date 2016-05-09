
package Controlador;


import Vista.FRM_Matricula;
//import Vista.FRM_MenuPrincipal;
import Vista.FRM_RegistroCursos;
import Vista.FRM_RegistroEstudiantes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador_FRM_MenuPrincipal implements ActionListener{
    FRM_RegistroEstudiantes mantenimientoEstudiantes;
    FRM_RegistroCursos registroCursos;
    FRM_Matricula matricula;
   
    
    public Controlador_FRM_MenuPrincipal(){
        
      
        mantenimientoEstudiantes=new FRM_RegistroEstudiantes();
        registroCursos =new FRM_RegistroCursos();
        matricula= new FRM_Matricula(mantenimientoEstudiantes,registroCursos);
        
    }
  
    public void actionPerformed(ActionEvent e){
        if(e.getActionCommand().equals("Salir")){
            System.exit(0);
        }
        if(e.getActionCommand().equals("Registro Estudiantes")){
            mantenimientoEstudiantes.setVisible(true);
        }
        if(e.getActionCommand().equals("Registro Cursos")){
             registroCursos.setVisible(true);
        }
        if(e.getActionCommand().equals("Matricula")){
            System.out.println("Matricula");
            matricula.setVisible(true);
            this.matricula.colocarCodigo();
        }
    }
}
