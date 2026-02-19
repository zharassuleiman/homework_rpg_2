package com.narxoz.rpg.loot;
public interface LootTable extends Cloneable{
    String getLootInfo();
    LootTable clone();
}