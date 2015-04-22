package gestionealbergo;

public class Cliente {
   private String nome;
   private String cognome;
   private String cellulare;
   private String email;
public Cliente(String nome, String cognome, String cellulare) {
	super();
	this.nome = nome;
	this.cognome = cognome;
	this.cellulare = cellulare;
	this.email=email;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getCognome() {
	return cognome;
}
public void setCognome(String cognome) {
	this.cognome = cognome;
}
public String getCellulare() {
	return cellulare;
}
public void setCellulare(String cellulare) {
	this.cellulare = cellulare;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

}
