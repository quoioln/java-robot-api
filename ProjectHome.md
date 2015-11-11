# Introduction #

MobileRobots' Advanced Robot Interface for Applications (ARIA) is a C++ library(software development toolkit or SDK) for all MobileRobots/ActivMedia platforms. (see http://robots.mobilerobots.com/wiki/ARIA)

ARIA supports Java, but it is NOT pure Java. It uses JNI technology and not perfectly supports ARIA interfaces.

**This project defines Java Interface for ArNetworking and implements client library.**

# How to Use? #

You can see many examples in semix2.robot.example package.
  * [Create a client for ArNetworking](CreateClient.md)
  * [How can I get server commands?](GetCommand.md)
  * [How to make a request?](MakeRequest.md)
  * [How can I get server datas?](ReceiveData.md)

# About me #

Hi, there. My name is Byulsaim Kwak and I'm Korean. (Sorry for my english)
  * Blog: http://semix2.textcube.com (Korean)

# Project Status #

  * ver 1.0.2 released
    * Implementation package is moved to semix2.impl.robot
  * ver 1.0.1 released
    * Log message (UDP connection to server confirmed) level is changed from WARNING to INFO
  * ver 1.0 released