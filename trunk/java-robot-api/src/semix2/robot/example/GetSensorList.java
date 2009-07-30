package semix2.robot.example;

import semix2.robot.Command;
import semix2.robot.DataPacket;
import semix2.robot.DataPacketHandler;
import semix2.robot.DataPacketIterator;
import semix2.robot.RobotClient;
import semix2.robot.RobotClientFactory;

public class GetSensorList {

	public static void main(String[] args) {
		RobotClient client = RobotClientFactory.newRobotClient();
		if (!client.connect()) {
			System.out.println("connection failed.");
			return;
		}

		Command getSensorListCommand = client.getCommand("getSensorList");
		if (getSensorListCommand == null) {
			System.out.println("Command not found");
			client.disconnect();
			return;
		}
		
		System.out.println(getSensorListCommand);
		
		client.addDataPacketHandler(getSensorListCommand, new DataPacketHandler() {
			public void handleDataPacket(DataPacket packet) {
				DataPacketIterator iter = packet.getDataPacketIterator();
				int numSensors = iter.nextByte2();
				System.out.println("Sensor List:");
				for (int i=0; i<numSensors; i++) {
					String sensorName = iter.nextString();
					System.out.println("\t" + sensorName);
				}
			}
		});
		
		client.request(getSensorListCommand);
		try {
			Thread.sleep(50);
		} catch(InterruptedException ignore) {}
		client.disconnect();
	}
}
