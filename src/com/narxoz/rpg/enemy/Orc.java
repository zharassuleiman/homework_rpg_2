package com.narxoz.rpg.enemy;

import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.loot.LootTable;

public class Orc implements Enemy {
    private String name;
    private int hp;
    private Ability ability;
    private LootTable loot;
    private String ai;

    public Orc(String name, int hp, Ability ability, LootTable loot, String ai) {
        this.name = name;
        this.hp = hp;
        this.ability = ability;
        this.loot = loot;
        this.ai = ai;
    }
    @Override
    public Enemy clone() {
        return new Orc(name, hp, ability.clone(), loot.clone(), ai);
    }
    @Override
    public void multiplyStats(double f) {
        this.hp = (int)(this.hp * f);
    }
    @Override
    public void displayInfo() {
        System.out.println("Orc: " + name + " | HP: " + hp + " | Ability: " + ability.getName());
    }
}
