package com.narxoz.rpg.factory;

import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.combat.FireAbility;
import com.narxoz.rpg.loot.LootTable;
import com.narxoz.rpg.loot.FireLootTable;
import java.util.Arrays;
import java.util.List;

public class IceFactory implements EnemyFactory{
    @Override
    public List<Ability> createAbilities(){
        return Arrays.asList(
                new FireAbility("ледяная стрела", 40, "замедляет"),
                new FireAbility("ледяной щит", 0, "защита"));}
    @Override
    public LootTable createLootTable(){
        return new FireLootTable(Arrays.asList("кристалл льда", "замерзшая слеза"), 80, 15);}

    @Override
    public String createAI(){
        return "защитный";}}