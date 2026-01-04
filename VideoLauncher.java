import java.util.*;

public class VideoLauncher {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		VideoStore video = new VideoStore();
		do {
			System.out.println("\nMAIN MENU\r\n"
					+ "=========\r\n"
					+ "1. Add Videos:\r\n"
					+ "2. Check Out Video :\r\n"
					+ "3. Return Video :\r\n"
					+ "4. Receive Rating :\r\n"
					+ "5. List Inventory :\r\n"
					+ "6. Exit :\r\n"
					+ "Enter your choice (1..6):");
			choice = sc.nextInt();
			switch (choice) {
				case 1 -> {
					System.out.println("Please enter the name of the video : ");
					sc.nextLine();
					String name = sc.nextLine();
					video.addVideo(name);
					System.out.printf("Video %s Added Successfully", name);
					break;
				}
				case 2 -> {
					System.out.println("Please enter the name of the video you want to checkout: ");
					sc.nextLine();
					String name = sc.nextLine();
					video.doCheckout(name);
					System.out.printf("Video %s has checked out Successfully", name);
					break;
				}
				case 3 -> {
					System.out.println("Please enter the name of the video you want to return: ");
					sc.nextLine();
					String name = sc.nextLine();
					video.doReturn(name);
					System.out.printf("Video %s has returned Successfully", name);
					break;
				}
				case 4 -> {
					System.out.println("Please enter the name of the video you want to rate: ");
					sc.nextLine();
					String name = sc.nextLine();
					System.out.println("Please enter the rating for the video : ");
					int rating = sc.nextInt();
					video.receiveRating(name, rating);
					System.out.printf("Video %s has been rated succesfully", name);
					break;
				}
				case 5 -> {
					video.listInventory();
					break;
				}
				case 6 -> {
					System.out.println("Thanks for using the application...\n");
					return;
				}
			}
		} while (true);
	}
}
