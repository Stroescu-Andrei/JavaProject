
import com.sun.istack.internal.logging.Logger;
import static java.lang.Integer.parseInt;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrei
 */
public class Robin extends javax.swing.JFrame {

    int Contor; //numarul total de procese introduse
    int NrProces; //numarul procesului care ruleaza
    int TAProces=0; //timpul alocat procesului aflat in executie
    int Cuanta=0; //cuanta aflata in executie
    int TRProces=0; //timpul ramas dintr-un proces aflat in executie
    int TimpulProces=0; //timpul unui proces
    int ValoareIncarcare; //valoarea incarcarii barei
    int Finalizare; //finalizarea procesului
    /**
     * Creates new form Robin
     */
    public void InserareProcese(){ //introducerea unui proces in tabel
        DefaultTableModel model=(DefaultTableModel) tabel1.getModel();
        
        Contor++;
        Object[] Tabla=new Object[5];
        Tabla[0]=Contor;
        Tabla[1]=timpalocatproces.getText();
        Tabla[2]=cuanta.getText();
        Tabla[3]=timpalocatproces.getText();
        Tabla[4]="Gata";
        model.addRow(Tabla);
        tabel1.setModel(model);
        timpalocatproces.setText(null);
        timpalocatproces.grabFocus();
    }
    
    
    
    public Robin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        numeCuanta = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        cuanta = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelfinal = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        alocat = new javax.swing.JLabel();
        timpalocatproces = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        proces = new javax.swing.JLabel();
        procentajproces = new javax.swing.JLabel();
        bara = new javax.swing.JProgressBar();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        finalizareproces = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        timpulproces = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setForeground(new java.awt.Color(0, 204, 204));

        numeCuanta.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        numeCuanta.setText("Cuanta");

        jButton1.setBackground(new java.awt.Color(0, 0, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setText("Adauga");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 51));
        jLabel4.setText("Lista De Procese");

