# Document Similarity Project
4th year Semester 1 Advanced Object Orientated Project
The following are instructions to complete the project for the module Advanced Object Oriented Programming for 2017

## Overview
<p>You are required to develop a Java web application that enables two or more text documents to
be compared for similarity. An overview of the system is given below:
 <br><br>
<img src="https://github.com/gtonra89/DocumentSimilarityProject/blob/master/34524665-39cc66f2-f094-11e7-9bdb-e405f29ece83.PNG" align="middle"/>
</p>

## Minimum Requirements 
<b>1</b>. A document or URL should be specified or selected from a web browser and then
dispatched to a servlet instance running under Apache Tomcat.<br>
<b>2</b>. Each submitted document should be parsed into its set of constituent shingles and
then compared against the existing document(s) in an object-oriented database (db4O)
and then stored in the database.<br>
<b>3</b>. The similarity of the submitted document to the set of documents stored in the
database should be returned and presented to the session user.
You are also required to provide a UML diagram of your design and to JavaDoc your code.
Note that the whole point of this assignment is for you to demonstrate an understanding of the
principles of object-oriented design by using abstraction, encapsulation, composition,
inheritance and polymorphism WELL throughout the application. You should carefully
consider how design patterns can be applied throughout your design. For example, patterns
such as façade, chain of responsibility, command and proxy have obvious applications as
mechanisms for handling incoming HTTP requests. Please pay particular attention to how your 
CP4SD – Advanced Object Oriented Design Principles & Patterns
Department of Computer Science & Applied Physics, GMIT
application must be packaged and submitted. Marks will be deducted if you deviate from the
requirements. Finally, as 4th year software students, you should appreciate that, if your code
does not compile you cannot pass the assignment

## Deployment and Delivery
The project must be submitted by midnight on Sunday 8th January 2018 using both
Moodle and GitHub.
<br>
</h5>GitHub:</h5>
Submit the HTTPS clone URL, e.g. https://github.com/myaccount/my-repo.git
of the public repository for your project. All your source code should be
available at the GitHub URL. You should try to use GitHub while developing
your software and not just push changes at the end.
<br>
<h5>Moodle</h5>
The project must be submitted as a Zip archive (not a rar or WinRar file) using
the Moodle upload utility. You can find the area to upload the project under
the “A JEE Application for Measuring Document Similarity (50%)
Assignment Upload” heading of Moodle.<br>
The name of the Zip archive should be <id>.zip where <id> is your GMIT
student number.<br>
Do not package the Db4O libraries with your application.<br>
The Zip archive should have the following structure (do NOT submit the
assignment as an Eclipse project):


## Servlets 
servlet is a Java programming language class that is used to extend the capabilities of servers that host applications accessed by means of a request-response programming model. Although servlets can respond to any type of request, they are commonly used to extend the applications hosted by web servers.

## DB4O Database
db4o (Database for Objects) is the open source object database that enables developers to store and retrieve any application object with one line of code.



## Prerequisites & Technologies used

<img src="https://github.com/gtonra89/Distributed-systems-RMI-Project/blob/master/Eclipse-Neon-300x200.jpg?raw=true" align="left"/>
<img src="https://github.com/gtonra89/Distributed-systems-RMI-Project/blob/master/apache-tomcate-web-server-online-training.jpg?raw=true" align="left"/>
<br><br><br><br><br><br>
Eclipse Java EE I used Neon version :<br>https://www.eclipse.org/downloads/packages/eclipse-ide-java-ee-developers/neon3
<br>Apache Tomcat 9.0 :<br>https://tomcat.apache.org/download-90.cgi

## Download Tomcat9.0
1.Have project open in Eclipse<br>
2.Go to Window -> Preferences<br>
3.Type in server -> Runtime environment<br>
4.Add -> Apache Tomcat v9.0<br>
5.Then go back & Go to Project -> Properties<br>
6.Java Build Path -> Libraries -> Add Library -> Server Runtime -> Apache Tomcat v9.0 -> Finish -> Apply<br>

## How to Run
1.Clone the repository to your machine.<br>
2.Extract the Zip
3.Import the unzipped folder from eclipse.<br>
4.Go to the src folder and run "DocumentRunner.java" file as a Java Application.<br>
5.Then go to the Dynamic Web Application and run "index.jsp" file on the server.<br>
6.Go to the web brower on your machine or on Eclipse and the webpage will be there and you should be able to upload a text file <br>
