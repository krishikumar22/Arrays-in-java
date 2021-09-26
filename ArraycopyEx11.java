
public class ArraycopyEx11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char[]copyFrom= {'a','n','t','e','n','n','a'};
char[]copyTo=new char[3];
System.arraycopy(copyFrom, 0, copyTo, 0, 3);
System.out.println(String.valueOf(copyTo));
	}

}
