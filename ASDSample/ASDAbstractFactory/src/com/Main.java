package com;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		AbstractFactory giftPackFactory = FactoryProducer.getFactory(PackTP.BUSINESS);
		GiftItem giftItem = giftPackFactory.getItem(PackagingTP.BAG);
		GiftItem giftItem1 = giftPackFactory.getItem(PackagingTP.BAG);
		GiftItem giftItem2 = giftPackFactory.getItem(PackagingTP.BOX);
		
		GiftPack giftPack = giftPackFactory.getPack(PackTP.BUSINESS);
		giftPack.setGiftItems(Arrays.asList(giftItem,giftItem1,giftItem2));
		System.out.println("The Total price is :" + giftPack.getTotalAmount());

	}
}


