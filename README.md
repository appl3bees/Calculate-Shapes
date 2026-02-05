# Calculate-Shapes  
**CSC122 – Project #1 (Fall 2022)**

This was my final project for **Computer Science 1**.

> *Considering how old this project is, I still feel very proud of it. There are countless ways it could be improved, but from a basic standpoint it’s clean, and the flow of the code is solid, in my opinion.  
>  
> It’s been a while since I last programmed like this, and making this old project my first commit to GitHub made me want to seriously get back into programming. I miss it—and I love it.*

---

## Project Overview

This project focuses on applying object-oriented programming principles by designing reusable and extensible classes to model geometric shapes.

### Student Learning Outcomes
- Identify objects associated with a stated problem and design classes demonstrating:
  - Encapsulation
  - Data abstraction
  - Information hiding
- Organize programs using separate declaration, definition, and usage files
- Develop applications designed for reuse and extensibility using best software engineering practices

---

## Problem Statement

Implement three classes:

- **Triangle**
- **Cylinder**
- **ShapesDemo** (driver class that interfaces with Triangle and Cylinder)

---

## Class: Triangle

### Description
A `Triangle` represents a geometric triangle defined by three sides.

### Requirements
- Stores three integer side lengths
- Tracks:
  - Total number of Triangle objects created
  - Sum of all Triangle perimeters (static accumulator)
- Constructor:
  - Accepts three integers
  - Resets sides to `1` if the triangle is invalid
  - Increments object count
  - Calculates and accumulates perimeter

### Boolean Methods
- `isRight()`
- `isAcute()`
- `isObtuse()`
- `isScalene()`
- `isIsosceles()`
- `isEquilateral()`
- `isValid()`
- `equals(Triangle t)` (compares perimeters)

### Additional Methods
- `toString()`
- `calcPerim()`
- `addTotalPerim()`
- `reduceTotalPerim()`
- Accessors for all properties

**Note:** Triangle sides may be entered in any order.

---

## Triangle Classification Rules

### Right Triangle
1. Square all sides
2. Add squares of the two smallest sides
3. Compare to square of the largest side
4. If equal → right triangle

### Acute Triangle
- Sum of squares of smaller sides **greater than** square of largest side

### Obtuse Triangle
- Sum of squares of smaller sides **less than** square of largest side

---

## Class: Cylinder

### Description
A `Cylinder` represents a 3D solid composed of two circular bases and one curved surface.

### Requirements
- Stores:
  - Radius
  - Height
- Tracks:
  - Total number of Cylinder objects
  - Total surface area of all Cylinders (static accumulator)
- Constructor:
  - Accepts radius and height as doubles
  - Sets values to `99` if invalid
  - Increments object count
  - Calculates and accumulates surface area

### Boolean Methods
- `isValid()`
- `equals(Cylinder c)` (compares surface areas)

### Additional Methods
- `toString()`
- `calcCurvedSurfaceArea()`
- `calcBaseSurfaceArea()`
- `calcSurfaceArea()`
- `addTotalSurfaceArea()`
- `reduceTotalSurfaceArea()`
- Accessors for all properties

---

## Class: ShapesDemo

### Responsibilities
- Drives the application
- Manages dynamic arrays of:
  - `Triangle` objects
  - `Cylinder` objects
- Handles all user input and output

### Program Flow
1. Prompt user to choose shape type
2. Accept shape dimensions
3. Instantiate objects
4. Store objects in arrays
5. After input completes:
   - Print properties and calculations for each object
   - Test equality methods
   - Print total perimeters and surface areas

Output is required to be **clearly labeled, aligned, and well spaced**.

---

## Diagrams & References

- **UML Diagram:**  
  https://imgur.com/a/hSapOhV

- **Equals Method Requirements:**  
  https://imgur.com/a/YQWAO3g

---

## Assessment Rubric Summary

### Categories
- Test Plan (10 pts)
- Documentation (25 pts)
- Class Organization & Structure (15 pts)
- Methodology (40 pts)
- Output Correctness & Formatting (10 pts)

---

## Related Documentation
- Detailed program output and verification can be found in [`OUTPUT.md`](OUTPUT.md)
