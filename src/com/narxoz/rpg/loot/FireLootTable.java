package com.narxoz.rpg.loot;

import java.util.ArrayList;
import java.util.List;

public class FireLootTable implements LootTable {
    private List<String> items;
    private int gold;
    private int experience;

    public FireLootTable(List<String> items, int gold, int experience) {
        this.items = new ArrayList<>(items);
        this.gold = gold;
        this.experience = experience;}

    @Override
    public List<String> getItems() {
        return items;}

    @Override
    public int getGoldDrop() {
        return gold;}

    @Override
    public int getExperienceDrop() {
        return experience;}

    @Override
    public String getLootInfo(){
        return "дроп [золото: " + gold + ", Опыт: " + experience + ", предметы: " + items + "]";}

    @Override
    public LootTable clone(){
        return new FireLootTable(new ArrayList<>(this.items), this.gold, this.experience);}
}