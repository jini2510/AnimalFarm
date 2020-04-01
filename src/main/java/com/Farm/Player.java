package com.Farm;

public class Player {

    private String playerName;
    private int playerMoney;
    private Animals playerAnimals;
    private StringFormatter stringFormatter;


    public Player(String playerName, int playerMoney, Animals playerAnimals) {
        this.playerName = playerName;
        this.playerMoney = playerMoney;
        this.playerAnimals = playerAnimals;
        this.stringFormatter =  () -> "Player: " + this.getPlayerName() + this.getPlayerMoney() + this.getPlayerAnimals();
    }

    public Player() {

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

    public void setStringFormatter(final StringFormatter stringFormatter){
        this.stringFormatter = stringFormatter;
    }
}
