package state;

class IrairaState extends DogState {
private static IrairaState s = new IrairaState();
private IrairaState() {}
public static DogState getInstance() {
return s;
}
public void tukareta(Dog moto) {
	moto.changeState(IrairaState.getInstance());
	}
public void okita(Dog moto) {

}
public void neru(Dog moto) {
moto.changeState(NeteiruState.getInstance());
}
	public void tabeta(Dog moto) {
	moto.changeState(TanoshiiState.getInstance());
	}
	public String toString() {
	return "いらいら状態";
	}
	}
