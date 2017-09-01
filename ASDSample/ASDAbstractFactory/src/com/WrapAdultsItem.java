package com;

public class WrapAdultsItem implements GiftItem {
	private String giftId;
	private String giftName;
	private String description;
	private String packagingType; //"bag", "box", or "wrap".
	private Packaging packaging;
	@Override
	public void setPakaging(GiftPack giftPack) {
		// TODO Auto-generated method stub

	}
	@Override
	public float getCost() {
		// TODO Auto-generated method stub
		return 0;
	}

}
