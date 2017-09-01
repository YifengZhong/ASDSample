package com;

public class GiftBusinessItemFactory extends AbstractFactory {

	@Override
	public GiftItem getItem(PackagingTP packagingTp) {
		if(packagingTp == PackagingTP.BAG) {
			return new BagBusinessItem();
		} else if (packagingTp == PackagingTP.BOX) {
			return new BoxBusinessItem();
		} else if (packagingTp == PackagingTP.WRAP) {
			return new WrapBusinessItem();
		}
		return null;
	}

	@Override
	public GiftPack getPack(PackTP packTp) {
		// TODO Auto-generated method stub
		return new BusinessGiftPack();
	}

}
