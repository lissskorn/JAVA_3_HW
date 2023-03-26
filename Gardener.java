/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hw3;

/**
 *
 * @author olesiyakorgueva
 */
public class Gardener {
    private String firstName;
    private String lastName;
    
    public Gardener(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public void filter(Plant plant) {
        String fName = plant.getFlowerName();
        fName = fName.replaceAll("[AEIOUaeiou]", "");
        fName = fName + " - VGTBL";
        plant.setFlowerName(fName);   
    }
}
