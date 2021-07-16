/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdminPart;

/**
 *
 * @author jaina
 */
class AdminCaller{
    String adminId;
    AdminCaller(String Id)
    {
        this.adminId = Id;
        new AdminFunctions(adminId);
    }
}

public class AdminPart {
    String adminId;
    /**
     * @param args the command line arguments
     */
    
    public AdminPart(String Id) {
        this.adminId = Id;
        new AdminFunctions(adminId);
    }
    public static void main(String[] args) {
        // TODO code application logic here:
    }
    
}
