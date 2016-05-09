
package Vista;

import Controlador.Controlador_FRM_Matricula;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tata
 */
public class FRM_Matricula extends javax.swing.JFrame {

    DefaultTableModel modelo;
    Controlador_FRM_Matricula controlador;
    public FRM_Matricula(FRM_RegistroEstudiantes estudiantes, FRM_RegistroCursos cursos) {
        initComponents();
       controlador= new  Controlador_FRM_Matricula(estudiantes, cursos,this);
        modelo = new DefaultTableModel();
        this.tbl_Matricula.setModel(modelo);
        colocarTitulosTabla();
        colocarCodigo();
        agregarEventos();
        this.gUI_Botones1.estadoInicialBotones();
    }
    public void habilitarAgregar(){
        this.gUI_Botones1.habilitarNoExisteBotones();
    }
    public void limpiarCurso(){
        this.jt_Cedula.setText("");
        this.jt_Sigla.setText("");
    }
    public void estadoInicial(){
        this.gUI_Botones1.estadoInicialBotones();
    }
    public void colocarTitulosTabla(){
        modelo.addColumn("Cédula");
        modelo.addColumn("Nombre Estudiante");
        modelo.addColumn("Sigla");
        modelo.addColumn("Nombre Curso");
    }
    
    public void colocarCodigo(){
        this.jt_Codigo.setText(controlador.colocarCodigo());
    }
    public void mostrarNombreEstudiante(String nombre){
     this.jt_NombreE.setText(nombre);
    }
    public void mostrarNombreCurso(String nombre){
        this.jt_NombreC.setText(nombre);
    }
    public int getCantidadDeCursosMatriculador(){
        return modelo.getRowCount();
    }
    public String[] getInformacionTabla(int contador){
        String arreglo[]=new String [3];
        arreglo[0]= this.jt_Codigo.getText();
        arreglo[1]=""+this.modelo.getValueAt(contador,0);//(fila,columna)
        arreglo[2]=""+this.modelo.getValueAt(contador,2);
    
        return arreglo;
    }
    
    public void resetearInterfaz(){
        colocarCodigo();
        this.jt_Cedula.setText("");
        this.jt_NombreE.setText("");
        this.jt_Sigla.setText("");
        this.jt_NombreC.setText("");
        
        int numeroFijoDeFilaTabla=modelo.getRowCount();
        for(int contador=0;contador<numeroFijoDeFilaTabla;contador++){
            modelo.removeRow(contador);
            System.out.println("resetear interfaz");
        }
    }
    public void agregarEventos(){  
        this.btn_Cedula.addActionListener(controlador);
        this.btn_Sigla.addActionListener(controlador);
        this.gUI_Botones1.agregarEventos(controlador);
        this.jb_Finalizar.addActionListener(controlador);
        
    }
   public void mostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(null,mensaje);
        
    }
   
   public void cargarTabla(){
       String arreglo[]=new String[4];
       arreglo[0]=this.jt_Cedula.getText();
       arreglo[1]=this.jt_NombreE.getText();
       arreglo[2]=this.jt_Sigla.getText();
       arreglo[3]=this.jt_NombreC.getText();
       
       modelo.addRow(arreglo);
   }
    public String devolverCedula(){
        return this.jt_Cedula.getText();
    }
    public String devolverSigla(){
        return this.jt_Sigla.getText();
    }
//modelo.addRow(), en un arreglo para cargar la tabla
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_Cedula = new javax.swing.JLabel();
        jl_Nombre = new javax.swing.JLabel();
        jl_Sigla = new javax.swing.JLabel();
        jl_NombreC = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Matricula = new javax.swing.JTable();
        jt_Cedula = new javax.swing.JTextField();
        jt_NombreE = new javax.swing.JTextField();
        jt_Sigla = new javax.swing.JTextField();
        jt_NombreC = new javax.swing.JTextField();
        btn_Cedula = new javax.swing.JButton();
        btn_Sigla = new javax.swing.JButton();
        jl_Codigo = new javax.swing.JLabel();
        jt_Codigo = new javax.swing.JTextField();
        jb_Finalizar = new javax.swing.JButton();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_Cedula.setText("Cédula");
        getContentPane().add(jl_Cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jl_Nombre.setText("Nombre");
        getContentPane().add(jl_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jl_Sigla.setText("Sigla");
        getContentPane().add(jl_Sigla, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, -1, -1));

        jl_NombreC.setText("Nombre");
        getContentPane().add(jl_NombreC, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, -1, -1));

        tbl_Matricula.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbl_Matricula);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 600, 108));
        getContentPane().add(jt_Cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 130, 30));

        jt_NombreE.setEnabled(false);
        getContentPane().add(jt_NombreE, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 220, 30));
        getContentPane().add(jt_Sigla, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 110, 30));

        jt_NombreC.setEnabled(false);
        getContentPane().add(jt_NombreC, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 200, 30));

        btn_Cedula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Buscar.png"))); // NOI18N
        btn_Cedula.setActionCommand("Estudiantes");
        getContentPane().add(btn_Cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, -1, -1));

        btn_Sigla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Buscar.png"))); // NOI18N
        btn_Sigla.setActionCommand("Curso");
        getContentPane().add(btn_Sigla, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, -1, -1));

        jl_Codigo.setText("Código");
        getContentPane().add(jl_Codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));
        getContentPane().add(jt_Codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 130, 30));

        jb_Finalizar.setText("Finalizar Matricula");
        getContentPane().add(jb_Finalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

       
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Cedula;
    private javax.swing.JButton btn_Sigla;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_Finalizar;
    private javax.swing.JLabel jl_Cedula;
    private javax.swing.JLabel jl_Codigo;
    private javax.swing.JLabel jl_Nombre;
    private javax.swing.JLabel jl_NombreC;
    private javax.swing.JLabel jl_Sigla;
    private javax.swing.JTextField jt_Cedula;
    private javax.swing.JTextField jt_Codigo;
    private javax.swing.JTextField jt_NombreC;
    private javax.swing.JTextField jt_NombreE;
    private javax.swing.JTextField jt_Sigla;
    private javax.swing.JTable tbl_Matricula;
    // End of variables declaration//GEN-END:variables
}
