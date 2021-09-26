
public class AnonymousArrayex5 {
static void method(int a[]) {
	for (int i=0;i<a.length;i++)
		System.out.println(a[i]);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
method(new int[] {10,20,30,90,120});//passing anonymous array in a method declaration
	}

}
