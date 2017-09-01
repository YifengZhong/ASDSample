package com;

public abstract class AbstractFactory {
	public abstract GiftItem getItem(PackagingTP packagingTp);
	public abstract GiftPack getPack(PackTP packTp);
}
