package org.firstinspires.ftc.teamcode;

// Importing all of the packages

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.TouchSensor;
import com.qualcomm.robotcore.util.ElapsedTime;

public class DMHardwareTest {

    // Instantiating the hardware classes
    public DcMotor myTestMotor;

    public boolean runThisWithEncoders;

    public HardwareMap hwMap;
    public ElapsedTime timer = new ElapsedTime();

    // Methods...

    public DMHardwareTest(boolean runThisWithEncoders) {
        this.runThisWithEncoders = runThisWithEncoders;
    }

    public void initTeleOpIMU(HardwareMap hwMap) {
        this.hwMap = hwMap;

        timer.reset();
        myTestMotor = hwMap.dcMotor.get("testmotor");
        myTestMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    }

    // Method to set the power of all of the motors...

    public void setPowerOfAllMotorsTo(double speed) {
        //We only have two motors...
        myTestMotor.setPower(speed);
    }

    // Method to get current time...
    public double getTime() {
        return timer.time();
    }

}
