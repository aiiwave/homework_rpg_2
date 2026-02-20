package com.narxoz.rpg.combat;

public class Vanish implements Ability {
    public String getName() { return "исчезновение"; }
    public int getDamage() { return 0; }
    public Ability clone() { return new Vanish(); }
}