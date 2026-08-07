partA
understanding the problem:
This question is asking for me to take one of the 8 coding design guidelines from Daniel Liang and explain it in detail.

The guideline i want to explain is called encapsulation, in which the author suggests that a class should use a private 
modifier to hide its data from direct access by clients. This makes the class easy to maintain since there would be no 
interference.

Second bullet point suggests that we only provide a getter method for a variable if you want the data field to be 
readable and provide a setter method only if you want the data field to be updateable. To my understanding, the author 
is suggesting to not write these methods unless you are going to use them in your code. Additionally, not adding 
getter/setter methods ensures no field is accessed/modified unless intended by the programmer.

--
In order to complete this requirement. I'm planning to create an Object oriented program with a simple class named 
Student. the Student class will contain a student name, GPA, and private address. The address is not supposed to be
accessed or modified hence we will not be creating any getter or setter methods for this variable.

The driver class will be called private just so no one accesses the data unnecessarily.

--
Let’s discuss how I created a new Java class to demonstrate these 2 rules. I created 3 classes. 1 driver class and 1 
Student class and 1 private DanceStudent class nested within the 
Student class. This nested private class demonstrates the first suggestion to create private classes. I learned in 
java you can only create private classes if they are nested, you can not begin a class file with a private class.

For the second suggestion, I created 3 variables. 2 of them to be accessed and modified and 1 of them not to be 
accessed or changed. The first 2 as demonstrated in screenshots are Name and GPA which have getter and setter methods. 
Although the address have been made private, unable to be accessed or modified. Since this is a personal detail, it’s 
best left this way.

--
Part B (a)

Has A, aggregation and composition

This problem is asking from us to demonstrate our ability of OOP aggregation and composition. As a valid attempt, we
must have 5 classes for the program. 1 must be the driver class to run the instance and the other 4 must be related to 
each other meaning one father class which contains the other 3 subclasses. Then I must also draw a simple diagram of the
class relationsships. I’m planning to complete this by creating 4 classes. 1 Stationary class and then as a subclass I 
want a pencil, eraser and sharpener. The biggest challenge in this program is that its so easy that it’s boring. That’s 
the challenge, to overcome the burden and go through it. I will try to complete this program in no more than the next 3 
minutes. Go. Then I will watch the composition video on youtube just to confirm i am on the right track.

--
Post reflection is the program compiles successfully and it was executed as I had imagined. I was able to meet all client 
requirements and I did that by creating 5 classes. 1 Class on the top of the flowchart is the driver class. Then one 
level below that is the stationaryBox class. Then one level below that is 3 subclasses; pencil, eraser and sharpener. 
For the sake of clarity, I did not create more that 2 attributes, 2 constructors, and 1 method for each subclass and 
1 method for the father class. This concludes all requirements from the client into a successful execution of Has-A 
relationships.
--

Part C (a)

Is-A relationship. Inheritance. 

Understanding the problem:
The client is requesting for our team to demonstrate our understanding of IsA relationships. they are asking for us to
define 4 methods. 1 driver method and a 3 layered identity structure of a singular class. Among the requirements is to 
build a flowchart diagram and share it with the client. I am planning to complete this assignment by creating a Person,
who is also a student and who is also a computer science student. This would entail a 3 layer class is-a relationship
inheritance.

All client requirements have been met and a demonstration has been coded as well. Also a flowchart has been attached in 
the screenshots below. To explain further, the granchild class is the CSStudent who is-A Student who is-A Person. This 
explains the 3 layers of a person’s identity, hence separate classes. Then also a driver method on top of this structure 
to run the program. This in other words is also commonly known as inheritance in Java OOP. To further clarify, the 
CSStudent would inherit attributes and methods from the Student class and the person class since a cs student is also 
naturally a student and a person. My program demonstrates this relationship and further supports this explanation.
--
