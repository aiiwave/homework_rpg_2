package com.narxoz.rpg.enemy;
import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.loot.LootTable;
import java.util.*;
public class DragonBoss implements Enemy {
    private String name;
    private int health;
    private int damage;
    private String element;
    private List<Ability> abilities;
    private Map<Integer, Integer> phases;
    private LootTable lootTable;
    private String ai;
    private boolean canFly;
    private int wingspan;
    public DragonBoss(String n, int h, int d, String e, List<Ability> a, Map<Integer, Integer> p, LootTable l, String ai, boolean f, int w) {
        this.name = n; this.health = h; this.damage = d; this.element = e;
        this.abilities = a; this.phases = p; this.lootTable = l;
        this.ai = ai; this.canFly = f; this.wingspan = w;
    }
    @Override public String getName() { return name; }
    @Override public int getHealth() { return health; }
    @Override public void displayInfo() { System.out.println("босс: " + name + " | стихия: " + element + " | хп: " + health); }
    @Override public Enemy clone() {
        List<Ability> clonedAbilities = new ArrayList<>();
        if (abilities != null) for (Ability a : abilities) clonedAbilities.add(a.clone());
        return new DragonBoss(name, health, damage, element, clonedAbilities, new HashMap<>(phases), lootTable != null ? lootTable.clone() : null, ai, canFly, wingspan);
    }
}