/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ender
 */
//class triangle - creates a triangle object 
public class Triangle {

    //counter for objects created 
    private static int objCreated;
    //holds the total perim for all triangle objects 
    private static int perimTotal;
    //three sides of the triangle 
    private int side1, side2, side3;

    //constructor 
    //precondition: all sides have been input and initialized
    //postcondition: this objects sides have been assigned and triangle is valid 
    public Triangle(int s1, int s2, int s3) {
        this.side1 = s1;
        this.side2 = s2;
        this.side3 = s3;
        objCreated++;
        if (!isValid()) {
            this.side1 = 1;
            this.side2 = 1;
            this.side3 = 1;
        }
        calcPerim();
        addTotalPerim(calcPerim());
    }

    //precondition: sides have been input from constructor 
    //postcondition: traiangle is valid if all sides are above the value of 0
    // and if two smallest sides are greater than the third 
    private boolean isValid() {
        if (this.side1 <= 0 || this.side2 <= 0 || this.side3 <= 0) {
            return false;
        }
        if (((this.side1 + this.side2) <= this.side3)
                || ((this.side1 + this.side3) <= this.side2)
                || ((this.side2 + this.side3) <= this.side1)) {
            return false;
        }
        return true;
    }

    //precondition: triangle must be valid and method must be called from 
    //the constructor 
    //postcondition: perimeter is calculated from adding all three sides together 
    private int calcPerim() {
        return this.side1 + this.side2 + this.side3;
    }

    //precondition: the base perimeter of this onject must be calculated
    //then method must be called from constructor after passing in calcPerim() as 
    //only argument 
    //postcondition: adds this objects perimeter to the total perimeter 
    private void addTotalPerim(int perimeter) {
        perimTotal += perimeter;
    }

    //precondition: triangle is valid and method is called from outside of the 
    //class to check if triangle is a valid right triangle 
    //postconditon: triangle is returned as not right if the sum squared of the two sides
    //are not equal to the square of the third
    public boolean isRight() {

        if (((Math.pow(this.side1, 2) + Math.pow(this.side2, 2)) == Math.pow(this.side3, 2))
                || ((Math.pow(this.side2, 2) + Math.pow(this.side3, 2)) == Math.pow(this.side1, 2))
                || ((Math.pow(this.side1, 2) + Math.pow(this.side3, 2)) == Math.pow(this.side2, 2))) {
            System.out.println("Right");
            return true;
        }

        return false;
    }

    //precondition: triangle is valid and method is called from outside of the 
    //class
    //postcondition: triangle is returned as false if the sum squared of the two 
    //sides are not greater than the third side squared 
    public boolean isAcute() {

        if (Math.pow(this.side1, 2) + Math.pow(this.side2, 2) > Math.pow(this.side3, 2)
                || Math.pow(this.side2, 2) + Math.pow(this.side3, 2) > Math.pow(this.side1, 2)
                || Math.pow(this.side1, 2) + Math.pow(this.side3, 2) > Math.pow(this.side2, 2)) {
            System.out.println("Acute");
            return true;
        }

        return false;
    }

    //precondition: triangle is valid and method is called from outside of the 
    //class
    //postcondition:triangle is retured as false if the sum squared of the two sides 
    //is less than the sum squared of the third 
    public boolean isObtuse() {
        if (Math.pow(this.side1, 2) + Math.pow(this.side2, 2) < Math.pow(this.side3, 2)
                || Math.pow(this.side2, 2) + Math.pow(this.side3, 2) < Math.pow(this.side1, 2)
                || Math.pow(this.side1, 2) + Math.pow(this.side3, 2) < Math.pow(this.side2, 2)) {
            System.out.println("Obtuse");
            return true;
        }

        return false;
    }

    //precondition: triangle is valid and method is called from outside of the
    //class
    //postconditon: triangle is returned as false if any sides of the triangle 
    //are equal to another 
    public boolean isScalene() {
        if (this.side1 != this.side2
                && this.side2 != side3
                && this.side1 != side3) {
            System.out.println("Scalene");
            return true;
        }

        return false;
    }

    //precondition: triangle is valid and method is called from outside of the 
    //class
    //postcondition: triangle returns as true if any of the sides of the triangle 
    //are equal to another 
    public boolean isIsosceles() {
        if (this.side1 == this.side2
                || this.side2 == side3
                || this.side1 == side3) {
            System.out.println("Isosceles");
            return true;
        }

        return false;
    }

    //precondition: triangle is valid and method is called from outside of the \
    //class
    //postcondition: triangle returns as true if any of the sides of the triangle 
    //are equal to another
    public boolean isEquilateral() {
        if (this.side1 == this.side2
                && this.side2 == this.side3
                && this.side1 == this.side3) {
            System.out.println("Equilateral");
            return true;
        }

        return false;
    }

    //precondition: triangle is valid and method is called from outside of the 
    //class and another triangle object is passed is as the parameter 
    //postcondition: returns true or false if one triangle object perimeter is equal 
    //to the other 
    public boolean equals(Triangle t) {
        return this.calcPerim() == t.calcPerim();
    }

    //precondition: totalperimeter is summed up
    //postconditon: returns the objects perimeter after 
    //subtracting the totalPerim from this objects Perim
    public int reduceTotalPerim() {
        return perimTotal -= this.calcPerim();
    }

    //precondition: totalPerim is summed up 
    //postcondition: returns the totalPerimeter
    public int getTotalPerim() {
        return perimTotal;
    }

    //precondition: all objects have been created from the user input
    //postcondition: returns the total objects created
    public int getObjCreated() {
        return objCreated;
    }

    //precondition: side has been assigned from the constructor 
    //postcondition: returns this objects side 
    public int getSideOne() {
        return this.side1;
    }

    //precondition: side has been assigned from the constructor 
    //postcondition: returns this objects side 
    public int getSideTwo() {
        return this.side2;
    }

    //precondition: side has been assigned from the constructor 
    //postcondition: returns this objects side 
    public int getSideThree() {
        return this.side3;
    }

    //precondition: none 
    //postconditon: default toString method is overridden 
    public String toString() {

        return "\nSide A: " + this.getSideOne()
                + "\nSide B: " + this.getSideTwo()
                + "\nSide C: " + this.getSideThree()
                + "\nThe permieter is " + this.calcPerim()
                + "\nTriangle Properties:";
    }
}
