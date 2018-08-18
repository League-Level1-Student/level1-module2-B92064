
public class JamesBond {
	 static Vault vault = new Vault();
	public static void main(String[] args) {
		JamesBond Bond = new JamesBond();
		Bond.findCode(vault);
	
	}

	
	public static void findCode(Vault v) {
		int code = -1;
		for(int i = 0; i < 1000000; i++) {
			vault.tryCode(i);
			if(vault.tryCode(i) == true) {
				code = i;
				break;
			}
		}
		System.out.println(code);
	}}

