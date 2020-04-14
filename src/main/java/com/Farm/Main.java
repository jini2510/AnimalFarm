package com.Farm;

import com.Farm.animals.*;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Sheep mySheep = new Sheep();
        System.out.println(mySheep);

        Chicken newChicken = new Chicken();
        System.out.println(newChicken);


        System.out.println(newChicken.getTotalEggs());
        newChicken.layEggs();
        System.out.println(newChicken.getTotalEggs());
        newChicken.layEggs();
        newChicken.layEggs();
        System.out.println(newChicken.getTotalEggs());
    }

}




//public class Main extends Player {

//    public Animals randomAnimal() {
//        return Animals.values()[new Random().nextInt(Animals.values().length)];
//    }
//
//    public Player createPlayer() throws PlayerException {
//
//        System.out.println("Welcome to the farm");
//        System.out.println("Please enter your player name");
//
//        Scanner scanner = new Scanner(System.in);
//        String playerName = scanner.next();
//
//        //this.setPlayerName(playerName);
//
//        //return new Player(this.getPlayerName(),(20), randomAnimal(),50);
//        //problem with *this.getPlayerName(), my edit:
//        return new Player(playerName, 20, randomAnimal(), 50);
//    }
//
//    public void gameTime(){
//        long startTime = System.currentTimeMillis();
//    }
//
//    public static void main(String[] args) throws PlayerException {
//
//        Main main = new Main();
//        Player player1 = main.createPlayer();
//
//    }
// }