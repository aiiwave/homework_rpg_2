package com.narxoz.rpg.combat;

public class IceShield implements Ability {
    public String getName() { return "ледяной щит"; }
    public int getDamage() { return 0; }
    public Ability clone() { return new IceShield(); }
}