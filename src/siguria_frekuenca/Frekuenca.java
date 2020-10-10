/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siguria_frekuenca;

import java.awt.Dimension;
import static java.awt.PageAttributes.MediaType.A;
import java.awt.Toolkit;
import java.util.Vector;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;


/**
 *
 * @author Blendi
 */
public class Frekuenca extends javax.swing.JFrame {

    Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
    
    /**
     * Creates new form Frekuenca
     */
    public Frekuenca() {
        initComponents();
        this.setSize(screen.width-100, screen.height-100);
        
        this.setLocationRelativeTo(null);
        
        String alfabeti="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] alfabetiArray = alfabeti.toCharArray();
        
        
        
        
        
        
        
      
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtTekstiEnkriptuar = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtTekstiDekriptuar = new javax.swing.JTextArea();
        btnNdryshoKarakteret = new javax.swing.JButton();
        btnGjejFrekuencat = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblFrekuencatE = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblFrekuencat = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Frequency Analysis");
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Frekuenca e karaktereve ne alfabetin e gjuhes angleze");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 530, 630, 31);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Teksti i Dekriptuar");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(160, 220, 150, 30);

        txtTekstiEnkriptuar.setColumns(20);
        txtTekstiEnkriptuar.setRows(5);
        txtTekstiEnkriptuar.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane2.setViewportView(txtTekstiEnkriptuar);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(160, 100, 500, 100);

        txtTekstiDekriptuar.setColumns(20);
        txtTekstiDekriptuar.setRows(5);
        jScrollPane1.setViewportView(txtTekstiDekriptuar);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(160, 250, 500, 100);

