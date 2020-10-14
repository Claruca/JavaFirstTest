package testingJava;


import testingJava.LT;
import testingJava.Horoscopo;


/**
 *
 * @author clara
 */
public class FirstClass {

    public static void main(String[] args) {
        
        //int year = 1932;
       // int resto = year%12;
       //String horoscopo = "";
        
        LT lector = new LT();
        System.out.println("Introducir año: ");
        int year = lector.leerEntero();    
        Horoscopo horos = new Horoscopo();        
        System.out.println(horos.queHoroscopotengo(year));
         
        
        /*
        switch(resto){
            case 0: horoscopo = "Mono"; break;
            case 1: horoscopo = "Gallo"; break;
            case 2: horoscopo = "Perro"; break;
            case 3: horoscopo = "Cerdo"; break;
            case 4: horoscopo = "Rata"; break;
            case 5: horoscopo = "Buey"; break;
            case 6: horoscopo = "Tigre"; break;
            case 7: horoscopo = "Conejo"; break;
            case 8: horoscopo = "Dragon"; break;
            case 9: horoscopo = "Serpiente"; break;
            case 10: horoscopo = "Caballo"; break;
            case 11: horoscopo = "Cabra"; break;
        
        }
        
        System.out.println("Tu horóscopo chino, según el año de nacimiento es: " + horoscopo);
        
        */
     

     /*   String helloWorld = "Hello World";
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

        System.out.println(V && F);
        System.out.println(F && V);
        System.out.println(V && V);
        System.out.println(F && F);
        System.out.println(V || F);
        System.out.println(V || F);
        System.out.println(V || F);
        System.out.println(V || F);

        int numero = 10;
        int numero1 = 6;
        int numero2 = 3;

        if (numero > 0) {
            System.out.println(numero + "es positivo");
        }      
        
        
        
        if (numero < 1 && numero > -1) {
            System.out.println(numero);
        }

        if (numero % 2 == 0) {
            System.out.println(numero + " múltiplo de 2");
        } else {
            System.out.println(numero + " no es múltiplo de 2");
        }

        if (numero % numero2 == 0) {
            System.out.println(numero + " múltiplo");
        }
        System.out.println(numero + " no es múltiplo");

        int cadena[] = new int[4];
        cadena[0] = 2;
        cadena[1] = 4;
        cadena[2] = 6;

        System.out.println(cadena[0]);

        for (int i = 1; i < 10; i++) {
            System.out.println(i);

        }

        while (numero1 < 10) {
            numero1++;
            System.out.println(numero1);

        }
*/
     
     
    }
}

