
package bloc_notas;

import java.awt.Color;
import java.awt.Font;
import java.awt.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;


public class Diseno extends javax.swing.JFrame {
    
    boolean modificado=false;
    boolean guardando=false;//variable para saber si guardado
    File guardarArchivo;
    DefaultListModel errores=new DefaultListModel();
    ///COMPILADOR
    String[]operadores={"=","<",">",";","(",")","{","}","[","]","!",".","+","-"};
    
    String[ ] keywords = {"abstract","assert","boolean","break","byte","case","catch","char","class","const","continue",
        "default","do",	"double","else","enum",	"extends","false","final","finally","float","for",
        "goto",	"if","implements","import","instanceof","int","interface","long","native","new","null",
        "package","private","protected","public","return","short","static","strictfp","String","super","switch",
        "synchronized","this","throw","throws","transient","true","try","void","volatile","while","length","equals","main","out","System","out","println"};
    // ArrayList<Token> lista_token = new ArrayList();
     ///////////////////
    ArrayList<String> token = new ArrayList<String>();
    int cantidadLineas=0;
    ArrayList<String> tokenClasificado = new ArrayList<String>();
    
    private String[] FUNCIONES = {"==","=","+","-",".","(",")","'","*","[","]",";"};
    ArrayList<String> listaTokens = new ArrayList<String>();
    int inicioT=0;//CONTADOR PARA LITERALES
    
