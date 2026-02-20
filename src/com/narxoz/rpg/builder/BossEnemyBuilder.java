package com.narxoz.rpg.builder;

import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.loot.LootTable;
import com.narxoz.rpg.enemy.Enemy;
import com.narxoz.rpg.enemy.DragonBoss;

public class BossEnemyBuilder implements EnemyBuilder {
    private String name;
    private int hp;
    private Ability ability;
    private LootTable loot;
    private String ai;

    public EnemyBuilder setName(String name) { this.name = name; return this; }
    public EnemyBuilder setHp(int hp) { this.hp = hp; return this; }
    public EnemyBuilder setAbility(Ability ability) { this.ability = ability; return this; }
    public EnemyBuilder setLoot(LootTable loot) { this.loot = loot; return this; }
    public EnemyBuilder setAi(String ai) { this.ai = ai; return this; }

    public Enemy build() {
        return new DragonBoss(name, hp, ability, loot, ai);
    }
}