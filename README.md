# Calculate-Shapes final project 

This was my final project for my Computer Science 1 class

CSC122 – Fall/2022
Project # 1 

This project promotes the following Student Learning Outcomes: 

•        Identify objects associated with a stated problem, then design, code, and test a set of classes for their representation that demonstrates encapsulation, data abstraction, and information hiding.
•        Organize programs based on separate declaration, definition, and usage files that demonstrate security considerations.
•        Develop applications based on code designed for reuse and extensibility using best practice software engineering techniques.

Problem Statement

Write a class called Triangle that can be used to represent a triangle. 
Write a class called Cylinder that can be used to represent a Cylinder.
Write a class called ShapesDemo that will interface with the Triangle and Cylinder classes.

Class Triangle

•        A Triangle will have 3 sides.  The class will be able to keep track of the number of Triangle objects created.  [rv1.1]It will also hold the total of the perimeters of all the Triangle objects created. [rv2.1]
•        It will allow a client to create a Triangle, passing in integer values for the three sides into the Triangle constructor.
•	If the values for the sides that are passed in do not represent a valid Triangle (read below for the requirements for a Triangle to be valid) , then all sides will be set to a value of 1. 
•	The constructor should add 1 to the count of the number of Triangles created.
•	The constructor should call a method to calculate the perimeter and then add the perimeter for that object to an accumulator. 

In addition to the constructor, the Triangle class must have the following methods that return a boolean value:

•	isRight () ¬- see note 1 below regarding Acute triangles.
•	isAcute() - see note 1 below regarding Acute triangles.
•	isObtuse() - see note 1 below regarding Obtuse triangles.
•	isScalene() - no two sides are the same length
•	isIsosceles() - exactly two sides are the same length
•	isEquilateral() - all three sides are the same length
•	isValid() - the sum of any two sides of a triangle must be greater than the third in order to represent a valid triangle.  Also, no side may be 0 or negative. 
•	equals (Triangle t) – compares two Triangle objects to determine if they are equal.  We will compare their perimeters to determine equality.

Additional methods in the Triangle class

•	toString() – returns a String that specifies the values for the 3 sides of the triangle
•	calcPerim() – calculate and return the perimeter of the object.
•	addTotalPerim().  This method will call calc_perim() and add the perimeter for that object to an accumulator. 
•	reduceTotalPerim().  This method should subtract the perimeter for that object from the accumulator.
•	Accessor methods for all properties.
•	The Triangle object cannot assume that the values of the 3 sides are entered in any particular order.  Think about what that means.

Be sure to specify proper visibility for all methods and properties

Note 1:

When given 3 triangle sides:

•	to determine if the triangle is right
1) Square all 3 sides.
2) Sum the squares of the 2 shortest sides.
3) Compare this sum to the square of the 3rd side.
4) If equal then we have a right triangle

•	to determine if the triangle is acute
1) Square all 3 sides.
2) Sum the squares of the 2 shortest sides.
3) Compare this sum to the square of the 3rd side.
4) If the sum of the squares of the 2 shortest sides is greater than the square of the 3rd side, the triangle is acute

•	to determine if the triangle is obtuse
1) Square all 3 sides.
2) Sum the squares of the 2 shortest sides.
3) Compare this sum to the square of the 3rd side.
4) If the sum of the squares of the 2 shortest sides is less than the square of the 3rd side, the triangle is obtuse

Note 2:

All methods MUST be well documented including formalized pre-conditions and post-conditions.  Refer to document T-1_Design By Contract located in the testing folder in your Project 1 download for guidance.

Note 3:

Your Triangle and Cylinder classes MUST be written according to these specifications.  Do not vary from those specs.   


UML Diagram: https://imgur.com/a/hSapOhV



**Class Cylinder **

A cylinder is a 3D solid shape that consists of two identical and parallel bases linked by a curved surface. These bases are like circular disks. The line passing from the center or joining the centers of two circular bases is called the axis of the cylinder shape. The distance between the two bases is called perpendicular distance and is represented as height, “h”. The two circular bases have a distance from the center to the outer boundary which is known as the radius of the cylinder, represented by “r”. The cylinder is a combination of 2 circles + 1 rectangle.


•        A Cylinder will have a radius.  A Cylinder will have a height.  The class will be able to keep track of the number of Cylinder objects created.  It will also hold the total of the surface areas of all the Cylinder objects created. 
•        It will allow a client to create a Cylinder, passing in a double value for the radius and a double value for the height into the Cylinder constructor.
•	If the value for the radius or height that is passed in is 0 or negative, then the radius and height will be set to a value of 99. 
•	The constructor should add 1 to the count of the number of Cylinders created.
•	The constructor should call a method to calculate the surface area and then add the surface area for that object to an accumulator. 

In addition to the constructor, the Cylinder class must have the following methods that return a boolean value:

•	isValid() – the radius and the height may not be 0 or negative. 
•	equals (Cylinder c) – compares two Cylinder objects to determine if they are equal.  We will compare their surface areas to determine equality.

Additional methods in the Cylinder class

•	toString() – returns a String that specifies the value of the radius and height of the object.
•	calcCurvedSurfaceArea() – calculate and return the curved surface area of the object
•	calcBaseSurfaceArea() – calculate and return the base surface area of the object
•	calcSurfaceArea() – calculate and return the totalSurfaceArea of the object.
•	addTotalSurfaceArea().  This method will add the total surface area for that object to an accumulator. 
•	reduceTotalSurfaceArea().  This method should subtract the total surface area for that object from the accumulator.
•	Accessor methods for all properties.









Class ShapesDemo

•	ShapesDemo will drive the application and manage the arrays which will store the Cylinder and Triangle objects. Fashion your arrays to store any number of objects.   Your arrays should be able to accommodate any number of objects (i.e. not limited to just the number of objects in the Test Run).  In main you will declare your Cylinder and Triangle arrays.  You will need one array to store any Cylinder objects you create and another array to store any Triangle objects you create.  You will also need to instantiate any other objects necessary for input and output and declare any variables used in main.

•	Review the Test Run to see how the application interfaces with the user.

•	Inside a loop in main
o	Prompt the user as shown below
o	Allow the user to create either a Cylinder or a Triangle
o	If the user selects Triangle then allow the user to type 3 integers on separate lines for each triangle. 
o	Instantiate each Triangle (refer to the sample dialog below for test data)
o	Store each Triangle object in an array of Triangle objects.
o	If the user selects Cylinder then allow the user to type in a double, representing the radius of the Cylinder, and a double representing the height of the Cylinder.
o	Instantiate each Cylinder (refer to the sample dialog below for test data)
o	Store each Cylinder object in an array of Cylinder objects.

•        Once you have entered your data, then inside a separate loop access the Triangle and Cylinder objects stored in your arrays.	
o	Use an if statements to test each triangle for its properties and print appropriate output.
o	Print the values of the sides of each triangle.
o	Print the properties that apply for each triangle.  See the sample output.
o	Print the Perimeter for each triangle.

•	Inside a separate loop	
o	Test each Cylinder for its properties and print appropriate output.
o	Print the values as shown in the Test Run.

•	Test your equals method as shown in the Test Run.
•	Print the total of the perimeters for all Triangles.
•	Print the total of the surface areas for all Cylinders.
•        Output must be labeled, aligned, and reasonably well-spaced.  Test your program using the data that I have provided in the test run.  Copy and paste your output to the bottom of your ShapesDemo class.
•	Analyze the test run.  Take note of the data entered by the user and the corresponding output.  This will help you understand the requirements and answer many of the questions you may have regarding the application.

