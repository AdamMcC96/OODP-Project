public class Nirvana extends MusicStore {
    public BandMember getGuitarist() {
        return new BandMember("Krist Novoselic", "16-05-1965", 52);
    }
    public BandMember getSinger() {
	        return new BandMember("Kurt Cobain", "20-02-1967", 27);
    }
    public BandMember getDrummer() {
	        return new BandMember("Dave Grohl", "14-01-1969", 49);
    }
    public Album getAlbum() {
		String[] array = {"Smells Like Teen Spirit", "In Bloom", "Come As You Are", "Breed", "Lithium", "Polly", "Territorial Pissings", "Drain You", "Lounge Act", "Stay Away", "On A Plain", "Something In The Way", "Endless Nameless"};
		return new Album("Nevermind", array);
	}
}
