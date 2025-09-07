package com.company;

import java.util.Random;
import java.util.Scanner;

class Game{
    public int number;
    public int noOfGuesses;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    void Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }

    void takeUserInput(){
        Scanner sc = new Scanner(System.in);
       int inputNumber = sc.nextInt();
    }


}
public class CWH_50_Ex3sol {
    public static void main(String[] args) {
    Game game = new Game();
    game.setNoOfGuesses(12);
    System.out.println(game.getNoOfGuesses());

    }
}
