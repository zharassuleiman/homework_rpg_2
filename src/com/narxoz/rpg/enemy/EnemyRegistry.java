package com.narxoz.rpg.enemy;
import java.util.HashMap;
import java.util.Map;

public class EnemyRegistry {
    private Map<String, Enemy> templates = new HashMap<>();
    public void register(String key, Enemy e) { templates.put(key, e); }
    public Enemy create(String key) { return templates.get(key).clone(); }
}