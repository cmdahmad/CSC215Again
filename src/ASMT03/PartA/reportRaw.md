Explain my understanding of the problem
10m freewrite
10m refine

The question is asking me to create a BMI calculator. The purpose behind a BMI calculator is to calculate how much body fat a person has. The output from this calculation is a number which ranges from under 18.5 all the way above 30. But it usually stays within this range. This program would be helpful for nutritionists and gyms who help people with creating a better lifestyle whether through working out or creating a diet. The client wants an interactive program which asks the user for their weight, height, low weight, high weight and displays a range for them to see where they stand. The weight categories range from underweight, healthy weight, overweight, obese. After taking these inputs, the program would then make an accurate calculation on the BMI, and using the number from the BMI the program would put the user in the appropriate weight category ranging from underweight all the way up to obesity. Then the user is prompted to enter a low weight and a high weight which then displays a range of weight, bmi and weight status for the user to have a visual idea of what the progress from their low to high weight would look like. Some key factors to producing a good program requires taking the appropriate inputs, making accurate calculations, and displaying relevant results. The inputs are Name, height, weight, low weight, high weight. The calculations are for BMI and the weight status based on the BMI. Then finally, the program requires outputting the result at 2 different stages: Firstly after the user enters their current situation. Secondly when the user enters a range from low to high, they would see the visualy representation of that range which would include the weight, BMI and weight status displayed as a comprehensive table. The input height is taken in feet and inches, weight in pounds. These forms input would make the program the ‘English version.’

1. welcome()
a. public static void welcome()
b. public - this increases the scope of the method to be accessed from anywhere.
c. welcome
d. welcome()
e. no parameters
f. no
g. no
h. the method prints the welcome message
i. void method
j. void method
This method is an essential method as it prints out the welcome message for the program. It’s callers are the driver() method which calls this method to begin the program.

2. inputs1()
a. public static void inputs1() {}
b. public - the scope is accessible everywhere
c. inputs1
d. inputs1()
e. no parameters
f. no
g. the driver method calls it
h. the method receives all inputs
i. void method
j. void method
This method is one of the 3 key pillars of the program, which is receiving inputs from the user. It’s caller is the driver() method which calls this method right after the welcome message to start receiving inputs from the user. After receiving these inputs, the program uses this data to calculatBMI. Which is the next method.

3. BMI()
a. public static double bmi (int height, double weight)
b. public - the scope is accessible everywhere
c. bmi
d. inputs1(int height, double weight)
e. height and weight
f. int height, double weight
g. called in the first summary as bmi(height, weight)
h. the method calculates bmi using height and weight
i. the method returns the bmi floating point number
j. Double
This method is the second key pillar of the program, which is calculating inputs. This method in particular calculates bmi, which is later printed and also used to calculate the weight status of the user. It’s caller is the report1() method which calls this method to display bmi and weight status of the user.

4. indexReport()
a. public static void indexReport()
b. public - the scope is accessible everywhere
c. indexReport
d. indexReport()
e. no parameters
f. no formal parameters
g. the driver method calls it
h. this method prints the low—> high report index.
i. void method
j. void method
This method is the final key pillar of the program. It’s job is to print a comprehensive table for the user to see what it would look like to go from their low weight to their high weight. Additionally, this enables the user to judge their bmi and weight status at different weights.

5. driver()
a. public static void driver() {}
b. public - the scope is accessible everywhere
c. driver
d. driver()
e. no parameters
f. no
g. the main method calls it.
h. the method holds and organises all methods. structure
i. void method
j. void method
This method is the backbone of the program containing all the methods and providing them structure to create a smooth experience for the user. It’s caller is only the main method, which has only one line; which is to call the driver method.

Analyse your results.
The Program compiles and runs successfully. In addition, the program successfully executes the 2 desired outputs which are outlined in the bottom of the program. What works is that it does it job completely and does not fail in producing a valuable output. 

To further explain, the program welcomes the user, receives the input, makes the calculations, displays the desired results and gracefully exits the program. 

However one thing that it fails in is outside of the test sample outputs, there are some abnormal inputs which can hinder the design of the final table. Although, this has a very low chance of occuring. In the future, I would create this program in a way where the design is consistent across all users, meaning there are no inconsistencies, and also create some exception handling control structures. E.g. if the user enters a String when prompted for weight or height the program would crash creating a runtime error. Some Slice of life addition in the program would be to create a library of quotations to motivate the user to create healthy habits. This can be in the form of a quote, a life hack or a random fact about staying fit. As that is the primary objective, or atleast i hope the primary objective, for the client.