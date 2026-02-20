package com.narxoz.rpg;

import com.narxoz.rpg.builder.*;
import com.narxoz.rpg.factory.*;
import com.narxoz.rpg.enemy.Enemy;
import com.narxoz.rpg.prototype.EnemyRegistry;

public class Main {
    public static void main(String[] args) {
        System.out.println("rpg enemy system итоговая демонстрация");
        System.out.println("");

        EnemyComponentFactory fireFactory = new FireFactory();
        EnemyComponentFactory iceFactory = new IceFactory();
        EnemyComponentFactory shadowFactory = new ShadowFactory();

        EnemyDirector director = new EnemyDirector(new BossEnemyBuilder());

        Enemy fireDragon = director.createDragon("огненный владыка", "огонь", fireFactory);
        fireDragon.displayInfo();

        EnemyRegistry registry = new EnemyRegistry();
        registry.register("fire_template", fireDragon);

        Enemy clonedBoss = registry.create("fire_template");
        System.out.print("клон: ");
        clonedBoss.displayInfo();

        Enemy shadowBoss = director.createDragon("теневой жнец", "тень", shadowFactory);
        shadowBoss.displayInfo();

        System.out.println("");
        System.out.println("проверка паттернов завершена");
    }
}