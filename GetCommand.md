# Introduction #

You can request to server using a Command.

# Details #

What commands the server provides? You can get server commands using getAllCommands().

```
Command[] commands = client.getAllCommands();
```

You can see a command information using Command.toString(). See a example.

```
package semix2.example.robot;

import semix2.robot.Command;
import semix2.robot.RobotClient;
import semix2.robot.RobotClientFactory;

public class TestGetCommand {

	public static void main(String[] args) {
		RobotClient client = RobotClientFactory.newRobotClient();
		client.connect();
		
		Command[] commands = client.getAllCommands();
		for (Command command : commands) {
			System.out.println(command);
		}
		
		client.disconnect();
	}
}
```

Then, you can see like this.

```
[275] sonarCurrent
	Group Name            : SensorInfo
	Description           : 
	Data Flag             : RETURN_SINGLE
	Argument Description  : none
	Return Description    : See getDrawingList for the information on how this drawing should be drawn, and the documentation in ArDrawingData for that information means.

[274] sim_lms2xx_1Cumulative
	Group Name            : SensorInfo
	Description           : 
	Data Flag             : RETURN_SINGLE
	Argument Description  : none
	Return Description    : See getDrawingList for the information on how this drawing should be drawn, and the documentation in ArDrawingData for that information means.

...
```

If you know a command name or id, you can get a command using getCommand().

```
Command command = client.getCommand("sonarCurrent");
// Command command = client.getCommand(275);
```