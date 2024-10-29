public class Triangle {
  private double sideSmall;
  private double sideMedium;
  private double sideLarge;

  public Triangle(double side1,double side2,double side3) { // 6 possible combinations considering greatest to least
      if ((side1 > side2) && (side1 < side3)) { // for format side2 < side1 < side3
          sideSmall = side2;
          sideMedium = side1;
          sideLarge = side3;
      } else if ((side1 > side3) && (side1 < side2)) { // for format side3 < side1 < side2
          sideSmall = side3;
          sideMedium = side1;
          sideLarge = side2;
      } else if ((side2 > side1) && (side2 < side3)) { // for format side1 < side2 < side3
          sideSmall = side1;
          sideMedium = side2;
          sideLarge = side3;
      } else if ((side2 > side3) && (side2 < side1)) { // for format side3 < side2 < side1
          sideSmall = side3;
          sideMedium = side2;
          sideLarge = side1;
      } else if ((side3 > side1) && (side3 < side2)) { // for format side1 < side3 < side2
          sideSmall = side1;
          sideMedium = side3;
          sideLarge = side2;
      } else { // for all other formats: side2 < side3 > side1
          sideSmall = side2;
          sideMedium = side3;
          sideLarge = side1;

      }
  }
  public Triangle(){ // default constructor
      sideSmall = 3.0;
      sideMedium = 4.0;
      sideLarge = 5.0;
  }
  public boolean isTriangle(){ // returns true if the sum of the 2 smallest sides are greater than the largest side
      if ((sideSmall + sideMedium) > sideLarge){
          return true;
      }
      return false;
  }
  public boolean isRightTriangle(){ // returns boolean true if the triangle is a right triangle
      if ((sideSmall*sideSmall) + (sideMedium*sideMedium) == (sideLarge*sideLarge)){
          return true;
      }
  return false;
  }
  public double perimeter(){ //returns the perimeter of the triangle
      double sum;
      sum = sideSmall + sideMedium + sideLarge;
      return sum;
  }
  public double area(){ //returns area of the triangle using herons method
      double p = (perimeter() / 2);
      double area = Math.sqrt(p * (p - sideSmall) * (p - sideMedium) * (p - sideLarge));
      return area;
  }
  // getter methods:
  public double getSideSmall(){
      return sideSmall;
  }
  public double getSideMedium(){
      return sideMedium;
  }
  public double getSideLarge(){
      return sideLarge;
  }

  public String displayTriangle(){
      return "Smallest Side: " + sideSmall + "\nMedium Side: " + sideMedium +"\nLargest Side: " + sideLarge;
  }
}