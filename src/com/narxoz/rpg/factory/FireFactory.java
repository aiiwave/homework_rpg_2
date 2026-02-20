package com.narxoz.rpg.factory;
import com.narxoz.rpg.combat.*;
import com.narxoz.rpg.loot.LootTable;
import java.util.*;

public class FireFactory implements EnemyComponentFactory {
    @Override public List<Ability> createAbilities() { return Arrays.asList(new FireBall()); }
    @Override public LootTable createLootTable() { return new LootTable("огненный меч"); }
    @Override public String createAIBehavior() { return "агрессивный"; }
}