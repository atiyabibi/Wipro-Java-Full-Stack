package day2;

public class WelcomeMessage {
	public static void main(String args[]) {
		if (args.length == 0) {
            System.out.println("No name provided!");
        } else {
            String name = args[0];
            System.out.println("Welcome " + name);
        }
		}
}
