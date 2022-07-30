public class GreenDay extends MusicStore {
    public BandMember getGuitarist() {
        return new BandMember("Mike Dirnt", "04-05-1972", 45);
    }
    public BandMember getSinger() {
	        return new BandMember("Billie Joel Armstrong", "17-02-1972", 46);
    }
    public BandMember getDrummer() {
	        return new BandMember("Tre Cool", "09-12-1972", 45);
    }
    public Album getAlbum() {
		String[] array = {};
		return new Album("American Idiot", array);
	}
}
