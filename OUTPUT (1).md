# Project Output & Requirement Verification

This document presents the program output for **CSC122 – Project #1 (Fall 2022)** and explains how the output satisfies the assignment requirements. The output shown is based on the instructor-provided test run data and demonstrates correct functionality, validation, and formatting.

---

## Program Execution Overview

The application allows the user to dynamically create **Triangle** and **Cylinder** objects via console input. Objects are stored in resizable arrays and evaluated after input is complete. The program then reports detailed properties, calculated values, and aggregate totals.

The program follows the required flow:
- User selects a shape type (Triangle or Cylinder)
- Inputs required dimensions
- Objects are validated, instantiated, and stored
- Properties and calculations are printed in a formatted report

---

## Triangle Output

For each Triangle object created, the following information is displayed:
- Side lengths (A, B, C)
- Calculated perimeter
- Triangle classification properties:
  - Right / Acute / Obtuse
  - Scalene / Isosceles / Equilateral

### Validation Behavior
- If invalid side lengths are entered (negative values or values that do not form a valid triangle), all sides are reset to **1** as required.
- The triangle validation rules correctly enforce the triangle inequality theorem.
- Side order does not affect triangle classification.

### Observations
- Triangle `3-4-5` is correctly identified as **Right** and **Scalene**.
- Invalid triangles are safely corrected and classified as **Equilateral (1,1,1)**.
- All valid triangle types are detected correctly.

---

## Triangle Aggregates & Equality Testing

- The **total perimeter of all Triangle objects** is accumulated and printed.
- The `equals()` method compares Triangle objects by perimeter.

**Results:**
- Triangle 3 and Triangle 4 are equal.
- Triangle 2 and Triangle 6 are not equal.

---

## Cylinder Output

For each Cylinder object created, the following information is displayed:
- Radius
- Height
- Calculated surface area
- Calculated volume

### Validation Behavior
- If a radius or height is zero or negative, both values are set to **99** as required.
- Invalid input does not interrupt program execution.

### Calculations
- Curved surface area
- Base surface area
- Total surface area

All values are calculated using the required formulas and displayed with consistent numeric formatting.

---

## Cylinder Aggregates & Equality Testing

- The **total surface area of all Cylinder objects** is accumulated and printed.
- The `equals()` method compares Cylinder objects by total surface area.

**Results:**
- Cylinders 1 and 4 are equal.
- Cylinders 4 and 5 are not equal.

---

## Output Formatting & Readability

The output:
- Is clearly labeled and logically grouped.
- Separates Triangle and Cylinder results.
- Matches the instructor-provided sample output.
- Is spaced for readability and easy verification.

This satisfies the rubric requirement that output be **correct, labeled, aligned, and neatly formatted**.

---

## Full Test Run

### User Input

