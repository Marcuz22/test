/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author ADMIN
 */
public class Admin {
    private String username;
    private String adminPass;

    public Admin(String username, String adminPass) {
        this.username = username;
        this.adminPass = adminPass;
    }

    @Override
    public String toString() {
        return "Admin{" + "username=" + username + ", adminPass=" + adminPass + '}';
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAdminPass(String adminPass) {
        this.adminPass = adminPass;
    }

    public String getUsername() {
        return username;
    }

    public String getAdminPass() {
        return adminPass;
    }
    
    //Write to Admin file
    public void Write2FileLogin()
    {
        File admin = new File("admin.txt"); 
        try
        {
            FileWriter fw = new FileWriter(admin,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.write(toString() + "\n");
            pw.close();
        }
        catch(IOException Ex)
        {
            
        }
    } 
}
