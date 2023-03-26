/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hw3;

/**
 *
 * @author olesiyakorgueva
 */   
public class Plant {
    
    private String sort;
    private String flowerName;
    private int quantity;
    
    public Plant(String sort, String flowerName, int quantity) {
        this.sort = sort;
        this.flowerName = flowerName;
        this.quantity = quantity;
    }
    
    public String getSort() {
        return sort;
    }
    
    public void setSort(String sort) {
        this.sort = sort;
    }
    
    public String getFlowerName() {
        return flowerName;
    }
    
    public void setFlowerName(String flowerName) {
        this.flowerName = flowerName;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public void description() {
        System.out.println("Hello! This flower is unusual!");
    }
    
     
     public String toString() {
         return "sort = " + sort + ", flower name = " + flowerName + ", quantity =  " + quantity; 
        }
}


