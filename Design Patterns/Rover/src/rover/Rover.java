/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rover;

/**
 *
 * @author Adithya Anand
 */
public class Rover {

    /**
     * @param args the command line arguments
     */
    protected State curentState = new AtRest();
    
    Rover (){}
    
    protected void pressRightPedal(int numOfTimesPressed){
        Boolean move;
        switch(this.curentState.name){
            case "At Rest":
                move = this.curentState.pressRightPedal(numOfTimesPressed);
                if(move){
                    this.curentState = new MoveForward();
                }
                break;
            case "Move Forward":
                move = this.curentState.pressRightPedal(numOfTimesPressed);
                if(move){
                    this.curentState= new AtRest();
                }
                break;
            default:
                System.out.println("Error, Can press only Right pedal  when in At Rest  or inside Move Forward States. \n Unable to Moves");
                break;
                
                
        }
    }
    
    protected void pressRightPedalForTime(int numOfSecondsPressed){
        if(this.curentState.name== "Move Backward" || this.curentState.name == "At Rest"){
            System.out.println("Can only press Right Pedal when  inside Move Forward State. \n Unable to Move...");
            return;
        }
        this.curentState.pressRightPedalForTime(numOfSecondsPressed);
    }
    
    protected void pressLeftPedal(int numOfTimesPressed){
        if(this.curentState.name== "Move Forward" || this.curentState.name == "At Rest"){
            System.out.println("Can only press Left Pedal when  inside Move Backward State. \n Unable to Move...");
            return;
        }
        
        Boolean move = this.curentState.pressLeftPedal(numOfTimesPressed);
        if(move){
            this.curentState = new AtRest();
        }
    }
    
    
    protected void pressLeftPedalForTime(int numOfSecondsPressed){
        
        switch(this.curentState.name){
            case "At Rest":
                Boolean move = this.curentState.pressLeftPedalForTime(numOfSecondsPressed);
                if(move){
                    this.curentState = new MoveBackward();
                }
                break;
            case "Move Backward":
                this.curentState.voidPressLeftPedalForTime(numOfSecondsPressed);
                break;
            default:
                System.out.println("Can only press Left Pedal  for TIme  when in the At Rest  or inside  Move Backward  States. \n Unable to Move");
                break;
        }
        
    }
    
    protected void printStateAndSubState(){
        System.out.println("Current State: "+ this.curentState.name);
        System.out.println("Current SubState: "+ this.curentState.subState);
    }
    
    
    
    
    
    
    public static void main(String[] args) {
        
        Rover rover = new Rover();
        
        rover.pressRightPedal(1);
        rover.printStateAndSubState();
        rover.pressRightPedalForTime(5);
        rover.printStateAndSubState();
        rover.pressRightPedalForTime(3);
        rover.printStateAndSubState();
        rover.pressRightPedal(2);
        rover.printStateAndSubState();
        rover.pressRightPedal(3);
        rover.printStateAndSubState();
        rover.pressRightPedal(2);
        rover.printStateAndSubState();
        
        
        
        rover.pressRightPedal(3);
        rover.printStateAndSubState();
        
        
        rover.pressLeftPedalForTime(5);
        rover.printStateAndSubState();
        rover.pressLeftPedalForTime(3);
        rover.printStateAndSubState();
        rover.pressLeftPedal(1);
        rover.printStateAndSubState();
        rover.pressLeftPedal(2);
        rover.printStateAndSubState();
        rover.pressLeftPedal(3);
        rover.printStateAndSubState();
//        rover.pressLeftPedal(4);
//        rover.printStateAndSubState();
        
        // TODO code application logic here
    }
    
}
