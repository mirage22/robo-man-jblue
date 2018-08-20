package src.robot;

import com.robo4j.man.demo.LegoBrick;
import com.robo4j.man.demo.LeftMotor;
import com.robo4j.man.demo.RightMotor;
import com.robo4j.man.demo.TouchSensor;
import com.robo4j.man.demo.InfraRedSensor;
import com.robo4j.man.demo.RobotCenter;

/**
 * ManRobotMain represent the main entry point for the 
 * ManRobot program. It is necessary to implement the logic.
 *
 * @author Miroslav Wengner(@miragemiko)
 */ 
public final class ManRobotMain extends ManRobotLogic
{
    public static void main(String[] args){
        ManRobotMain robot = new ManRobotMain();
        robot.run();   
    }
    
    protected void logic(){
        brick.addDevice(new LeftMotor("B"));
        brick.addDevice(new RightMotor("C"));
        brick.addDevice(new TouchSensor("S1"));
        brick.addDevice(new InfraRedSensor("S2"));
    }
}
