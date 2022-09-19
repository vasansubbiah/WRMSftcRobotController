package org.firstinspires.ftc.teamcode.twoWheelAutos;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.DMHardwareTest;

@Autonomous(name = "firsttest", group = "awrlGelafv")
public class firstTest extends LinearOpMode {

    public DMHardwareTest robot = new DMHardwareTest(false);

    @Override
    public void runOpMode() {
        robot.initTeleOpIMU(hardwareMap);
        robot.timer.reset();
        robot.setPowerOfAllMotorsTo(0.3);
        while (robot.getTime() <= 5) {
        }
        robot.setPowerOfAllMotorsTo(0);
        robot.timer.reset();
        while (robot.getTime() <= 1) {
        }
        robot.timer.reset();
        robot.setPowerOfAllMotorsTo(0.3);
        while (robot.getTime() <= 5) {
        }
        robot.setPowerOfAllMotorsTo(0);
    }
}
