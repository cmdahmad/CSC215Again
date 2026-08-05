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

