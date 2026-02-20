package com.narxoz.rpg.enemy;

import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.loot.LootTable;

public class GoblinMinion extends Enemy {
    public GoblinMinion(String name, int hp, Ability ability, LootTable loot) {
        super(name, hp, ability, loot);
    }

    @Override
    public Enemy clone() {
        return new GoblinMinion(this.name, this.hp, this.ability.clone(), this.loot.clone());
    }

    @Override
    public void attack() {
        System.out.println(name + " трусливо атакует, используя " + ability.getName() + "!");
    }
}