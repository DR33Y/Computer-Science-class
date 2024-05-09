public class Tester{
	public static int f1(String[] arr, int num) {
		int i;
		int sum=0;
		
		for(i=0; i<arr.length; i++) {
			if(arr[i].length() == num)
				sum++;
		}
		return sum;
	}
	
	public static int f2(int[] arr, int num) {
		int i;
		int sum=0;
		
		for(i=0; i<arr.length; i++) {
			sum += arr[i];
			if(sum > num)
				return i;
		}
		return -1;
	}
	
	public static void main(String[] args) {	
		// Game class test
		Game g1 = new Game("Ross",5,12);
		Game g2 = new Game(g1);
		System.out.println("g1:\n"+g1);
		System.out.println("g2(g1 copy):\n"+g2);
		System.out.println(g1.equal(16));
		
		// Time class test
		Time t1 = new Time(1,7);
		System.out.println(t1);
	}
}


public class Game {
	private String _nameGame;
	private int _numPlayers;
	private int _minAge;
	
	public Game(String nameGame, int numPlayers, int minAge) {
		_nameGame = nameGame;
		_numPlayers = numPlayers;
		_minAge = minAge;
	}
	public Game(Game other) {
		_nameGame = other._nameGame;
		_numPlayers = other._numPlayers;
		_minAge = other._minAge;
	}
	
	public boolean equal(int age) {
		if (age >= _minAge)
			return true;
		else
			return false;
	}
	
	public String toString() {
		return ("Game name: "+_nameGame+"\nPlayers number: "+_numPlayers+"\nMinimum age: "+_minAge);
	}
	
	// get and set functions
	public String getGameName() {
		return _nameGame;
	}
	public int getPlayersNum() {
		return _numPlayers;
	}
	public int getminAge() {
		return _minAge;
	}
	public void setGameName(String nameGame) {
		_nameGame = nameGame;
	}
	public void setPlayernum(int numPlayers) {
		_numPlayers = numPlayers;
	}
	public void setMinAge(int minAge) {
		_minAge= minAge;
	}
}


public class Time {
	private int _hour;
	private int _minute;
	
	public Time(int hour, int minute) {
		if(hour > 23 || hour < 0)
			_hour = -1;
		else
			_hour = hour;
		
		if(minute > 59 || minute < 0)
			_minute = -1;
		else
			_minute = minute;
	}
	
	public String toString() {
		if(_hour == -1 && _minute == -1)
			return (_hour+":"+_minute);
		else if(_hour < 10 && _minute < 10)
			return ("0"+_hour+":0"+_minute);
		else if(_minute < 10)
			return (_hour+":0"+_minute);
		else if(_hour < 10)
			return ("0"+_hour+":"+_minute);
		else
			return (_hour+":"+_minute);
	}
	
	// get and set functions
	public int getHour() {
		return _hour;
	}
	public int getMinute() {
		return _minute;
	}
	public void setHour(int hour) {
		_hour = hour;
	}
	public void setMinute(int minute) {
		_minute = minute;
	}
}
