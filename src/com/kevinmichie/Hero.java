package com.kevinmichie;

import java.lang.*;

public class Hero implements Character {

    public String weapon = "lightsaber";

    public String getWeapon(){
        return weapon;
    }

    @Override
    public void attack() {
        System.out.println("The hero attacks the enemy");
    }

    @Override
    public void heal() {
        System.out.println("The hero heals you");
    }
}
