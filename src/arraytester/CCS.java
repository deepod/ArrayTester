/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraytester;

import java.util.ArrayList;

/**
 *
 * @author dpitt
 */
public class CCS {
    private static int currentID;
    private ArrayList<Complaint> complaints = new ArrayList<>();
    
    public static int generateNewID(){
        currentID += 1;
        return currentID;
    }
     
    public void addComplaint(Complaint complaint){
         complaints.add(complaint);
    }
     
    public void printComplaints(){
         for (Complaint i : complaints){
             System.out.println(i + "\n");
         }
    }
    
    
}
