/**
 *
 * @author clara
 */
public class FirstClass {
    public static void main(String[] args){       
      
        String nombre = "Clara";
        int numero1, numero2, total;
        numero1 = 6;
        numero2 = 9;
        
        total = numero1 + numero2;
        
        if(numero1 < numero2){
            System.out.println(total + " " + nombre);
            
        }
        else{
            System.out.println("Error ");
        }
        
        for(int i=1; i<10; i++){
          System.out.println(i);
        }
        
        while(numero1<10){
            numero1++;  
            System.out.println(numero1);
    }
        
        
    }
    
    
}
