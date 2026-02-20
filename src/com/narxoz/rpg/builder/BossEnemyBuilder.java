package com.narxoz.rpg.builder;
import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.loot.LootTable;
import com.narxoz.rpg.enemy.*;
import java.util.*;
public class BossEnemyBuilder implements EnemyBuilder {
    private String name;
    private int health;
    private int damage;
    private String element;
    private List<Ability> abilities = new ArrayList<>();
    private Map<Integer, Integer> phases = new HashMap<>();
    private LootTable lootTable;
    private String ai;
    private boolean canFly = true;
    private int wingspan = 20;
    @Override public EnemyBuilder setName(String name) { this.name = name; return this; }
    @Override public EnemyBuilder setHealth(int health) { this.health = health; return this; }
    @Override public EnemyBuilder setDamage(int damage) { this.damage = damage; return this; }
    @Override public EnemyBuilder setElement(String element) { this.element = element; return this; }
    @Override public EnemyBuilder setAbilities(List<Ability> abilities) { this.abilities = abilities; return this; }
    @Override public EnemyBuilder setLootTable(LootTable lootTable) { this.lootTable = lootTable; return this; }
    @Override public EnemyBuilder setAI(String ai) { this.ai = ai; return this; }
    public BossEnemyBuilder addPhase(int p, int hp) { this.phases.put(p, hp); return this; }
    @Override public Enemy build() {
        return new DragonBoss(name, health, damage, element, abilities, phases, lootTable, ai, canFly, wingspan);
    }
}