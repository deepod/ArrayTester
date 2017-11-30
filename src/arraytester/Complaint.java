/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraytester;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dpitt
 */
public class Complaint {
    
    private int complaintID;
    private String description;
    private ArrayList<Action> actions = new ArrayList<>(); // list of complaint's actions
    
    
    public Complaint(int complaintID, String description){
        this.complaintID = complaintID;
        this.description = description;
    }
    
    public int getComplaintID(){
        return complaintID;
    }
    
    public List<Action> getActions(){
        return actions;
    }
    
    /**
     * 
     * @return Complaint as a String 
     */
    public String toString(){
        return ("Complaint Id: " + complaintID + "\nDescription: " + description);
    }
    
    public void addAction(Action action){
        actions.add(action);
    }
    
    
}
