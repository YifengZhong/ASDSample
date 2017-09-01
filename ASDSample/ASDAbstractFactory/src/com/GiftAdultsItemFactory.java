package com;

public class GiftAdultsItemFactory extends AbstractFactory {

	@Override
	public GiftItem getItem(PackagingTP packagingTp) {
		if(packagingTp == PackagingTP.BAG) {
			return new BagAdultsItem();
		} else if (packagingTp == PackagingTP.BOX) {
			return new BoxAdultsItem();
		} else if (packagingTp == PackagingTP.WRAP) {
			return new WrapAdultsItem();
		}
		return null;
	}

	@Override
	public GiftPack getPack(PackTP packTp) {
		// TODO Auto-generated method stub
		return new AdultsGiftPack();
	}

}
