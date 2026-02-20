package com.narxoz.rpg.builder;

import com.narxoz.rpg.enemy.Enemy;
import com.narxoz.rpg.enemy.GoblinMinion;
import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.loot.LootTable;

public class MinionBuilder implements EnemyBuilder {
    private String name;
    private int hp;
    private Ability ability;
    private LootTable loot;

    @Override
    public EnemyBuilder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public EnemyBuilder setHp(int hp) {
        this.hp = hp;
        return this;
    }

    @Override
    public EnemyBuilder setAbility(Ability ability) {
        this.ability = ability;
        return this;
    }

    @Override
    public EnemyBuilder setLoot(LootTable loot) {
        this.loot = loot;
        return this;
    }

    @Override
    public EnemyBuilder setAi(String ai) {
        return this;
    }

    @Override
    public Enemy build() {
        return new GoblinMinion(name, hp, ability, loot);
    }
}