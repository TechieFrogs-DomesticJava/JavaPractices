interface Shapes {
  public boolean fitsText(String message);
}

class Circle implements Shapes {
  int radius;
  String color;
  
  // constructor would go here
  
  public boolean fitsText(String message) {
    return message.length() < (2 * this.radius);
  }

}

class Rectangle implements Shapes {
  int length;
  int width;
  String color;
  
  // constructor would go here
  
  public boolean fitsText(String message) {
    return message.length() < this.width;
  }
  
}

class Sign {
  Shapes shape;
  String text;
  
  // constructor would go here

}