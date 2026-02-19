package com.narxoz.rpg.builder;
import com.narxoz.rpg.enemy.*;
import com.narxoz.rpg.factory.EnemyComponentFactory;

public class BossEnemyBuilder implements EnemyBuilder {
    private String name; private int hp; private EnemyComponentFactory factory;
    @Override public EnemyBuilder setName(String n) { this.name = n; return this; }
    @Override public EnemyBuilder setHp(int h) { this.hp = h; return this; }
    @Override public EnemyBuilder setType(EnemyComponentFactory f) { this.factory = f; return this; }
    @Override public Enemy build() { return new DragonBoss(name, hp, factory.createAbility(), factory.createLoot(), factory.getAIBehavior()); }
}