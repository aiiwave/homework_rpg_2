package com.narxoz.rpg.factory;

import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.combat.FireAbility;
import com.narxoz.rpg.loot.LootTable;
import com.narxoz.rpg.loot.FireLootTable;
import java.util.Arrays;
import java.util.List;

public class ShadowFactory implements EnemyFactory {
    @Override
    public List<Ability> createAbilities(){
        return Arrays.asList(
                new FireAbility("теневой шаг", 20, "телепортация"),
                new FireAbility("темная звезда", 60, "сильный урон"));}

    @Override
    public LootTable createLootTable(){
        return new FireLootTable(Arrays.asList("эссенция тьмы", "плащ тени"), 150, 40);}

    @Override
    public String createAI(){
        return "тактический";}}