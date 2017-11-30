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
public class Person {
    
    private int ID;
    private String name;
    
    public Person(int ID, String name){
        this.ID = ID;
        this.name = name;
    }
    
    public int getID(){
        return ID;
    }
    
    public String toString(){
        return ("Person ID: " + ID + "\nName: " + name);
    }
    
}
