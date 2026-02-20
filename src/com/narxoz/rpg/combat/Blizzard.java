package com.narxoz.rpg.combat;

public class Blizzard implements Ability {
    public String getName() { return "снежная буря"; }
    public int getDamage() { return 65; }
    public Ability clone() { return new Blizzard(); }
}