package com.narxoz.rpg.factory;

import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.combat.ShadowStrike;
import com.narxoz.rpg.loot.LootTable;
import com.narxoz.rpg.loot.ShadowLootTable;

public class ShadowFactory implements EnemyComponentFactory {
    @Override
    public Ability createAbility() {
        return new ShadowStrike();
    }

    @Override
    public LootTable createLootTable() {
        return new ShadowLootTable();
    }

    @Override
    public String createAI() {
        return "Скрытный теневой ИИ";
    }
}