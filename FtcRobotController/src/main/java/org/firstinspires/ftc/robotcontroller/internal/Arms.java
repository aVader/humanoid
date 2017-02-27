package org.firstinspires.ftc.robotcontroller.internal;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;


@TeleOp(name="Arms", group="Ahuman")
public class Arms extends OpMode {
    //DcMotors Variables
    private DcMotor Lshould;
    private DcMotor Rshould;
    private Servo lShoul;
    private Servo Rshoul;
    private Servo lRotateAl;
    private Servo rRotateAl;
    private Servo lRotateF;
    private Servo rRotateF;

    @Override
    public void init() {
        //dcMotors setting
        Lshould = hardwareMap.dcMotor.get("Lshould");
        Rshould = hardwareMap.dcMotor.get("Rshould");

        Lshould.setDirection(DcMotorSimple.Direction.FORWARD);
        Rshould.setDirection(DcMotorSimple.Direction.REVERSE);

        Lshould.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        Rshould.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);


        Lshould.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        Rshould.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        telemetry.addData("Init", "Init Completed");

        //Servo Setting
        lShoul.scaleRange(0,1);
        Rshoul.scaleRange(0,1);
        rRotateAl.scaleRange(0,1);
        lRotateAl.scaleRange(0,1);
        lRotateF.scaleRange(0,1);
        rRotateF.scaleRange(0,1);

    }
    @Override
    public void start() {

    }

    @Override
    public void loop () {



        telemetry.addData("Loop", "Running" );
    }

}