        tabelfinal.setBackground(new java.awt.Color(204, 204, 0));
        tabelfinal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tabelfinal.setForeground(new java.awt.Color(204, 0, 0));
        tabelfinal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "# Proces", "Timpul Alocat Proces", "Cuanta", "Timpul Final", "Stare"
            }
        ));
        jScrollPane1.setViewportView(tabelfinal);

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton2.setText("Start");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        alocat.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        alocat.setText("Timp Alocat Proces");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setText("Proces");

        proces.setBackground(new java.awt.Color(255, 255, 255));
        proces.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        proces.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));

        procentajproces.setBackground(new java.awt.Color(255, 255, 255));
        procentajproces.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        procentajproces.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 0));
        jLabel8.setText("Istoric Procese");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 102, 0));
        jLabel10.setText("Finalizarea Procesului");

        finalizareproces.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        finalizareproces.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 0));
        jLabel12.setText("Timpul Procesului");

        timpulproces.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        timpulproces.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));

        tabel1.setBackground(new java.awt.Color(51, 153, 0));
        tabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tabel1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "# Proces", "Timpul Alocat Proces", "Cuanta", "Timp Ramas Proces", "Stare"
            }
        ));
        jScrollPane2.setViewportView(tabel1);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("Round Robin ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(319, 319, 319))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(87, 87, 87)
                            .addComponent(numeCuanta)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel1)
                            .addGap(54, 54, 54)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(timpalocatproces)
                                .addComponent(alocat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(72, 72, 72)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel9)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(7, 7, 7)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jScrollPane1)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(proces, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(procentajproces, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(bara, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(16, 16, 16))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(cuanta, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel12)
                                        .addComponent(jLabel10))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(finalizareproces, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
                                        .addComponent(timpulproces, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(0, 0, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(334, 334, 334)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(343, 343, 343)
                        .addComponent(jLabel2)))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1)
                    .addComponent(numeCuanta, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alocat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(timpalocatproces, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jButton2))
                    .addComponent(cuanta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jLabel2)
                .addGap(46, 46, 46)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bara, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(procentajproces, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(proces, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50)
                .addComponent(jLabel8)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(finalizareproces, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(timpulproces, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if((Integer.parseInt(timpalocatproces.getText()))<=1000) {
            InserareProcese();
            cuanta.setEditable(false);
        }else{
            JOptionPane.showMessageDialog(null,"Timpul alocat unui proces nu trebuie sa fie mai mare decat 1000!");
            timpalocatproces.setText(null);
            timpalocatproces.grabFocus();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new Thread(new Fir()).start();//crearea unui fir nou 
        //start();
    }//GEN-LAST:event_jButton2ActionPerformed
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
            java.util.logging.Logger.getLogger(Robin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Robin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Robin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Robin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Robin().setVisible(true);
            }
        });
    }
    
    
      public class Fir implements Runnable { //Tip de obiect cu extensie executabilă


    @Override
    public void run() {
        int stare=1;//starea de timp q indică dacă poate fi urmată sau nu
        int i=0; //contor while
        
        while(stare!=0){
            while(i<Contor){//verificarea fiecarui proces inserat 
                Sarcina(i);
                if(TRProces!=0 && TRProces>Cuanta){ //executarea unui proces
                    for(int c=1;c<=Cuanta;c++){
                        tabel1.setValueAt(" Procesare", i, 4);
                        TRProces--;
                        BaraIncarcare(TAProces,TRProces);
                        PictareBaraProgres();
                        tabel1.setValueAt(String.valueOf(TRProces), i , 3);
                        TimpulProces++;
                        IntrerupereProces( );
                    }
                    tabel1.setValueAt(" Asteptare",i,4);
                    if(TRProces==0){
                        tabel1.setValueAt(" Terminat", i, 4);
                        PictareBaraProgres();
                        Raport(i);
                        Stergere(i);
                        bara.setValue(0);   
                    }
                    
                }else{
                    if(TRProces>0 && Cuanta!=0){
                        while(TRProces>0){
                            tabel1.setValueAt(" Procesare",i,4);
                            TRProces--;
                            BaraIncarcare(TAProces,TRProces);
                            PictareBaraProgres();
                            tabel1.setValueAt(String.valueOf(TRProces),i,3);
                            TimpulProces++;
                            IntrerupereProces( );
                        }
                        tabel1.setValueAt(" Asteptare", i, 4);
                        if(TRProces==0 && Cuanta!=0){
                            tabel1.setValueAt(" Terminat",i,4);
                            PictareBaraProgres();
                            Raport(i);
                            Stergere(i);
                            bara.setValue(0);
                        }
                    }else{
                        if(TRProces==0 && Cuanta!=0){
                            tabel1.setValueAt(" Terminat",i,4);
                            PictareBaraProgres();
                            Raport(i);
                            Stergere(i);
                            bara.setValue(0);
                    }
                }
            }
                proces.setText(String.valueOf(""));//șterge conținutul
                procentajproces.setText(String.valueOf(""));
                i++;
        }
             i=0;
             proces.setText(String.valueOf(""));//șterge conținutul
             procentajproces.setText(String.valueOf(""));
    }
    }
      }

      public void start(){//începe secvența procesului
          alocat.setVisible(false);
          numeCuanta.setVisible(false);
          timpalocatproces.setVisible(false);
          cuanta.setVisible(false);
          jButton1.setVisible(false);
          jButton2.setVisible(false);
          
      }
      public void Raport(int c){//adaugă în tabelul de proces finit fiecare proces finalizat
          DefaultTableModel model2=(DefaultTableModel) tabelfinal.getModel();
          
          Object[] Tabla=new Object[5];
          Tabla[0]=c+1;
          Tabla[1]=TAProces;
          Tabla[2]=Cuanta;
          Tabla[3]=TimpulProces+" Secunde";
          Tabla[4]=" Terminat";
          model2.addRow(Tabla);
          tabelfinal.setModel(model2);
          
          Finalizare++;
          finalizareproces.setText(String.valueOf("Procesul "+Finalizare+" s-a terminat!"));
          timpulproces.setText(String.valueOf("Procesul "+Finalizare+" s-a terminat in "+TimpulProces+" Secunde!"));
      }  
      
      public void Stergere(int c){//elimină înregistrările din tabelul de proces
          tabel1.setValueAt(0,c,0);
          tabel1.setValueAt("0",c,1);
          tabel1.setValueAt("0",c,2);
          tabel1.setValueAt("0", c, 3);
          tabel1.setValueAt("*****",c,4);
      }
      
    public void IntrerupereProces( ){
        try{
            Thread.sleep(700); //sistemul de somn al unui proces
        }catch(InterruptedException ex){
            Logger.getLogger(Robin.class).log(Level.SEVERE,null,ex);
        }
    }
     public void Sarcina(int i){//valorile din tabel sunt încărcate
        NrProces=(int) tabel1.getValueAt(i,0);//valorile tabelului
        TAProces=parseInt((String) (tabel1.getValueAt(i, 1)));
        Cuanta=parseInt((String) (tabel1.getValueAt(i, 2)));
        TRProces=parseInt((String) (tabel1.getValueAt(i, 3)));
        if(NrProces>0){
            proces.setText(String.valueOf(NrProces));
        }
    }
    
    public void BaraIncarcare(int timpAlocat, int timpRamas){ //Calcularea procentajul barei și progresul acesteia
        int TimpAlocat=timpAlocat;
        int valoare=100/timpAlocat;
        int procentaj=100-(valoare*timpRamas);
        ValoareIncarcare=procentaj;
        procentajproces.setText(String.valueOf(ValoareIncarcare+"%"));
        
    }
    
    public void PictareBaraProgres(){ //pictarea barari de incarcare a unui proces
        bara.setValue(ValoareIncarcare);
        bara.repaint();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alocat;
    private javax.swing.JProgressBar bara;
    private javax.swing.JTextField cuanta;
    private javax.swing.JLabel finalizareproces;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel numeCuanta;
    private javax.swing.JLabel procentajproces;
    private javax.swing.JLabel proces;
    private javax.swing.JTable tabel1;
    private javax.swing.JTable tabelfinal;
    private javax.swing.JTextField timpalocatproces;
    private javax.swing.JLabel timpulproces;
    // End of variables declaration//GEN-END:variables
}
