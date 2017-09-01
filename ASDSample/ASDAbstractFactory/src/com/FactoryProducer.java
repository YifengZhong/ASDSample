package com;

public class FactoryProducer {
	public static AbstractFactory getFactory(PackTP tp) {
		if (tp == PackTP.BUSINESS) {
			return new GiftBusinessItemFactory();
		} else if (tp == PackTP.ADULTS) {
			return new GiftAdultsItemFactory();
		} else if (tp == PackTP.KIDS) {
			return new GiftKidsItemFactory();
		}
		return null;
	}
}
