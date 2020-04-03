package com.Farm;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "player_table")

public class Player {

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "incrementer")
    @GenericGenerator(name = "incrementer", strategy = "increment")

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "playerName")
    private String playerName;


    @Column(name = "playerMoney")
    private int playerMoney;

    @Column(name = "playerAnimals")
    private Animals playerAnimals;

    @Column(name = "playerScore")
    private int playerScore;

    public Player(String playerName, int playerMoney, Animals playerAnimals,int playerScore) {
        this.playerName = playerName;
        this.playerMoney = playerMoney;
        this.playerAnimals = playerAnimals;
        this.playerScore = playerScore;
    }

    public Player() {

    }

    @Override
    public String toString(){
        return "Player : " + "your name is " + this.getPlayerName() +
                 " you currently have £" + this.getPlayerMoney() + " and own a " + this.getPlayerAnimals();
    }


    public Animals getPlayerAnimals() {
        return playerAnimals;
    }

    public void setPlayerAnimals(Animals playerAnimals) {
        this.playerAnimals = playerAnimals;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getPlayerMoney() {
        return playerMoney;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void setPlayerMoney(int playerMoney) {
        this.playerMoney = playerMoney;
    }

}
