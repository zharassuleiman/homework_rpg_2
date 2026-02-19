package com.narxoz.rpg.enemy;
import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.loot.LootTable;

public class DragonBoss implements Enemy {
    private String name;
    private int hp;
    private Ability ability;
    private LootTable loot;
    private String ai;

    public DragonBoss(String name, int hp, Ability ability, LootTable loot, String ai) {
        this.name = name; this.hp = hp; this.ability = ability; this.loot = loot; this.ai = ai;
    }
    @Override public Enemy clone() { return new DragonBoss(name, hp, ability.clone(), loot.clone(), ai); }
    @Override public void multiplyStats(double f) { this.hp *= f; }
    @Override public void displayInfo() { System.out.println("DragonBoss: " + name + " | HP: " + hp + " | AI: " + ai + " | Loot: " + loot.getLootInfo()); }
}