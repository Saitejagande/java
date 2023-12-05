package wrapperclass;

public class ByteClass {

	public static void main(String[] args) {
		byte a=36;
		Byte b= new Byte(a);
		System.out.println(b.byteValue());
		System.out.println(b.intValue());
		System.out.println(b.doubleValue());
		System.out.println(b.floatValue());
		System.out.println(b.longValue());

	}

}
