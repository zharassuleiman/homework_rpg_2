package com.narxoz.rpg.combat;

public class IceShard implements Ability {
    @Override
    public String getName() { return "Ice Shard"; }
    @Override
    public void use() { System.out.println("Using Ice Shard: Freezing projectile!"); }
    @Override
    public Ability clone() { return new IceShard(); }
}