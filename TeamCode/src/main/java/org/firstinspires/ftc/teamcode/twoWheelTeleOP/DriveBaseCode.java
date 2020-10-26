package org.firstinspires.ftc.teamcode.twoWheelTeleOP;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.DMHardware;


@TeleOp(name = "driveBase", group = "DreamMachines")
public class DriveBaseCode extends LinearOpMode {

    public DMHardware robot = new DMHardware(false);

    @Override
    public void runOpMode() {
        robot.initTeleOpIMU(hardwareMap);

        waitForStart();

        while (opModeIsActive()) {

            //Arcade style controls...
            robot.rightMotor.setPower(gamepad1.left_stick_x + gamepad1.left_stick_y);
            robot.leftMotor.setPower(gamepad1.left_stick_x - gamepad1.left_stick_y);

            if (gamepad1.right_bumper) {
                robot.claw.setPosition(0.8);
            }
            if (gamepad1.left_bumper) {
                robot.claw.setPosition(0.2);
            }
            if (gamepad1.y) {
                robot.armMotor.setPower(0.25);
            }
            else if (gamepad1.a) {
                robot.armMotor.setPower(-0.25);
            }
            else if (robot.armLimiter.isPressed()){
                robot.armMotor.setPower(0);
            }
            else {
                robot.armMotor.setPower(0);
            }

        }
    }
}
