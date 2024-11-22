/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singletonpatterndemo;

/**
 *
 * @author Adithya Anand
 */
public class SingleObject {
    private static SingleObject instance = new SingleObject();
    
    public SingleObject(){}
    
    public static SingleObject getInstance(){
        return instance;
    }
    
    public String showMessage(){
        System.out.println("Hello World");
        String str = "Adithya Anand";
        return str;
        
    }
}
