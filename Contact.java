public class Contact implements java.io.Serializable {
	public String name; 
	public String phoneNumber;
	public transient int numberTimesCalled;
	/*transient variables won't be serialized; 
	 * meaning, when deserialized value won't be retrieved. */
	public Boolean blocked;
	public void callContact() {
		System.out.println("Calling "+ name +" ["+ phoneNumber +"] ...");
		numberTimesCalled++;
		System.out.println("Times called: " +numberTimesCalled);
	}
}
