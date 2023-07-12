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
public class Booking {
    private String studentId;
    private String studentGender;
    private String type;
    private String startDate;
    private String endDate;
    private String numOfMonth;
    private String bookDate;
    private String status;
    private String payment;
    private String payDate;
    private String roomId;

    public Booking(String studentId, String studentGender, String type, String startDate, String endDate, String numOfMonth, String bookDate, String status, String payment, String payDate, String roomId) {
        this.studentId = studentId;
        this.studentGender = studentGender;
        this.type = type;
        this.startDate = startDate;
        this.endDate = endDate;
        this.numOfMonth = numOfMonth;
        this.bookDate = bookDate;
        this.status = status;
        this.payment = payment;
        this.payDate = payDate;
        this.roomId = roomId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setStudentGender(String studentGender) {
        this.studentGender = studentGender;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public void setNumOfMonth(String numOfMonth) {
        this.numOfMonth = numOfMonth;
    }

    public void setBookDate(String bookDate) {
        this.bookDate = bookDate;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public void setPayDate(String payDate) {
        this.payDate = payDate;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public Booking() {}

    public String getStudentId() {
        return studentId;
    }

    public String getStudentGender() {
        return studentGender;
    }

    public String getType() {
        return type;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public String getNumOfMonth() {
        return numOfMonth;
    }

    public String getBookDate() {
        return bookDate;
    }

    public String getStatus() {
        return status;
    }

    public String getPayment() {
        return payment;
    }

    public String getPayDate() {
        return payDate;
    }

    public String getRoomId() {
        return roomId;
    }

    @Override
    public String toString() {
        return  studentId + "|" + studentGender + "|" + type + "|" + startDate +
                "|" + endDate + "|" + numOfMonth + "|" + bookDate + "|" + status +
                "|" + payment + "|" + payDate + "|" + roomId;
    }

    public void DelFileBooking() 
    {
        File f = new File("booking.txt");
        try {
            FileWriter fw = new FileWriter(f);
            //clear the file
            fw.flush();
            fw.close();
        } catch (IOException ex) {} 
    }

    public void Write2FileBooking()
    {
        File room = new File("booking.txt"); 
        try
        {
            FileWriter fw = new FileWriter(room,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.write(toString() + "\n");
            pw.close();
        }
        catch(IOException Ex){}
    }

    
}
