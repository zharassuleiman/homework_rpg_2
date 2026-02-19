package com.narxoz.rpg.combat;

public class ShadowStrike implements Ability {
    @Override public String getName() { return "Shadow Strike"; }
    @Override public void use() { System.out.println("Using Shadow Strike: Attack from the dark!"); }
    @Override public Ability clone() { return new ShadowStrike(); }
}
