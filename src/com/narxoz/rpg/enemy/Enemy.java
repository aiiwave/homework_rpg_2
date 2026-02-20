package com.narxoz.rpg.enemy;
public interface Enemy {
    String getName();
    int getHealth();
    void displayInfo();
    Enemy clone();
}