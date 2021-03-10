
public class Mittagessen3Befehl implements MittagessenBefehl{
	private Mittagessen3 uhrzeit;
	
	public Mittagessen3Befehl(Mittagessen3 uhrzeit) {
		this.uhrzeit = uhrzeit;
	}
	@Override
	public void anzeigen() {
		uhrzeit.anzeigen("12:30 - 13:00");
	}
}
