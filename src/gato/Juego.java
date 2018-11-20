package gato;
import static gato.Gato.empatados;
import static gato.Gato.ganadosE;
import static gato.Gato.ganadosO;
import static gato.Gato.ganadosX;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Juego extends javax.swing.JFrame {
    private int turno;//--------------------
    private boolean empatados;
    public static boolean habilitador;

    public Juego() {
        this.turno = 1;//---------------------
        initComponents();
        jLabel2.setText("X");
        Gato gato = new Gato();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Juego del Gato");
        setLocation(new java.awt.Point(50, 0));
        setResizable(false);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Turno:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("--");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 204, 0));
        jLabel3.setText("Juegos ganados O:");
        jLabel3.setToolTipText("");

        jButton10.setText("Nuevo Juego");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("Juegos ganados X:");
        jLabel4.setToolTipText("");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 51, 255));
        jLabel5.setText("Empates:");
        jLabel5.setToolTipText("");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 204, 0));
        jLabel6.setText("0");
        jLabel6.setToolTipText("");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("0");
        jLabel7.setToolTipText("");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 0, 255));
        jLabel8.setText("0");
        jLabel8.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(49, 49, 49))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel5)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(34, 34, 34)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(571, 372));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if(habilitador == true)return;
        if(turno == 1){
            jButton5.setText("X");
            jButton5.setBackground(Color.red);
            turno = 2;
            jLabel2.setText("O");
            jLabel2.setForeground(Color.GREEN);
        }else {
            jButton5.setText("O");
            jButton5.setBackground(Color.GREEN);
            turno = 1;
            jLabel2.setText("X");
            jLabel2.setForeground(Color.red);
        }
        jButton5.setEnabled(false);

        Gato.comprobar(jButton1.getText(),jButton2.getText(),jButton3.getText(),jButton4.getText(),jButton5.getText(),jButton6.getText(),jButton7.getText(),jButton8.getText(),jButton9.getText());
        contador();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(habilitador == true)return;
        if(turno == 1){
            jButton1.setText("X");
            jButton1.setBackground(Color.red);
            turno = 2;
            jLabel2.setText("O");
            jLabel2.setForeground(Color.GREEN);
        }else {
            jButton1.setText("O");
            jButton1.setBackground(Color.GREEN);
            turno = 1;
            jLabel2.setText("X");
            jLabel2.setForeground(Color.red);
        }
        jButton1.setEnabled(false);
        Gato.comprobar(jButton1.getText(),jButton2.getText(),jButton3.getText(),jButton4.getText(),jButton5.getText(),jButton6.getText(),jButton7.getText(),jButton8.getText(),jButton9.getText());
        contador();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(habilitador == true)return;
        if(turno == 1){
            jButton2.setText("X");
            jButton2.setBackground(Color.red);
            turno = 2;
            jLabel2.setText("O");
            jLabel2.setForeground(Color.GREEN);
        }else {
            jButton2.setText("O");
            jButton2.setBackground(Color.GREEN);
            turno = 1;
            jLabel2.setText("X");
            jLabel2.setForeground(Color.red);
        }
        jButton2.setEnabled(false);
        Gato.comprobar(jButton1.getText(),jButton2.getText(),jButton3.getText(),jButton4.getText(),jButton5.getText(),jButton6.getText(),jButton7.getText(),jButton8.getText(),jButton9.getText());
        contador();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(habilitador == true)return;
        if(turno == 1){
            jButton3.setText("X");
            jButton3.setBackground(Color.red);
            turno = 2;
            jLabel2.setText("O");
            jLabel2.setForeground(Color.GREEN);
        }else {
            jButton3.setText("O");
            jButton3.setBackground(Color.GREEN);
            turno = 1;
            jLabel2.setText("X");
            jLabel2.setForeground(Color.red);
        }
        jButton3.setEnabled(false);
        Gato.comprobar(jButton1.getText(),jButton2.getText(),jButton3.getText(),jButton4.getText(),jButton5.getText(),jButton6.getText(),jButton7.getText(),jButton8.getText(),jButton9.getText());
        contador();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(habilitador == true)return;
        if(turno == 1){
            jButton4.setText("X");
            jButton4.setBackground(Color.red);
            turno = 2;
            jLabel2.setText("O");
            jLabel2.setForeground(Color.GREEN);
        }else {
            jButton4.setText("O");
            jButton4.setBackground(Color.GREEN);
            turno = 1;
            jLabel2.setText("X");
            jLabel2.setForeground(Color.red);
        }
        jButton4.setEnabled(false);
        Gato.comprobar(jButton1.getText(),jButton2.getText(),jButton3.getText(),jButton4.getText(),jButton5.getText(),jButton6.getText(),jButton7.getText(),jButton8.getText(),jButton9.getText());
        contador();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if(habilitador == true)return;
        if(turno == 1){
            jButton6.setText("X");
            jButton6.setBackground(Color.red);
            turno = 2;
            jLabel2.setText("O");
            jLabel2.setForeground(Color.GREEN);
        }else {
            jButton6.setText("O");
            jButton6.setBackground(Color.GREEN);
            turno = 1;
            jLabel2.setText("X");
            jLabel2.setForeground(Color.red);
        }
        jButton6.setEnabled(false);
        Gato.comprobar(jButton1.getText(),jButton2.getText(),jButton3.getText(),jButton4.getText(),jButton5.getText(),jButton6.getText(),jButton7.getText(),jButton8.getText(),jButton9.getText());
        contador();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if(habilitador == true)return;
        if(turno == 1){
            jButton7.setText("X");
            jButton7.setBackground(Color.red);
            turno = 2;
            jLabel2.setText("O");
            jLabel2.setForeground(Color.GREEN);
        }else {
            jButton7.setText("O");
            jButton7.setBackground(Color.GREEN);
            turno = 1;
            jLabel2.setText("X");
            jLabel2.setForeground(Color.red);
        }
        jButton7.setEnabled(false);
        Gato.comprobar(jButton1.getText(),jButton2.getText(),jButton3.getText(),jButton4.getText(),jButton5.getText(),jButton6.getText(),jButton7.getText(),jButton8.getText(),jButton9.getText());
       contador();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if(habilitador == true)return;
        if(turno == 1){
            jButton8.setText("X");
            jButton8.setBackground(Color.red);
            turno = 2;
            jLabel2.setText("O");
            jLabel2.setForeground(Color.GREEN);
        }else {
            jButton8.setText("O");
            jButton8.setBackground(Color.GREEN);
            turno = 1;
            jLabel2.setText("X");
            jLabel2.setForeground(Color.red);
        }
        jButton8.setEnabled(false);
        Gato.comprobar(jButton1.getText(),jButton2.getText(),jButton3.getText(),jButton4.getText(),jButton5.getText(),jButton6.getText(),jButton7.getText(),jButton8.getText(),jButton9.getText());
        contador();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if(habilitador == true)return;
        if(turno == 1){
            jButton9.setText("X");
            jButton9.setBackground(Color.red);
            turno = 2;
            jLabel2.setText("O");
            jLabel2.setForeground(Color.GREEN);
        }else {
            jButton9.setText("O");
            jButton9.setBackground(Color.GREEN);
            jLabel2.setText("X");
            jLabel2.setForeground(Color.red);
            turno = 1;
        }
        jButton9.setEnabled(false);
        Gato.comprobar(jButton1.getText(),jButton2.getText(),jButton3.getText(),jButton4.getText(),jButton5.getText(),jButton6.getText(),jButton7.getText(),jButton8.getText(),jButton9.getText());
        contador();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        this.habilitador = false;        
        //Borramos los textos de los botones
        jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        jButton4.setText("");
        jButton5.setText("");
        jButton6.setText("");
        jButton7.setText("");
        jButton8.setText("");
        jButton9.setText("");
        //Habilitamos botones
        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton4.setEnabled(true);
        jButton5.setEnabled(true);
        jButton6.setEnabled(true);
        jButton7.setEnabled(true);
        jButton8.setEnabled(true);
        jButton9.setEnabled(true);
        //Restauramos el backgrond color de los botones
        jButton1.setBackground(new JButton().getBackground());
        jButton2.setBackground(new JButton().getBackground());
        jButton3.setBackground(new JButton().getBackground());
        jButton4.setBackground(new JButton().getBackground());
        jButton5.setBackground(new JButton().getBackground());
        jButton6.setBackground(new JButton().getBackground());
        jButton7.setBackground(new JButton().getBackground());
        jButton8.setBackground(new JButton().getBackground());
        jButton9.setBackground(new JButton().getBackground());
        //Cambiamos el turno para que empiece el que perdio
        if (jLabel2.getText() == "X"){
        jLabel2.setText("X");
        turno = 1;
        }else{
           jLabel2.setText("O");
           turno = 2;
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private  void deshabilitador(){
        jButton1.setEnabled(false);
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);
        jButton5.setEnabled(false);
        jButton6.setEnabled(false);
        jButton7.setEnabled(false);
        jButton8.setEnabled(false);
        jButton9.setEnabled(false);
    }

    public void contador(){
        jLabel6.setText(Integer.toString(ganadosO));
        jLabel7.setText(Integer.toString(ganadosX));
        jLabel8.setText(Integer.toString(ganadosE));
    }

    public  void mensaje(String tipo){
        switch(tipo){
            case "X":  
                JOptionPane.showMessageDialog(null, "    Gano " + tipo, "Mensaje", 1);
                ganadosX = ganadosX + 1;
                this.habilitador = true;
                this.deshabilitador();
                break;
            case "O":  
                JOptionPane.showMessageDialog(null, "    Gano " + tipo, "Mensaje", 1);
                ganadosO = ganadosO + 1;
                this.habilitador = true;
                this.deshabilitador();
                break;
            case "E": 
                JOptionPane.showMessageDialog(null, "Esto es un Empate", "Mensaje", 1);
                ganadosE = ganadosE + 1;
            break;   
        }
    }
        
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
