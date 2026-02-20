package com.narxoz.rpg.factory;
import com.narxoz.rpg.combat.*;
import com.narxoz.rpg.loot.LootTable;
import java.util.*;

public class ShadowFactory implements EnemyComponentFactory {
    @Override public List<Ability> createAbilities() { return new ArrayList<>(); }
    @Override public LootTable createLootTable() { return new LootTable("теневой кинжал"); }
    @Override public String createAIBehavior() { return "скрытный"; }
}