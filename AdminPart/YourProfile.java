/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdminPart;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author jaina
 */
public class YourProfile extends javax.swing.JFrame {
    String userName;
    String adminId;
    String adminId2;
    String password;
    String name;
    String gender;
    String department;
    String mobileNo;
    String emailId;
    String errorLabel="";
    boolean flag=false;
    /**
     * Creates new form YourProfile
     */
    public YourProfile(String Id) 
    {
        initComponents();
        String adminId=Id;
        boolean validChecker;
        do{
            adminId2 =  JOptionPane.showInputDialog("Admin Id.");
            JOptionPane.showMessageDialog( this, adminId2 );
            validChecker = adminId.equals(adminId2);
            if(validChecker==false)
            {
                JOptionPane.showMessageDialog( this, "You have not entered Valid AdminId !!!" );
            }
        }while(validChecker==false);
        //userName="Mary890";
        String url = "jdbc:mysql://localhost:3306/library";
        String MySQLname = "root";
        String dbPassword = "";
        setVisible(true);
        Connection con=null;
        PreparedStatement pst=null;
        //Class.forName("com.mysql.jdbc.Driver");
        try
        {
            con=(Connection) DriverManager.getConnection(url,MySQLname,dbPassword);
            if(con == null)
            {
                JOptionPane.showMessageDialog(this, "Error in Connecting To Database!!");
            }
            else
            {
                System.out.println("Connected to database\n"+con.toString()+"\n");
                System.out.println("UserName: "+adminId);
            System.out.println("Reached here -2");
                String sql="SELECT * FROM admin WHERE UserName = '"+adminId+"'"; //select all books
                pst = (PreparedStatement)con.prepareStatement(sql);
                //pst.setString(1,adminId);
                ResultSet rs=pst.executeQuery(sql); //view data in table format
                if(rs.first())
                {
                    userName = rs.getString("UserName");
                    name = rs.getString("Name");
                    gender = rs.getString("Gender");
                    String department = rs.getString("Department");
                    emailId = rs.getString("EmailId");
                    mobileNo = rs.getString("MobileNo");
                    password = rs.getString("Password");
                    jTextField1.setText(name);
                    jTextField6.setText(gender);
                    jTextField3.setText(department);
                    jTextField4.setText(mobileNo);
                    jTextField5.setText(emailId);
                    jTextField2.setText(password);
                    jTextField7.setText(userName);
                    System.out.println("Username = "+userName);
                    System.out.println("Password = "+password);
                    System.out.println("name = "+name);
                    System.out.println("gender = "+gender);
                    System.out.println("dept = "+department);
                    System.out.println("mobileNo = "+mobileNo);
                    System.out.println("emailId = "+emailId);
                    }
                    pst.close();
                    rs.close();
                    con.close();
                    setVisible(true);
                    JOptionPane.showMessageDialog(this, "Please Verify Your Profile Details!!");
            }
        }catch (Exception e1) {
                    // TODO Auto-generated catch block
                    JOptionPane.showMessageDialog(null, e1);
        }
    }

