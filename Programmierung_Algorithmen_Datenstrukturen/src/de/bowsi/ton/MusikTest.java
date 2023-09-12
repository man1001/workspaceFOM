package de.bowsi.ton;

public class MusikTest {
	public static void main(String[] args) {
		
		// Erzeugen von Musikabspielgeraeten und Uebergabe von Tontraegern
		Musikabspielgeraet schallplattenSpieler = new SchallplattenSpieler();
		schallplattenSpieler.hoeren(new LP("Jimmi Hendrix"));
		
		// Erzeugen eines CD
		Musikabspielgeraet cdPlayer = new CDPlayer();
		cdPlayer.hoeren(new CD("The Beatles"));
		cdPlayer.hoeren(new LP("Jimmi Hendrix"));
		
		// Erzeugen eines MP3Players
		Musikabspielgeraet mp3Player = new MP3Player();
		mp3Player.hoeren(new Kassette("Benjamin Blümchen"));
		mp3Player.hoeren(new MP3("ACDC"));
		
		// Kassette erzeugen
		Musikabspielgeraet kassetenRekorder = new KassettenRekorder();
		kassetenRekorder.hoeren(new Kassette("Benjamin Blümchen"));
		kassetenRekorder.hoeren(new MP3("ACDC"));
		
		
	}
}
