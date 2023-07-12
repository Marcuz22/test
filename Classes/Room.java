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
import javax.swing.JTextField;

/**
 *
 * @author ADMIN
 */
public class Room {

    private String roomId;
    private String rGender;
    private String roomType;
    private String roomName;
    private String size;
    private String aircond;
    private String washroom;
    private String fridge;
    private String price;

    public Room() {
    }

    ;
    public Room(String roomId, String Gender, String roomType, String roomName,
            String size, String aircond, String washroom, String fridge, String price) {
        this.roomId = roomId;
        this.rGender = Gender;
        this.roomType = roomType;
        this.roomName = roomName;
        this.size = size;
        this.aircond = aircond;
        this.washroom = washroom;
        this.fridge = fridge;
        this.price = price;
    }

    public String getRoomId() {
        return roomId;
    }

    public String getrGender() {
        return rGender;
    }

    public String getRoomType() {
        return roomType;
    }

    public String getRoomName() {
        return roomName;
    }

    public String getSize() {
        return size;
    }

    public String getAircond() {
        return aircond;
    }

    public String getWashroom() {
        return washroom;
    }

    public String getFridge() {
        return fridge;
    }

    public String getPrice() {
        return price;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public void setrGender(String Gender) {
        this.rGender = Gender;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setAircond(String aircond) {
        this.aircond = aircond;
    }

    public void setWashroom(String washroom) {
        this.washroom = washroom;
    }

    public void setFridge(String fridge) {
        this.fridge = fridge;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void Write2FileRoom() {
        File room = new File("room.txt");
        try {
            FileWriter fw = new FileWriter(room, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.write(toString() + "\n");
            pw.close();
        } catch (IOException Ex) {

        }
    }

    public void DelFileRoom() {
        File f = new File("room.txt");
        try {
            FileWriter fw = new FileWriter(f);
            //clear the file
            fw.flush();
            fw.close();
        } catch (IOException ex) {
        }
    }

    @Override
    public String toString() {
        return roomId + "|" + rGender + "|" + roomType + "|" + roomName
                + "|" + size + "|" + aircond + "|" + washroom
                + "|" + fridge + "|" + price;
    }

}
