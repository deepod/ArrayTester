/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraytester;

/**
 *
 * @author dpitt
 */
public class Complaint {
    
    private int complaintId;
    private String description;
    
    
    public Complaint(int complaintId, String description){
        this.complaintId = complaintId;
        this.description = description;
    }
    
    public int getComplaintId(){
        return complaintId;
    }
    
    /**
     * 
     * @return Complaint as a String 
     */
    public String toString(){
        return ("Complaint Id: " + complaintId + "\nDescription: " + description);
    }
    
    
    
}
