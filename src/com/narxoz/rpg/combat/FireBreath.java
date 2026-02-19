package com.narxoz.rpg.combat;
public class FireBreath implements Ability {
    public String getName() { return "Fire Breath"; }
    public void use() { System.out.println("Searing flames erupt!"); }
    public Ability clone() { return new FireBreath(); }
}