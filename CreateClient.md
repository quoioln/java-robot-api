# Introduction #

You can connect ArNetworking Server(ex. arnlServer) with a RobotClient instance.

# Details #

Firstly, create a RobotClient instance.

```
RobotClient client = RobotClientFactory.newRobotClient();
```

You can set a lot of server properties.
  * If server require user & password information, you can set these information using setUser(), setPassword().
  * If server address is not localhost:7272, you can set server address using setHost(), setPort(). (default values are localhost, 7272)

```
client.setUser("semix2");
client.setPassword("1234");
client.setHost("192.16.1.11");
client.setPort(7272);
```

Okey, now, you can connect to server using connect().

```
client.connect();
```

You can disconnect from server using disconnect().

```
client.disconnect();
```