    public Diseno() {
        
        //COLOR [49,66,82]
        initComponents(); 
        this.setLocationRelativeTo(null);//CENTRAR EL FORMULARIO
        this.jTextArea1.setCaretColor(Color.WHITE);//CURSOR A BLANCO
        //RSyntax(); 
        errores=new DefaultListModel();
        lista_errores.setModel(errores);
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        btnc_nuevo = new javax.swing.JMenuItem();
        btnc_abrir = new javax.swing.JMenuItem();
        btnc_guardar = new javax.swing.JMenuItem();
        btnc_salir = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jToolBar1 = new javax.swing.JToolBar();
        btn_nuevo = new javax.swing.JButton();
        btn_abrir = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        btn_guardarcomo = new javax.swing.JButton();
        btn_analizador_lexico = new javax.swing.JButton();
        btn_analizador2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lista_errores = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        btnc_nuevo.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnc_nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/agregar-archivo.png"))); // NOI18N
        btnc_nuevo.setText("Nuevo");
        btnc_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnc_nuevoActionPerformed(evt);
            }
        });
        jPopupMenu1.add(btnc_nuevo);

        btnc_abrir.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnc_abrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/archivo.png"))); // NOI18N
        btnc_abrir.setText("Abrir");
        btnc_abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnc_abrirActionPerformed(evt);
            }
        });
        jPopupMenu1.add(btnc_abrir);

        btnc_guardar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnc_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/salvar.png"))); // NOI18N
        btnc_guardar.setText("Guardar");
        btnc_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnc_guardarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(btnc_guardar);

        btnc_salir.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnc_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/cerrar.png"))); // NOI18N
        btnc_salir.setText("Salir");
        btnc_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnc_salirActionPerformed(evt);
            }
        });
        jPopupMenu1.add(btnc_salir);

        jMenuItem5.setText("jMenuItem5");

        jMenuItem9.setText("jMenuItem9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(500, 380));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jTextArea1.setBackground(new java.awt.Color(49, 66, 82));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        jTextArea1.setComponentPopupMenu(jPopupMenu1);
        jTextArea1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextArea1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTextArea1);

        jToolBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jToolBar1.setRollover(true);

        btn_nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar-archivo.png"))); // NOI18N
        btn_nuevo.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 3, 3, 3));
        btn_nuevo.setFocusable(false);
        btn_nuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_nuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_nuevo);

        btn_abrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/carpeta.png"))); // NOI18N
        btn_abrir.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 3, 3, 3));
        btn_abrir.setFocusable(false);
        btn_abrir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_abrir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_abrirActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_abrir);

        btn_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar-el-archivo.png"))); // NOI18N
        btn_guardar.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 3, 3, 3));
        btn_guardar.setFocusable(false);
        btn_guardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_guardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_guardar);

        btn_guardarcomo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disquete.png"))); // NOI18N
        btn_guardarcomo.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 3, 3, 3));
        btn_guardarcomo.setFocusable(false);
        btn_guardarcomo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_guardarcomo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_guardarcomo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarcomoActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_guardarcomo);

        btn_analizador_lexico.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_analizador_lexico.setText("Analizador Lexico");
        btn_analizador_lexico.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 3, 3, 3));
        btn_analizador_lexico.setFocusable(false);
        btn_analizador_lexico.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_analizador_lexico.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_analizador_lexico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_analizador_lexicoActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_analizador_lexico);

        btn_analizador2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_analizador2.setText("Analizador 2");
        btn_analizador2.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 3, 3, 3));
        btn_analizador2.setFocusable(false);
        btn_analizador2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_analizador2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_analizador2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_analizador2ActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_analizador2);

        lista_errores.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jScrollPane2.setViewportView(lista_errores);

        jTextArea2.setBackground(new java.awt.Color(45, 66, 91));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        jMenuBar1.setBorder(null);
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuBar1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        jMenu1.setText("Archivo");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/agregar-archivo.png"))); // NOI18N
        jMenuItem1.setText("Nuevo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/archivo.png"))); // NOI18N
        jMenuItem2.setText("Abrir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/salvar.png"))); // NOI18N
        jMenuItem3.setText("Guardar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/salvar_1.png"))); // NOI18N
        jMenuItem10.setText("Guardar Como");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem10);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/cerrar.png"))); // NOI18N
        jMenuItem4.setText("Salir");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1567, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    
    public void abrirArchivo() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
    if (JFileChooser.APPROVE_OPTION == fileChooser.showOpenDialog(jTextArea1)) {
        File archivo = fileChooser.getSelectedFile();
        guardarArchivo=fileChooser.getSelectedFile();
        FileReader lector = null;
        try {
            lector = new FileReader(archivo);
            BufferedReader bfReader = new BufferedReader(lector);

            String lineaFichero;
            StringBuilder contenidoFichero = new StringBuilder();

            // Recupera el contenido del fichero
            while ((lineaFichero = bfReader.readLine()) != null) {
                contenidoFichero.append(lineaFichero);
                contenidoFichero.append("\n");
            }

            // Pone el contenido del fichero en el area de texto
            jTextArea1.setText(contenidoFichero.toString());

        } catch (FileNotFoundException ex) {
            //Logger.getLogger(Diseno.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error");
        } catch (IOException ex) {
            //Logger.getLogger(Diseno.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error");
        } finally {
            try {
                lector.close();
            } catch (IOException ex) {
               // Logger.getLogger(Diseno.class.getName()).log(Level.SEVERE, null, ex);
               System.out.println("Error");
            }
        }
    }
}//TERMINA LA FUNCION ABRIR
    
    
    public void guardarArchivo() {//FUNCION GUARDARCOMO
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
    if (JFileChooser.APPROVE_OPTION == fileChooser.showSaveDialog(jTextArea1)) {
        File archivo = fileChooser.getSelectedFile();
        guardarArchivo=fileChooser.getSelectedFile();
        FileWriter escritor = null;
        try {
            escritor = new FileWriter(archivo);
            escritor.write(jTextArea1.getText());
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(Diseno.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("ERROR");
        } catch (IOException ex) {
            //Logger.getLogger(Diseno.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("ERROR");
        } finally {
            try {
                escritor.close();
            } catch (IOException ex) {
                //Logger.getLogger(Diseno.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("ERROR");
            }
        }
    }


}//TERMINA LA FUNCION GUARDARCOMO

////////////////// 
    public void gArchivo() {//FUNCION GUARDAR
       
    
        if(guardarArchivo!=null){
            FileWriter escritor = null;
            try {
                escritor = new FileWriter(guardarArchivo);
                escritor.write(jTextArea1.getText());
            } catch (FileNotFoundException ex) {
                //Logger.getLogger(Diseno.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("ERROR");
            } catch (IOException ex) {
                //Logger.getLogger(Diseno.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("ERROR");
            } finally {
                try {
                    escritor.close();
                } catch (IOException ex) {
                    //Logger.getLogger(Diseno.class.getName()).log(Level.SEVERE, null, ex);
                    System.out.println("ERROR");
                }
            }

        }//IF
        else{
            guardarArchivo();
        }
        
   
}//TERMINA LA FUNCION GUARDAR
///////////////////

    
    
    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        /*int i= JOptionPane.showConfirmDialog(this,"¿Desea Salir?","Cerrar Aplicación",
                    JOptionPane.YES_NO_CANCEL_OPTION);
            
            if(i==0){//BOTON SI
                System.exit(0);//SALIR
            }else{//BOTON NO
                
            }*/
        if(modificado==false){//TEXTO NO MODIFICADO   
                System.exit(0);//SALIR
        }else{//TEXTO SI MODIFICADO
            int i= JOptionPane.showConfirmDialog(this,"¿Desea Guardar Cambios Antes de salir?","Cerrar Aplicacion",
                        JOptionPane.YES_NO_CANCEL_OPTION);

                if(i==0){//BOTON SI
                   
                    gArchivo();
                  
                    
                    System.exit(0);//SALIR
                }else if(i==1){//BOTON NO
                   
                   System.exit(0);//SALIR
                }else{
                    //BOTON CANCELAR
                    modificado=true;
                }
        }
         
        
    }//GEN-LAST:event_jMenuItem4ActionPerformed
