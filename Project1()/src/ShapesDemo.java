/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ender
 */
import java.util.Scanner;

public class ShapesDemo {

    //static arrays of triangle and cylinder objects
    static Triangle[] tri;
    static Cylinder[] cyl;

    static int count1 = 0, count2 = 0;

    static Scanner scan = new Scanner(System.in);

    static int caseAns;

    //precondition: arrays have been created but not initilized
    //postcondition: arrays have had memory allocated
    //and have been initalized and have had objects in the indexes
    //then accesses the array contents 
    public static void main(String[] args) {

        tri = new Triangle[1];
        cyl = new Cylinder[1];

        String ans;
        do {
            System.out.println("Create a Shape\n"
                    + "Enter 1 for cylinder or 2 for a triangle");
            caseAns = scan.nextInt();

            switch (caseAns) {
                case 1:
                    if (count2 == cyl.length) {
                        increaseLength();
                    }
                    cylObject();
                    break;
                case 2:
                    if (count1 == tri.length) {
                        increaseLength();
                    }
                    triObject();
                    break;
            }

            System.out.println("\nDo you wish to process another shape?");
            ans = scan.next();
        } while (ans.equalsIgnoreCase("y"));

        for (int i = 0; i < tri.length; i++) {
            System.out.println("\nTriangle " + i + " has sides of" + tri[i]);
            tri[i].isRight();
            tri[i].isAcute();
            tri[i].isObtuse();
            tri[i].isScalene();
            tri[i].isIsosceles();
            tri[i].isEquilateral();

        }
        for (int i = 0; i < 1; i++) {
            System.out.println("\nthe total perimeter of all "
                    + count1 + " triangles is: " + tri[i].getTotalPerim());
        }
        for (int i = 0; i < cyl.length; i++) {
            System.out.println(cyl[i].toString());
        }
        for (int i = 0; i < 1; i++) {
            System.out.println(cyl[i].getTotalSA());
        }

//        System.out.println("My test for equals method\n"
//                + "Triangle " + tri[2] + " and " + tri[3] + " are " + tri[2].equals(tri[3])
//                + "\nTriangle " + tri[1] + " and " + tri[5] + " are " + tri[1].equals(tri[5]));
//        
//        System.out.println("My test for equals method\n"
//                + "Cylinders " + cyl[3] + " and " + tri[4] + " are " + cyl[3].equals(tri[4])
//                + "Cylinders " + cyl[0] + " and " + cyl[3] + " are " + cyl[0].equals(tri[3]));
    }

    //precondition: main has created triangle array
    //postcondition: creates the triangle object and assigns the object
    //to the current index
    public static void triObject() {
        int side1, side2, side3;

        System.out.println("Enter an integer dimension for side a of "
                + "triangle " + count1);
        side1 = scan.nextInt();
        System.out.println("Enter an integer dimension for side b of "
                + "triangle " + count1);
        side2 = scan.nextInt();
        System.out.println("Enter an integer dimension for side c of "
                + "triangle " + count1);
        side3 = scan.nextInt();

        tri[count1] = new Triangle(side1, side2, side3);
        count1++;

    }

    //precondition: main has created cylinder array 
    //postconditon: creates the cylinder object and assigns the object 
    //to the current array index
    public static void cylObject() {
        double radius, height;

        System.out.println("Enter the radius for cylinder " + count2);
        radius = scan.nextDouble();
        System.out.println("Enter the height for cylinder " + count2);
        height = scan.nextDouble();

        cyl[count2] = new Cylinder(radius, height);
        count2++;
    }

    //preconditon: counter1/counter2 has the same length as either 
    //triangle array or cylinder array 
    //postcondition: increases the size of the array
    public static void increaseLength() {
        if (caseAns == 2) {
            Triangle[] temp = new Triangle[tri.length + 2];

            for (int i = 0; i < tri.length; i++) {
                temp[i] = tri[i];
            }
            tri = temp;
        } else if (caseAns == 1) {
            Cylinder[] temp = new Cylinder[cyl.length + 2];
            for (int i = 0; i < cyl.length; i++) {
                temp[i] = cyl[i];
            }
            cyl = temp;
        }
    }

}

