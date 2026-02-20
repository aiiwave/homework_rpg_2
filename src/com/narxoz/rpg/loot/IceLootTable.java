package com.narxoz.rpg.loot;

public class IceLootTable implements LootTable {
    @Override
    public String getItems() {
        return "ледяной кристалл и замерзшая пыль";
    }

    @Override
    public LootTable clone() {
        return new IceLootTable();
    }
}