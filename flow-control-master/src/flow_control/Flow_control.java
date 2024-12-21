/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flow_control;

/**
 *
 * @author 1
 */
public class Flow_control {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 105 ;
        switch(x){ 
            case 100 :
                System.out.println(" x =  100" );       
                break;
            case 1 :
                System.out.println(" x = 1" );               
                break;
            case 10 :
                System.out.println(" x =  10");
                break;            

            default:
                System.out.println(" no value");
                
        }
                
        System.out.println(" do while " );
        do{
            System.out.println("deddddddddd");
        
        }while(x>200);
        
        for (int y = 0 ; y<10 ;y++){
            if (y == 5){continue;}
            System.out.println("y = " + y);
            
                       
        
        }
    }
    
}
