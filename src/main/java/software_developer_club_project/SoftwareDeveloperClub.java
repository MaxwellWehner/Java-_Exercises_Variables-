package software_developer_club_project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class SoftwareDeveloperClub {
	private ArrayList<ClubMember> clubMembersList = new ArrayList<>();

	public SoftwareDeveloperClub() {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("members.txt"));
			String line;
			int i = 0;
			while ((line = reader.readLine()) != null) {
				if(i > 0) {
					String[] lineInfo = line.split("\\*\\*");
					clubMembersList.add(new ClubMember(lineInfo[0], lineInfo[1], lineInfo[2], lineInfo[3]));
				}
				i++;
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void printClubMembers() {
		for(ClubMember cm : clubMembersList) {
			System.out.format("Member Name: %s\n", cm.getName());
			System.out.format("Location: %s\n", cm.getLocation());
			System.out.format("Favorite Language: %s\n\n", cm.getFavLang());
		}
	}
	
	public void addMember(ClubMember memToAdd) {
		clubMembersList.add(memToAdd);
	}
	
	public void removeMember(String memberName) {
		for(int i = 0; i < clubMembersList.size(); i++) {
			if(clubMembersList.get(i).getName().equals(memberName)) {
				clubMembersList.remove(i);
				break;
			}
		}
	}
}
