package com.narxoz.rpg.builder;

import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.loot.LootTable;
import com.narxoz.rpg.enemy.Enemy;
import com.narxoz.rpg.enemy.Goblin;
import java.util.List;

public class DefaultEnemyBuilder implements EnemyBuilder {
    private String name;
    private int health;
    private int damage;
    private List<Ability> abilities;
    private LootTable lootTable;
    private String ai;

    @Override public EnemyBuilder setName(String name) { this.name = name; return this; }
    @Override public EnemyBuilder setHealth(int health) { this.health = health; return this; }
    @Override public EnemyBuilder setDamage(int damage) { this.damage = damage; return this; }
    @Override public EnemyBuilder setElement(String element) { return this; }
    @Override public EnemyBuilder setAbilities(List<Ability> abilities) { this.abilities = abilities; return this; }
    @Override public EnemyBuilder setLootTable(LootTable lootTable) { this.lootTable = lootTable; return this; }
    @Override public EnemyBuilder setAI(String ai) { this.ai = ai; return this; }

    @Override
    public Enemy build() {
        return new Goblin(name);
    }
}