```text
Create a Shape
Enter 1 for cylinder or 2 for a triangle
1. Cylinder
2. Triangle
2
Enter an integer dimension for side a of triangle 1: 3
Enter an integer dimension for side b of triangle 1: 4
Enter an integer dimension for side c of triangle 1: 5
Do you wish to process another shape?
y

Create a Shape
Enter 1 for cylinder or 2 for a triangle
1. Cylinder
2. Triangle
2
Enter an integer dimension for side a of triangle 2: 4
Enter an integer dimension for side b of triangle 2: 4
Enter an integer dimension for side c of triangle 2: 5
Do you wish to process another shape?
y

Create a Shape
Enter 1 for cylinder or 2 for a triangle
1. Cylinder
2. Triangle
1
Enter the radius for Cylinder 1 as a double:
2
Enter the height for Cylinder 1 as a double:
4.0
Do you wish to process another shape?
y

Create a Shape
Enter 1 for cylinder or 2 for a triangle
1. Cylinder
2. Triangle
1
Enter the radius for Cylinder 2 as a double:
4.0
Enter the height for Cylinder 2 as a double:
8.0
Do you wish to process another shape?
y

Create a Shape
Enter 1 for cylinder or 2 for a triangle
1. Cylinder
2. Triangle
2
Enter an integer dimension for side a of triangle 3: 1
Enter an integer dimension for side b of triangle 3: 1
Enter an integer dimension for side c of triangle 3: 2
Do you wish to process another shape?
y

Create a Shape
Enter 1 for cylinder or 2 for a triangle
1. Cylinder
2. Triangle
2
Enter an integer dimension for side a of triangle 4: -3
Enter an integer dimension for side b of triangle 4: 4
Enter an integer dimension for side c of triangle 4: 5
Do you wish to process another shape?
y

Create a Shape
Enter 1 for cylinder or 2 for a triangle
1. Cylinder
2. Triangle
1
Enter the radius for Cylinder 3 as a double:
-2
Enter the height for Cylinder 3 as a double:
-4
Do you wish to process another shape?
y

Create a Shape
Enter 1 for cylinder or 2 for a triangle
1. Cylinder
2. Triangle
1
Enter the radius for Cylinder 4 as a double:
2
Enter the height for Cylinder 4 as a double:
4
Do you wish to process another shape?
y

Create a Shape
Enter 1 for cylinder or 2 for a triangle
1. Cylinder
2. Triangle
2
Enter an integer dimension for side a of triangle 5: 5
Enter an integer dimension for side b of triangle 5: 6
Enter an integer dimension for side c of triangle 5: 7
Do you wish to process another shape?
y

Create a Shape
Enter 1 for cylinder or 2 for a triangle
1. Cylinder
2. Triangle
2
Enter an integer dimension for side a of triangle 6: 3
Enter an integer dimension for side b of triangle 6: 7
Enter an integer dimension for side c of triangle 6: 9
Do you wish to process another shape?
y

Create a Shape
Enter 1 for cylinder or 2 for a triangle
1. Cylinder
2. Triangle
1
Enter the radius for Cylinder 5 as a double:
5.0
Enter the height for Cylinder 5 as a double:
10.0
Do you wish to process another shape?
n```

### Program Output

```text
================================
Triangles
================================

Triangle 1 has sides of:
Side A: 3
Side B: 4
Side C: 5
The perimeter is 12
Triangle Properties:
  - Right Triangle
  - Scalene


Triangle 2 has sides of:
Side A: 4
Side B: 4
Side C: 5
The perimeter is 13
Triangle Properties:
  - Acute
  - Isosceles


Triangle 3 has sides of:
Side A: 1
Side B: 1
Side C: 1
The perimeter is 3
Triangle Properties:
  - Acute
  - Equilateral


Triangle 4 has sides of:
Side A: 1
Side B: 1
Side C: 1
The perimeter is 3
Triangle Properties:
  - Acute
  - Equilateral


Triangle 5 has sides of:
Side A: 5
Side B: 6
Side C: 7
The perimeter is 18
Triangle Properties:
  - Acute
  - Scalene


Triangle 6 has sides of:
Side A: 3
Side B: 7
Side C: 9
The perimeter is 19
Triangle Properties:
  - Obtuse
  - Scalene


The total perimeter of all 6 triangles is: 68

My test for equals method
  - Triangle 3 and 4 are equal
  - Triangle 2 and 6 are not equal


================================
Cylinders
================================

Cylinder 1:
  Radius: 2
  Height: 4
  Surface Area: 75.4
  Volume: 50.27


Cylinder 2:
  Radius: 4
  Height: 8
  Surface Area: 301.59
  Volume: 402.12


Cylinder 3:
  Radius: 99
  Height: 99
  Surface Area: 123163
  Volume: 3048284.21


Cylinder 4:
  Radius: 2
  Height: 4
  Surface Area: 75.4
  Volume: 50.27


Cylinder 5:
  Radius: 5
  Height: 10
  Surface Area: 471.24
  Volume: 785.4


Total surface area for all 5 cylinders is: 124086.63

My test for equals method
  - Cylinders 4 and 5 are not equal
  - Cylinders 1 and 4 are equal

```
