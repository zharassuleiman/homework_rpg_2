package com.narxoz.rpg.builder;
import com.narxoz.rpg.enemy.Enemy;
import com.narxoz.rpg.factory.EnemyComponentFactory;

public interface EnemyBuilder {
    EnemyBuilder setName(String name);
    EnemyBuilder setHp(int hp);
    EnemyBuilder setType(EnemyComponentFactory factory);
    Enemy build();

}
