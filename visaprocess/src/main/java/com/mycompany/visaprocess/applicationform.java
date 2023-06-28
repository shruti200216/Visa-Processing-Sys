/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.visaprocess;

import java.awt.Toolkit;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;





public class applicationform extends javax.swing.JFrame {

    private static final String WindowEvent = null;
	private Object pst;
	 private final String url = "jdbc:mysql://localhost:3306/visa";
		private final String username = "root";
		private final String pwd = "kanan";
	
	
   
    /**
     * Creates new form applicationform
     */
    public applicationform() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        FNLsbel = new javax.swing.JLabel();
        EmLabel = new javax.swing.JLabel();
        NLabel = new javax.swing.JLabel();
        LnLabel = new javax.swing.JLabel();
        AddLabel = new javax.swing.JLabel();
        DOBLabel = new javax.swing.JLabel();
        FNTxt = new javax.swing.JTextField();
        Emtxt = new javax.swing.JTextField();
        AddTxt = new javax.swing.JTextField();
        LNTxt = new javax.swing.JTextField();
        Ncb = new javax.swing.JComboBox<>();
        jDate = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        Gencb = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        Idcb = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        nxtbtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        visajb = new javax.swing.JComboBox<>();
        FLabel = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(240, 131, 74));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Application Form");

        FNLsbel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        FNLsbel.setText("FirstName");

        EmLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        EmLabel.setText("Email");

        NLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        NLabel.setText("Nationality");

        LnLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        LnLabel.setText("LastName");

        AddLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        AddLabel.setText("Address");

        DOBLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        DOBLabel.setText("Date of Birth");

        FNTxt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        FNTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FNTxtActionPerformed(evt);
                
                
            }
        });

        Emtxt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        AddTxt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        LNTxt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        Ncb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Afghan\t", "Algerian\t", "American", "Argentine\t", "Armenian\t", "Australian\t", "Austrian", "Azerbaijani\t \t", "Bahamian", "Bangladeshi\t", "Belarusian\t", "Belgian\t", "Belizean\t", "Bermudian\t", "Bhutanese\t", "Bolivian\t", "Citizen of Bosnia and Herzegovina", "Brazilian\t", "British\t", "British Virgin Islander", "Bruneian\t", "Bulgarian\t", "Burundian\t", "Cambodian\t", "Canadian\t", "Cayman Islander\t", "Central African\tChadian\t", "Chilean", "Chinese\t", "Colombian\t", "Congolese (DRC)\t", "Cook Islander\t", "Costa Rican\t", "Croatian", "Cuban", "Cypriot", "Czech\t", "Danish\t", "Dominican\t", "Citizen of the Dominican Republic", "Dutch   ", "Egyptian\t", "Emirati", "English\t", "Equatorial Guinean\t", "Eritrean\t", "Ethiopian\t", "Fijian\t", "Filipino\t", "Finnish", "French\t", "Georgian\t", "German", "Ghanaian\t", "Greek\t", "Greenlandic", "Grenadian\t", "Guinean\t", "Haitian\t", "Honduran\t", "Hong Konger\t", "Hungarian   \t \t", "Icelandic\t", "Indian\t", "Indonesian\t", "Iranian", "Iraqi\t", "Irish\t", "Israeli\t", "Italian", "Ivorian\t  ", "Jamaican\t", "Japanese\t", "Jordanian", "Kazakh\t", "Kenyan\t", "Kosovan\t", "Kuwaiti\t", "Kyrgyz\t", "Macanese\t", "Malaysian\t", "Maldivian\t", "Martiniquais\t", "Mauritanian\t", "Mauritian", "Mexican\t", "Mongolian\t", "Mosotho\t", "Mozambican\t", "Namibian\t", "Nauruan\t", "Nepalese\t", "New Zealander", "Nicaraguan\t", "Nigerian\t", "Nigerien\t", "Niuean", "North Korean\t", "Northern Irish\t", "Norwegian\t   ", "Omani", "Pakistani\t", "Palauan\t", "Palestinian\t", "Papua New Guinean\t", "Paraguayan\t", "Peruvian\t", "Polish\t", "Portuguese\t", "Puerto Rican", "Qatari", "Romanian\t", "Russian\t", "Rwandan", "Saudi Arabian\t", "Scottish\t", "Serbian", "Sierra Leonean\tSingaporean\t", "Slovak", "Slovenian\t", "South African", "South Korean\t", "South Sudanese\t", "Spanish\t", "Sri Lankan", "Stateless\t", "Swedish\t", "Swiss", "Syrian\t", "Taiwanese\t", "Tanzanian\t", "Thai", "Trinidadian\t", "Tristanian", "Tunisian\t", "Turkish\t", "Turkmen", " Ugandan\t", "Ukrainian\t", "Uruguayan\t", "Uzbek", "Vatican citizen\tCitizen of Vanuatu\t", "Venezuelan\t", "Vietnamese", "Vincentian\t", "Wallisian\t", "Welsh", "Yemeni", "Zambian\t", "Zimbabwean " }));

        jDate.setToolTipText("MMM-DD-YYYY");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Gender");

        Gencb.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Gencb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Gender", "Male", "Female", "Prefer Not to Say", " " }));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("ID Proof");

        Idcb.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Idcb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Id proof", "Aadhar Card", "PanCard", "Voter ID", "License", "Passport" }));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("UPLOAD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
                
                
                
                
            }
        });

        nxtbtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        nxtbtn.setText("NEXT");
        nxtbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	nxtbtnActionPerformed(evt);
           
            }
        });
                
            
        
        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Visa Type");

        visajb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Visa Type", "Student Visa", "Medical Visa", "Tourist Visa", "Business Visa", " " }));
        visajb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visajbActionPerformed(evt);
            }
        });

        FLabel.setText("File");

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(FNLsbel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EmLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FNTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Emtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ncb, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Gencb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LnLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AddLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DOBLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(LNTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(AddTxt)
                                .addComponent(jDate, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                            .addComponent(Idcb, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(visajb, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(FLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(151, 151, 151))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(323, 323, 323)
                        .addComponent(nxtbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(188, 188, 188)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(521, 521, 521)
                            .addComponent(jButton1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(FNLsbel)
                                            .addComponent(LnLabel))
                                        .addGap(18, 19, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(FNTxt)
                                        .addGap(13, 13, 13)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(EmLabel)
                                    .addComponent(AddLabel)
                                    .addComponent(Emtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LNTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(AddTxt)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DOBLabel)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(Gencb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(Idcb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(NLabel)
                        .addComponent(Ncb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(visajb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(FLabel)
                        .addGap(13, 13, 13)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(nxtbtn)
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(20, 20, 20))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       JFileChooser chooser= new JFileChooser();
       chooser.showOpenDialog(null);
       File f=chooser.getSelectedFile();
       filename=f.getAbsolutePath();
       FLabel.setText(filename);
       
       try{
           File image=new File(filename);
           FileInputStream fis=new FileInputStream(image);
           ByteArrayOutputStream bos=new ByteArrayoutputStream();
           byte[] buf=new byte[1024];
           for(int readNum; (readNum=fis.read(buf))!=-1;){
               bos.write(buf, 0 ,readNum);
           }
           photo=bos.toByteArray();
           
       }
           catch(Exception e){
               JOptionPane.showMessageDialog(null, e);
           }
    }//GEN-LAST:event_jButton1ActionPerformed

   
   
    
    private void visajbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visajbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_visajbActionPerformed

    private void nxtbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nxtbtnActionPerformed
       
        String fname= FNTxt.getText();
        String lname= LNTxt.getText();
        String email= Emtxt.getText();
        String Address=AddTxt.getText();
        String Gender= Gencb.getActionCommand();
        String DOB= jDate.getDateFormatString();
        String Nationality= Ncb.getActionCommand();
        String visatype =  visajb.getActionCommand();
        String IDproof= Idcb.getActionCommand();
   
		try {
			Connection connect = DriverManager.getConnection(url, username, pwd);
			String query = "INSERT INTO applicationdetails values('" + fname + "','" + lname + "','" + email +"','"+ Address
					+ "','" + Gender + "','" + DOB  + "','" + Nationality + "','"+ visatype+"','" +IDproof+"','"+photo+"')";
			Statement sta = connect.createStatement();
			int x = sta.executeUpdate(query);
			
			if (x == 0) {
				JOptionPane.showMessageDialog(nxtbtn, "please fill all the details");
			} else {
				JOptionPane.showMessageDialog(nxtbtn,
						 "done");
			}
			connect.close();
		} catch (SQLException e1) {
			System.out.println("connection issues");
			e1.printStackTrace();
		}
    }

        
private void nxtbtnActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nxtbtnActionPerformed
        dispose();
        VisaSelection vs=new VisaSelection();
        vs.setVisible(true);
    }//GEN-LAST:event_nxtbtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     dispose();
     Dashboard ds=new Dashboard();
     ds.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void FNTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FNTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FNTxtActionPerformed

  
    /**
     * 
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
            java.util.logging.Logger.getLogger(applicationform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(applicationform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(applicationform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(applicationform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new applicationform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddLabel;
    private javax.swing.JTextField AddTxt;
    private javax.swing.JLabel DOBLabel;
    private javax.swing.JLabel EmLabel;
    private javax.swing.JTextField Emtxt;
    private javax.swing.JLabel FLabel;
    private javax.swing.JLabel FNLsbel;
    private javax.swing.JTextField FNTxt;
    private javax.swing.JComboBox<String> Gencb;
    private javax.swing.JComboBox<String> Idcb;
    private javax.swing.JTextField LNTxt;
    private javax.swing.JLabel LnLabel;
    private javax.swing.JLabel NLabel;
    private javax.swing.JComboBox<String> Ncb;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton nxtbtn;
    private javax.swing.JComboBox<String> visajb;
    // End of variables declaration//GEN-END:variables
byte[] photo=null;
String filename=null;

   

    public static class ByteArrayoutputStream extends ByteArrayOutputStream {

        public ByteArrayoutputStream() {
        }
    }

    private static class WindowEvent {

        public WindowEvent() {
        }
    }

	
}
