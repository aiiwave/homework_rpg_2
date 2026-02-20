package com.narxoz.rpg.loot;

public class FireLootTable implements LootTable {
    @Override
    public String getItems() {
        return "огненный камень и обгорелая чешуя";
    }

    @Override
    public LootTable clone() {
        return new FireLootTable();
    }
}