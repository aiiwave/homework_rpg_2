package com.narxoz.rpg.loot;

public class ShadowLootTable implements LootTable {
    @Override
    public String getItems() {
        return "осколок тьмы и призрачная нить";
    }

    @Override
    public LootTable clone() {
        return new ShadowLootTable();
    }
}