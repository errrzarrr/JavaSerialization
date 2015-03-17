import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeDemo {

	public static void main(String[] args) {
		Contact friend = null;
		
		try {
			FileInputStream fileIn =
					new FileInputStream("./contact.ser");
			ObjectInputStream in =  
					new ObjectInputStream(fileIn);
			friend =  (Contact) in.readObject();
			
			in.close();
			fileIn.close();
		}
		catch(IOException ioexec) {
			ioexec.printStackTrace();
			return;
		}
		catch(ClassNotFoundException cnfexc) {
			System.out.println("Contact class not found");
			cnfexc.printStackTrace();
			return;
		}
		
		System.out.println("Deserializing Contact...");
		System.out.println("Name: " +friend.name);
		System.out.println("Phone #: " +friend.phoneNumber);
		System.out.println("Times called: " +friend.numberTimesCalled);

	}
}

