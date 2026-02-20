package com.narxoz.rpg.combat;

public class FlameBreath implements Ability {
    public String getName() { return "огненное дыхание"; }
    public int getDamage() { return 70; }
    public Ability clone() { return new FlameBreath(); }
}