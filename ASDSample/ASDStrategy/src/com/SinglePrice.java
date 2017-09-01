package com;

import java.util.List;

public class SinglePrice implements Model {

	@Override
	public long getRevenue(List<Flight> flights) {
		
		return flights
				.stream()
				.map(x -> (x.getPassengers()*Model.BASE_TICKET - Model.FIXED_COST)).reduce((long)0,(x,y) -> x+y);

	}
}
