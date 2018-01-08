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
<p> 
1. A document or URL should be specified or selected from a web browser and then
dispatched to a servlet instance running under Apache Tomcat.
2. Each submitted document should be parsed into its set of constituent shingles and
then compared against the existing document(s) in an object-oriented database (db4O)
and then stored in the database.
3. The similarity of the submitted document to the set of documents stored in the
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
</p>




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


# DocumentSimilarityProject
