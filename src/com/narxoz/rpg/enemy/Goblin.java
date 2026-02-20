package com.narxoz.rpg.enemy;
import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.loot.LootTable;
import java.util.*;
public class Goblin implements Enemy {
    private String name;
    private int health;
    private int damage;
    private List<Ability> abilities = new ArrayList<>();
    private LootTable lootTable;
    public Goblin(String name) {
        this.name = name;
        this.health = 100;
        this.damage = 15;
    }
    @Override public String getName() { return name; }
    @Override public int getHealth() { return health; }
    @Override public void displayInfo() { System.out.println("враг: " + name + " (гоблин) | хп: " + health); }
    @Override public Enemy clone() {
        Goblin copy = new Goblin(this.name);
        copy.health = this.health;
        copy.damage = this.damage;
        return copy;
    }
}