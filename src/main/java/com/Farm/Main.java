package com.Farm;

import java.util.Random;
import java.util.Scanner;

public class Main extends Player {


    public Animals randomAnimal() {
        return Animals.values()[new Random().nextInt(Animals.values().length)];
    }


    public Player createPlayer() throws PlayerException {

        System.out.println(" Napoleon - Welcome to the farm");
        System.out.println("...four legs good, two legs bad");
        System.out.println("Please enter your player name");

        Scanner scanner = new Scanner(System.in);
        String playerName = scanner.next();
        this.setPlayerName(playerName);

        return new Player(this.getPlayerName(),20, randomAnimal());
    }


    public static void main(String[] args) throws PlayerException {

        Main main = new Main();
        Player player1 = main.createPlayer();

    }
}