public void nuevo(){
    try{
            if(modificado==false){//TEXTO NO MODIFICADO   
                jTextArea1.setText("");
                jTextArea2.setText("");
               //lista_token.clear();
                guardarArchivo=null;
            }else{//TEXTO SI MODIFICADO
            
                int i= JOptionPane.showConfirmDialog(this,"¿Desea Guardar Cambios?","Limpiar Texto",
                        JOptionPane.YES_NO_CANCEL_OPTION);

                if(i==0){//BOTON SI
                    //System.out.println("SIIIII");
                    gArchivo();
                    jTextArea1.setText("");//LIMPIRA EL JTEXTAREA1
                    jTextArea2.setText("");//LIMPIRA EL JTEXTAREA2
                    //lista_token.clear();
                    
                    modificado=false;//VARIABLE PARA SABER SI MODICADO
                    guardarArchivo=null;
                }else if(i==1){//BOTON NO
                    //System.out.println("NOOO");
                    jTextArea1.setText("");//LIMPIRA EL JTEXTAREA1
                    jTextArea2.setText("");//LIMPIRA EL JTEXTAREA2
                    //lista_token.clear();
                    
                    modificado=false;//VARIABLE PARA SABER SI MODICADO
                    guardarArchivo=null;
                }else{
                    //BOTON CANCELAR
                    modificado=true;
                }
            }
            
          }catch(Exception exc){
               System.out.println("Error al limpiar");
        
           }
        int todo=lista_errores.getSelectedIndex();//Limpia la lista
        errores.removeAllElements();//limpia la lista
}
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // BOTONO NUEVO       
        nuevo();
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // FUNCION PARA ABRIR
         try{
            abrirArchivo();
            guardando=true;
        }catch(Exception excepcion){
            System.out.println("Error al abrir boton");
        }
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // SUB-MENU FUNCION GUARDAR
        try{
            
            gArchivo();//FUNCION GUARDAR
        }catch(Exception excepcion){
            System.out.println("Error al guardar boton");
        }
		        
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jTextArea1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea1KeyReleased
        // TODO add your handling code here:
        modificado=true;
           
    }//GEN-LAST:event_jTextArea1KeyReleased

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // CERRAR
        //System.out.println("CERRADO");
    }//GEN-LAST:event_formWindowClosing

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void btn_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoActionPerformed
        //BARRA ICONO NUEVO
        nuevo();
    }//GEN-LAST:event_btn_nuevoActionPerformed

    private void btn_abrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_abrirActionPerformed
        // BARRA MENU ICONO ABRIR
         try{
            abrirArchivo();
            
        }catch(Exception excepcion){
            System.out.println("Error al abrir Archivo");
        }
    }//GEN-LAST:event_btn_abrirActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        // BARRA DEL MENU ICONO GUARDAR
        try{
            
            gArchivo();
        }catch(Exception excepcion){
            System.out.println("Error al guardar boton");
        }
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btnc_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnc_nuevoActionPerformed
        //BARRA ICONO NUEVO
        nuevo();
    }//GEN-LAST:event_btnc_nuevoActionPerformed

    private void btnc_abrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnc_abrirActionPerformed
        // BARRA ICONO ABRIR
         try{
            abrirArchivo();
        }catch(Exception excepcion){
            System.out.println("Error al abrir Archivo");
        }
    }//GEN-LAST:event_btnc_abrirActionPerformed

    private void btnc_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnc_guardarActionPerformed
       // BARRA MENUCLICK GUARDARCOMO JJJJJJ
        try{
            gArchivo();
        }catch(Exception excepcion){
            System.out.println("Error al guardar boton");
        }
    }//GEN-LAST:event_btnc_guardarActionPerformed
   
    
    
    private void btnc_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnc_salirActionPerformed
       /* int i= JOptionPane.showConfirmDialog(this,"¿Desea Salir?","Cerrar Aplicación",
                    JOptionPane.YES_NO_CANCEL_OPTION);
            
            if(i==0){//BOTON SI
                System.exit(0);//SALIR
            }else{//BOTON NO
                
            }*/
       if(modificado==false){//TEXTO NO MODIFICADO   
                System.exit(0);//SALIR
        }else{//TEXTO SI MODIFICADO
            int i= JOptionPane.showConfirmDialog(this,"¿Desea Guardar Cambios Antes de salir?","Cerrar Aplicacion",
                        JOptionPane.YES_NO_CANCEL_OPTION);

                if(i==0){//BOTON SI
                   
                    gArchivo();
                  
                    
                    System.exit(0);//SALIR
                }else if(i==1){//BOTON NO
                   
                   System.exit(0);//SALIR
                }else{
                    //BOTON CANCELAR
                    modificado=true;
                }
        }
    }//GEN-LAST:event_btnc_salirActionPerformed
