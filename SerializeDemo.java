import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {
	public static void main(String[] args) {
		Contact friend = new Contact();
		
		friend.name = "Rick";
		friend.phoneNumber = "8095551122";
		friend.blocked = false;
		friend.numberTimesCalled = 0;
		friend.callContact();
		
		try {
			FileOutputStream fileOut =
					new FileOutputStream("./contact.ser");
			
			ObjectOutputStream out = 
					new ObjectOutputStream(fileOut);
			
			out.writeObject(friend);
			
			out.close();
			fileOut.close();
			
			System.out.println("Data saved in ./contact.ser");
		}
		catch (IOException ioexc) {
			ioexc.printStackTrace();
		}
	}
}