//run:
//Create a Shape
//Enter 1 for cylinder or 2 for a triangle
//2
//Enter an integer dimension for side a of triangle 0
//3
//Enter an integer dimension for side b of triangle 0
//4
//Enter an integer dimension for side c of triangle 0
//5
//
//Do you wish to process another shape?
//y
//Create a Shape
//Enter 1 for cylinder or 2 for a triangle
//2
//Enter an integer dimension for side a of triangle 1
//4
//Enter an integer dimension for side b of triangle 1
//4
//Enter an integer dimension for side c of triangle 1
//5
//
//Do you wish to process another shape?
//y
//Create a Shape
//Enter 1 for cylinder or 2 for a triangle
//1
//Enter the radius for cylinder 0
//2
//Enter the height for cylinder 0
//4.0
//
//Do you wish to process another shape?
//y
//Create a Shape
//Enter 1 for cylinder or 2 for a triangle
//1
//Enter the radius for cylinder 1
//4.0
//Enter the height for cylinder 1
//8.0
//
//Do you wish to process another shape?
//y
//Create a Shape
//Enter 1 for cylinder or 2 for a triangle
//2
//Enter an integer dimension for side a of triangle 2
//1
//Enter an integer dimension for side b of triangle 2
//1
//Enter an integer dimension for side c of triangle 2
//2
//
//Do you wish to process another shape?
//y
//Create a Shape
//Enter 1 for cylinder or 2 for a triangle
//2
//Enter an integer dimension for side a of triangle 3
//1
//Enter an integer dimension for side b of triangle 3
//1
//Enter an integer dimension for side c of triangle 3
//2
//
//Do you wish to process another shape?
//y
//Create a Shape
//Enter 1 for cylinder or 2 for a triangle
//2
//Enter an integer dimension for side a of triangle 4
//-3
//Enter an integer dimension for side b of triangle 4
//4
//Enter an integer dimension for side c of triangle 4
//5
//
//Do you wish to process another shape?
//y
//Create a Shape
//Enter 1 for cylinder or 2 for a triangle
//1
//Enter the radius for cylinder 2
//-2
//Enter the height for cylinder 2
//-4
//
//Do you wish to process another shape?
//y
//Create a Shape
//Enter 1 for cylinder or 2 for a triangle
//1
//Enter the radius for cylinder 3
//2
//Enter the height for cylinder 3
//4
//
//Do you wish to process another shape?
//y
//Create a Shape
//Enter 1 for cylinder or 2 for a triangle
//2
//Enter an integer dimension for side a of triangle 5
//5
//Enter an integer dimension for side b of triangle 5
//6
//Enter an integer dimension for side c of triangle 5
//7
//
//Do you wish to process another shape?
//y
//Create a Shape
//Enter 1 for cylinder or 2 for a triangle
//2
//Enter an integer dimension for side a of triangle 6
//3
//Enter an integer dimension for side b of triangle 6
//7
//Enter an integer dimension for side c of triangle 6
//9
//
//Do you wish to process another shape?
//y
//Create a Shape
//Enter 1 for cylinder or 2 for a triangle
//1
//Enter the radius for cylinder 4
//5.0
//Enter the height for cylinder 4
//10.0
//
//Do you wish to process another shape?
//n
//
//Triangle 0 has sides of
//Side A: 3
//Side B: 4
//Side C: 5
//The permieter is 12
//Triangle Properties:
//Right
//Acute
//Scalene
//
//Triangle 1 has sides of
//Side A: 4
//Side B: 4
//Side C: 5
//The permieter is 13
//Triangle Properties:
//Acute
//Isosceles
//
//Triangle 2 has sides of
//Side A: 1
//Side B: 1
//Side C: 1
//The permieter is 3
//Triangle Properties:
//Acute
//Isosceles
//Equilateral
//
//Triangle 3 has sides of
//Side A: 1
//Side B: 1
//Side C: 1
//The permieter is 3
//Triangle Properties:
//Acute
//Isosceles
//Equilateral
//
//Triangle 4 has sides of
//Side A: 1
//Side B: 1
//Side C: 1
//The permieter is 3
//Triangle Properties:
//Acute
//Isosceles
//Equilateral
//
//Triangle 5 has sides of
//Side A: 5
//Side B: 6
//Side C: 7
//The permieter is 18
//Triangle Properties:
//Acute
//Scalene
//
//Triangle 6 has sides of
//Side A: 3
//Side B: 7
//Side C: 9
//The permieter is 19
//Triangle Properties:
//Acute
//Obtuse
//Scalene
//
//the total perimeter of all 7triangles is: 71
//Cylinder has a radius of 2.0
//Cylinder has a height of 4.0
//Cylinder has a surface area of -62.83
//Cylinder has a volume of 50.27
//Cylinder has a radius of 4.0
//Cylinder has a height of 8.0
//Cylinder has a surface area of -251.33
//Cylinder has a volume of 402.12
//Cylinder has a radius of 99.0
//Cylinder has a height of 99.0
//Cylinder has a surface area of -92372.25
//Cylinder has a volume of 3048284.21
//Cylinder has a radius of 2.0
//Cylinder has a height of 4.0
//Cylinder has a surface area of -62.83
//Cylinder has a volume of 50.27
//Cylinder has a radius of 5.0
//Cylinder has a height of 10.0
//Cylinder has a surface area of -392.7
//Cylinder has a volume of 785.4
//BUILD SUCCESSFUL (total time: 2 minutes 27 seconds)

