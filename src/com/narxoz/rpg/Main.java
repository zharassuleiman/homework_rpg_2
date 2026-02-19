package com.narxoz.rpg;
import com.narxoz.rpg.builder.*;
import com.narxoz.rpg.enemy.*;
import com.narxoz.rpg.factory.*;

public class Main{
    public static void main(String[] args) {
        EnemyDirector director = new EnemyDirector();
        BossEnemyBuilder bossBuilder = new BossEnemyBuilder();
        BasicEnemyBuilder gruntBuilder = new BasicEnemyBuilder();
        EnemyRegistry registry = new EnemyRegistry();

        Enemy fireDragonBase = director.createFireBoss(bossBuilder);
        registry.register("AncientFireDragon", fireDragonBase);

        Enemy shadowSpy = gruntBuilder
                .setName("Shadow Stalker")
                .setHp(300)
                .setType(new ShadowComponentFactory())
                .build();
        registry.register("ShadowSpy", shadowSpy);

        Enemy boss1 = registry.create("AncientFireDragon");
        Enemy eliteBoss = registry.create("AncientFireDragon");
        eliteBoss.multiplyStats(3.0);

        Enemy spy1 = registry.create("ShadowSpy");
        Enemy spy2 = registry.create("ShadowSpy");


        System.out.println(" ---ENEMY DEPLOYMENT REPORT--- ");
        boss1.displayInfo();
        eliteBoss.displayInfo();
        spy1.displayInfo();
        spy2.displayInfo();
        System.out.println("\n--- ACTION VERIFICATION---");
        System.out.println("Elite Boss used special move: ");
        System.out.println("Executing combat logic for" + eliteBoss.getClass().getSimpleName());
        Enemy[] battleGroup = {boss1, spy1};
        for (Enemy e : battleGroup) {
            e.displayInfo();
        }
        System.out.println("\n--- SYSTEM CHECK COMPLETE ---");
    }
}