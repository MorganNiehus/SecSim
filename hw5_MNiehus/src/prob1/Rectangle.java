package prob1;

public class Rectangle extends GeometricObject {
  private double width;
  private double height;


  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
    
    // Write your code to check on area and throw exception here...
    
    
    
<<<<<<< HEAD
    
  }
=======
  }
    
>>>>>>> 633fab66122e815a182996ff138fc36a7b3a9d19

  /** Return width */
  public double getWidth() {
    return width;
  }

  /** Set a new width */
  public void setWidth(double width) {
    this.width = width;
  }

  /** Return height */
  public double getHeight() {
    return height;
  }

  /** Set a new height */
  public void setHeight(double height) {
    this.height = height;
  }

  @Override /** Return area */
  public double getArea() {
    return width * height;
  }

  @Override /** Return perimeter */
  public double getPerimeter() {
    return 2 * (width + height);
  }

  @Override 
  public String toString() {
    // Implement it to return the three sides
    return "Rectangle: width = " + width + ", height = " + height;
  }  
<<<<<<< HEAD
}
=======
}
>>>>>>> 633fab66122e815a182996ff138fc36a7b3a9d19