///ANALIZADOR LÉXICO
    private void btn_analizador_lexicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_analizador_lexicoActionPerformed
       int todo=lista_errores.getSelectedIndex();//Limpia la lista
       errores.removeAllElements();//Limpia la lista 
       
       String texto=jTextArea1.getText();//OBTIENE EL TEXTO
       String[] partes=texto.split("\n");
       cantidadLineas=partes.length;//CANTIDAD DE LINEAS
        
        for (int i = 0;i<partes.length; i++) {
            
            texto=partes[i].trim();//QUITA LOS ESPACIOS     
            //lexico(texto,i+1);
           /// separaFunciones(texto);
           analizador(texto,i+1);
        }
 
    }//GEN-LAST:event_btn_analizador_lexicoActionPerformed
    
    public void analizador(String texto,int linea){
        String lexema = "";
        ///CONVIERTE A CADENA EL STRING
        char cadena[];
        cadena=texto.toCharArray();
       
        if(cadena[0]=='/' && cadena[1]=='/'){
            token.add(texto);
        }else{
                
            for (int i = 0; i <cadena.length; i++) {


                if (cadena[i]=='\"') {
                   inicioT++;                
                }


                if(inicioT==1){

                    lexema=lexema+Character.toString(cadena[i]);

                }else if(inicioT==2){

                    lexema=lexema+Character.toString(cadena[i]);
                    token.add(lexema);
                    lexema="";
                    inicioT=0;


                }else{

                    if (Character.isLetterOrDigit(cadena[i])) {
                    //System.out.println(cadena[i]);
                    lexema=lexema+Character.toString(cadena[i]);

                    }else if(cadena[i]==' '){
                        token.add(lexema);
                        lexema="";
                    }else if (existeEnArreglo(operadores,Character.toString(cadena[i]))!=-1) {
                        token.add(lexema);
                        lexema=Character.toString(cadena[i]);
                        token.add(lexema);
                        lexema="";
                    }            
                }                             
            }
        }   
        
        for (int i = 0; i < token.size();i++) {
            clasificarToken(token.get(i)); 
        }
         
        mostrarTokens();
        jTextArea2.setText(jTextArea2.getText() +"\n");
        tokenClasificado.clear();
        token.clear();
        
    }


    
    
    
    
   
    public void clasificarToken(String token){
        
        
        if (existeEnArreglo(keywords,token)!=-1) {///CLASIFICAR PALABRAS RESERVADAS
            //System.out.println("PR["+token+"],");
            tokenClasificado.add("PR["+token+"]");
        }else{
            if (existeEnArreglo(operadores,token)!=-1) {//CLASIFICA OPERADORES
                //System.out.println("OP["+token+"],");
                tokenClasificado.add("OP["+token+"]");

            }else{
                
                if (isNumerico(token)) {//CLASIFICAR NUMEROS
                    //System.out.println("NUM["+token+"],");
                    tokenClasificado.add("NUM["+token+"]");
                }else{
                    if(!token.equals(" ")){//DIFERENTE DE VACIO   
                       if(!token.isEmpty()){
                            char cadena[];
                            cadena=token.toCharArray();
                            if(cadena[0]=='\"'){
                                tokenClasificado.add("LT["+token+"]");
                            }else if(cadena[0]=='/' && cadena[1]=='/'){
                                tokenClasificado.add("COM["+token+"]");
                            }else{
                                tokenClasificado.add("ID["+token+"]");
                            }
                           
                       }
                        
                    }
                    
                }

            }
            
        }
       
    }
    
    public void mostrarTokens(){    
            for (int j = 0; j < tokenClasificado.size(); j++) {
                jTextArea2.setText(jTextArea2.getText() + tokenClasificado.get(j) +" , ");
            }   
    }
    
    public static int existeEnArreglo(String[] arreglo, String busqueda) {
        for (int x = 0; x < arreglo.length; x++) {
          if (arreglo[x].equals(busqueda)) {
            return x;
          }
        }
        return -1;
    }
    
    public  boolean isNumerico(String cadena){
	try {
		Integer.parseInt(cadena);
		return true;
	} catch (Exception e){
		return false;
	}
    }
    
           
