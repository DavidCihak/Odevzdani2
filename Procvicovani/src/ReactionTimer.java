import java.util.Scanner;

public class ReactionTimer {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("3");
		Thread.sleep(1000);
		System.out.println("2");
		Thread.sleep(1000);
		System.out.println("1");
		Thread.sleep(1000);
		System.out.println("Go!");
		long startTime = System.currentTimeMillis();
		int x = sc.nextInt();
		long stopTime = System.currentTimeMillis();
		long reactionTime = stopTime - startTime;

		System.out.println(reactionTime + " ms =>" + reactionTime / 1000 + " s");
	}

}
