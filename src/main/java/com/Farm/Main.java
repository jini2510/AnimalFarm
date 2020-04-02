package com.Farm;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Random;
import java.util.Scanner;

public class Main extends Player {

    public void saveToDatbase (Player player){

        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("org.hibernate.tutorial.jpa");

        try {
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            entityManager.getTransaction().begin();
            entityManager.persist(player);
            entityManager.getTransaction().commit();
            entityManagerFactory.close();

        }
        catch (Exception e){
            System.out.println(e);
        }

    }

    public Animals randomAnimal() {
        return Animals.values()[new Random().nextInt(Animals.values().length)];
    }

    public Player createPlayer() throws PlayerException {

        System.out.println("Welcome to the farm");
        System.out.println("Please enter your player name");

        Scanner scanner = new Scanner(System.in);
        String playerName = scanner.next();

        this.setPlayerName(playerName);

        return new Player(this.getPlayerName(),(20), randomAnimal());
    }


    public static void main(String[] args) throws PlayerException {

        Main main = new Main();
        Player player1 = main.createPlayer();
        main.saveToDatbase(player1);

    }
}