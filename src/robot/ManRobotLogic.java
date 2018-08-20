package src.robot;

import com.robo4j.hw.lego.util.EscapeButtonUtil;
import com.robo4j.RoboContext;
import com.robo4j.RoboReference;
import com.robo4j.man.demo.RobotCenter;
import com.robo4j.man.demo.LegoBrick;

/**
 * ManRobotLogic is the helper abstact class which contains 
 * basic logic necessary to run RoboMan project on the LEGO
 * EV3 Brick. 
 * The class contains ManRobot life cycle (prepare, logic, initiate, shutdown)
 *
 * @author Miroslav Wengner (@miragemiko)

 */
public abstract class ManRobotLogic
{
    protected LegoBrick brick;
    
    private  void prepare(){
        brick = new LegoBrick();
    }
    
    protected abstract void logic();
    
    protected void run(){
        prepare();
        logic();
        RoboContext system = initiate();
        shutdown(system);
    }
    
    protected RoboContext initiate(){
        if(brick == null){
            throw new IllegalStateException("not initiated");
        }
        RoboContext system = RobotCenter.createRobot(brick);
        system.start();

        RoboReference<String> lcd = system.getReference(RobotCenter.UNIT_NAME_LCD);
        lcd.sendMessage("clear");

        RoboReference<String> infraSensor = system.getReference(RobotCenter.UNIT_INFRA_SENSOR);
        infraSensor.sendMessage("start");

        RoboReference<String> touchUnit = system.getReference("touchUnit");
        touchUnit.sendMessage("START TOUCH");
        
        return system;
    }
    
    
    protected void shutdown(RoboContext system) {
        EscapeButtonUtil.waitForPressAndRelease();
        system.shutdown();
    }
}