    private YourProfile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(700, 600));
        setMinimumSize(new java.awt.Dimension(700, 600));

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
        jLabel2.setText("Your Profile!!!");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 8, 660, 100));

        jPanel3.setBackground(new java.awt.Color(51, 255, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 5, true));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Bodoni MT Condensed", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 255));
        jLabel3.setText("You can change the following details:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Name:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 133, -1));

        jTextField1.setBackground(new java.awt.Color(51, 255, 255));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(102, 102, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Johnson G.");
        jTextField1.setToolTipText("Enter your Name.");
        jTextField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 1, true));
        jPanel3.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 135, 140, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Password:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 140, 150, -1));

        jTextField2.setBackground(new java.awt.Color(51, 255, 255));
        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(102, 102, 255));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("568Johnson");
        jTextField2.setToolTipText("Enter Your Password.");
        jTextField2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 1, true));
        jPanel3.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 135, 140, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Department:");
        jLabel7.setToolTipText("");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 130, -1));

        jTextField3.setBackground(new java.awt.Color(51, 255, 255));
        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(102, 102, 255));
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("IT");
        jTextField3.setToolTipText("Enter Your Department.");
        jTextField3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 1, true));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 175, 140, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Mobile No.:");
        jLabel8.setToolTipText("");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 180, 150, -1));

        jTextField4.setBackground(new java.awt.Color(51, 255, 255));
        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(102, 102, 255));
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setText("1234567890");
        jTextField4.setToolTipText("Enter Your Mobile No.");
        jTextField4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 1, true));
        jPanel3.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 175, 140, 30));

        jTextField5.setBackground(new java.awt.Color(51, 255, 255));
        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(102, 102, 255));
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setText("johnson568@mail.com");
        jTextField5.setToolTipText("Enter Your Department.");
        jTextField5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 1, true));
        jPanel3.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 215, 200, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 255));
        jLabel9.setText("Email Id.:");
        jLabel9.setToolTipText("");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("User Name:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 133, -1));

        jTextField7.setEditable(false);
        jTextField7.setBackground(new java.awt.Color(51, 255, 255));
        jTextField7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(102, 102, 255));
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.setText("Johnson568");
        jTextField7.setToolTipText("You Can't edit your Name.");
        jTextField7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 1, true));
        jPanel3.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 35, 140, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Gender:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 40, 150, -1));

        jTextField6.setEditable(false);
        jTextField6.setBackground(new java.awt.Color(51, 255, 255));
        jTextField6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(102, 102, 255));
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setText("Others");
        jTextField6.setToolTipText("You Can't edit your Gender.");
        jTextField6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 1, true));
        jPanel3.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 35, 140, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 640, 270));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/7_UpdateProfile.png"))); // NOI18N
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
        String label = l1+l2+l3+l4+l5;
        if(flag)
        {
            JOptionPane.showMessageDialog(this, label,"ERRORS",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            int option = JOptionPane.showConfirmDialog(this, "Are you SURE you want to UPDATE Your Profile?", "Confirmation", JOptionPane.YES_NO_OPTION);
            if(option==0)
            {
                Connection con=null;
                PreparedStatement pst=null;
                try{
                    String url = "jdbc:mysql://localhost:3306/library";
                    String MySQLname = "root";
                    String password = "";
                    System.out.println("Reached Here   -24");
                    //Class.forName("com.mysql.jdbc.Driver");
                    con=(Connection) DriverManager.getConnection(url,MySQLname,password);
                    if(con == null)
                    {
                        JOptionPane.showMessageDialog(this, "Error in Connecting To Database!!");
                    }
                    else
                    {
                        System.out.println("Connected to database\n"+con.toString()+"\n");
                        String sql = "UPDATE admin SET UserName = ?, Password = ?, Name = ?, Gender = ?, Department = ?, MobileNo = ?, EmailId = ? WHERE UserName = '"+userName+"'";
                        pst=con.prepareStatement(sql);
                        pst.setString(1,userName);
                        pst.setString(2,password);
                        pst.setString(3,name);
                        pst.setString(4,gender);
                        pst.setString(5,department);
                        pst.setString(6,mobileNo);
                        pst.setString(7,emailId);
                        //pst.setString(8,userName);
                        System.out.println("name: "+name);
                        int r=pst.executeUpdate();
                        jTextField3.setText(department);
                        jTextField4.setText(mobileNo);
                        jTextField5.setText(emailId);
                        jTextField2.setText(password);
                        jTextField7.setText(userName);
                        //            ResultSet rs=pst.executeQuery(sql); //view data in table format
                        pst.close();
                        con.close();
                        //            rs.close();
                        if(r>0)
                        {JOptionPane.showMessageDialog(this, "Admin, Name: "+name+" of User-Name.:"+userName+", Your profile is Updated Successfully!!","Message",JOptionPane.INFORMATION_MESSAGE);}
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

    public String validateTextField1()
    {
        errorLabel="";
        name = jTextField1.getText();
        if(name.equals(""))
        {
            errorLabel = errorLabel + "\n Enter your Name.";
            jTextField1.setText(null);
            flag=true;
        }
        if(name.length()<6)
        {
            errorLabel = errorLabel + "\n Name should be of atleast 6 characters.";
            jTextField1.setText(null);
            flag=true;
        }
        return errorLabel;
    }
    
    public String validateTextField2()
    {
        errorLabel="";
        password = jTextField2.getText();
        if(password.equals(""))
        {
            errorLabel = errorLabel + "\n Enter Password.";
            jTextField2.setText(null);
            flag=true;
        }
        if(password.length()<6)
        {
            errorLabel = errorLabel + "\n Password should be of atleast 6 characters.";
            jTextField2.setText(null);
            flag=true;
        }
        return errorLabel;
    }
    
    public String validateTextField3()
    {
        errorLabel="";
        department = jTextField3.getText();
        if(department.equals(""))
        {
            errorLabel = errorLabel + "\n Enter Department.";
            jTextField3.setText(null);
            flag=true;
        }
        return errorLabel;
    }
    
    public String validateTextField4()
    {
        errorLabel="";
        mobileNo = jTextField4.getText();
        if(mobileNo.equals("") || mobileNo.length()!=10)
        {
            errorLabel = errorLabel + " Enter Mobile No. of 10 digit.";
            jTextField4.setText(null);
            flag=true;
        }
        
        if(mobileNo.length()==10)
        {
            char arr[] = mobileNo.toCharArray();
            for(int i=0; i<10; i++)
            {
                if(arr[i]<48 || arr[i]>57)
                {
                    errorLabel = errorLabel + " Mobile No. Should be Digits Only.";
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
        boolean valid1,valid2;
        valid1=valid2=false;
        int count=0;
        emailId = jTextField5.getText();
        if(emailId.equals("") || emailId.length()<6)
        {
            errorLabel = errorLabel + "\n Enter Email Id. of atleast 6 characher";
            jTextField5.setText(null);
            flag=true;
        }
        if(emailId.length()>6)
        {
            char arr[] = emailId.toCharArray();
            for(int i=0; i<emailId.length(); i++)
            {
                if(i>0 && i!=emailId.length())
                {
                    if(arr[i]=='@' && count<2)
                    {
                        valid1=true;
                        count++;
                    }
                    if(arr[i]=='.' && valid1==true && count<2)
                    {
                        valid2=true;
                        flag=false;
                        count++;
                    }
                    if((arr[i]=='@'|| arr[i]=='.') && valid2==true && count>1)
                    {
                        flag=true;
                        errorLabel = errorLabel + "\n Enter a valid Email Id.";
                        System.out.println("i= "+i+"count= "+count);
                        jTextField5.setText(null);
                        break;
                    }
                }
            }
            if(valid2==true)
            {
                flag=false;
            }
            else
            {
                flag=true;
                errorLabel = errorLabel + "\n Enter a valid Email Id.";
                jTextField5.setText(null);
            }
        }
        return errorLabel;
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

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
            java.util.logging.Logger.getLogger(YourProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(YourProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(YourProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(YourProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new YourProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
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
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
