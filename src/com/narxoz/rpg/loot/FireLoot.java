package com.narxoz.rpg.loot;

public class FireLoot implements LootTable{
    @Override public String getLootInfo(){return "Fire Gem, Dragon Scale";}
    @Override public LootTable clone(){return new FireLoot();}
}