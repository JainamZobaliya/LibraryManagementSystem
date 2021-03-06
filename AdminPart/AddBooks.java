/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdminPart;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author jaina
 */
public class AddBooks extends javax.swing.JFrame {
    String isbn, bookName, category, price, authorName, publisherName;
    float bookPrice;
    String errorLabel = "";
    boolean flag=false;
    boolean bookStatus=true;

    /**
     * Creates new form AddBooks
     */
    public AddBooks() {
        initComponents();
        this.flag=false;
        setVisible(true);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setAlwaysOnTop(true);
        setMaximumSize(new java.awt.Dimension(700, 600));
        setMinimumSize(new java.awt.Dimension(700, 600));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 8, true));
        jPanel1.setMaximumSize(new java.awt.Dimension(700, 600));
        jPanel1.setMinimumSize(new java.awt.Dimension(700, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Colonna MT", 3, 45)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Library Management System");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 13, -1, -1));

        jLabel2.setFont(new java.awt.Font("MV Boli", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Add Books!!!");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 8, 660, 100));

        jPanel3.setBackground(new java.awt.Color(51, 255, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 5, true));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Bodoni MT Condensed", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 255));
        jLabel3.setText("Please Enter Book Details Here:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 18, -1, -1));

        jLabel4.setFont(new java.awt.Font("Bodoni MT Condensed", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 255));
        jLabel4.setText("( Example is given )");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 25, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("ISBN No.:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 133, -1));

        jTextField1.setBackground(new java.awt.Color(51, 255, 255));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(102, 102, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("1234567890123");
        jTextField1.setToolTipText("Enter ISBN No. Of The Book.");
        jTextField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 1, true));
        jPanel3.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 85, 140, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Book Name: ");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 90, 150, -1));

        jTextField2.setBackground(new java.awt.Color(51, 255, 255));
        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(102, 102, 255));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("Java World");
        jTextField2.setToolTipText("Enter Book Name.");
        jTextField2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 1, true));
        jPanel3.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 85, 140, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Category:");
        jLabel7.setToolTipText("");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 130, -1));

        jTextField3.setBackground(new java.awt.Color(51, 255, 255));
        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(102, 102, 255));
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("Programming");
        jTextField3.setToolTipText("Enter Book Category. ");
        jTextField3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 1, true));
        jPanel3.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 135, 140, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Book Price:");
        jLabel8.setToolTipText("");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 140, 150, -1));

        jTextField4.setBackground(new java.awt.Color(51, 255, 255));
        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(102, 102, 255));
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setText("450");
        jTextField4.setToolTipText("Enter Book Price.");
        jTextField4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 1, true));
        jPanel3.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 135, 140, 30));

        jTextField5.setBackground(new java.awt.Color(51, 255, 255));
        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(102, 102, 255));
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setText("John Doe");
        jTextField5.setToolTipText("Enter Authors Name.");
        jTextField5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 1, true));
        jPanel3.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 185, 140, 30));

        jTextField6.setBackground(new java.awt.Color(51, 255, 255));
        jTextField6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(102, 102, 255));
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setText("Java World");
        jTextField6.setToolTipText("Enter Publishers Name.");
        jTextField6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 1, true));
        jPanel3.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 185, 140, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 255));
        jLabel9.setText("Authors Name:");
        jLabel9.setToolTipText("");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 255));
        jLabel10.setText("Publishers Name:");
        jLabel10.setToolTipText("");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 190, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 640, 270));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/2_AddBook.png"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.blue, java.awt.Color.blue, java.awt.Color.blue, java.awt.Color.blue));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 500, 120, 50));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/0_PreviousButton.jpg"))); // NOI18N
        jButton2.setToolTipText("To Go To Previous Page.");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.blue, java.awt.Color.blue, java.awt.Color.blue, java.awt.Color.blue));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 75, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        errorLabel="";
        String l1 = validateTextField1();
        String l2 = validateTextField2();
        String l3 = validateTextField3();
        String l4 = validateTextField4();
        String l5 = validateTextField5();
        String l6 = validateTextField6();
        String label = l1+l2+l3+l4+l5+l6;
        if(flag)
        {
            JOptionPane.showMessageDialog(this, label,"ERRORS",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            bookPrice = Integer.parseInt(price);
            int option = JOptionPane.showConfirmDialog(this, "Are you SURE you want to add this book?", "Confirmation", JOptionPane.YES_NO_OPTION);
            if(option==0)
            {
                Connection con=null;
                PreparedStatement pst=null;
                try{
                    String url = "jdbc:mysql://localhost:3306/library";
                    String MySQLname = "root";
                    String password = "";
                    //Class.forName("com.mysql.jdbc.Driver");
                    con=(Connection) DriverManager.getConnection(url,MySQLname,password);
                    if(con == null)
                    {
                        JOptionPane.showMessageDialog(this, "Error in Connecting To Database!!");
                    }
                    else
                    {
                        String sql = "INSERT INTO book (BookName, ISBNNo, AuthorName, Category, Price, Publisher, Status)"+" VALUES (?, ?, ?, ?, ?, ?, ?)";
                        pst=con.prepareStatement(sql);  
                        pst.setString(1,bookName);  
                        pst.setString(2,isbn);  
                        pst.setString(3,authorName);  
                        pst.setString(4,category);  
                        pst.setFloat(5,bookPrice);  
                        pst.setString(6,publisherName); 
                        pst.setBoolean(7,bookStatus); 
                        int r=pst.executeUpdate();
            //            ResultSet rs=pst.executeQuery(sql); //view data in table format
                        pst.close();
                        con.close();
            //            rs.close();
                       if(r>0)
                       {JOptionPane.showMessageDialog(this, "Book "+bookName+" of ISBN No.:"+isbn+" is Added Successfully!!","Message",JOptionPane.INFORMATION_MESSAGE);}
                        jTextField1.setText(null);
                        jTextField2.setText(null);
                        jTextField3.setText(null);
                        jTextField4.setText(null);
                        jTextField5.setText(null);
                        jTextField6.setText(null);
                    } 
                }catch (Exception e1) {
                    // TODO Auto-generated catch block
                    JOptionPane.showMessageDialog(null, e1);
                }   
            }
            else
            {
                this.dispose();
            }
        }
        //jLabel12.setText(label);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    public String validateTextField1()
    {
        errorLabel="";
        flag=false;
        isbn = jTextField1.getText();
        bookName = jTextField2.getText();
        category = jTextField3.getText();
        price = jTextField4.getText();
        authorName = jTextField5.getText();
        publisherName = jTextField6.getText();
        if(isbn.equals("") || isbn.length()!=13)
        {
            errorLabel = errorLabel + " Enter ISBN No. of 13 digit.";
            jTextField1.setText(null);
            flag=true;
        }
        
        if(isbn.length()==13)
        {
            char arr[] = isbn.toCharArray();
            for(int i=0; i<13; i++)
            {
                if(arr[i]<48 || arr[i]>57)
                {
                    errorLabel = errorLabel + " ISBN No. Should be Digits Only.";
                    jTextField1.setText(null);
                    flag=true;
                    break;
                }
            }
        }
        return errorLabel;
    }
    
    public String validateTextField2()
    {
        errorLabel="";
        if(bookName.equals(""))
        {
            errorLabel = errorLabel + "\n Enter Book Name.";
            jTextField2.setText(null);
            flag=true;
        }
        return errorLabel;
    }
    
    public String validateTextField3()
    {
        errorLabel="";
        if(category.equals(""))
        {
            errorLabel = errorLabel + "\n Enter Book Category.";
            jTextField3.setText(null);
            flag=true;
        }
        return errorLabel;
    }
    
    public String validateTextField4()
    {
        errorLabel="";
        
        if(price.equals(""))
        {
            errorLabel = errorLabel + "\n Enter Book Price.";
            jTextField4.setText(null);
            flag=true;
        }
        
        if(price!=null)
        {
            char pr[] = price.toCharArray();
            for(int i=0; i<price.length(); i++)
            {
                if(pr[i]=='.' || pr[i]<48 || pr[i]>57)
                {
                    errorLabel = errorLabel + "\n Price Should be Floating Poins Only.";
                    jTextField4.setText(null);
                    flag=true;
                    break;
                }
            }
        }
        return errorLabel;
    }
    
    public String validateTextField5()
    {
        
        errorLabel="";
        if(authorName.equals(""))
        {
            errorLabel = errorLabel + "\n Enter Authors Name.";
            jTextField5.setText(null);
            flag=true;
        }
        return errorLabel;
    }
    
    public String validateTextField6()
    {
        errorLabel="";
        if(publisherName.equals(""))
        {
            errorLabel = errorLabel + "\n Enter Publishers Name.";
            jTextField6.setText(null);
            flag=true;
        }
        return errorLabel;
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
            java.util.logging.Logger.getLogger(AddBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddBooks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
