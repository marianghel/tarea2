
package Vista;

import Controlador.Controlador_FRM_Matricula;
import Controlador.Controlador_FRM_RegistroCursos;
import Controlador.Controlador_FRM_RegistroEstudiantes;


public class GUI_Botones extends javax.swing.JPanel {
Controlador_FRM_RegistroEstudiantes controlador;
Controlador_FRM_RegistroCursos controladorCursos;
Controlador_FRM_Matricula matricula;
    public GUI_Botones() {
        initComponents();
    }
     public void agregarEventos(Controlador_FRM_RegistroEstudiantes controlador){
         this.controlador=controlador;
         this.jb_Agregar.addActionListener(controlador);
         this.jb_Buscar.addActionListener(controlador);
         this.jb_Modficar.addActionListener(controlador);
         this.jb_Eliminar.addActionListener(controlador);
     }
      public void agregarEventos(Controlador_FRM_RegistroCursos controladorCursos){
         this.controladorCursos=controladorCursos;
         this.jb_Agregar.addActionListener(controladorCursos);
         this.jb_Buscar.addActionListener(controladorCursos);
         this.jb_Modficar.addActionListener(controladorCursos);
         this.jb_Eliminar.addActionListener(controladorCursos);
     }
        public void agregarEventos(Controlador_FRM_Matricula matricula){
         this.matricula=matricula;
         this.jb_Agregar.addActionListener(matricula);
         this.jb_Buscar.addActionListener(matricula);
         this.jb_Modficar.addActionListener(matricula);
         this.jb_Eliminar.addActionListener(matricula);
     }
      
       
     public void habilitarNoExisteBotones(){
         this.jb_Agregar.setEnabled(true);
          this.jb_Eliminar.setEnabled(false);
         this.jb_Modficar.setEnabled(false);
         this.jb_Buscar.setEnabled(false);
     }
     public void habilitarExisteBotones(){
        this.jb_Agregar.setEnabled(false);
         this.jb_Eliminar.setEnabled(true);
         this.jb_Modficar.setEnabled(true);
         this.jb_Buscar.setEnabled(true);
     }
     public void estadoInicialBotones(){
         this.jb_Agregar.setEnabled(false);
         this.jb_Buscar.setEnabled(true);
         this.jb_Eliminar.setEnabled(false);
         this.jb_Modficar.setEnabled(false);
     }

     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jb_Buscar = new javax.swing.JButton();
        jb_Agregar = new javax.swing.JButton();
        jb_Modficar = new javax.swing.JButton();
        jb_Eliminar = new javax.swing.JButton();

        setToolTipText("");
        setOpaque(false);
        setLayout(null);

        jb_Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Buscar.png"))); // NOI18N
        jb_Buscar.setText("Buscar");
        add(jb_Buscar);
        jb_Buscar.setBounds(30, 40, 120, 50);

        jb_Agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/AGREGAR.png"))); // NOI18N
        jb_Agregar.setText("Agregar");
        add(jb_Agregar);
        jb_Agregar.setBounds(170, 40, 71, 50);

        jb_Modficar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/MODIFICAR.png"))); // NOI18N
        jb_Modficar.setText("Modificar");
        add(jb_Modficar);
        jb_Modficar.setBounds(310, 40, 120, 50);

        jb_Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ELIMINAR (2).png"))); // NOI18N
        jb_Eliminar.setText("Eliminar");
        add(jb_Eliminar);
        jb_Eliminar.setBounds(450, 40, 120, 50);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jb_Agregar;
    private javax.swing.JButton jb_Buscar;
    private javax.swing.JButton jb_Eliminar;
    private javax.swing.JButton jb_Modficar;
    // End of variables declaration//GEN-END:variables
}
