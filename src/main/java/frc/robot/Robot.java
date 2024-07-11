// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import com.revrobotics.CANSparkMax; // MotorController
import com.revrobotics.CANSparkLowLevel.MotorType; //Type of motor (switch between brush/brushless)
import edu.wpi.first.wpilibj.PS4Controller; //Controller I am using (could be Xbox or PS)
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.xrp.XRPMotor; //XRPMotor
/**
 * The VM is configured to automatically run this class, and to call the functions corresponding to
 * each mode, as described in the TimedRobot documentation. If you change the name of this class or
 * the package after creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {
private final CANSparkMax m_leftMotor = new CANSparkMax(7, MotorType.kBrushless);
private final CANSparkMax m_rightMotor = new CANSparkMax(3, MotorType.kBrushed);
// (m_) - basically means "mine"; its the name I give to the component
private final XboxController m_NormalController = new XboxController(0); 
private final PS4Controller m_SusController = new PS4Controller(1);
private final XboxController m_ShooterController = new XboxController(2);

/*
  "MotorType." - gets from import


*/


  @Override
  public void robotInit() {}

  @Override
  public void robotPeriodic() {}

  @Override
  public void autonomousInit() {}

  @Override
  public void autonomousPeriodic() {}

  @Override
  public void teleopInit() {

  }

  @Override
  public void teleopPeriodic() {
    if (m_NormalController.getAButton()) //"get" means its grabbing something from controller
    {
      m_leftMotor.set(.15);
    }
    else if (m_NormalController.getBButton())
    {
      m_leftMotor.set(-.15); 
    }
    else
    {
      m_leftMotor.set(0);
    }

    if (m_NormalController.getXButton())
    {
      m_rightMotor.set(.35);
    }
    else if (m_NormalController.getYButton())
    {
      m_rightMotor.set(-.35); 
    }
    else
    {
      m_rightMotor.set(0);
    }
  }


  @Override
  public void disabledInit() {}

  @Override
  public void disabledPeriodic() {}

  @Override
  public void testInit() {}

  @Override
  public void testPeriodic() {}

  @Override
  public void simulationInit() {}

  @Override
  public void simulationPeriodic() {}
}
