package com.narxoz.rpg.prototype;
import com.narxoz.rpg.enemy.Enemy;
import java.util.*;

public class EnemyRegistry {
    private Map<String, Enemy> templates = new HashMap<>();
    public void register(String key, Enemy p) { templates.put(key, p); }
    public Enemy create(String key) { return templates.get(key).clone(); }
}