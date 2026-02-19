package com.narxoz.rpg.factory;
import com.narxoz.rpg.combat.*;
import com.narxoz.rpg.loot.*;

public class IceComponentFactory implements EnemyComponentFactory {
    @Override public Ability createAbility() { return new IceShard(); }
    @Override public LootTable createLoot() { return new IceLoot(); }
    @Override public String getAIBehavior() { return "DEFENSIVE"; }
}