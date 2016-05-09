
package Modelo;

import java.io.Serializable;

public class Cursos implements Serializable{

    private String sigla;
    private String nombreCurso;
    private int creditos;
private String horario;

    public Cursos(String sigla, String nombreCurso,int creditos,String horario) {
        this.sigla = sigla;
        this.nombreCurso = nombreCurso;
        this.creditos = creditos;
        this.horario= horario;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public int getCreditos() {
        return creditos;
    }
    
    public String getInformacionCursos(){
        return "Sigla: "+getSigla()+"\nNombre: "+getNombreCurso()+"\nCreditos"+getCreditos(); 
    }
}
