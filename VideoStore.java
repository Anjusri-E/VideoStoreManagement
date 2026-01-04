public class VideoStore {
	private Video[] store;
	
	public void addVideo(String name) {
		Video video = new Video(name);
		int storeSize=0;
		
		try {
			storeSize = store.length;
		}catch(Exception e) {
			storeSize = 0;
		}
		
		
		Video[] newStore = new Video[storeSize+1];
		for(int i=0;i<storeSize;i++){
			newStore[i] = store[i];
		}
		newStore[storeSize] = video;
		store = newStore;
	}
	
	public void doCheckout(String name) {
		if(store==null || store.length==0) {
			System.out.println("Store is empty");
			return;
		}
		for (Video videos:store) {
			if(videos.getName().equals(name)) {
				videos.doCheckout();
			}
		}
	}
	public void doReturn(String name) {
		if(store==null || store.length==0) {
			System.out.println("Store is empty");
			return;
		}
		for (Video videos:store) {
			if(videos.getName().equals(name)) {
				videos.doReturn();
			}
		}
			
	}
	public void receiveRating(String name, int rating) {
		if(store==null || store.length==0) {
			System.out.println("Store is empty");
			return;
		}
		for (Video videos:store) {
			if(videos.getName().equals(name)) {
				videos.receiveRating(rating);
			}
		}
		
	}
	public void listInventory() {
		if(store==null || store.length==0) {
			System.out.println("Store is empty");
			return;
		}
		for(int i=0;i<80;i++) System.out.print("-");
		System.out.printf("\n\t%-20s\t|%-15s\t|%-10s\n", "VideoName", "Rating", "CheckOut");
		for(int i=0;i<80;i++) System.out.print("-");
		for(Video videos : store) {
			System.out.printf("\n\t%-20s\t|%-15s\t|%-10s\n",videos.getName(),videos.getRating(),videos.getCheckOut());
		}
		for(int i=0;i<80;i++) System.out.print("-");
	}
}