//        for (int i = 0; i < token.size();i++) {
//           
//            //System.out.println(token.get(i));
//            clasificarToken(token.get(i));
//        
//        }
    
    ///////////////////////////////////////////////////////////////////////////
    public void separaFunciones(String sentencia) {
        for (String funcion : FUNCIONES) {
            if (sentencia.contains(funcion)) {
                sentencia = sentencia.replace(funcion, " " + funcion + " ");
            }
        }
        String[] tokens = sentencia.replaceAll("\\s+", " ").trim().split(" ");
        for (int i = 0; i <tokens.length; i++) {
             token.add(tokens[i]);
            // System.out.println(tokens[i]);
        }
        
        
        for (int i = 0; i < token.size();i++) {
            clasificarToken(token.get(i)); 
        }
         
        mostrarTokens();
        jTextArea2.setText(jTextArea2.getText() +"\n");
        tokenClasificado.clear();
        token.clear();
       
    }
    ///////////////////////////////////////////////////////////////////////////
    
    
    //    public void escanea(String codigo) {
//        for (String sentencia : codigo.split("\n")) {
//            separaFunciones(sentencia);
//        }
//        for (String tokens : listaTokens) {
//            for (String token1 : tokens) {
//                System.out.print("[" + token1 + "]");
//            }
//            System.out.println("");
//        }
//    }
    
    
     public void lexico(String texto,int linea){
        
        ///CONVIERTE A CADENA EL STRING
        char cadena[];
        cadena=texto.toCharArray();
        
        StringTokenizer st = new StringTokenizer(texto,"=;(){}[].+-< ",true);
        //System.out.println("Hay un total de: "+st.countTokens()+" tokens.");
        while (st.hasMoreTokens()) { ///OBTIENE LOS TOKENS
           token.add(st.nextToken());
              
        }
        
        
        //jTextArea2.setText(jTextArea2.getText() + token.get(i) +"\n");
        //jTextArea2.setText(token.get(i) +"\n");
        
        for (int i = 0; i < token.size();i++) {
            clasificarToken(token.get(i)); 
        }
         
        mostrarTokens();
        jTextArea2.setText(jTextArea2.getText() +"\n");
        tokenClasificado.clear();
        token.clear();
        
    }
    
    private void btn_guardarcomoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarcomoActionPerformed
       // BARRA DEL MENU  GUARDAR_COMO
        try{
            guardarArchivo();
            
        }catch(Exception excepcion){
            System.out.println("Error al guardar boton");
        }

    }//GEN-LAST:event_btn_guardarcomoActionPerformed

    
    
    
    private void btn_analizador2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_analizador2ActionPerformed
//        int todo=lista_errores.getSelectedIndex();//Limpia la lista
//        errores.removeAllElements();//Limpia la lista
//        // AUTOMATA NUMERO REAL
//        
//        String texto=jTextArea1.getText();
//        String[] partes=texto.split("\n");
//        
//        for (int i = 0;i<partes.length; i++) {
//            
//            texto=partes[i].replaceAll("\\s","");//QUITA LOS ESPACIOS
//            //errores.addElement("Partes"+partes[i]);
//            //NumeroReal(texto,i+1);
//        }
//new analizador(lista_token).analizar(jTextArea1.getText());
//        
//        for(int i = 0; i < lista_token.size(); i++){
//            /*txt_consola.setText(txt_consola.getText() + '\n' + lista_token.get(i).toString());*/
//            jTextArea2.setText(jTextArea2.getText() + lista_token.get(i).toString());
//        }
    }//GEN-LAST:event_btn_analizador2ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        
        // SUB-MENU  GUARDAR_COMO
        try{
            guardarArchivo();
        }catch(Exception excepcion){
            System.out.println("Error al guardar boton");
        }
    }//GEN-LAST:event_jMenuItem10ActionPerformed
   
    
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Diseno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Diseno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Diseno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Diseno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Diseno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_abrir;
    private javax.swing.JButton btn_analizador2;
    private javax.swing.JButton btn_analizador_lexico;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_guardarcomo;
    private javax.swing.JButton btn_nuevo;
    private javax.swing.JMenuItem btnc_abrir;
    private javax.swing.JMenuItem btnc_guardar;
    private javax.swing.JMenuItem btnc_nuevo;
    private javax.swing.JMenuItem btnc_salir;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JList<String> lista_errores;
    // End of variables declaration//GEN-END:variables
}
