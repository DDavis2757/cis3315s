/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

/**
 *
 * @author Dillon Davis
 */
  public class C11PetDog extends C11Pet  {
    @Override
    public String speak(){
        return "Ruff";
    }
    public String toString(){
        return "My name is " + getPetName() + " I am a dog";
    }
}
