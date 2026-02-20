package com.narxoz.rpg.builder;

// Добавь эти две строки импорта:
import com.narxoz.rpg.factory.EnemyComponentFactory;
import com.narxoz.rpg.enemy.Enemy;

public class EnemyDirector {
    private EnemyBuilder builder;

    public EnemyDirector(EnemyBuilder builder) {
        this.builder = builder;
    }

    public Enemy createDragon(String name, String element, EnemyComponentFactory factory) {
        return builder.setName(name)
                .setHealth(5000)
                .setElement(element)
                .setAbilities(factory.createAbilities())
                .setLootTable(factory.createLootTable())
                .setAI(factory.createAIBehavior())
                .build();
    }
}