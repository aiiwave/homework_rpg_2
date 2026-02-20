package com.narxoz.rpg.factory;

import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.combat.IceShield;
import com.narxoz.rpg.loot.LootTable;
import com.narxoz.rpg.loot.IceLootTable;

public class IceFactory implements EnemyComponentFactory {
    @Override
    public Ability createAbility() {
        return new IceShield();
    }

    @Override
    public LootTable createLootTable() {
        return new IceLootTable();
    }

    @Override
    public String createAI() {
        return "Защитный ледяной ИИ";
    }
}