public class Video {
	String videoName;
	boolean checkOut;
	int rating;

	public Video(String name) {
		videoName = name;
	}

	public String getName() {
		return videoName;
	}

	public void doCheckout() {
		checkOut = true;
	}

	public void doReturn() {
		checkOut = false;
	}

	public void receiveRating(int rating) {
		this.rating = rating;
	}

	public int getRating() {
		return rating;
	}

	public boolean getCheckOut() {
		return checkOut;
	}
}
