package com;

public class Main {
	private static final Image locations[] =
		{new Image("Beijing"), new Image("ChengDu"), new Image("ChengDu"),
		 new Image("Tokyo"), new Image("Shanghai"), new Image("FairField")};
	public static void main(String[] args) {
		for(int i=0; i<20; ++i) {
			Customer customer = (Customer)CustomerFactory.getCustomer(getRandomImage());
			customer.setCustomerId(getRandomId());
			customer.setFirstName("OK");
			customer.setLastName("Yes");
			customer.setProfile(new HealthProfile());
			customer.setResidenceAddress(new Address());
			customer.print();
		}
	}
	private static Image getRandomImage() {
		return locations[(int)(Math.random()*locations.length)];
		
	}

	private static int getRandomId() {
	return (int)(Math.random()*100 );
	}

}
