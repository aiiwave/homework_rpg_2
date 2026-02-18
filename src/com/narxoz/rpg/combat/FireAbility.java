package com.narxoz.rpg.combat;

public class FireAbility implements Ability {
    private String name;
    private int damage;
    private String description;

    public FireAbility(String name, int damage, String description) {
        this.name = name;
        this.damage = damage;
        this.description = description;}

    @Override
    public String getName(){
        return name;}

    @Override
    public int getDamage(){
        return damage;}

    @Override
    public String getDescription(){
        return description;}

    @Override
    public Ability clone(){
        return new FireAbility(this.name, this.damage, this.description);}

    @Override
    public String toString(){
        return "способность: " + name + " (урон: " + damage + ")";}
}