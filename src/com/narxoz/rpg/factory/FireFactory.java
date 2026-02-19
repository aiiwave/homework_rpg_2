package com.narxoz.rpg.factory;

import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.combat.FireAbility;
import com.narxoz.rpg.loot.LootTable;
import com.narxoz.rpg.loot.FireLootTable;
import java.util.Arrays;
import java.util.List;

public class FireFactory implements EnemyFactory{
    @Override
    public List<Ability> createAbilities(){
        return Arrays.asList(
                new FireAbility("огненный шар", 50, "обжигает"),
                new FireAbility("огненный удар", 30, "урон по площади"));}

    @Override
    public LootTable createLootTable(){
        return new FireLootTable(Arrays.asList("эссенция огня", "уголь"), 100, 20);}

    @Override
    public String createAI(){
        return "агрессивный";}}