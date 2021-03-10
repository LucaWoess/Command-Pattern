
public class Mittagessen1Befehl implements MittagessenBefehl{
	private Mittagessen1 uhrzeit;
	
	public Mittagessen1Befehl(Mittagessen1 uhrzeit) {
		this.uhrzeit = uhrzeit;
	}
	@Override
	public void anzeigen() {
		uhrzeit.anzeigen("11:30 - 12:00");
	}
}
