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
public class Customer extends Person{
    private String email;
    
    public Customer(int ID, String name, String email){
        super(ID,name);
        this.email = email;
    }
    
    public String toString(){
        return (super.toString() + "\nEmail: " + email);
    }
}
