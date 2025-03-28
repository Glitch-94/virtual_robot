package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class MathOpModeExcercises extends OpMode {
    @Override
    public void init() {

    }

    @Override
    public void loop() {
        double joystickDifference = gamepad1.left_stick_y - gamepad1.right_stick_y;
        double  triggerSum = gamepad1.left_trigger + gamepad1.right_trigger;
        telemetry.addData("Left stick y", gamepad1.right_stick_y);
        telemetry.addData("Joystick Difference", joystickDifference);
        telemetry.addData("Trigger Sum", triggerSum);

    }
}
