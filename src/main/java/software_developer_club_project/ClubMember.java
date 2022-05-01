package software_developer_club_project;

public class ClubMember {
	String name;
	String city;
	String state;
	String favLang;

	public ClubMember(String name, String city, String state, String favLang) {
		this.name = name;
		this.city = city;
		this.state = state;
		this.favLang = favLang;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getFavLang() {
		return favLang;
	}

	public void setFavLang(String favLang) {
		this.favLang = favLang;
	}
	
	public String getLocation() {
		return city + ", " + state;
	}
}
