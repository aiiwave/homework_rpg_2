package com.narxoz.rpg.loot;
public class LootTable {
    private String name;
    public LootTable(String name) { this.name = name; }
    public LootTable clone() { return new LootTable(this.name); }
}