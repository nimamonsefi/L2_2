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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        Study s1=new Study();
        Study s2=new Study();
        Study s3=new Study();

        ArrayList<Study> studyList=new ArrayList<>();
        
        studyList.add(s1);
        studyList.add(s2);
        studyList.add(s3);

        for(Study s:studyList){
            System.out.print("\nEnter The Name : ");
            s.setName(scanner.next());
            
            System.out.print("Enter The Number : ");
            s.setNumber(scanner.nextInt());
            
            while(true){
                System.out.print("Enter The Pishniaz : ");
                s.setpishniaz(scanner.next());
                
                System.out.print("Is There Another Pishniaz ?(Y or N) :");
                if(scanner.next().equalsIgnoreCase("N")){
                    break;
                }
            }
            while(true){
                System.out.print("Enter The Hamniaz : ");
                s.sethamniaz(scanner.next());
                
                System.out.print("Is There Another Hamniaz ?(Y or N) :");
                if(scanner.next().equalsIgnoreCase("N")){
                    break;
                }
            }
        }
        
        System.out.print("\nEnter The Name of Study : ");
        
        for(Study s:studyList){
            if(scanner.next().equalsIgnoreCase(s.getName())){
                System.out.println("Number : "+s.getNumber());
                System.out.print("Pishniaz : ");
                s.getpishniaz();
                System.out.print("\nHamniaz : ");
                s.gethamniaz();
            }
        }
    }
    
}
