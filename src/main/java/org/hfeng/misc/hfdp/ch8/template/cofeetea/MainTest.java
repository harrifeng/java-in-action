package org.hfeng.misc.hfdp.ch8.template.cofeetea;

public class MainTest {
    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();

        System.out.println("--------Tea---------------------");
        tea.prepareRecipe();
        System.out.println("--------Coffee------------------");
        coffee.prepareRecipe();
    }
}

////////////////////////////////////////////////////
// <===================OUTPUT===================> //
// --------Tea---------------------               //
// Boiling water                                  //
// Steeping the tea                               //
// Pouring into cup                               //
// Adding Lemon                                   //
// --------Coffee------------------               //
// Boiling water                                  //
// Dripping Coffee through filter                 //
// Pouring into cup                               //
// Adding Sugar and Milk                          //
////////////////////////////////////////////////////
