public class BandMember {

    private String name;
    private String dob;
    private int age;

    public BandMember(String bname, String bdob, int bage) {
        name = bname;
        dob = bdob;
        age = bage;
    }
    public String getName() {
        return name;
    }
    public String getDob() {
		return dob;
	}
	public int getAge() {
		return age;
	}
}

