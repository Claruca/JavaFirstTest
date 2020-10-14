package testingJava;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author clara
 */
public class Horoscopo {
    
    String name;
    
     public String queHoroscopotengo (int yearIn){
         
         int resto = yearIn%12;         
         switch(resto){
            case 0: name = "Mono"; break;
            case 1: name = "Gallo"; break;
            case 2: name = "Perro"; break;
            case 3: name = "Cerdo"; break;
            case 4: name = "Rata"; break;
            case 5: name = "Buey"; break;
            case 6: name = "Tigre"; break;
            case 7: name = "Conejo"; break;
            case 8: name = "Dragon"; break;
            case 9: name = "Serpiente"; break;
            case 10: name = "Caballo"; break;
            case 11: name = "Cabra"; break;        
        }
          
     return name;
     
     }
    
}
