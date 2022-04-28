package core_java_oop_library_users;

public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		LibraryUser kid1 = new KidUser(10, "Kids");
		kid1.registerAccount();
		kid1.requestBook();

		LibraryUser kid2 = new KidUser(18, "Fiction");
		kid2.registerAccount();
		kid2.requestBook();
		
		LibraryUser adult1 = new AdultUser(5, "Kids");
		adult1.registerAccount();
		adult1.requestBook();

		LibraryUser adult2 = new AdultUser(23, "Fiction");
		adult2.registerAccount();
		adult2.requestBook();

	}

}
