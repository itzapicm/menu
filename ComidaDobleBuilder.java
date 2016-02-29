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
public class ComidaDobleBuilder  extends MenuBuilder {
    
    public void buildSopa(){
        Sopa sopa = new Sopa();
        sopa.setTipo("Arroz o Espagueti");
        sopa.setVerdurasIncluidas("elote y papa (para el arroz) brocoli y para el espagueti");
        
        
    }
    
    public void buildFrijoles(){
        menu.setFrijoles("Frijoles");
    }
    
    public void buildGuisado(){
        menu.setGuisado("Tienes derecho a 2 guisados");
        
    }
    
    public void buildEnsalada(){
        menu.setEnsalada("Tu ensalada incluye 2 verduras");
        
    }
}