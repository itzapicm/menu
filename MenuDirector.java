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
public class MenuDirector {
    
    private MenuBuilder menuBuilder;
    
    public void constructMenu(){
        menuBuilder.crearMenu();
        menuBuilder.buildSopa();
        menuBuilder.buildFrijoles();
        menuBuilder.buildGuisado();
        menuBuilder.buildEnsalada();
    }
    
    public void setMenuBuilder (MenuBuilder ab){
        menuBuilder = ab;
        
    
    }
    
    
    public Menu getMenu() {
        return menuBuilder.getMenu();
    
    }
}
