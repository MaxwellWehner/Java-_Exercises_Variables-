package software_developer_club_project;

import java.util.Scanner;

public class ClubMemberApp {

	public static void main(String[] args) {
		SoftwareDeveloperClub club = new SoftwareDeveloperClub();
		System.out.println("Select from the following menu:\r\n"
				+ "1: Display Members\r\n"
				+ "2: Remove Member\r\n"
				+ "3: Add Member\r\n"
				+ "4: Quit");
		Scanner input = new Scanner(System.in);
		int userInt = input.nextInt();
		switch (userInt) {
		case 1: {
			club.printClubMembers();
			break;
		}
		case 2:
			input.nextLine();
			System.out.println("Enter the name of the member to remove: ");
			String memToRm = input.nextLine();
			club.removeMember(memToRm);
			club.printClubMembers();
			break;
		case 3:
			input.nextLine();
			ClubMember memToAdd = new ClubMember(); 
			System.out.println("Enter the name of the member to add: ");
			memToAdd.setName(input.nextLine());
			System.out.println("Enter the city of the member to add: ");
			memToAdd.setCity(input.nextLine());
			System.out.println("Enter the state of the member to add: ");
			memToAdd.setState(input.nextLine());
			System.out.println("Enter the favorite language of the member to add: ");
			memToAdd.setFavLang(input.nextLine());
			club.addMember(memToAdd);
			club.printClubMembers();
			break;
		case 4:
			System.out.println("Have a nice day");
			break;
		default:
			System.out.println("Have a nice day");
			break;
		}
		input.close();
	}

}
