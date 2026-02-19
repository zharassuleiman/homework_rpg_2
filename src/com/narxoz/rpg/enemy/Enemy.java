package com.narxoz.rpg.enemy;

public interface Enemy extends Cloneable{
    void displayInfo();
    void multiplyStats(double f);
    Enemy clone();
}