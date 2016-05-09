package Vista;

import Controlador.Controlador_FRM_RegistroCursos;

/**
 *
 * @author Tata
 */
public class FRM_RegistroCursos extends javax.swing.JFrame {

  public Controlador_FRM_RegistroCursos controlador;//que sea accesible desde afuera
    public FRM_RegistroCursos() {
        initComponents();
        controlador= new Controlador_FRM_RegistroCursos(this);
        this.gUI_Botones1.agregarEventos(controlador);
        estadoIncial();
        
    }

    public void estadoIncial(){
        this.gUI_Botones1.estadoInicialBotones();
        this.gUI_InformacionCursos1.estadoInicio();
    }
    public void cuandoHayCurso(){
     this.gUI_InformacionCursos1.ExistenCurso();
     this.gUI_Botones1.habilitarExisteBotones();
    }
    public void cuandoNoCurso(){
        this.gUI_InformacionCursos1.NoHayCursos();
        this.gUI_Botones1.habilitarNoExisteBotones();
    }
    public void limpiarVentana(){
        this.gUI_InformacionCursos1.limpiarInterfaz();
    }
    public String[] devolverInformacion(){
        return this.gUI_InformacionCursos1.devolverInformacion();
    }
    public String devolverSigla(){
        return this.gUI_InformacionCursos1.devolverSigla();
    }
    public  void mostrarInformacion(String arreglo[]){
        this.gUI_InformacionCursos1.mostrarInformacion(arreglo);
    }
    public String devolverNombre(){
        return this.gUI_InformacionCursos1.devolverNombreCurso();
    }
    public String devolverCreditos(){
        return this.gUI_InformacionCursos1.devolverCreditos();
    }
    public String devolverHorario(){
        return this.gUI_InformacionCursos1.devolverHorario();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gUI_Botones1 = new Vista.GUI_Botones();
        gUI_InformacionCursos1 = new Vista.GUI_InformacionCursos();
        gUI_Botones2 = new Vista.GUI_Botones();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(gUI_InformacionCursos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 400, 230));
        getContentPane().add(gUI_Botones2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 650, 110));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Vista.GUI_Botones gUI_Botones1;
    private Vista.GUI_Botones gUI_Botones2;
    private Vista.GUI_InformacionCursos gUI_InformacionCursos1;
    // End of variables declaration//GEN-END:variables
}
