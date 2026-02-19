package com.narxoz.rpg.factory;
import com.narxoz.rpg.combat.*;
import com.narxoz.rpg.loot.*;

public class FireComponentFactory implements EnemyComponentFactory {
    @Override public Ability createAbility() { return new FireBreath(); }
    @Override public LootTable createLoot() { return new FireLoot(); }
    @Override public String getAIBehavior() { return "AGGRESSIVE"; }
}