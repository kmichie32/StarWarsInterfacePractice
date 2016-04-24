package com.kevinmichie;

import java.lang.*;
import java.util.Random;

public class StarWarsInterfacePractice {

    public static Character summonCharacter(){
        Random rand = new Random();
        if(Math.abs(rand.nextInt())%2 == 0){ //returns either a 0 or 1 based on modulus
            return new Enemy();
        } else{
            return new Hero();
        }
    }

    public static void main(String[] args) {
	// write your code here
        Enemy darthVader = new Enemy();
        Hero obiWanKenobi = new Hero();
        darthVader.attack();
        obiWanKenobi.attack();
        darthVader.heal();
        obiWanKenobi.heal();
        System.out.println("Enemy weapon: "+ darthVader.getWeapon());
        System.out.println("Hero weapon: " + obiWanKenobi.getWeapon());
        Character spy = summonCharacter();
        spy.attack();
        spy.heal();
    }
}
