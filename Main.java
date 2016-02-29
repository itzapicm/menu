/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

/**
 *
 * @author ANGELICA
 */
public class Main {
    
    public static void main(String[] args) {
        MenuDirector director = new MenuDirector();
        director.setMenuBuilder(new ComidaSencillaBuilder());
        director.constructMenu();
        Menu menu = director.getMenu();
        
    
     
      
        System.out.println( "Sopa: " + menu.getSopa());
        System.out.println( "Frijoles: " + menu.getFrijoles());
        System.out.println( "Guisado: " + menu.getGuisado() );
        System.out.println( "Ensalada: " + menu.getEnsalada() );
        System.out.println("===================================");
    }
        
        
       
    
        
    }
    

