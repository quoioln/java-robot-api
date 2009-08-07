package semix2.robot.example;

import semix2.robot.Command;
import semix2.robot.RobotClient;
import semix2.robot.RobotClientFactory;

public class PrintAllCommands {

	public static void main(String[] args) {
		RobotClient client = RobotClientFactory.newRobotClient();
		if (!client.connect()) {
			System.out.println("connection failed.");
			return;
		}
		printCommands(client);
		client.disconnect();
	}
	
	private static void printCommands(RobotClient client) {
		System.out.println(String.format("%5s | %30s | %35s | %s", "ID", "GroupName", "CommandName", "Description"));
		System.out.println("-------------------------------------------------------------------------------------------------------------------------");
		for (Command command : client.getAllCommands()) {
			System.out.println(String.format("%5d | %30s | %35s | %s", command.getId(), command.getGroupName(), command.getName(), command.getDescription().replace("\n", " ")));
		}
	}
}
