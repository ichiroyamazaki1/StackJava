package com.mycompany.stac;


import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
public class Stac {

    public static void main(String[] args) {

        Stack<String> mlheroes = new Stack<>();
        LinkedList<String> heroesQueue = new LinkedList<>();
        
        Scanner x = new Scanner(System.in);
        System.out.println("Enter your favorite heroes in mobile legends. ");
        for (int i = 1; i < 5; i++) {
             System.out.print("hero " + i + ": ");

 
            String heroesName = x.nextLine();
            mlheroes.push(heroesName);
        }

        while (!mlheroes.isEmpty()) {
            String heroesName = mlheroes.pop();
            heroesQueue.add(heroesName);
        }

        System.out.println("New heroes is: ");
        System.out.println(heroesQueue);
    }

}
