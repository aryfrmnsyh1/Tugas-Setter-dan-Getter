/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setget;

/**
 *
 * @author ASUS
 */
public class Setget {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        identitas enemy = new identitas();
        
        enemy.setName("paijo");
        enemy.setHp("1000 hp");
        enemy.setDamage("100");
        
        System.out.println("Name Enemy : "+ enemy.getName());
        System.out.println("HP : " + enemy.getHp());
        System.out.println("Damage : "+ enemy.getDamage());
    }
    
}
