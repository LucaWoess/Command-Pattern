
public class Mittagessen2Befehl implements MittagessenBefehl{
	private Mittagessen2 uhrzeit;
	
	public Mittagessen2Befehl(Mittagessen2 uhrzeit) {
		this.uhrzeit = uhrzeit;
	}
	@Override
	public void anzeigen() {
		uhrzeit.anzeigen("12:00 - 12:30");
	}
}
