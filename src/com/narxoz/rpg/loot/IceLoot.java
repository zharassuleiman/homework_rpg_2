package com.narxoz.rpg.loot;

public class IceLoot implements LootTable {
    @Override public String getLootInfo() { return "Frozen Core, Blue Crystal"; }
    @Override public LootTable clone() { return new IceLoot(); }
}