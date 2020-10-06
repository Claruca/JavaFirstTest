/**
 *
 * @author clara
 */
public class FirstClass {
    public static void main(String[] args){     
        
        String helloWorld = "Hello World";
        System.out.println(helloWorld);     
        
        
        final double PI = 3.14;
        char grupo = 'B';
        int contador = 34;   
        float resultado = 34.3f;
        double d = 34.3;
        
        float euros, dolares;
        euros = 427;
        dolares = euros * 1.17f;
  
        System.out.println("Los " + euros + "euros, son " + dolares + " dolares.");       
        
        
        
        boolean V = true;
        boolean F = false;
        
        System.out.println(V&&F);
        System.out.println(F&&V);
        System.out.println(V&&V);
        System.out.println(F&&F);
        System.out.println(V||F);
        System.out.println(V||F);
        System.out.println(V||F);
        System.out.println(V||F);
        
        
        int numero = 10;
        int numero2 = 3;
        
        if(numero>0){
            System.out.println(numero + "es positivo");
        }
        
        if(numero<1&&numero>-1){
            System.out.println(numero);
        }
        
        
        if(numero%2 == 0){
            System.out.println(numero + " múltiplo de 2");
        }
        else{
            System.out.println(numero + " no es múltiplo de 2");
        }
        
        
        if(numero%numero2 ==0){
            System.out.println(numero + " múltiplo");
        }
        System.out.println(numero + " no es múltiplo");
            
        }
        
        
        
        /*
      
        String nombres = "Clara";
        int numero1, numero2, total;
        numero1 = 6;
        numero2 = 9;
        
        total = numero1 + numero2;
        
        if(numero1 < numero2){
            System.out.println(total + " " + nombres);
            
        }
        else{
            System.out.println("Error ");
        }
       
        int cadena[] = new int[4];
        cadena[0] = 2;
        cadena[1] = 4;
        cadena[2] = 6;
                
        System.out.println(cadena[0]);
                
        for(int i=1; i<10; i++){
          System.out.println(i);
          
        }
        
        while(numero1<10){
            numero1++;  
            System.out.println(numero1);
    }
       
    */
    }
    
    
}
