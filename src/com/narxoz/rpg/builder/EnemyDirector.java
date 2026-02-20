package com.narxoz.rpg.builder;

import com.narxoz.rpg.enemy.Enemy;
import com.narxoz.rpg.factory.EnemyComponentFactory;

public class EnemyDirector {
    public Enemy makeBoss(EnemyBuilder builder, EnemyComponentFactory factory, String name) {
        return builder.setName(name)
                .setHp(5000)
                .setAbility(factory.createAbility())
                .setLoot(factory.createLootTable())
                .setAi(factory.createAI())
                .build();
    }
}