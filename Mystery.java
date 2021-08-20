
public class Mystery {
	public static void main(String[] args) {

		mystery(20);
	}
	public static void mystery(int n){
		System.out.print(n+" ");
		if (n>10) {
			n = n/2;
		} else {
			n = n + 7;
		}
		if (n*2<25){
			n = n+10;
		}
		System.out.println(n);
	}
}
