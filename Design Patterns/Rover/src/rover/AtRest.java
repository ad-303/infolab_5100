/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rover;

/**
 *
 * @author Adithya Anand
 */
public class AtRest extends State{
    AtRest(){
        this.name = "At Rest";
        this.subState = "None";
    }
    
    
    public Boolean pressRightPedal(int numOfTimesPressed){
        if(numOfTimesPressed !=1){
            System.out.println("Error, can only be press Right Pedal once  when at Rest State. \n Unable to move");
            return false;
        }
        else{
            System.out.println("Transitioning from Rest State to Move Forward State");
            return true;
        }
    }
    
    protected Boolean pressLeftPedalForTime(int numOfSecondsPressed){
        if(numOfSecondsPressed !=5){
            System.out.println("Error, must press Right pedal  for 5 seconds  when at Rest State. \n Unable to move... ");
            return false;
        }
        else{
            System.out.println("Transitioning from Rest State to Move Backward State");
            return true;
        }
    }
    
}
