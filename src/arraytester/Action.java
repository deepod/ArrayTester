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
public class Action {
    
    
    private String actionTaken;
    
    public Action(String actionTaken){
        this.actionTaken = actionTaken;
    }
    
    public String toString(){
        return (actionTaken);
    }
}
