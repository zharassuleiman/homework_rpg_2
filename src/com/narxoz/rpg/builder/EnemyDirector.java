package com.narxoz.rpg.builder;
import com.narxoz.rpg.enemy.Enemy;
import com.narxoz.rpg.factory.FireComponentFactory;
import com.narxoz.rpg.factory.IceComponentFactory;

public class EnemyDirector {
    public Enemy createFireBoss(EnemyBuilder builder) {
        return builder.setName("Fire Lord").setHp(5000).setType(new FireComponentFactory()).build();
    }
    public Enemy createIceMinion(EnemyBuilder builder) {
        return builder.setName("Ice Scout").setHp(200).setType(new IceComponentFactory()).build();
    }
}