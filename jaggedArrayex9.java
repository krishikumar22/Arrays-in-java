
public class jaggedArrayex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[][]=new int[3][];
a[0]=new int[3];
a[1]=new int[4];
a[2]=new int [5];
 int count=0;
 for(int i=0;i<a.length;i++) 
	 for(int j=0;j<a.length;j++) 
		 a[i][j]=count++;
		 
	 
 
 for(int i=0;i<a.length;i++) {
	 for(int j=0;j<a[i].length;j++) {
		 System.out.print(a[i][j]+" ");
		 
	 }
	 System.out.println();
 
	}

}}


