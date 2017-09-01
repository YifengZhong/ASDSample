package com;

public interface Component<K> {
	boolean add(K e);
	boolean remove(K e);
	boolean contains(K e);
	boolean size(K e);
}
