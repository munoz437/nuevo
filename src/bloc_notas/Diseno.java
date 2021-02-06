
package bloc_notas;

import java.awt.Color;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;


public class Diseno extends javax.swing.JFrame {
    //NumeroLinea numeroLinea;
    boolean modificado=false;
    boolean guardando=false;//variable para saber si guardado
    File guardarArchivo;
    DefaultListModel errores=new DefaultListModel();
    
    public Diseno() {
        
        //COLOR [49,66,82]
        initComponents(); 
        this.setLocationRelativeTo(null);//CENTRAR EL FORMULARIO
        this.jTextArea1.setCaretColor(Color.WHITE);//CURSOR A BLANCO
        //RSyntax(); 
        errores=new DefaultListModel();
        lista_errores.setModel(errores);
        
//        numeroLinea= new NumeroLinea(jTextArea1);
//        jScrollPane1.setRowHeaderView(numeroLinea);
        
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
        btn_asignacion_variables = new javax.swing.JButton();
        btn_numeros_reales = new javax.swing.JButton();
        btn_variableNombre = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btn_racionales = new javax.swing.JButton();
        btn_01 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lista_errores = new javax.swing.JList<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        btn_fuente = new javax.swing.JMenuItem();
        btn_color = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jmenu_binario = new javax.swing.JMenuItem();

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
        setUndecorated(true);
        setOpacity(0.9F);
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
        jTextArea1.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        jTextArea1.setComponentPopupMenu(jPopupMenu1);
        jTextArea1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextArea1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTextArea1);

        jToolBar1.setRollover(true);

