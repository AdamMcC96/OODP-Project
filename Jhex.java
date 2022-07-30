public class Jhex extends MusicStore {
    public BandMember getGuitarist() {
        return new BandMember("Noel Redding", "25-12-1945", 57);
    }
    public BandMember getSinger() {
	        return new BandMember("Jimi Hendrix", "27-11-1942", 27);
    }
    public BandMember getDrummer() {
	        return new BandMember("Mitch Mitchell", "09-07-1946", 62);
    }
    public Album getAlbum() {
		String[] array = {"And The Gods Made Love", "Have You Ever Been (To Electric Ladyland", "Crosstown Traffic", "Voodoo Chile", "Little Miss Strange", "Long Hot Summer Night", "Come On (Let The Good Times Roll)", "Gipsy Eyes", "Burning of The Midnight Lamp", "Rainy Day, Dream Away", "1983... (A Merman I Should Turn To Be", "Moon, Turn The Tides... Gently Gently Away", "Still Raining, Still Dream", "All Along The Watchtower", "Voodoo Child (Slight Return)"};
		return new Album("Electric Ladyland", array);

	}
}
