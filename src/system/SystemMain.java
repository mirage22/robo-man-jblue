package src.system;

import com.robo4j.tools.center.CenterMain;
/**
 * Write a description of class SystemMain here.
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
