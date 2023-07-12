/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class Student {

    public static String SID;
    public static String pwd;

    private String studentId;
    private String studentPass;
    private String studentName;
    private String studentGender;
    private String studentIC;
    private String studentEmail;
    private String studentPhone;

    //Overloading method
    public Student() {
    }

    //Create a constructor
    public Student(String studentId, String studentPass, String studentName, String studentGender,
            String studentIC, String studentEmail, String studentPhone) {
        this.studentId = studentId;
        this.studentPass = studentPass;
        this.studentName = studentName;
        this.studentGender = studentGender;
        this.studentIC = studentIC;
        this.studentEmail = studentEmail;
        this.studentPhone = studentPhone;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentIC() {
        return studentIC;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public String getStudentGender() {
        return studentGender;
    }

    public String getStudentPhone() {
        return studentPhone;
    }

    public String getStudentPass() {
        return studentPass;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentIC(String studentIC) {
        this.studentIC = studentIC;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public void setStudentGender(String studentGender) {
        this.studentGender = studentGender;
    }

    public void setStudentPhone(String studentPhone) {
        this.studentPhone = studentPhone;
    }

    public void setStudentPass(String studentPass) {
        this.studentPass = studentPass;
    }

    public static boolean validatepwd(String pwd) {
        if (pwd.length() > 5) {
            boolean hasNum = false, hasUp = false, hasLow = false;
            char c;
            for (int i = 0; i < pwd.length(); i++) {
                c = pwd.charAt(i);
                if (Character.isDigit(c)) {
                    hasNum = true;
                } else if (Character.isUpperCase(c)) {
                    hasUp = true;
                } else if (Character.isLowerCase(c)) {
                    hasLow = true;
                }
            }
            if (!hasNum || !hasUp || !hasLow) {
                return false;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static boolean duplicatesid(String sid) {
        boolean duplicate = false;
        try {
            BufferedReader br = new BufferedReader(new FileReader("student.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] Sdata = line.split("\\|");
                if (sid.equals(Sdata[0])) {
                    duplicate = true;
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (duplicate) {
            return true;
        } else {
            return false;
        }
    }

    public void addstudentacc() {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("student.txt", true));
            bw.write(toString() + "\n");
            bw.close();
        } catch (IOException Ex) {

        }
    }

    public String toString() {
        return studentId + "|" + studentPass + "|" + studentName + "|" + studentGender
                + "|" + studentIC + "|" + studentEmail + "|" + studentPhone;
    }
}
