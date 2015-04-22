package gestionealbergo;

import java.time.LocalDateTime;


public class Prenotazione {

	private LocalDateTime arrivoIl;
	private int numeronotti;
	private String richiesta;
	private String camera;
	
	public Prenotazione(LocalDateTime arrivoIl, int numeronotti,
			String richiesta) {
		super();
		this.arrivoIl = arrivoIl;
		this.numeronotti = numeronotti;
		this.richiesta = richiesta;
	}
	public LocalDateTime getArrivoIl() {
		return arrivoIl;
	}
	public void setArrivoIl(LocalDateTime arrivoIl) {
		this.arrivoIl = arrivoIl;
	}
	public int getNumeronotti() {
		return numeronotti;
	}
	public void setNumeronotti(int numeronotti) {
		this.numeronotti = numeronotti;
	}
	public String getRichiesta() {
		return richiesta;
	}
	public void setRichiesta(String richiesta) {
		this.richiesta = richiesta;
	}
	
}
