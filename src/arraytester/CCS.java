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
public class CCS {
    private static int currentID;
    private ArrayList<Complaint> complaints = new ArrayList<>();
    private ArrayList<Person> people = new ArrayList<>();
    
    
    public void addComplaint(Complaint complaint){
         complaints.add(complaint);
    }
    
    public void addStaffMember(Staff staffMember){
        people.add(staffMember);
    }
     
    public void printComplaints(){
         for (Complaint i : complaints){
             System.out.println(i + "\n");
         }
    }
    
    public int generateNewID(){
        currentID += 1;
        return currentID;
    }
    
    public void recordAction(int complaintID, String actionTaken){
        for (Complaint c : complaints){
            if (c.getComplaintID() == complaintID){
                c.addAction(new Action(actionTaken));
            }
         }
    }
    
    public List<Action> getActionsForComplaint(int complaintID){
        for (Complaint c : complaints){
            if (c.getComplaintID() == complaintID){
                return c.getActions();
            }      
        }
        
        return null;
    }
    
    
    public List <Complaint> getLiftComplaints(){
        ArrayList<Complaint> liftComplaints = new ArrayList<Complaint>();
        for (Complaint c : complaints){
            if (c instanceof  LiftComplaint){
                liftComplaints.add(c);
            }       
        }
        return liftComplaints;
    }
    
}
