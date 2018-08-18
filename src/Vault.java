
public class Vault {
	private static int SecretCode = 9236209;

	public boolean tryCode(int i) {
		if(i == SecretCode) {
			return true;
		}
		else {
		return false;
	}
	}
}
