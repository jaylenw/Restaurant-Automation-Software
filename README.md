# Restaurant-Automation-Software (cecs343_prj)
Software Engineering Course Project for our Software Engineering Class.

Archived 2023/11/26.

## Description

This project represents software that a restaurant may want to use as a tool to encourage more efficient operations. The software contains components for storing and updating menus, orders, and prices of food items. Managers and other employees can view the tables and see the status of them. Status’ include dirty, occupied, total number of visitors, and empty. Having the layout helps the staff to see the nature of the restaurant. The software also includes a special asynchronous chat like instance that allows staff to update each other on the status of tables in the restaurant. Screenshots of this software may be found in
the screenshots folder.

## Screenshots

![](https://raw.githubusercontent.com/jaylenw/Restaurant-Automation-Software/master/Screenshots/AddEmployee.JPG)
![](https://raw.githubusercontent.com/jaylenw/Restaurant-Automation-Software/master/Screenshots/EditEmployee.JPG)
![](https://raw.githubusercontent.com/jaylenw/Restaurant-Automation-Software/master/Screenshots/Login.JPG)
![](https://raw.githubusercontent.com/jaylenw/Restaurant-Automation-Software/master/Screenshots/ManagerWindow.JPG)
![](https://raw.githubusercontent.com/jaylenw/Restaurant-Automation-Software/master/Screenshots/RemoveEmployee.JPG)
![](https://raw.githubusercontent.com/jaylenw/Restaurant-Automation-Software/master/Screenshots/Waiter.JPG)
![](https://raw.githubusercontent.com/jaylenw/Restaurant-Automation-Software/master/Screenshots/login_chat.png)


## Description of Major Components:
1. Database (Apache Derby) & Java Integration w/ Menu/Orders/Employees - Michael Botsko
2. Table Layout (Swing) & Login System - Alejandro Lemus
3. Restaurant Status Chat (Spark) & Java Integration w/ Login System - Jaylen Wimbish

The component of the software allows the manager and other employees to communicate with each other on the status of tables. Every user that logs in will have their own session to the chat instance where they can notify everyone asynchronously for example if a certain table is occupied or not. 

## Demo-ing:

The files included in the release page contains two netbeans projects. Both projects need to be imported into Netbeans and built for them to execute. These files are in a .zip package. Software requires at least Java 1.8 (need JRE and JDK installed). You also need the latest Java FX SDK installed as well.

The execution of the files depends on the importation of the project .zip packages in the release page. Once each project is imported, you must build with dependencies before running. Run the FinalSparkChat project first to initiate the local server for the chat session. Next, confirm that the project has included JavaDB to the list of libraries, if not, add it. Proceed to the Services tab on the left hand window, right clicking JavaDB and clicking “Start Server”. Right click JavaDB once more and select “create database”. When prompted, add a database of RestaurantEmployees with username of “access” and password of “granted”. Then navigate to the Restaurant Automation project and go to the source file called “login.java”. Right click on that file and the project will initiate prompting the user to login to view the table layout and other components.

Login usernames:

Manager Window
	
	Username: Sen
	Password: Wang
	
Waiter Window
	
	Username: Michael
	Password: Botsko

	Username: Alejandro
	Password: Lemus

	Username Jaylen
	Password: Wimbish

#### Team Members

Alejandro Lemus, Michael Botsko, Jaylen Wimbish.
