package state;

public class Dog {
	private DogState myState;
	public Dog() {
	myState = TanoshiiState.getInstance();
	}
	public void roudou() {
	myState.tukareta(this);
	}
	public void shokuji() {
	myState.tabeta(this);
	}
	public void okita() {
	myState.okita(this);
	}
	public void neru() {
	myState.neru(this);
	}
	public void changeState(DogState d) {
		myState = d;
		}
		public void print() {
		System.out.print("現在、わたしは「");
		System.out.print( myState.toString() );
		System.out.println("」です。");
		}

}
