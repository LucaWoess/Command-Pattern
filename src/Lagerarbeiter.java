
public class Lagerarbeiter {
	private MittagessenBefehl meBefehl;

	public void setMittagessenBefehl(MittagessenBefehl meBefehl) {
		this.meBefehl = meBefehl;
	}

	public void mittagessenAnzeigen() {
		meBefehl.anzeigen();
	}
}
