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
        Complaint complaint4 = new LiftComplaint(system1.generateNewID(), "It smelled of poo", 5);
        Complaint complaint5 = new LiftComplaint(system1.generateNewID(), "The buttons were stiff", 3);
        system1.addComplaint(complaint1);
        system1.addComplaint(complaint2);
        system1.addComplaint(complaint3);
        system1.addComplaint(complaint4);
        system1.addComplaint(complaint5);
        
        system1.printComplaints();
        
        system1.recordAction(1, "We gave him a kiss");
        system1.recordAction(1, "sent him flowers");
        system1.recordAction(1, "paid a cheque");
        
        for (Action c : system1.getActionsForComplaint(1)){
            System.out.println(c);
        }
        
        if (complaint4 instanceof LiftComplaint){
            System.out.println("yolo");
        }
        
        for (Complaint c : system1.getLiftComplaints()){
            System.out.println(c);
        }
        
        System.out.println(complaint5.getActions());
            
    }   
    
    
    
}
