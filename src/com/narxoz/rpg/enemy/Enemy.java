package com.narxoz.rpg.enemy;

import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.loot.LootTable;

public abstract class Enemy {
    protected String name;
    protected int hp;
    protected Ability ability;
    protected LootTable loot;

    public Enemy(String name, int hp, Ability ability, LootTable loot) {
        this.name = name;
        this.hp = hp;
        this.ability = ability;
        this.loot = loot;
    }

    public abstract Enemy clone();
    public abstract void attack();

    public void showStats() {
        System.out.println("Враг: " + name + " | HP: " + hp + " | Способность: " + ability.getName());
    }
}