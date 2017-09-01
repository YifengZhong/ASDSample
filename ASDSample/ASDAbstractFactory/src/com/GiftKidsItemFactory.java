package com;

public class GiftKidsItemFactory extends AbstractFactory {

	@Override
	public GiftItem getItem(PackagingTP packagingTp) {
		if(packagingTp == PackagingTP.BAG) {
			return new BagKidsItem();
		} else if (packagingTp == PackagingTP.BOX) {
			return new BoxKidsItem();
		} else if (packagingTp == PackagingTP.WRAP) {
			return new WrapKidsItem();
		}
		return null;
	}

	@Override
	public GiftPack getPack(PackTP packTp) {
		// TODO Auto-generated method stub
		return new KidsGiftPack();
	}

}
