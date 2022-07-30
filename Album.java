public class Album {
    private String name;
    private String[] tracks;
    public Album(String aname, String[] atracks) {
        name = aname;     //save name
        tracks = atracks;
    }
    public String getName() {
        return name;
    }
    public String[] getTracks() {

		return tracks;

	}
}

