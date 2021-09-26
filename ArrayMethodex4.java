
public class ArrayMethodex4 {
static void method(int a[]) {//defining a method and a array inside it
	int method=a[0];//instantation
	for(int i=1;i<a.length;i++) 
		if(method>a[i])
			a[i]=method;
		
		System.out.println(method);
		
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {10,20,30,40,50};
method(a);//passing arrayto method
	}

}
