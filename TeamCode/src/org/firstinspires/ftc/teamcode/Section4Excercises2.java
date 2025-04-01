package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class Section4Excercises2 extends OpMode {
    @Override
    public void init() {

    }

    @Override
    public void loop() {
        double speedForward;
        if(gamepad1.a){
            speedForward = gamepad1.left_stick_y * 1.0;
        }else{
            speedForward = gamepad1.left_stick_y * 0.5;
        }

        telemetry.addData("Left stick y", gamepad1.left_stick_y);
        telemetry.addData("speed Forward", speedForward);
    }
}
