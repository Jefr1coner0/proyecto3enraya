/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TresenRaya;
import java.awt.Color;
import javax.swing.JLabel;

/**
 *
 * @author usuario
 */
public class TicTacToe extends javax.swing.JFrame {
    boolean estado=true; //si es true se puede escribir
    String siguientejuego="O";
    String turno="X";
    JLabel lbs[]= new JLabel[9];
    int vs [][]={
        {1,2,3},
        {4,5,6},
        {7,8,9},
        {1,4,7},
        {2,5,8},
        {3,6,9},
        {1,5,9},
        {3,5,7}
        
    };
    
    public TicTacToe() {
        initComponents();
this.setLocationRelativeTo(null);           
        lbs[0]=jLabel1;
        lbs[1]=jLabel2;
        lbs[2]=jLabel3;
        lbs[3]=jLabel4;
        lbs[4]=jLabel5;
        lbs[5]=jLabel6;
        lbs[6]=jLabel7;
        lbs[7]=jLabel8;
        lbs[8]=jLabel9;
        
    
}


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel15 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        lbpuntajeo = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lbpuntajex = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        lbturno = new javax.swing.JLabel();

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("x=");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 0));

        jPanel2.setBackground(new java.awt.Color(51, 102, 255));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Evaluacion Unidad II");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Nombres:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Wrangler Choquechambi Luque");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGap(34, 34, 34))
        );

        jPanel1.setBackground(new java.awt.Color(0, 0, 204));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setOpaque(true);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setOpaque(true);
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel4MousePressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setOpaque(true);
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel5MousePressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setOpaque(true);
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel6MousePressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setOpaque(true);
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel7MousePressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setOpaque(true);
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel8MousePressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setOpaque(true);
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel9MousePressed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setOpaque(true);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setOpaque(true);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(0, 204, 0));

        jButton1.setBackground(new java.awt.Color(0, 204, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Reiniciar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("0=");

        lbpuntajeo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lbpuntajeo.setForeground(new java.awt.Color(255, 255, 255));
        lbpuntajeo.setText("0");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("x=");

        lbpuntajex.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lbpuntajex.setForeground(new java.awt.Color(255, 255, 255));
        lbpuntajex.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbpuntajex.setText("0");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "#", "Jugador 1", "Jugador 2", "Ganador", "Puntaje", "Estado"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(20);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(25);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(30);
            jTable1.getColumnModel().getColumn(1).setMinWidth(60);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(80);
            jTable1.getColumnModel().getColumn(1).setMaxWidth(100);
            jTable1.getColumnModel().getColumn(2).setMinWidth(60);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(80);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(100);
            jTable1.getColumnModel().getColumn(3).setMinWidth(60);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(80);
            jTable1.getColumnModel().getColumn(3).setMaxWidth(100);
            jTable1.getColumnModel().getColumn(4).setMinWidth(80);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(80);
            jTable1.getColumnModel().getColumn(4).setMaxWidth(100);
            jTable1.getColumnModel().getColumn(5).setMinWidth(75);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(60);
            jTable1.getColumnModel().getColumn(5).setMaxWidth(90);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbpuntajex, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(141, 141, 141)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbpuntajeo)
                        .addGap(0, 110, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                        .addComponent(lbpuntajex)
                        .addComponent(lbpuntajeo)))
                .addGap(52, 52, 52)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 153, 0));

        lbturno.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbturno.setForeground(new java.awt.Color(255, 255, 255));
        lbturno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbturno.setText("Turno de X");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbturno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lbturno, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        presionar(1);
    }//GEN-LAST:event_jLabel1MousePressed

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        presionar(2);
    }//GEN-LAST:event_jLabel2MousePressed

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        presionar(3);
    }//GEN-LAST:event_jLabel3MousePressed

    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed
        presionar(4);
    }//GEN-LAST:event_jLabel4MousePressed

    private void jLabel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MousePressed
        presionar(5);
    }//GEN-LAST:event_jLabel5MousePressed

    private void jLabel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MousePressed
        presionar(6);
    }//GEN-LAST:event_jLabel6MousePressed

    private void jLabel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MousePressed
        presionar(7);
    }//GEN-LAST:event_jLabel7MousePressed

    private void jLabel8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MousePressed
        presionar(8);
    }//GEN-LAST:event_jLabel8MousePressed

    private void jLabel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MousePressed
        presionar(9);
    }//GEN-LAST:event_jLabel9MousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        for (int i= 0; i< lbs.length; i++) {
        lbs[i].setText("");
        lbs[i].setBackground(Color.white);
        }
        turno=siguientejuego;
        if(siguientejuego.equals("O")){
            siguientejuego="X";
        }else{
        siguientejuego="O";
        }
        
        lbturno.setText("Turno de "+turno);
        estado=true;

    }//GEN-LAST:event_jButton1ActionPerformed

    public void presionar (int casilla){
        if (lbs[casilla-1].getText().equals("")&&estado){
        lbs [casilla-1].setText(turno);
        cambiarturno();
        comprobarganador();
        }
    }
    
    public void cambiarturno(){
        if(turno.equals("X")){
            turno="O";
        }else{
            turno="X";
        }
        lbturno.setText("Turno de "+turno);
    }
    
    public void comprobarganador(){
        for(int i = 0; i < vs.length;i++ ) {
            if(lbs[vs[i][0]-1].getText().equals("X")&&
                    lbs[vs[i][1]-1].getText().equals("X")&&
                    lbs[vs[i][2]-1].getText().equals("X")){ 
                
                lbs[vs[i][0]-1].setBackground(Color.red);
                lbs[vs[i][1]-1].setBackground(Color.red);
                lbs[vs[i][2]-1].setBackground(Color.red);
            lbpuntajex.setText(Integer.toString(Integer.parseInt(lbpuntajex.getText())+1));   
            lbturno.setText("EL GANADOR ES X ");    
            estado=false;
            } 
            if(lbs[vs[i][0]-1].getText().equals("O")&&
                    lbs[vs[i][1]-1].getText().equals("O")&&
                    lbs[vs[i][2]-1].getText().equals("O")){ 
                
                lbs[vs[i][0]-1].setBackground(Color.red);
                lbs[vs[i][1]-1].setBackground(Color.red);
                lbs[vs[i][2]-1].setBackground(Color.red);
            lbpuntajeo.setText(Integer.toString(Integer.parseInt(lbpuntajeo.getText())+1));   
            lbturno.setText("EL GANADOR ES O ");   
            estado=false;

            } 
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbpuntajeo;
    private javax.swing.JLabel lbpuntajex;
    private javax.swing.JLabel lbturno;
    // End of variables declaration//GEN-END:variables
}
