package com.narxoz.rpg.loot;

public class ShadowLoot implements LootTable {
    @Override public String getLootInfo() { return "Dark Essence, Void Fragment"; }
    @Override public LootTable clone() { return new ShadowLoot(); }
}
