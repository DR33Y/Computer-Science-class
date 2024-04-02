//Point Class
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
  public class ArithmeticProgression {
  	private int _fM;
  	private int _diff;
  	public ArithmeticProgression(int fM, int diff) {
  		_fM = fM;
  		_diff = diff;
  	}
  	public void printGeneralSeries() {
  		System.out.println("an = "+_fM+"+(n-1)*"+_diff);
  	}
  	public int memberCalculation(int n) {
  		return _fM+(n-1)*_diff;
  	}
  	public int calculateN(int an) {
  		int n = ((an-_fM)/_diff)+1;
  		if(an/n == _diff)
  			return n;
  		else
  			return 0;
  		
  	}
  }

  public class Tester {
	public static void main(String[] args) {
		ArithmeticProgression ap1 = new ArithmeticProgression(2,2);
		ap1.printGeneralSeries();
		int an = ap1.memberCalculation(6);
		System.out.println(an);
		int n = ap1.calculateN(an);
		System.out.println(n);
		
	}
}

