public class Blur extends MusicStore {
    public BandMember getGuitarist() {
        return new BandMember("Graham Coxon", "12-03-1969", 48);
    }
    public BandMember getSinger() {
	        return new BandMember("Damon Albarn", "23-03-1968", 49);
    }
    public BandMember getDrummer() {
	        return new BandMember("Dave Rowntree", "08-05-1964", 53);
    }
    public Album getAlbum() {
		String[] array = {"Beetlebum", "Song 2", "Country Sad Ballad Man", "M.O.R", "On Your Own", "Theme From Retro", "You're So Great", "Death of A Party", "Chinese Bombs", "I'm Just A Killer For Your Love", "Look Inside America", "Strange News From Another Star", "Movin' On", "Essex Dogs", "Dancehall"};
		return new Album("Blur ", array);
	}
}
