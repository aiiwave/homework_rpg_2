package com.narxoz.rpg.factory;
import com.narxoz.rpg.combat.*;
import com.narxoz.rpg.loot.LootTable;
import java.util.*;

public class IceFactory implements EnemyComponentFactory {
    @Override public List<Ability> createAbilities() { return new ArrayList<>(); }
    @Override public LootTable createLootTable() { return new LootTable("ледяной щит"); }
    @Override public String createAIBehavior() { return "защитный"; }
}