
public class Vault {
	private static int SecretCode = 193083;
public static void main(String[] args) {
	tryCode(0);
}
	private static boolean tryCode(int i) {
		if(i == SecretCode) {
			return true;
		}
		else {
		return false;
	}
	}
}
