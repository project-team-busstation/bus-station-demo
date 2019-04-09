/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus.station;

import java.io.*;
import java.util.*;

public class Validation { 
    private Scanner x; 
    SignIn data;
    
    public void openFile(){
        try{ 
            
            x = new Scanner(new File("Clients.txt"));
             while (x.hasNext()){
              String name = x.next();
              String pin = x.next();
               
              
        }
        } catch(Exception e){
            //do nothing until now
        }
    } 
    public void readFile(){
       
    }
    
}
