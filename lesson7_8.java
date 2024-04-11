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
		ArithmeticProgression ap1 = new ArithmeticProgression(2,2);
		ArithmeticProgression ap2 = new ArithmeticProgression(ap1);
		System.out.println(ap1);
		int an = ap1.memberCalculation(6);
		System.out.println(an);
		int n = ap1.calculateN(4);
		System.out.println(ap1.calculateN(4));
		boolean new_series = ap2.equal(ap1);
		System.out.println(new_series);
		boolean small_diff = ap2.smalLDiff(ap1);
		System.out.println(small_diff);
		
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
	public ArithmeticProgression(ArithmeticProgression other) {
		_fM = other._fM;
		_diff = other._diff;
	}
	
	public void printGeneralSeries() {
		System.out.println("an = "+_fM+"+(n-1)*"+_diff);
	}
	public int memberCalculation(int n) {
		return _fM+(n-1)*_diff;
	}
	public int calculateN(int an) {
		double n;
		n = (double)((an-_fM)/_diff)+1;
		if (n%2 == 0)
			return (int)n;
		else 
			return 0;
	}
	
	public String toString() {
		return ("an = "+_fM+"+(n-1)*"+_diff);
	}
	
	public boolean equal(ArithmeticProgression other) {
		if(other._fM == _fM && other._diff == _diff)
			return true;
		else
			return false;
	}
	
	public boolean smalLDiff(ArithmeticProgression other) {
		if(other._diff == _diff) 
			return true;
		else
			return false;
	}
	
	public int getDiff() {
		return _diff;
	}
	public int getfM() {
			return _fM;
		}
	public void setDiff(int diff) {
		_diff = diff;
	}
	public void setfM(int fM) {
		_fM = fM;
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

//Student
   public class Student {
	private String _name;
	private String _lastName;
	private int _id;
	public Student(String name, String lastName, int id) {
		_name = name;
		_lastName = lastName;
		_id = id;
	}
	
	public String toString() {
		return ("Student first name: "+_name+"\nStudent last name: "+_lastName+"\nStudent id: "+_id);
	}
    }

    public class Tester {
  	public static void main(String[] args) {
  		Student s1 = new Student("Daniel","Ross",1234);
  		System.out.println(s1);
  	}
    }  

//Book
    public class Book {
	private String _name;
	private String _author;
	private int _categoryNumber;
	public Book(String name, String author, int categoryNumber) {
		_name = name;
		_author = author;
		_categoryNumber = categoryNumber; 
	}
	
	public String toString() {
		return ("Book name: "+_name+"\nAuthor name: "+_author+"\nBook category number: "+_categoryNumber);
	}
    }

    public class Tester {
  	public static void main(String[] args) {
  		Book b1 = new Book("Daniel","Story",2);
  		System.out.println(b1);
  	}	
    } 

