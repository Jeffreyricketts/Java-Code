
public class ExamTwoPerfectNO {
	public static void main(String[] args) {
		findPerfectNumbers(1);
		}
	public static void findPerfectNumbers(int howMany){
	    int count;
	    int sum;
	    sum = 1;
	    count = 0;
	    while(count<= howMany)

        System.out.print(1);
        for (int i = 2; i < 10000; i++) {
            if (sum % i == 0) {
				sum = sum + sum;
				count++;
			}
                i++;
            }

        	System.out.println(count);


	}
}
