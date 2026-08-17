partA
Assignment 06 starts here

Hey Claude. I trust you. Please reformat the following text to be suitable for google docs (Attaching a PDF example). 
Please do not change any words. Just spacing, line breaks and all. format. thanks.

Also, please ask as many follow up questions as needed if there is any confusion.

Talking about pkg 17

6 parts
no coding
each part requires extensive writing and explanation of material. There might be some cheating involved but let’s see. 
I haven’t cheated until now, so I might instead look into the material and search on google and try to understand 
before writing if there is anything i don’t necessarily understand. Although it is unlikely that i wont understand. 
The only thing in the list of topics i want a refresher on is superclass equals and compareto methods.

No modifier in a class means that the class is accessible within the package but not outside the package.
—
For this document, i recommend you to open the attached PKG17 pdf in parallel (included in the zip file).
PKG17 is essential context to understand this report.
--

Part A rules for superclass/subclass access
1) lines 77 and 78

// context
Singer singer = new Singer();
Object Declared as Singer and initialised as Singer also.

#77 singer.sayHelloPerson(); // father class method
#78 singer.sayHelloSinger(); // child class method

I need to learn more about polymorphism. I need to learn more about upcasting and downcasting. Or perhaps i need a 
quick refresher.

But line one if we go word by word we see the singer object being called and more specifically a method is being 
accessed of this object using a .operator. Even though it is a purely Singer object, the Person class method works 
because Singer class extends the Person class. In other words, the Singer class is a subclass to the Person class 
hence the method can be called within the child class objects. Line 78 works because the object is defined as the 
Singer object and this method is publicly accessible which makes it possible to be called in the driver class.

2) lines
next is 86 to 89

explain why these lines do not work.

same context as 1)

//86 Singer singerPerson = new Person();
//87 Student studentPerson = newPerson();
//88 Singer singerStudent = new Student();
//89 Student studentSinger = new Singer();

First 2 lines are 2 examples of failed downcasting. For the first example, singerPerson is an address variable for 
Singer. It does not construct an object for a person as the object is referenced as a singer hence it must contain 
singer variables. It can not be constructed as a Person type because -xyz- This would be similar to casting an integer 
to a reference data type variable of double. It simply does not contain enough data to be stored as a Double. Same with
line 87, Person() constructor does not provide the studentPerson variable with enough data to construct the object. 
Hence a compilation error.

Last 2 lines do not work for the same reason. Both objects are declared as one class and initialised as a completely 
separate class which has no relation with it. The similitude of this would be trying to store a String into an int 
variable. It does not compile.

3) lines Line 92 and 96

92 does work simply because it calls onto the method defined in the Person class getName() which simply returns the 
name of the Object. This object, constructed without parameters returns the words “Person” as defined within the Object
class. 

Line 96 was also a method inherited by this object. Simply using dot ‘.’ allows the compiler to access this method 
called sayHelloPerson() which prints the output listed on line 96.

4) Line 93 and 97
93 does not work because the object is stored in a Person data type variable. This means that it does not have a place 
5) to store the subtype method hence it returns an error.

Line 97 does not work for the same reason as line 93. The singerPerson object is stored in a Person (superclass) data 
type. The superclass does not know the existence of subclasses, hence it has no memory space to store the subtype 
methods. In line 97, the code calls for a subtype method which was never stored in the reference object.

--

PartB - Upcasting/Downcasting
1) Line 110 to 112
studentSub is a pure student object by definition. The student class extends the Person class. Since the student class 
inherits Person attributes and methods, line 110 works as it is a Person class method.

Since this is a pure student object by definition, the student method also works in line 111.
Line 112 studentSuper object is a student object upcasted into a Person reference. This is now a Person object which 
has access to the Person class methods hence why line 112 works.

2) Line 113:
As explained earlier, studentSuper is now a Person object which does not have access to subtype class methods. Line 113 
tries to invoke the subtype ‘Student’ class methods, which the Object has no access to, hence why line 113 does not 
work.

3) Line 117: // This one is remaining.
The object in question is personSuper, which is a pure Person object. Person is the supertype of Student. The client 
ttempts to downcast personSuper into a super reference. Which as you can see does not work since

3) Line 117
Variable personSub
declared Student (subtype)

This line is an example of explicit downcasting. It fails because a supertype object can not be stored in a subtype 
reference. Hence personSub (Student variable) can not be equal to personSuper which is a super type object.

4) Line 122
Variables in question
studentSub
studentSuper

context:
studentSub is pure student by definition
studentSuper is an object which was a student upcasted into a person variable.

This line of code works because studentSuper was initially upcasted into a Person object from a Student object at one 
point which means there is still memory that exists as it being a Student. Hence that memory is accessed to allow 
studentSub to become equal to studentSuper. Demonstrating a successful downcast.

5) Code attached in file to demonstrate understanding.

