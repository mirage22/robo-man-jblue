package src.system;

import com.robo4j.tools.center.CenterMain;
/**
 * SystemMain is the util class used for compiling and uploading 
 * final RoboMan solution to the LEGO EV3 Brick. 
 * The LEGO EV3 Brick need to be connect to the system by using 
 * Bluetooth, W-LAN or USB connector. 
 * The final result (RoboMan.jar) will be stored in the project
 * root
 * 
 * SystemMain class can be directly executed from the BlueJ IDE
 *
 * @author Miroslav Wengner(@miragemiko)
 */
public class SystemMain
{
    public static void main(String[] args) throws Exception {
        System.out.println("System Start");
        CenterMain.main(new String[]{"robo4jCenter.xml"});
    }
}
