package com.narxoz.rpg.loot;
import java.util.ArrayList;
import java.util.List;
public class FireLoot implements LootTable {
    public List<String> getItems() { return new ArrayList<>(List.of("Fire Gem", "Dragon Scale")); }
    public String getLootInfo() { return "Loot: " + getItems(); }
    public LootTable clone() { return new FireLoot(); }
}