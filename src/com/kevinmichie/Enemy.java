package com.kevinmichie;

import java.lang.*;

public class Enemy implements Character {

    public String weapon = "lightsaber";

    public Enemy(){

    }

    public String getWeapon(){
        return weapon;
    }

    @Override
    public void attack() {
        System.out.println("The enemy attacks YOU!");
    }

    @Override //Implements because of the interface
    public void heal() {
        System.out.println("The enemy heals himself");
    }

    public void weaponDraw(){
        System.out.println("Draw out weapon!");
    }
}
