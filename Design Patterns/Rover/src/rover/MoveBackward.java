/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rover;

/**
 *
 * @author Adithya Anand
 */
public class MoveBackward extends State{
    
    MoveBackward(){
        this.name = "Move Backward";
        this.subState = "Accelerate";
    }
    
    protected Boolean pressLeftPedal(int numOfTimesPressed){
        Boolean move = false;
        switch(numOfTimesPressed){
            case 1:
                if(this.subState != "Decelerate" && this.subState != "Constant Speed"){
                    System.out.println("Error, can only press Left Pedal once when in Constant Speed or Decelerate States.\n Unable to Move...");
                } else if(this.subState == "Decelerate"){
                    System.out.println("Transitioning from Decelerate State to Constant Speed State...");
                    this.subState = "Constant Speed";
                } else{
                    System.out.println("Transitioning from Constant Speed State to Decelerate State...");
                    this.subState = "Decelerate";
                }
                break;
            case 2:
                if(this.subState != "Decelerate" && this.subState != "Accelerate"){
                    
                    System.out.println("Error, Can only press Left Pedal twice when in Accelerate or Decelerate States.\\n Unable to Move");
                } else if(this.subState == "Decelerate"){
                    System.out.println("Transitioning from Decelerate State to Accelerate...");
                    this.subState = "Accelerate";
                } else{
                    System.out.println("Transition from Accelerate State to Deceleration");
                    this.subState = null;
                    move = true;
                }
                break;
            case 3:
                if(this.subState != "Decelerate"){
                    System.out.println("Error, can only press Left Pedal thrice when in  Decelerate State.\n Unable to Move");
                } else {
                    System.out.println("Transitioning from Decelerate State to  Rest State ");
                    this.subState=null;
                    move = true;
                }
                break;
            default:
                System.out.println("Error, must press Left Pedal for 3 seconds when it accelerates and ");
                break;
            
        }
        
        return move;
    }
    
    
    
    protected void voidPressLeftPedalForTime(int numOfSecondsPressed){
        
        if(numOfSecondsPressed !=3){
            System.out.println("Error, can only be pressed Left Pedal for 3 seconds  where is Accelerate  or Constant Speed States to move. \n Unable to move");
            return;
            
        }
        if(this.subState != "Accelerate" && this.subState != "Constant Speed"){
            System.out.println("Error, Can only press Left Pedal for 3 secongs  when in Accelerator or on Constant Speed");
            return;
        }
        if(this.subState== "Accelerate")
        {
            System.out.println("Transitioning from Accelerate State to Constant Speed State");
            this.subState = "Constant Speed";
            return;
        }
        System.out.println("Transitioning from Constant Speed State to Accelerate State...");
        this.subState="Accelerate";
    }
    
}
