package com.Farm;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Random;
import java.util.Scanner;

public class Main extends Player {

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

        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("org.hibernate.tutorial.jpa");

        Player player1 = new Player();
        player1.setId(2);
        player1.setPlayerName("James");
        player1.setPlayerMoney(10);
        player1.setPlayerAnimals(Animals.Cow);

        Player player2 = new Player();
        player2.setId(4);
        player2.setPlayerName("Deards");
        player2.setPlayerMoney(50);
        player2.setPlayerAnimals(Animals.Horse);

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.merge(player1);
        entityManager.merge(player2);
        entityManager.getTransaction().commit();

        entityManagerFactory.close();

    }
}