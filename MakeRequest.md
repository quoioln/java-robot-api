# Introduction #

You can request to ArNetworking Server using [Command](GetCommand.md).

# Details #

When you request to server, you must know that how to use a command. You can get usage information using Command.toString().

For example, usage information about **_update_** command is like this.

```
[281] update
	Group Name            : RobotInfo
	Description           : gets an update about the important robot status (you should request this at an interval)... for bandwidth savings this is deprecated in favor of updateNumbers and updateStrings
	Data Flag             : RETURN_SINGLE
	Argument Description  : none
	Return Description    : string: status; string: mode; byte2: 10 * battery; byte4: x; byte4: y; byte2: th; byte2: transVel; byte2: rotVel, byte2: latVel, byte: temperature (deg c, -128 means unknown)
```

The **_update_** command is:
  * There is no arguments.
  * This command has only one response. (RETURN\_SINGLE)
  * You can get return value from [DataPacket](ReceiveData.md):
    * First string is robot's current status.
    * Second string is robot's current mode.
    * and so on...

Okey, now, Make a request!

```
boolean result = client.request(281);
if (!result) {
	client.disconnect();
	System.err.println("request failed");
}
```

[You can receive a response using DataPacketHandler](ReceiveData.md)

Another example, let's request **_gotoGoal_** command.

```
[342] gotoGoal
	Group Name            : Navigation
	Description           : sends the robot to the goal
	Data Flag             : RETURN_NONE
	Argument Description  : string: goal
	Return Description    : none
```

This command require one argument that type is string, and there is no response.

```
Command command = client.getCommand("gotoGoal");

// You can make arguments using ParameterBuilder
// and call ParameterBuilder.toParameter(). 
// This makes Parameter instance that is command's arguments.

ParameterBuilder builder = new ParameterBuilder();
builder.appendString("Dock");
Parameter param = builder.toParameter();

boolean result = client.request(command, param);
if (!result) {
	client.disconnect();
	System.err.println("request failed");
}
```