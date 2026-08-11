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


