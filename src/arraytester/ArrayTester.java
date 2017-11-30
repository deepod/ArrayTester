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
public class ArrayTester {
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        CCS system1 = new CCS();
        Complaint complaint1 = new Complaint(system1.generateNewID(), "The toilet was dirty");
        Complaint complaint2 = new Complaint(system1.generateNewID(), "Bad bad service");
        Complaint complaint3 = new Complaint(system1.generateNewID(), "My food was cold cold");
        system1.addComplaint(complaint1);
        system1.addComplaint(complaint1);
        system1.addComplaint(complaint1);
        
        system1.printComplaints();
        
        
        
        //Complaint complaint2 = new Complaint(generateNewID(), "The toilet was dirty");
        //Complaint complaint3 = new Complaint(generateNewID(), "The toilet was dirty");
        
        //complaints.add(complaint1);
        
       
        
        
        
        


//System.out.println(complaint1);
    }
    
    
   
    
    
}
