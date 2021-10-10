package com.startjava.lesson4.guessnumber;

import java.util.Scanner;
import java.util.ArrayList;

class Player {
    private String name;
    private int number;

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Player(String name) {
        this.name = name;
        this.number = -1;
    }
}

class GuessNumber {
    private boolean guess = false;  // выигрышь
    private int p1x;  // введенное число первым игроком
    private int p2x;  // введенное число вторым игроком
    private String winner = "";  // победитель
    private String cycleGame = "yes";  // играем еще раз
    private Player player1;  // игрок 1
    private Player player2;  // игрок 2
    private int x;  // загаданное число
    private ArrayList<Integer> p1 = new ArrayList<>();
    private ArrayList<Integer> p2 = new ArrayList<>();
    private int p1attempt = p1.size();  // количество попыток первого игрока
    private int p2attempt = p2.size();  // количество попыток второго игрока

    public void setGuess(boolean guess) {
        this.guess = guess;
    }

    public void setP1x(int p1x) {
        this.p1x = p1x;
    }

    public void setP2x(int p2x) {
        this.p2x = p2x;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public void setCycleGame(String continueGame) {
        this.cycleGame = continueGame;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setP1attempt(int p1attempt) {
        this.p1attempt = p1attempt;
    }

    public void setP2attempt(int p2attempt) {
        this.p2attempt = p2attempt;
    }

    public boolean isGuess() {
        return guess;
    }

    public int getP1x() {
        return p1x;
    }

    public int getP2x() {
        return p2x;
    }

    public String getWinner() {
        return winner;
    }

    public String getCycleGame() {
        return cycleGame;
    }

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public int getX() {
        return x;
    }

    public int getP1attempt() {
        return p1attempt;
    }

    public int getP2attempt() {
        return p2attempt;
    }

    public void startGame() {
        System.out.println("Начинаем новую игру. У каждого игрока по 10 попыток.");
    }

    public void createPlayers() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите имя первого игрока: ");
        String p1 = sc.next();
        player1 = new Player(p1);
        System.out.print("Введите имя второго игрока: ");
        String p2 = sc.next();
        player2 = new Player(p2);
    }

    public void game() {
        while (!isGuess() || (getP1attempt() != 10 && getP2attempt() != 10)) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Игрок " + player1.getName() + ", введите число: ");
            setP1x(sc.nextInt());
            p1.add(getP1x());
            setP1attempt(p1.size());
            if (getP1x() == getX()) {
                setGuess(true);
                setWinner(player1.getName());
                break;
            } else {
                if (getP1x() > getX()) {
                    System.out.println("Данное число больше того, что загадал компьютер");
                } else {
                    System.out.println("Данное число меньше того, что загадал компьютер");
                }
            }
            if(getP1attempt() == 10) {
                System.out.println("У игрока " + player1.getName() + " закончились попытки.");
            }
            System.out.print("Игрок " + player2.getName() + ", введите число: ");
            setP2x(sc.nextInt());
            p2.add(getP2x());
            setP2attempt(p2.size());
            if (getP2x() == getX()) {
                setGuess(true);
                setWinner(player2.getName());
                break;
            } else {
                if (getP2x() > getX()) {
                    System.out.println("Данное число больше того, что загадал компьютер");
                } else {
                    System.out.println("Данное число меньше того, что загадал компьютер");
                }
            }
            if(getP2attempt() == 10) {
                System.out.println("У игрока " + player2.getName() + " закончились попытки.");
                break;
            }
        }
        if(getWinner().equals(player1.getName())) {
            System.out.println("Игрок " + getWinner() + " угадал число с " + getP1attempt() + " попытки.");
        }
        else if(getWinner().equals(player2.getName())) {
            System.out.println("Игрок " + getWinner() + " угадал число с " + getP2attempt() + " попытки.");
        }
        else {
            System.out.println("Никто не угадал число.");
        }
        System.out.println("Было загадано число " + getX() + ".");
        System.out.println("Попытки игрока " + player1.getName() + ": " + p1.toString().replaceAll("\\[|\\]|\\,", ""));
        System.out.println("Попытки игрока " + player2.getName() + ": " + p2.toString().replaceAll("\\[|\\]|\\,", ""));
    }

    public void continueGame() {
        setGuess(false);
        setWinner("");
        p1 = new ArrayList<>();
        p2 = new ArrayList<>();
        game();
    }

    public void endGame() {
        System.out.println("Славно поиграли, пока.");
    }
}

class GuessNumberTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GuessNumber guessNumber = new GuessNumber();
        guessNumber.startGame();
        guessNumber.setX((int) (Math.random() * 100 + 1));
        System.out.println(guessNumber.getX());
        guessNumber.createPlayers();
        guessNumber.game();
        while (!guessNumber.getCycleGame().equals("no")) {
            System.out.print("Хотите продолжить игру? [yes/no]: ");
            String s = sc.next();
            if (s.equals("no")) {
                guessNumber.setCycleGame(s);
            } else if (s.equals("yes")) {
                guessNumber.setX((int) (Math.random() * 100 + 1));
                System.out.println(guessNumber.getX());
                guessNumber.continueGame();
            }
        }
        guessNumber.endGame();
    }
}


