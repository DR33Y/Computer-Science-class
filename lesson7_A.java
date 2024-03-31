/Point Class
  public class Point {
  	private int _x;
  	private int _y;
  	public Point(int x, int y) {
  		_x = x;
  		_y = y;
  	}
  	public void move(int deltaX, int deltaY) {
  		_x += deltaX;
  		_y += deltaY;
  	}
  	public void printStatus() {
  		System.out.println("("+_x+","+_y+")");
  	}
  }

  public class Tester {
  	public static void main(String[] args) {
  		Point p1 = new Point(1,1);
      Point p2 = new Point(2,2);
      p1.printStatus();
      p1.move(1,1);
      p1.printStatus();
      p2.printStatus();
      p2.move(1,1);
      p2.printStatus();
    }
  }

//ArithmeticProgression
