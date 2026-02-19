package com.narxoz.rpg.factory;
import com.narxoz.rpg.combat.*;
import com.narxoz.rpg.loot.*;

public class ShadowComponentFactory implements EnemyComponentFactory {
    @Override public Ability createAbility() { return new ShadowStrike(); }
    @Override public LootTable createLoot() { return new ShadowLoot(); }
    @Override public String getAIBehavior() { return "STEALTH"; }
}
