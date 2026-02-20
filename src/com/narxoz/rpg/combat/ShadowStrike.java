package com.narxoz.rpg.combat;

public class ShadowStrike implements Ability {
    public String getName() { return "удар из тени"; }
    public int getDamage() { return 90; }
    public Ability clone() { return new ShadowStrike(); }
}