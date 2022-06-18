import java.util.Base64;

public class Password_encryption {

	public static void main(String[] args) {
		
		String pass = "Test@123";
		String encoded = Base64.getEncoder().encodeToString(pass.getBytes());
		System.out.println(encoded);
		System.out.println(pass.getBytes());
		String decoded = new String(Base64.getDecoder().decode(encoded));
		System.out.println(decoded);

	}

}
