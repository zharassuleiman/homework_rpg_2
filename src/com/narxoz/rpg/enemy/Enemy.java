package com.narxoz.rpg.enemy;

public interface Enemy extends Cloneable{
    void displayInfo();
    void multiplyStatus(double factor);
    Enemy clone();
}