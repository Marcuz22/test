/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author ADMIN
 */
public class Feedback {
    private String studentId;
    private String feedback;

    public Feedback(){};
    public Feedback(String studentId, String feedback) {
        this.studentId = studentId;
        this.feedback = feedback;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
    
}
