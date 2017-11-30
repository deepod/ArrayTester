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
public class Staff extends Person{
    
    String role;
    
    public Staff (int ID, String name, String role){
        super(ID, name);
        this.role = role;
    }
    
    public String toString(){
        return(super.toString() + "\nRole: " + role);
    }
}
