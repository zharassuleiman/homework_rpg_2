package com.narxoz.rpg.combat;

public interface Ability extends Cloneable{
    String getName();
    void use();
    Ability clone();
}