package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@Autonomous
public class HelloWorld extends OpMode {
    /**
     * This is called when the driver presses INIT
     */
    @Override
    public void init(){
        // this sends to the driver station
        telemetry.addData("Hello","Harrison");
    }

    /**
     * This is called repeatedly while OpMode is playing
     */
    @Override
    public void loop(){
        // intentionally left blank
    }
}
