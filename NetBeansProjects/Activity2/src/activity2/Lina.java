/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity2;

/**
 *
 * @author asi
 */
public  class Lina extends Hero{
   public void takeDamage(int damage){
   this.hp-=damage;
   }
   public void attack(Hero hero,Skill skill){
   hero.hp-=skill.getDamage();
   }
   public void block(Skill skill){
   this.hp-=0;
   }
   
}
