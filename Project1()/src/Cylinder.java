
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ender
 */
import java.text.DecimalFormat;

//class cylinder - creates a cylinder object 
public class Cylinder {

    DecimalFormat fmt = new DecimalFormat("0.##");

    //counter for objects created 
    private static int objCreated;
    //hold the value of the total surface area of all the objects 
    private static double totalSurfaceArea;
    //radius and height if the cylinder used by the whole class
    private double radius, height;

    private double surfNum = 0;

    //constructor 
    //precondition: radius and height has been input and initialized by user 
    //postcondition: this objects radius and height has been assigned 
    //and is checked to be valid 
    public Cylinder(double rad, double hgt) {
        this.radius = rad;
        this.height = hgt;
        objCreated++;
        if (!isValid()) {
            this.radius = 99;
            this.height = 99;
        }

        calcSurfaceArea();
        addTotalSurfaceArea(calcSurfaceArea());
    }

    //precondition: radius and height has been assigned from the constructor 
    //and is called by the constructor
    //postconditon: returned as true as long as the radius or height is above 
    // the value of zero 
    private boolean isValid() {
        if (this.radius <= 0 || this.height <= 0) {
            return false;
        }
        return true;
    }

    //preconditon: base surface area and curved surface area has been calculated 
    //postcondition: returns the surface area of the cylinder object 
    private double calcSurfaceArea() {
        return this.calcCurvedSurfaceArea() + this.calcBaseSurfaceArea();
    }

    //precondition: radius has been assigned from the constructor 
    //returns the base surface area of the object 
    private double calcBaseSurfaceArea() {
        double BA = Math.PI * Math.pow(this.radius, 2);
        return BA;
    }

    //precondition: radius and height has been assigned from the constructor 
    //postcondition: returns the curved surface area of the object 
    private double calcCurvedSurfaceArea() {
        double CSA = 2 * Math.PI * this.radius * this.height;
        return CSA;
    }

    //precondition: radius has been assigned from the constructor 
    //postcondition: returns the volume of the object 
    private double calcVolume() {
        double vol = Math.PI * Math.pow(this.radius, 2) * this.height;
        return vol;
    }

    //precondition: total surface area has been summed and is called outside 
    //of the class
    //postcondition: adds the current objects SA to the accum for the total surface area  
    private void addTotalSurfaceArea(double surfaceArea) {
        totalSurfaceArea += surfaceArea;

    }

    //precondition: cylinder is valid and method is called from outside of 
    //the class as well as a cylinder object is passed in as arguments
    //returns true or false if the two objects surface area are equal to one another 
    private boolean equals(Cylinder c) {
        if (this.calcSurfaceArea() == c.calcSurfaceArea()) {
            System.out.println("Equal");
            return true;

        } else if (this.calcSurfaceArea() == c.calcSurfaceArea()) {
            System.out.println("not equal");
            return false;
        }
        return this.calcSurfaceArea() == c.calcSurfaceArea();
    }

    //precondition: this objects surface area has been calculated 
    //and total surface area has been summed up 
    public double reduceTotalSurfaceArea() {
        Double SA = this.calcSurfaceArea();

        surfNum = surfNum - SA;
        return surfNum;
    }

    //precondition: all of the objects have been crated by the user 
    //postconditon: returns the total of the objects created 
    public int getObjCreated() {
        return objCreated;
    }

    //precondition: all of the surface areas have been calculated and added up 
    //postcondition: returns the total surface area 
    public double getTotalSA() {
        return totalSurfaceArea;
    }

    //preconditon: this objects height has been assigned from the constructor 
    //postcondition: returns this objects height 
    public double getHeight() {
        return this.height;
    }

    //precondition: this objects radius has been assigned from the constructor 
    //postcondition: return the radius of this object 
    public double getRadius() {
        return this.radius;
    }

    //precondition: none
    //postcondition: overridded method of twostring 
    public String toString() {

        return "Cylinder " + "has a radius of "
                + this.getRadius()
                + "\nCylinder " + "has a height of "
                + this.getHeight()
                + "\nCylinder " + "has a surface area of "
                + fmt.format(this.reduceTotalSurfaceArea())
                + "\nCylinder has a volume of "
                + fmt.format(this.calcVolume());

    }
}
