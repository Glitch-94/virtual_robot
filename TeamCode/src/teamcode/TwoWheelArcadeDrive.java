package teamcode;

import virtual_robot.annotations.Disabled;
import virtual_robot.annotations.TeleOp;
import virtual_robot.hardware.DcMotor;
import virtual_robot.controller.LinearOpMode;

/**
 * Example OpMode. Controls robot using left joystick, with arcade drive.
 */

//@Disabled
@TeleOp(name = "two wheel arcade drive", group = "TwoWheel")
public class TwoWheelArcadeDrive extends LinearOpMode {

    public void runOpMode(){
        DcMotor left = hardwareMap.dcMotor.get("left_motor");
        DcMotor right = hardwareMap.dcMotor.get("right_motor");
        left.setDirection(DcMotor.Direction.REVERSE);
        telemetry.addData("Press Start When Ready","");
        telemetry.update();
        waitForStart();
        while (opModeIsActive()){
            float fwd = -gamepad1.left_stick_y;
            float steer = gamepad1.left_stick_x;
            left.setPower(.5 * fwd + .2 * steer);
            right.setPower(0.5 * fwd - .2 * steer);
            }
        left.setPower(0);
        right.setPower(0);
    }
}
