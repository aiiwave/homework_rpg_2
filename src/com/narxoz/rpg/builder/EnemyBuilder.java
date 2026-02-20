package com.narxoz.rpg.builder;

import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.loot.LootTable;
import com.narxoz.rpg.enemy.Enemy;

public interface EnemyBuilder {
    EnemyBuilder setName(String name);
    EnemyBuilder setHp(int hp);
    EnemyBuilder setAbility(Ability ability);
    EnemyBuilder setLoot(LootTable loot);
    EnemyBuilder setAi(String ai);
    Enemy build();
}