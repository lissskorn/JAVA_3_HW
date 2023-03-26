/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hw3;

import java.util.Scanner;
/**
 *
 * @author olesiyakorgueva
 */
public class HW3 {

    public static void main(String[] args) {
        System.out.println("Вариант 4; РИБО-04-21; Коргуева Олеся");
        
        Scanner myObj = new Scanner(System.in);
        
        System.out.println("Enter sort of flower: ");
        String sort = myObj.nextLine();
        
        System.out.println("Enter name of flower: ");
        String flowerName = myObj.nextLine();
        
        System.out.println("Enter quantity of flowers: ");
        int quantity = Integer.parseInt(myObj.nextLine());
        
        Plant plant = new Plant(sort, flowerName, quantity);
        System.out.println(plant.toString());
        
        Gardener gardener = new Gardener("Ivan", "Ivanov");
        gardener.filter(plant);
        System.out.println(plant.toString());
    }
}
