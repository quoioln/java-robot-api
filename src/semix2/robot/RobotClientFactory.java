package semix2.robot;

import semix2.impl.robot.RobotClientImpl;

public class RobotClientFactory {
	
	private RobotClientFactory() {
		//
	}
	
	public static final RobotClient newRobotClient() {
		return new RobotClientImpl();
	}
}
