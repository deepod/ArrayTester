/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraytester;

/**
 *
 * @author davidpitt
 */
public class LiftComplaint extends Complaint {
    int floor;
    
    public LiftComplaint(int ID, String description, int floor){
        super(ID, description);
        this.floor = floor;
    }
    
    public String toString(){
        return (super.toString() + "\nFloor: " + floor);
    }
}
