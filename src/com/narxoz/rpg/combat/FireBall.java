package com.narxoz.rpg.combat;

public class FireBall implements Ability {
    public String getName() { return "огненный шар"; }
    public int getDamage() { return 50; }
    public Ability clone() { return new FireBall(); }
}