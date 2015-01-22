import java.io.IOException;
import java.security.cert.CertificateException;
import java.util.Scanner;

public class MultipleCatches {
	
	public static final int ARITHMETIC = 1;
	public static final int IO = 2;
	public static final int FORMAT = 3;
	public static final int BOUNDS = 4;
	public static final int CERT = 5;
	
	public static void thrower(int i) throws Exception {
		if (i==ARITHMETIC) {
			throw
				new ArithmeticException
				("You did something weird with math.");
		} else if (i==IO) {
			throw
				new IOException
				("You did something weird with IO.");
		} else if (i==FORMAT) {
			throw
				new NumberFormatException
				("You did some weird format.");
		} else if (i==BOUNDS) {
			throw
				new IndexOutOfBoundsException
				("You did some weird offset.");
		} else if (i==CERT) {
			throw
				new CertificateException
				("You did something weird to a certificate.");
		}
	}
	
	public static void main(Sting[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		try {
			
		}
	}
	
}
