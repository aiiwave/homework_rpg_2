package com.narxoz.rpg;

import com.narxoz.rpg.builder.*;
import com.narxoz.rpg.factory.*;
import com.narxoz.rpg.enemy.Enemy;
import com.narxoz.rpg.prototype.EnemyRegistry;

public class Main {
    public static void main(String[] args) {
        EnemyDirector director = new EnemyDirector();
        EnemyRegistry registry = new EnemyRegistry();

        // 1. Создаем Огненного Босса
        EnemyComponentFactory fireFactory = new FireFactory();
        EnemyBuilder bossBuilder = new BossEnemyBuilder();

        Enemy fireDragon = director.makeBoss(bossBuilder, fireFactory, "Смертокрыл");
        registry.addPrototype("FireDragon", fireDragon);

        // 2. Создаем Теневого Миньона
        EnemyComponentFactory shadowFactory = new ShadowFactory();
        EnemyBuilder minionBuilder = new MinionBuilder();

        // Используем того же директора, но с другим билдером и фабрикой
        Enemy shadowGoblin = director.makeBoss(minionBuilder, shadowFactory, "Теневой Гоблин");
        registry.addPrototype("ShadowGoblin", shadowGoblin);

        // 3. Тестируем клонирование из реестра
        System.out.println("----- ГЕНЕРАЦИЯ ВРАГОВ -----");

        Enemy enemy1 = registry.getPrototype("FireDragon");
        if (enemy1 != null) {
            enemy1.showStats();
            enemy1.attack();
        }

        System.out.println("-------------------------");

        Enemy enemy2 = registry.getPrototype("ShadowGoblin");
        if (enemy2 != null) {
            enemy2.showStats();
            enemy2.attack();
        }
    }
}