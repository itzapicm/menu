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
public abstract class MenuBuilder {
    protected Menu menu;
    
    public Menu getMenu(){
        return menu;
    }
    
    public void crearMenu() {
        menu = new Menu();
    }
    
    public abstract void buildSopa();
    public abstract void buildFrijoles();
    public abstract void buildGuisado();
    public abstract void buildEnsalada();
    
   
}
