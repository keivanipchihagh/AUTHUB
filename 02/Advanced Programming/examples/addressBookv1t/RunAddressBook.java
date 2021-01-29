package exception.addressBookv1t;

public class RunAddressBook {

	public static void main(String[] args) {
//		AddressBookDemo demo = new AddressBookDemo();
//		demo.showInterface();
		
		AddressBook addressBook = new AddressBook();
		addressBook.addDetails(new ContactDetails("Amir Kalbasi", "12345678", "Tehran, sandogh posti"));
		System.out.println(addressBook.getNumberOfEntries());
		addressBook.removeDetails("1234567");
		System.out.println(addressBook.getNumberOfEntries());

	}

}
