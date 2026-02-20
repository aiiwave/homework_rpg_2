package com.narxoz.rpg.enemy;

import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.loot.LootTable;

public class DragonBoss extends Enemy {
    private String ai;

    public DragonBoss(String name, int hp, Ability ability, LootTable loot, String ai) {
        super(name, hp, ability, loot);
        this.ai = ai;
    }

    @Override
    public Enemy clone() {
        return new DragonBoss(name, hp, ability.clone(), loot.clone(), ai);
    }

    @Override
    public void attack() {
        System.out.println(name + " использует " + ai + " и бьет " + ability.getName());
    }
}