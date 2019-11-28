/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author nimamonsefi
 */
public class Study {
    private String name;
    private int number;
    private ArrayList<String> pishniaz =new ArrayList<>();
    private ArrayList<String> hamniaz =new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
    public void getpishniaz(){
        for(String p:pishniaz){
            System.out.print(p+"  ");
        }
    }
    
    public void setpishniaz(String entry){
        pishniaz.add(entry);
    }
    
    public void gethamniaz(){
        for(String p:hamniaz){
            System.out.print(p+"  ");
        }
    }
    
    public void sethamniaz(String entry){
        hamniaz.add(entry);
    }
    
    
    
}
