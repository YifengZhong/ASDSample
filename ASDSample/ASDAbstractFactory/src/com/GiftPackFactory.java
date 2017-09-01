package com;

public class GiftPackFactory extends AbstractFactory {

	@Override
	public GiftItem getItem(PackagingTP packagingTp) {
		return null;
	}

	@Override
	public GiftPack getPack(PackTP packTp) {
		if (packTp == PackTP.ADULTS) {
			return new AdultsGiftPack();
		} else if (packTp == PackTP.BUSINESS) {
			return new BusinessGiftPack();
		} else if (packTp == PackTP.KIDS) {
			return new KidsGiftPack();
		}
		return null;
	}

}