        btn_nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/agregar-archivo.png"))); // NOI18N
        btn_nuevo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_nuevo.setFocusable(false);
        btn_nuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_nuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_nuevo);

        btn_abrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/carpeta.png"))); // NOI18N
        btn_abrir.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_abrir.setFocusable(false);
        btn_abrir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_abrir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_abrirActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_abrir);

        btn_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/salvar.png"))); // NOI18N
        btn_guardar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_guardar.setFocusable(false);
        btn_guardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_guardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_guardar);

        btn_guardarcomo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/salvar_1.png"))); // NOI18N
        btn_guardarcomo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_guardarcomo.setFocusable(false);
        btn_guardarcomo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_guardarcomo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_guardarcomo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarcomoActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_guardarcomo);

        btn_asignacion_variables.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/boton-de-reproduccion.png"))); // NOI18N
        btn_asignacion_variables.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_asignacion_variables.setFocusable(false);
        btn_asignacion_variables.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_asignacion_variables.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_asignacion_variables.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_asignacion_variablesActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_asignacion_variables);

        btn_numeros_reales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/letra-n.png"))); // NOI18N
        btn_numeros_reales.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_numeros_reales.setFocusable(false);
        btn_numeros_reales.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_numeros_reales.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_numeros_reales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_numeros_realesActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_numeros_reales);

        btn_variableNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/jugar (1).png"))); // NOI18N
        btn_variableNombre.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_variableNombre.setFocusable(false);
        btn_variableNombre.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_variableNombre.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_variableNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_variableNombreActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_variableNombre);

        jButton1.setText("P2");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        btn_racionales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/letra-r.png"))); // NOI18N
        btn_racionales.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_racionales.setFocusable(false);
        btn_racionales.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_racionales.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_racionales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_racionalesActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_racionales);

        btn_01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/codigo-binario.png"))); // NOI18N
        btn_01.setBorder(null);
        btn_01.setFocusable(false);
        btn_01.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_01.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_01ActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_01);

        jScrollPane2.setViewportView(lista_errores);

        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuBar1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        jMenu1.setText("Archivo");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/agregar-archivo.png"))); // NOI18N
        jMenuItem1.setText("Nuevo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/archivo.png"))); // NOI18N
        jMenuItem2.setText("Abrir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/salvar.png"))); // NOI18N
        jMenuItem3.setText("Guardar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/salvar_1.png"))); // NOI18N
        jMenuItem10.setText("Guardar Como");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem10);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/cerrar.png"))); // NOI18N
        jMenuItem4.setText("Salir");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edición");

        btn_fuente.setText("Fuente");
        jMenu2.add(btn_fuente);

        btn_color.setText("Color");
        btn_color.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_colorActionPerformed(evt);
            }
        });
        jMenu2.add(btn_color);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Automatas");

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/boton-de-reproduccion.png"))); // NOI18N
        jMenuItem6.setText("Asignación Variables");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/letra-n.png"))); // NOI18N
        jMenuItem7.setText("Numeros Reales");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/jugar (1).png"))); // NOI18N
        jMenuItem8.setText("Nombre de Variables");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);

        jMenuItem12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/play.png"))); // NOI18N
        jMenuItem12.setText("Segundo Parcial");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem12);

        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/letra-r.png"))); // NOI18N
        jMenuItem11.setText("Numeros Racionales");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem11);

        jmenu_binario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/codigo-binario.png"))); // NOI18N
        jmenu_binario.setText("Automata Binario");
        jmenu_binario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenu_binarioActionPerformed(evt);
            }
        });
        jMenu3.add(jmenu_binario);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
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
                guardarArchivo=null;
            }else{//TEXTO SI MODIFICADO
            
                int i= JOptionPane.showConfirmDialog(this,"¿Desea Guardar Cambios?","Limpiar Texto",
                        JOptionPane.YES_NO_CANCEL_OPTION);

                if(i==0){//BOTON SI
                    //System.out.println("SIIIII");
                    gArchivo();
                    jTextArea1.setText("");//LIMPIRA EL JTEXTAREA1
                    modificado=false;//VARIABLE PARA SABER SI MODICADO
                    guardarArchivo=null;
                }else if(i==1){//BOTON NO
                    //System.out.println("NOOO");
                    jTextArea1.setText("");//LIMPIRA EL JTEXTAREA1
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

    private void btn_colorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_colorActionPerformed
//       JColorChooser selectColor=new JColorChooser();
//       Color jColor;
//        if (jColor=JColorChooser.showDialog(this,"Selecionar Color",jcolor)!=null) {
//            selectColor=jColor;
//            jTextArea1.setForeground(selectColor);
//        }
    }//GEN-LAST:event_btn_colorActionPerformed

    private void btn_asignacion_variablesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_asignacion_variablesActionPerformed
       int todo=lista_errores.getSelectedIndex();//Limpia la lista
        errores.removeAllElements();//Limpia la lista
        // AUTOMATA ASIGNACION DE VARIABLES11111
        
        String texto=jTextArea1.getText();
       
        //texto=texto.replaceAll(";","");//QUITA LOS ;
        
        String[] partes=texto.split("\n");
        
        
        for (int i = 0;i<partes.length; i++) {
            
            texto=partes[i].replaceAll("\\s","");//QUITA LOS ESPACIOS
            //texto=texto.replaceFirst("=","");//QUITA LOS IGUALES
            run(texto,i+1);
        }
    }//GEN-LAST:event_btn_asignacion_variablesActionPerformed
    
    public void run(String texto,int linea){
         // AUTOMATA 1
        int Estado=1,n=0;
        //String texto=jTextArea1.getText();
        //texto=texto.replaceAll("\\s","");//QUITA LOS ESPACIOS
        
        char cadena[];
        cadena=texto.toCharArray();
        while(n<cadena.length){//RECORRE LA CADENA HASTA EL FINAL
            switch(Estado){
                case 1:             
                    if(Character.isLetter(cadena[n])){//INDICA SI ES UNA CADENA
                        Estado=2;
                    }
                    else if(cadena[n]==':'){
                        Estado=3;
                    }
                    else if(Character.isDigit(cadena[n])){//INDICA SI ES UN DIGITO
                        Estado=5;
                    }
                    else{
                        errores.addElement("Linea "+linea+" Se econtro un Error 1: "+cadena[n]);
                        return;//SALE DEL CICLO WHILE
                    }
                    break;
                case 2: 
                    if(Character.isLetter(cadena[n])){
                        Estado=2;
                    }
                    else if(Character.isDigit(cadena[n])){
                        Estado=2;
                    }
                    else{
                        errores.addElement("Linea "+linea+" Se econtro un Error 2: "+cadena[n]);
                        return;
                    }
                    break;
                case 3:
                    if(cadena[n]=='='){
                        Estado=4;
                    }
                    //if(cadena[n]!='='){
                    else{
                        errores.addElement("Linea "+linea+" Se econtro un Error 3: "+cadena[n]);  
                        return;
                    }
                     
                    break;
                case 4:
                    if(cadena[n]!=' '){
                        errores.addElement("Linea "+linea+" Se econtro un Error 4: "+cadena[n]);
                        return;
                    }      
                    break;
                case 5:
                    if(!Character.isDigit(cadena[n])){
                        errores.addElement("Linea "+linea+" Se econtro un Error 5: "+cadena[n]);
                        return;
                    }
                    break;
            }///FIN CASE
        n++;//CONTADOR
        }///FIN WHILE

        if(Estado==1){
        
            errores.addElement("Linea "+linea+" Se econtro un Error: "+cadena[n]);
                        
           return;
        }
        if(Estado==3){
        
            errores.addElement("Linea "+linea+" Se econtro un Error: "+cadena[n]);
                        
           return;
        }
    }
    
    private void btn_guardarcomoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarcomoActionPerformed
       // BARRA DEL MENU  GUARDAR_COMO
        try{
            guardarArchivo();
            
        }catch(Exception excepcion){
            System.out.println("Error al guardar boton");
        }

    }//GEN-LAST:event_btn_guardarcomoActionPerformed

    
    
    
    private void btn_numeros_realesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_numeros_realesActionPerformed
        int todo=lista_errores.getSelectedIndex();//Limpia la lista
        errores.removeAllElements();//Limpia la lista
        // AUTOMATA NUMERO REAL
        
        String texto=jTextArea1.getText();
        String[] partes=texto.split("\n");
        
        for (int i = 0;i<partes.length; i++) {
            
            texto=partes[i].replaceAll("\\s","");//QUITA LOS ESPACIOS
            //errores.addElement("Partes"+partes[i]);
            NumeroReal(texto,i+1);
        }
    }//GEN-LAST:event_btn_numeros_realesActionPerformed

    private void btn_variableNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_variableNombreActionPerformed
        // TERCER AUTOMATA
        int todo=lista_errores.getSelectedIndex();//Limpia la lista
        errores.removeAllElements();//Limpia la lista
        // AUTOMATA ASIGNACION VARIABLE
        
        String texto=jTextArea1.getText();
        String[] partes=texto.split("\n");
        
        for (int i = 0;i<partes.length; i++) {
            
            texto=partes[i].replaceAll("\\s","");//QUITA LOS ESPACIOS
            //errores.addElement("Partes"+partes[i]);
            AsignacionVariable(texto,i+1);
        }
        
    }//GEN-LAST:event_btn_variableNombreActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // SUB-MENU A3
        // TERCER AUTOMATA
        int todo=lista_errores.getSelectedIndex();//Limpia la lista
        errores.removeAllElements();//Limpia la lista
        // AUTOMATA ASIGNACION VARIABLE
        
        String texto=jTextArea1.getText();
        String[] partes=texto.split("\n");
        
        for (int i = 0;i<partes.length; i++) {
            
            texto=partes[i].replaceAll("\\s","");//QUITA LOS ESPACIOS
            //errores.addElement("Partes"+partes[i]);
            AsignacionVariable(texto,i+1);
        }
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // SUB-MENU A2 NREALES
        int todo=lista_errores.getSelectedIndex();//Limpia la lista
        errores.removeAllElements();//Limpia la lista
        // AUTOMATA NUMERO REAL
        
        String texto=jTextArea1.getText();
        String[] partes=texto.split("\n");
        
        for (int i = 0;i<partes.length; i++) {
            
            texto=partes[i].replaceAll("\\s","");//QUITA LOS ESPACIOS
            //errores.addElement("Partes"+partes[i]);
            NumeroReal(texto,i+1);
        }
        
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // SUB-MENU AUTOMATA1
        int todo=lista_errores.getSelectedIndex();//Limpia la lista
        errores.removeAllElements();//Limpia la lista
        // AUTOMATA ASIGNACION DE VARIABLES
        
        String texto=jTextArea1.getText();
        //texto=texto.replaceAll(";","");//QUITA LOS ;
        //texto=texto.replaceAll("int","");//QUITA LOS INT
        
        String[] partes=texto.split("\n");
        
        
        for (int i = 0;i<partes.length; i++) {
            
            texto=partes[i].replaceAll("\\s","");//QUITA LOS ESPACIOS
            //texto=texto.replaceFirst("=","");//QUITA LOS IGUALES
        
            run(texto,i+1);
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        
        // SUB-MENU  GUARDAR_COMO
        try{
            guardarArchivo();
        }catch(Exception excepcion){
            System.out.println("Error al guardar boton");
        }
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         // SUB-MENU A4
   
        int todo=lista_errores.getSelectedIndex();//Limpia la lista
        errores.removeAllElements();//Limpia la lista
        // AUTOMATA ASIGNACION VARIABLE
        
        String texto=jTextArea1.getText();
        String[] partes=texto.split("\n");
        
        for (int i = 0;i<partes.length; i++) {
            
            texto=partes[i].replaceAll("\\s","");//QUITA LOS ESPACIOS
           
            SegundoParcial(texto,i+1);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_racionalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_racionalesActionPerformed
        // AUTOMALA NUMEROS RACIONALES
        int todo=lista_errores.getSelectedIndex();//Limpia la lista
        errores.removeAllElements();//Limpia la lista
        String texto=jTextArea1.getText();
        String[] partes=texto.split("\n");
        
        for (int i = 0;i<partes.length; i++) {
            
            texto=partes[i].replaceAll("\\s","");//QUITA LOS ESPACIOS
           
            numeros_racionales(texto,i+1);
        }
        
    }//GEN-LAST:event_btn_racionalesActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // SUB-MENU NUMEROS RACIONALES
        int todo=lista_errores.getSelectedIndex();//Limpia la lista
        errores.removeAllElements();//Limpia la lista
        String texto=jTextArea1.getText();
        String[] partes=texto.split("\n");
        
        for (int i = 0;i<partes.length; i++) {
            
            texto=partes[i].replaceAll("\\s","");//QUITA LOS ESPACIOS
            numeros_racionales(texto,i+1);
        }
        
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // SEGUNDO PARCIAL
        int todo=lista_errores.getSelectedIndex();//Limpia la lista
        errores.removeAllElements();//Limpia la lista
        // AUTOMATA ASIGNACION VARIABLE
        
        String texto=jTextArea1.getText();
        String[] partes=texto.split("\n");
        
        for (int i = 0;i<partes.length; i++) {
            
            texto=partes[i].replaceAll("\\s","");//QUITA LOS ESPACIOS
           
            SegundoParcial(texto,i+1);
        }
        
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void btn_01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_01ActionPerformed
        // AUTOMATA DE 0S Y 1S
        int todo=lista_errores.getSelectedIndex();//Limpia la lista
        errores.removeAllElements();//Limpia la lista
        
        String texto=jTextArea1.getText();
        String[] partes=texto.split("\n");
        
        for (int i = 0;i<partes.length; i++) {
            
            texto=partes[i].replaceAll("\\s","");//QUITA LOS ESPACIOS
           
            binario(texto,i+1);
        }
        
    }//GEN-LAST:event_btn_01ActionPerformed

    private void jmenu_binarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenu_binarioActionPerformed
        // MENU AUTOMATA BINARIO
        int todo=lista_errores.getSelectedIndex();//Limpia la lista
        errores.removeAllElements();//Limpia la lista
        
        String texto=jTextArea1.getText();
        String[] partes=texto.split("\n");
        
        for (int i = 0;i<partes.length; i++) {
            
            texto=partes[i].replaceAll("\\s","");//QUITA LOS ESPACIOS
           
            binario(texto,i+1);
        }
    }//GEN-LAST:event_jmenu_binarioActionPerformed
    
    public void binario(String texto,int linea){
        int Estado=0,n=0;
        char cadena[];
        cadena=texto.toCharArray();
       
        
        while(n<cadena.length){//RECORRE LA CADENA HASTA EL FINAL
            switch(Estado){
                case 0:
                    if(cadena[n]=='0'){
                        Estado=1;
                    }
                    else if(cadena[n]=='1'){
                        Estado=3;
                    }                   
                    else{
                        errores.addElement("Linea "+linea+" Se econtro un Error : "+cadena[n]);
                        return;//SALE DEL CICLO WHILE
                    }
                break;
                 case 1:
                    if(cadena[n]=='0'){
                        Estado=2;
                    }
                    else if(cadena[n]=='1'){
                        Estado=3;
                    } 
                    else{
                        errores.addElement("Linea "+linea+" Se econtro un Error 1: "+cadena[n]);
                        return;//SALE DEL CICLO WHILE
                    }
                break;
                case 2:
                    if(cadena[n]=='1'){
                        Estado=2;
                    } 
                    else if(cadena[n]=='0'){
                        Estado=2;
      
                    }
                    else{
                        errores.addElement("Linea "+linea+" Se econtro un Error 2: "+cadena[n]);
                        return;//SALE DEL CICLO WHILE
                    }
                break;
                case 3:
                    if(cadena[n]=='1'){
                        Estado=3;
                    }
                    else if(cadena[n]=='0'){
                        Estado=3;
                    } 
                    else{
                        errores.addElement("Linea "+linea+" Se econtro un Error 3: "+cadena[n]);
                        return;//SALE DEL CICLO WHILE
                    }
                break;
               
               
                     
            }//switch
            n++;//CONTADOR           
        }//while
        
        if(Estado!=3 && Estado!=1){
            errores.addElement("Linea "+linea+" Se econtro un Error en: "+texto);
             return;
        }
    }//TERMINA FUNCION BINARIO
    
    
    public void numeros_racionales(String texto,int linea){
        int Estado=1,n=0;
        char cadena[];
        cadena=texto.toCharArray();
       
        
        while(n<cadena.length){//RECORRE LA CADENA HASTA EL FINAL
            switch(Estado){
                case 1:
                    if(cadena[n]=='+'){
                        Estado=2;
                    }
                    else if(cadena[n]=='-'){
                        Estado=2;
                    }
                    else if(Character.isDigit(cadena[n])){
                        Estado=3;
                    }
                    else{
                        errores.addElement("Linea "+linea+" Se econtro un Error 1: "+cadena[n]);
                        return;//SALE DEL CICLO WHILE
                    }
                break;
                 case 2:
                    if(Character.isDigit(cadena[n])){
                        Estado=3;
                    }
                    else{
                        errores.addElement("Linea "+linea+" Se econtro un Error 2: "+cadena[n]);
                        return;//SALE DEL CICLO WHILE
                    }
                break;
                case 3:
                    if(Character.isDigit(cadena[n])){
                        Estado=3;
                    }
                    else if(cadena[n]=='.'){
                        Estado=4;
      
                    }
                    else{
                        errores.addElement("Linea "+linea+" Se econtro un Error 3: "+cadena[n]);
                        return;//SALE DEL CICLO WHILE
                    }
                break;
                case 4:
                   if(Character.isDigit(cadena[n])){
                        Estado=5;
                    }else{
                        errores.addElement("Linea "+linea+" Se econtro un Error 2: "+cadena[n]);
                        return;//SALE DEL CICLO WHILE
                    }
                break;
                case 5:
                   if(Character.isDigit(cadena[n])){
                        Estado=5;
                    }else{
                        errores.addElement("Linea "+linea+" Se econtro un Error 2: "+cadena[n]);
                        return;
                    }
                break;
               
                     
            }//switch
            n++;//CONTADOR           
        }//while
        
        if(Estado!=5){
            errores.addElement("Linea "+linea+" Se econtro un Error en: "+texto);
             return;
        }
        
        
    }//TERMINA FUNCION NUMERO RACIONALES
    public void SegundoParcial(String texto,int linea){
        int Estado=1,n=0;
   
        char cadena[];
        cadena=texto.toCharArray();
       
        
        while(n<cadena.length){//RECORRE LA CADENA HASTA EL FINAL
            switch(Estado){
                case 1:
                    if(cadena[n]=='&'){//INDICA SI ES &
                        Estado=2;
                    }    
                    else{
                        errores.addElement("Linea "+linea+" Se econtro un Error 1: "+cadena[n]);
                        return;//SALE DEL CICLO WHILE
                    }
                break;
                 case 2:
                    if(cadena[n]=='_'){//INDICA SI ES UNA CADENA
                        Estado=3;
                    }
                    else if(Character.isLetter(cadena[n])){//INDICA SI ES UNA CADENA
                        Estado=3;
                    }
                    
                    else{
                        errores.addElement("Linea "+linea+" Se econtro un Error 2: "+cadena[n]);
                        return;//SALE DEL CICLO WHILE
                    }
                break;
                case 3:
                    if(Character.isLetter(cadena[n])){//INDICA SI ES UNA CADENA
                        Estado=4;
                    }
                    else if(Character.isDigit(cadena[n])){//INDICA SI ES UN DIGITO
                        Estado=4;
                        
                        
                    }
                    else{
                        errores.addElement("Linea "+linea+" Se econtro un Error 3: "+cadena[n]);
                        return;//SALE DEL CICLO WHILE
                    }
                break;
                case 4:
                    if(cadena[n]=='_'){//INDICA SI ES UNA CADENA
                        Estado=4;
                    }
                    else if(Character.isLetter(cadena[n])){//INDICA SI ES UNA CADENA
                        Estado=4;
                    }
                    else if(Character.isDigit(cadena[n])){//INDICA SI ES UN DIGITO
                        Estado=4;
                    }
                    
      
                    else{
                        errores.addElement("Linea "+linea+" Se econtro un Error 2: "+cadena[n]);
                        return;//SALE DEL CICLO WHILE
                    }
                break;
               
                     
            }//switch
            n++;//CONTADOR           
        }//while
        
        if(Estado!=4){
            errores.addElement("Linea "+linea+" Se econtro un Error "+texto);
             return;//SALE DEL CICLO WHILE
        }
        
    }//TERMINA FUNCION SEGUNDO PARCIAL
    
    public void AsignacionVariable(String texto,int linea){
        int Estado=1,n=0;
   
        char cadena[];
        cadena=texto.toCharArray();
       
        
        while(n<cadena.length){//RECORRE LA CADENA HASTA EL FINAL
            switch(Estado){
                case 1:
                    if(Character.isLetter(cadena[n])){//INDICA SI ES UNA CADENA
                        Estado=3;
                    }
                    else if(Character.isDigit(cadena[n])){//INDICA SI ES UN DIGITO
                        Estado=2;
                        errores.addElement("Linea "+linea+" Se econtro un Error 2: "+cadena[n]);
                    
                        
                    }
                    else{
                        errores.addElement("Linea "+linea+" Se econtro un Error 1: "+cadena[n]);
                        return;//SALE DEL CICLO WHILE
                    }
                break;
               case 2:
                   //errores.addElement("Linea "+linea+" Se econtro un Error 2: "+cadena[n]);
                    
                    if(true){
                        
                    return;//SALE DEL CICLO WHILE
                        
                    }
                    

                break;
                case 3:
                    if(Character.isLetter(cadena[n])){//INDICA SI ES UNA CADENA
                        Estado=3;
                    }
                    else if(Character.isDigit(cadena[n])){//INDICA SI ES UN DIGITO
                        Estado=3;
                    }
                    else{
                        errores.addElement("Linea "+linea+" Se econtro un Error 3: "+cadena[n]);
                        return;//SALE DEL CICLO WHILE
                    }
                break;      
            }//switch
            n++;//CONTADOR           
        }//while
        
        if(Estado!=3){
            errores.addElement(" Se econtro un Error ");
             return;//SALE DEL CICLO WHILE
        }
    }//TERMINA EL TERCER AUTOMATA
    
 
    
    public void NumeroReal(String texto,int linea){
        int Estado=1,n=0;
   
        char cadena[];
        cadena=texto.toCharArray();
       
        
        while(n<cadena.length){//RECORRE LA CADENA HASTA EL FINAL
            switch(Estado){
                case 1:
                    if(Character.isDigit(cadena[n])){//INDICA SI ES UN DIGITO
                        Estado=2;
                    }
                    else{
                        errores.addElement("Linea "+linea+" Se econtro un Error 1: "+cadena[n]);
                        return;//SALE DEL CICLO WHILE
                    }
                break;
                case 2:
                    if(Character.isDigit(cadena[n])){//INDICA SI ES UN DIGITO
                        Estado=2;
                    }
                    else if(cadena[n]=='E')
                    {
                        Estado=5;
                    }
                    else if(cadena[n]=='.')
                    {
                        Estado=3;
                    }
                    
                    else{
                        errores.addElement("Linea "+linea+" Se econtro un Error 2: "+cadena[n]);
                        return;//SALE DEL CICLO WHILE
                    }
                break;
                case 3:
                    if(Character.isDigit(cadena[n])){//INDICA SI ES UN DIGITO
                        Estado=4;
                    }
                    else{
                        errores.addElement("Linea "+linea+" Se econtro un Error 3: "+cadena[n]);
                        return;//SALE DEL CICLO WHILE
                    }
                break;
                case 4:
                    if(Character.isDigit(cadena[n])){//INDICA SI ES UN DIGITO
                        Estado=4;
                    }
                    else if(cadena[n]=='E'){
                        Estado=5;
                    }
                    else{
                        errores.addElement("Linea "+linea+" Se econtro un Error 4: "+cadena[n]);
                        return;//SALE DEL CICLO WHILE
                    }
                break;
                case 5:
                    if(cadena[n]=='+'){
                        Estado=6;
                    }
                    else if(cadena[n]=='-'){
                        Estado=6;
                    }
                    else if(Character.isDigit(cadena[n])){//INDICA SI ES UN DIGITO
                        Estado=7;
                    }
                    else{
                        errores.addElement("Linea "+linea+" Se econtro un Error 5: "+cadena[n]);
                        return;//SALE DEL CICLO WHILE
                    }
                break;
                case 6:
                    if(Character.isDigit(cadena[n])){//INDICA SI ES UN DIGITO
                        Estado=7;
                    }
                    else{
                        errores.addElement("Linea "+linea+" Se econtro un Error 6: "+cadena[n]);
                        return;//SALE DEL CICLO WHILE
                    }
                break;
                case 7:
                    if(Character.isDigit(cadena[n])){//INDICA SI ES UN DIGITO
                        Estado=7;
                    }
                    else{
                        errores.addElement("Linea "+linea+" Se econtro un Error 7: "+cadena[n]);
                        return;//SALE DEL CICLO WHILE
                    }
                break;
                
                
            }//switch
            
            n++;//CONTADOR           
        }//while
        
        if(Estado!=7 && Estado!=4){
            errores.addElement("Linea "+linea+" Se econtro un Error en: "+texto);
                       
        }
        
        
        
    }//TERMINA LA FUNCION NREAL
    
    
    
    
    
    
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
    private javax.swing.JButton btn_01;
    private javax.swing.JButton btn_abrir;
    private javax.swing.JButton btn_asignacion_variables;
    private javax.swing.JMenuItem btn_color;
    private javax.swing.JMenuItem btn_fuente;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_guardarcomo;
    private javax.swing.JButton btn_nuevo;
    private javax.swing.JButton btn_numeros_reales;
    private javax.swing.JButton btn_racionales;
    private javax.swing.JButton btn_variableNombre;
    private javax.swing.JMenuItem btnc_abrir;
    private javax.swing.JMenuItem btnc_guardar;
    private javax.swing.JMenuItem btnc_nuevo;
    private javax.swing.JMenuItem btnc_salir;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem jmenu_binario;
    private javax.swing.JList<String> lista_errores;
    // End of variables declaration//GEN-END:variables
}
