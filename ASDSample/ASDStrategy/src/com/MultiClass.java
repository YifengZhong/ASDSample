package com;

import java.util.List;

public class MultiClass implements Model {

	@Override
	public long getRevenue(List<Flight> flights) {
		long total = 0;
		for (int i = 0; i< flights.size(); i++) {
			int firstNum = flights.get(i).getPassengers()/10;
			int businessNum = flights.get(i).getPassengers()/5;
			int baseNum = flights.get(i).getPassengers() - businessNum - firstNum;
			total = total + 
					(long) (businessNum*Model.BASE_TICKET*1.5 +
					firstNum*Model.BASE_TICKET*4 +
					baseNum*Model.BASE_TICKET*0.75 - 
					Model.FIXED_COST*1.2);
		}
		return total;
	}

}