-- PartC
Overriding equals and compareTo Methods.

1) 141, 145, 147
equals operator ‘==’ 
? a : b  // This is the ? control structure
means run 'a' if true 'b' if false

141 is diff objects because they are created as separate objects.
145 is same object because s3 is a variable that stores s1, essentially they are the same object with 2 addresses. 
147 is different because s2 although constructed in the same way and type, is a different object hence the == returns 
false.

2) 161,163,165,167

.equals method checks for Object’s data

161 returns true because string1 and string2 are literally the same String of characters.

163 returns false because string1 and string3 are a different String of characters

165 returns false because string1 and c are different data types with different data.

167 returns false because .equals does not accept primitive data types and c is a char.

3) 171 to 180
This is a demonstration of .compareTo method which i willl explain line by line.

Line 171 and 172 returns zero because the 2 strings being compared are equal in value.

Line 174 returns a negative integer because the argument being passed is smaller than the access variable.

line 174 returns positive 10 because the argument is greater than the access variable.

line 180 is an error because compareTo only takes String type as it’s parameter. This error will say “incompatible 
types: Char cannot be converted to String”

4) 306 to 308 
Variables in question
3 Phone objects phone1, phone2, and phone3

Operator in question: An overriden .equals method
> It’s function is to essentially check whether the phone prices are equal.

phone 1 and phone 2 are constructed at a price of 500. phone 3 is constructed at 800. 

Line 306 returns true because phone1 and phone2 have an equal price value.
Line 307 returns false because phone1 and phone3 have a different price value.
Line 308 returns false because the overridden .equals method checks data types first using .getClass(), and phone3 is a 
Phone object which is different from the String type being passed in the argument.

5) Line 310 to 313
Overridden compareTo method to check phone object’s attribute ‘price’.

310 return 0 because price is same. 
Access variable - parameters. Meaning the left value minus the right value is the result hence -300 in line 311 and 300 
in line 312. Finally, line 313 returns Warning which is a result written in the compareTo method if the compared object 
are of different type.


partD

Generic data type and static/dynamic binding

1) Line #321
Here we see the diamond operator '< >' being used to after the declaration of the BankAccount class. The purpose of the 
diamond operator here is to show another data type T which extends the Currency class. This means that every time 
an object of class BankAccount is created, the programmer (or the user) would have to also pass in a data type to be 
used within the class. For example, there is an attribute called "Currency" for which the data type has not been decided
The programmer wants this data type to be decided at the time of object initiation, in this case a generic class would 
be used. A generic class is interchangeable, and can be decided during object initiation. To implement a generic class
a diamond operator '<>' is used, and within it is the variable 'T extends Currency' which is only a child class of the 
Class 'Currency'.

2) Line 336 to 339
Here there are multiple classes being initiated. A good overview would be that there is a parent class called Currency 
and then within the child classes are multiple classes (USD, EUR, GBP etc.) This would allow users to initiate objects 
of specific currency types. The Currency class is the supertype of all these classes. Hence why the initiation says
for example 'class USD extends Currency.'

3) 344 to 345
Here in line 344 there is an object being created of the BankAccount class. The class constructor requires for the user
to pass in the data type for certain functions within the class. Hence the use of the diamond operator. To explain the
example, the diamond operator is used to declare an attribute variable called currency, but the data type of the 
currency variable has not been specified. This data type will be decided when an object of this class is created, 
and when an object is created, the programmer will pass in the data type at the time of construction. The passing in
will be done in the diamond operator e.g. '<Double>'. In line 344, the object being created has it's currency data type
as the 'Currency' class. In line 345 there is a method used to print out the data type for the currency, which is USD 
for empty constructor variables.

4) 348 and 349
Continuing on from the class BankAccount described in line 344, Line 348 is another object of this class being 
initiated. This time, the diamond operator defines a class called EUR. Also on the constructor arguments you will see
'new EUR' which will initiate a new EUR object within the class. Overall, 348 creates a bank account object and passes
in 'EUR' as the required generic class. Line 349 prints out this data type, which would be EUR.

5) Demonstrate (Add package header please and screenshot after)

Part E:
1) 386, 391, 397 and 403
This code is first lines of a class which extends another class. This is an example of class inheritance. The class 
being inherited is the one that comes after the keyword 'extends.' The class being initiated is considered the child
class of the class being inherited. The child class will inherit attributes and methods from the parent class. 
Furthermore, the child class objects can be stored in the parent reference objects and arrays.

2) 410 and 417
These 2 lines are lines which initiate a new class trying to extend another class called 'Phone' but the compiler 
returns an error. The reason for this error is the access availability of the Phone class. The Phone class exists
in a different package from these 2 attempts. Which means in order for these classes to have access to the Phone class
the Phone class would need to be initiated as "public", which it is not. The scope of the Phone class only exists 
within the package it's in.



