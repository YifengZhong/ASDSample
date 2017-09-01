package com;

import java.util.List;

public class TwoClasses implements Model {

	@Override
	public long getRevenue(List<Flight> flights) {
		long total = 0;
		for (int i = 0; i< flights.size(); i++) {
			int businessNum = flights.get(i).getPassengers()/3;
			int baseNum = flights.get(i).getPassengers() - businessNum;
			total = total + (long) (businessNum*Model.BASE_TICKET*1.5 + baseNum*Model.BASE_TICKET*0.75 - Model.FIXED_COST*1.1);
		}
		return total;
	}
}
