package com;

import java.util.List;

public class KidsGiftPack implements GiftPack {
	private List<GiftItem> giftItems;
	private Address shippingAddress;

	@Override
	public void setGiftItems(List<GiftItem> giftItem) {
		this.giftItems = giftItem;
	}
	public float getTotalAmount() {
		return giftItems.stream().map(x->x.getCost()).reduce((float)0, (x,y) ->x+y);
	}

}
