package state;

public class NeteiruState extends DogState{
	private static NeteiruState s = new NeteiruState();
	private NeteiruState() {}
	public static DogState getInstance() {
	return s;
	}
	public void tukareta(Dog moto) {

		}
	public void okita(Dog moto) {
		moto.changeState(FutsuuState.getInstance());
		}
	public void neru(Dog moto) {
		moto.changeState(NeteiruState.getInstance());
		}
	public void tabeta(Dog moto) {

		}
		public String toString() {
			return "寝ている状態";
			}
}
