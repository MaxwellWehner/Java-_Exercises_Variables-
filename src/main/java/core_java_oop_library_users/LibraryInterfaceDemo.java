package core_java_oop_library_users;

public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		LibraryUser kid1 = new KidUser(10, "Kids");
		kid1.registerAccount();
		kid1.requestBook();

		LibraryUser kid2 = new KidUser(18, "Fiction");
		kid2.registerAccount();
		kid2.requestBook();

	}

}
