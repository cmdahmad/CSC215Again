Assignment 04 Day one

Part A ; insert header
Part B ; insert header
Part C ; insert header
Part D ; insert header


All parts analysed. Nothing outside the scope of my knowledge so far.

We're still learning more about java, revisiting the problems we have solved.

Jagged/Ragged Arrays
Object Oriented programming start

Getting a bit anxious about this new project because with all new projects you never know where the knowledge gaps lie.

But there's only one way to find out what the right move is.

**Part B Code**

Ask for row 1; int
row 2; char
row3; str
row4; int,char,str

4 rows
3 cols

Object data type
2d array
multi step approach notation

**Solution:**

public scanner

ask for 4 questions
3 scanners each
e.g.
arr[0][1] = input.nextInt;
arr[0][1] = input.nextInt;
arr[0][1] = input.nextInt;

Then print method

loop i
loop j
print.arr[i][j]
System.out.println(“      ”)

**partC rought work**

Ask for minTemp
ask for maxTemp
ask for minRain


//does it grow or not
if (avgtemp => min temp && avgtemp =< max temp) { //if it grows
plant growth = rainfall[i] - minRain
} else { //if it doesnt grow
plantgrowth = -1
}

// final formula for plant height
plantHeight[i] = plantHeight[i] + plantGrowth[i]
if (plant height[i] < 0) {
plant height = 0;
}


for(int i = 0; i < avgTemp.length; i++) {
if (count == 0) {
print(“Index + month + temp + rainfall + plant growth + plant height”)
count++;
}
print(i + month[i] + avgTemp[i] + avgRain[i] + plantGrowth + plantHeight)

}

Object[][] arr = new Object[14][6];

arr[0] = {dashes,
}
arr[1] = Strings
arr[2+i] = i,month[i], avgtemp[i],avgrain[i],plantgrowth[i],plantheight[i].

**Part D**
Before jumping onto conclusions, let’s make a plan first on how we will tackle the problem.

The class student is already made

The class has 2 attributes.
Name,gpa.
Both attributes has a getter and setter method.

The program asks us to prompt it to create 3 students.

enter st1 (String)
enter gpa1 (double)

enter st2 (String)
enter gpa2 (double)

enter st3 (String)
enter gpa3 (double)

print 3 students:
Print(stu1)
Print(stu2)
Print(stu3)

Solve until here. Then let’s work on part 2 separately as it requires more deep thinking.

Before jumping onto conclusions, let’s make a plan first on how we will tackle the problem.

The class student is already made

The class has 2 attributes.
Name,gpa.
Both attributes has a getter and setter method.

The program asks us to prompt it to create 3 students.

enter st1 (String)
enter gpa1 (double)

enter st2 (String)
enter gpa2 (double)

enter st3 (String)
enter gpa3 (double)

print 3 students:
Print(stu1)
Print(stu2)
Print(stu3)

Solve until here. Then let’s work on part 2 separately as it requires more deep thinking.

part 2

Print(which name do you want to edit?)
String edit = input.NextLine().toLowerCase();

We want to ideally take the scanner input. Go back to the students array. Check each individual scanner 
to match their name. If the name matches, we allow user to set their name and gpa.

How do we check scanner to match their name.


for (int i = 0; i < students.length; i++) {
   if (edit.contains(students[i].getName.toLowercase) {
       tempName = students[i]
}
PartD (b)
Here’s my understanding of the problem.

The client has provided me with 4 semesters and 6 classes per semester. For each of this semester, they want me to create an object. Each object contains data for the 6 classes respective of the semester. Once the 4 objects are created, they want me to store them in a 1d Semester data type (class name) array. Finally, they want me to print out all the data from the semester array.



All file names:
Array_2D_SingleDataType_AhmadMustafa

Array_2D_MultipleDataTypes_AhmadMustafa

GardeningPlanner_AhmadMustafa

StudentClient_AhmadMustafa

DegreePlanner_3DArray_AhmadMustafa

DegreePlanner_OOP_AhmadMustafa