        btnNdryshoKarakteret.setBackground(new java.awt.Color(129, 207, 224));
        btnNdryshoKarakteret.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        btnNdryshoKarakteret.setText("Ndrysho Karakteret");
        btnNdryshoKarakteret.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNdryshoKarakteret.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNdryshoKarakteretActionPerformed(evt);
            }
        });
        getContentPane().add(btnNdryshoKarakteret);
        btnNdryshoKarakteret.setBounds(690, 250, 200, 100);

        btnGjejFrekuencat.setBackground(new java.awt.Color(129, 207, 224));
        btnGjejFrekuencat.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        btnGjejFrekuencat.setText("Gjej Frekuencat");
        btnGjejFrekuencat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGjejFrekuencat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGjejFrekuencatActionPerformed(evt);
            }
        });
        getContentPane().add(btnGjejFrekuencat);
        btnGjejFrekuencat.setBounds(690, 100, 200, 100);

        tblFrekuencatE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"12.7", "9.1", "8.2", "7.5", "7.0", "6.7", "6.3", "6.1", "6.0", "4.3", "4.0", "2.8", "2.8", "2.4", "2.4", "2.2", "2.0", "2.0", "1.9", "1.5", "1.0", "0.8", "0.15", "0.15", "0.10", "0.07"}
            },
            new String [] {
                "E", "T", "A", "O", "I", "N", "S", "H", "R", "D", "L", "C", "U", "M", "W", "F", "G", "Y", "P", "B", "V", "K", "J", "X", "Q", "Z"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblFrekuencatE.setToolTipText("");
        jScrollPane3.setViewportView(tblFrekuencatE);
        tblFrekuencatE.setRowHeight(30);
        tblFrekuencatE.setShowHorizontalLines(true);
        tblFrekuencatE.setShowVerticalLines(true);
        tblFrekuencatE.getTableHeader().setFont(new java.awt.Font("Tahome", 0, 20));
        tblFrekuencatE.getTableHeader().setBackground(new java.awt.Color(0, 0, 0));
        TableCellRenderer rendererFromHeader1 = tblFrekuencatE.getTableHeader().getDefaultRenderer();
        JLabel headerLabel1 = (JLabel) rendererFromHeader1;
        headerLabel1.setHorizontalAlignment(JLabel.CENTER);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(40, 570, 1020, 70);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Teksti i Enkriptuar");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(160, 70, 120, 30);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13), new java.awt.Color(255, 255, 255)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(55, 66, 58), new java.awt.Color(55, 66, 58), new java.awt.Color(55, 66, 58)))); // NOI18N
        jPanel2.setOpaque(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 792, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 351, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(120, 50, 800, 360);

        tblFrekuencat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
            }
        ));
        jScrollPane4.setViewportView(tblFrekuencat);
        tblFrekuencat.setRowHeight(30);
        tblFrekuencat.setShowHorizontalLines(true);
        tblFrekuencat.setShowVerticalLines(true);
        tblFrekuencat.getTableHeader().setFont(new java.awt.Font("Tahome", 0, 20));
        tblFrekuencat.getTableHeader().setBackground(new java.awt.Color(0, 0, 0));
        TableCellRenderer rendererFromHeader = tblFrekuencat.getTableHeader().getDefaultRenderer();
        JLabel headerLabel = (JLabel) rendererFromHeader;
        headerLabel.setHorizontalAlignment(JLabel.CENTER);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(40, 750, 1020, 130);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/siguria_frekuenca/siguriafoto1.PNG"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, -20, 1800, 1030);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNdryshoKarakteretActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNdryshoKarakteretActionPerformed
        
        String tekstiEnkriptuar =txtTekstiEnkriptuar.getText();
        char[] tekstiEnkriptuarArray = tekstiEnkriptuar.toCharArray();
        
        DefaultTableModel tabelaModel = (DefaultTableModel) tblFrekuencat.getModel();
        Object [] Karakteret = new Object[26];
        Object [] KolonaTitulli = new Object[26];
        
        
        for(int i=0;i<26;i++ ){
            
            Karakteret[i]=tabelaModel.getValueAt(0, i);
            KolonaTitulli[i]=tabelaModel.getColumnName(i);
            
        }
        
        for(int i=0;i<26;i++){
            if(Karakteret[i]==null)
                
            Karakteret[i]=KolonaTitulli[i];
            if(Karakteret[i].equals(""))
            
            Karakteret[i]=KolonaTitulli[i];
        }
            
       
       
       String tekstiEnkriptuar1 = tekstiEnkriptuar.replace("A", Karakteret[0].toString());               
       String tekstiEnkriptuar2 = tekstiEnkriptuar1.replace("B", Karakteret[1].toString());
       String tekstiEnkriptuar3 = tekstiEnkriptuar2.replace("C", Karakteret[2].toString());
       String tekstiEnkriptuar4 = tekstiEnkriptuar3.replace("D", Karakteret[3].toString());
       String tekstiEnkriptuar5 = tekstiEnkriptuar4.replace("E", Karakteret[4].toString());
       String tekstiEnkriptuar6 = tekstiEnkriptuar5.replace("F", Karakteret[5].toString());
       String tekstiEnkriptuar7 = tekstiEnkriptuar6.replace("G", Karakteret[6].toString());
       String tekstiEnkriptuar8 = tekstiEnkriptuar7.replace("H", Karakteret[7].toString());
       String tekstiEnkriptuar9 = tekstiEnkriptuar8.replace("I", Karakteret[8].toString());
       String tekstiEnkriptuar10 = tekstiEnkriptuar9.replace("J", Karakteret[9].toString());
       String tekstiEnkriptuar11 = tekstiEnkriptuar10.replace("K", Karakteret[10].toString());
       String tekstiEnkriptuar12 = tekstiEnkriptuar11.replace("L", Karakteret[11].toString());
       String tekstiEnkriptuar13 = tekstiEnkriptuar12.replace("M", Karakteret[12].toString());
       String tekstiEnkriptuar14 = tekstiEnkriptuar13.replace("N", Karakteret[13].toString());
       String tekstiEnkriptuar15 = tekstiEnkriptuar14.replace("O", Karakteret[14].toString());
       String tekstiEnkriptuar16 = tekstiEnkriptuar15.replace("P", Karakteret[15].toString());
       String tekstiEnkriptuar17 = tekstiEnkriptuar16.replace("Q", Karakteret[16].toString());
       String tekstiEnkriptuar18 = tekstiEnkriptuar17.replace("R", Karakteret[17].toString());
       String tekstiEnkriptuar19 = tekstiEnkriptuar18.replace("S", Karakteret[18].toString());
       String tekstiEnkriptuar20 = tekstiEnkriptuar19.replace("T", Karakteret[19].toString());
       String tekstiEnkriptuar21 = tekstiEnkriptuar20.replace("U", Karakteret[20].toString());
       String tekstiEnkriptuar22 = tekstiEnkriptuar21.replace("V", Karakteret[21].toString());
       String tekstiEnkriptuar23 = tekstiEnkriptuar22.replace("W", Karakteret[22].toString());
       String tekstiEnkriptuar24 = tekstiEnkriptuar23.replace("X", Karakteret[23].toString());
       String tekstiEnkriptuar25 = tekstiEnkriptuar24.replace("Y", Karakteret[24].toString());
       String tekstiEnkriptuar26 = tekstiEnkriptuar25.replace("Z", Karakteret[25].toString());
       
      
        
        txtTekstiDekriptuar.setText(tekstiEnkriptuar26);
        
        
     /*    JOptionPane optionPane = new JOptionPane(A, JOptionPane.ERROR_MESSAGE);
       JDialog dialog = optionPane.createDialog("Deshtoi");
             dialog.setAlwaysOnTop(true);
             dialog.setVisible(true);
       */ 
        
        
    }//GEN-LAST:event_btnNdryshoKarakteretActionPerformed

    private void btnGjejFrekuencatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGjejFrekuencatActionPerformed
        
       String tekstiEnkriptuar =txtTekstiEnkriptuar.getText();
       char[] tekstiEnkriptuarArray = tekstiEnkriptuar.toCharArray();
      int a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0,i=0,j=0,k=0,l=0,m=0,n=0,o=0,p=0,q=0,r=0,s=0,t=0,u=0,v=0,w=0,x=0,y=0,z=0;
      int gjatesiaTekstit = tekstiEnkriptuarArray.length;
       for(int nrKaraktereve=0;nrKaraktereve<tekstiEnkriptuarArray.length;nrKaraktereve++)
       {
           
           if(tekstiEnkriptuarArray[nrKaraktereve]== 65)
               a++;
               
           
           if(tekstiEnkriptuarArray[nrKaraktereve]== 66)
               b++;
           if(tekstiEnkriptuarArray[nrKaraktereve]== 67)
               c++;
           if(tekstiEnkriptuarArray[nrKaraktereve]== 68)
               d++;
           if(tekstiEnkriptuarArray[nrKaraktereve]== 69)
               e++;
           if(tekstiEnkriptuarArray[nrKaraktereve]== 70)
               f++;
           if(tekstiEnkriptuarArray[nrKaraktereve]== 71)
               g++;
           if(tekstiEnkriptuarArray[nrKaraktereve]== 72)
               h++;
           if(tekstiEnkriptuarArray[nrKaraktereve]== 73)
               i++;
           if(tekstiEnkriptuarArray[nrKaraktereve]== 74)
               j++;
           if(tekstiEnkriptuarArray[nrKaraktereve]== 75)
               k++;
           if(tekstiEnkriptuarArray[nrKaraktereve]== 76)
               l++;
           if(tekstiEnkriptuarArray[nrKaraktereve]== 77)
               m++;
           if(tekstiEnkriptuarArray[nrKaraktereve]== 78)
               n++;
           if(tekstiEnkriptuarArray[nrKaraktereve]== 79)
               o++;
           if(tekstiEnkriptuarArray[nrKaraktereve]== 80)
               p++;
           if(tekstiEnkriptuarArray[nrKaraktereve]== 81)
               q++;
           if(tekstiEnkriptuarArray[nrKaraktereve]== 82)
               r++;
           if(tekstiEnkriptuarArray[nrKaraktereve]== 83)
               s++;
           if(tekstiEnkriptuarArray[nrKaraktereve]== 84)
               t++;
           if(tekstiEnkriptuarArray[nrKaraktereve]== 85)
               u++;
           if(tekstiEnkriptuarArray[nrKaraktereve]== 86)
               v++;
           if(tekstiEnkriptuarArray[nrKaraktereve]== 87)
               w++;
           if(tekstiEnkriptuarArray[nrKaraktereve]== 88)
               x++;
           if(tekstiEnkriptuarArray[nrKaraktereve]== 89)
               y++;
           if(tekstiEnkriptuarArray[nrKaraktereve]== 90)
               z++;
           
           
       }
       
       
       double frekuencaA= (100.0*a)/gjatesiaTekstit;
       double frekuencaB= (100.0*b)/gjatesiaTekstit;
       double frekuencaC= (100.0*c)/gjatesiaTekstit;
       double frekuencaD= (100.0*d)/gjatesiaTekstit;
       double frekuencaE= (100.0*e)/gjatesiaTekstit;
       double frekuencaF= (100.0*f)/gjatesiaTekstit;
       double frekuencaG= (100.0*g)/gjatesiaTekstit;
       double frekuencaH= (100.0*h)/gjatesiaTekstit;
       double frekuencaI= (100.0*i)/gjatesiaTekstit;
       double frekuencaJ= (100.0*j)/gjatesiaTekstit;
       double frekuencaK= (100.0*k)/gjatesiaTekstit;
       double frekuencaL= (100.0*l)/gjatesiaTekstit;
       double frekuencaM= (100.0*m)/gjatesiaTekstit;
       double frekuencaN= (100.0*n)/gjatesiaTekstit;
       double frekuencaO= (100.0*o)/gjatesiaTekstit;
       double frekuencaP= (100.0*p)/gjatesiaTekstit;
       double frekuencaQ= (100.0*q)/gjatesiaTekstit;
       double frekuencaR= (100.0*r)/gjatesiaTekstit;
       double frekuencaS= (100.0*s)/gjatesiaTekstit;
       double frekuencaT= (100.0*t)/gjatesiaTekstit;
       double frekuencaU= (100.0*u)/gjatesiaTekstit;
       double frekuencaV= (100.0*v)/gjatesiaTekstit;
       double frekuencaW= (100.0*w)/gjatesiaTekstit;
       double frekuencaX= (100.0*x)/gjatesiaTekstit;
       double frekuencaY= (100.0*y)/gjatesiaTekstit;
       double frekuencaZ= (100.0*z)/gjatesiaTekstit;
       
       String SfrekuencaA =String.format("%.1f", frekuencaA);
       String SfrekuencaB =String.format("%.1f", frekuencaB);
       String SfrekuencaC =String.format("%.1f", frekuencaC);
       String SfrekuencaD =String.format("%.1f", frekuencaD);
       String SfrekuencaE =String.format("%.1f", frekuencaE);
       String SfrekuencaF =String.format("%.1f", frekuencaF);
       String SfrekuencaG =String.format("%.1f", frekuencaG);
       String SfrekuencaH =String.format("%.1f", frekuencaH);
       String SfrekuencaI =String.format("%.1f", frekuencaI);
       String SfrekuencaJ =String.format("%.1f", frekuencaJ);
       String SfrekuencaK =String.format("%.1f", frekuencaK);
       String SfrekuencaL =String.format("%.1f", frekuencaL);
       String SfrekuencaM =String.format("%.1f", frekuencaM);
       String SfrekuencaN =String.format("%.1f", frekuencaN);
       String SfrekuencaO =String.format("%.1f", frekuencaO);
       String SfrekuencaP =String.format("%.1f", frekuencaP);
       String SfrekuencaQ =String.format("%.1f", frekuencaQ);
       String SfrekuencaR =String.format("%.1f", frekuencaR);
       String SfrekuencaS =String.format("%.1f", frekuencaS);
       String SfrekuencaT =String.format("%.1f", frekuencaT);
       String SfrekuencaU =String.format("%.1f", frekuencaU);
       String SfrekuencaV =String.format("%.1f", frekuencaV);
       String SfrekuencaW =String.format("%.1f", frekuencaW);
       String SfrekuencaX =String.format("%.1f", frekuencaX);
       String SfrekuencaY =String.format("%.1f", frekuencaY);
       String SfrekuencaZ =String.format("%.1f", frekuencaZ);
       
       
             
       //JTable table = new JTable();
       DefaultTableModel tabelaModel = (DefaultTableModel) tblFrekuencat.getModel();
       
       Vector<String> frekuencat = new Vector<String>();
       frekuencat.addElement(SfrekuencaA);
       frekuencat.addElement(SfrekuencaB);
       frekuencat.addElement(SfrekuencaC);
       frekuencat.addElement(SfrekuencaD);
       frekuencat.addElement(SfrekuencaE);
       frekuencat.addElement(SfrekuencaF);
       frekuencat.addElement(SfrekuencaG);
       frekuencat.addElement(SfrekuencaH);
       frekuencat.addElement(SfrekuencaI);
       frekuencat.addElement(SfrekuencaJ);
       frekuencat.addElement(SfrekuencaK);
       frekuencat.addElement(SfrekuencaL);
       frekuencat.addElement(SfrekuencaM);
       frekuencat.addElement(SfrekuencaN);
       frekuencat.addElement(SfrekuencaO);
       frekuencat.addElement(SfrekuencaP);
       frekuencat.addElement(SfrekuencaQ);
       frekuencat.addElement(SfrekuencaR);
       frekuencat.addElement(SfrekuencaS);
       frekuencat.addElement(SfrekuencaT);
       frekuencat.addElement(SfrekuencaU);
       frekuencat.addElement(SfrekuencaV);
       frekuencat.addElement(SfrekuencaW);
       frekuencat.addElement(SfrekuencaX);
       frekuencat.addElement(SfrekuencaY);
       frekuencat.addElement(SfrekuencaZ);
       
        tabelaModel.setRowCount(1);
        tabelaModel.addRow(frekuencat);
        tabelaModel.addRow(new Object[] {a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z});
        
        
       
       
       
       //JOptionPane optionPane = new JOptionPane("A eshte perdorur "+a, JOptionPane.ERROR_MESSAGE);
       //JDialog dialog = optionPane.createDialog("Deshtoi");
       //      dialog.setAlwaysOnTop(true);
       //      dialog.setVisible(true);
        
    }//GEN-LAST:event_btnGjejFrekuencatActionPerformed

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
            java.util.logging.Logger.getLogger(Frekuenca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frekuenca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frekuenca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frekuenca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frekuenca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGjejFrekuencat;
    private javax.swing.JButton btnNdryshoKarakteret;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tblFrekuencat;
    private javax.swing.JTable tblFrekuencatE;
    private javax.swing.JTextArea txtTekstiDekriptuar;
    private javax.swing.JTextArea txtTekstiEnkriptuar;
    // End of variables declaration//GEN-END:variables
}
