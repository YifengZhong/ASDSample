package view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import application.Position;

public class ColorMediator implements Mediator {
	
	private static ColorMediator instance = null;

	
//	public Map<Position, Stone> getMap() {
//		return map;
//	}
//	public void setMap(Map<Position, Stone> map) {
//		this.map = map;
//	}
	private ColorMediator() {
		
	}
	public static ColorMediator getInstance() {
		if (instance != null) {
			return instance;
		}
		return new ColorMediator();
	}
	@Override
	public List<Position> changeColor(int x, int y) {
		List<Position> ret = new ArrayList<Position>();
//		if (map.containsKey(new Position(x-1,y-1))) {
//			ret.add(new Position(x-1,y-1));
//		}
//		if (map.containsKey(new Position(x,y-1))) {
//			ret.add(new Position(x,y-1));			
//		}
//		if (map.containsKey(new Position(x+1,y-1))) {
//			ret.add(new Position(x+1,y-1));			
//		}
//		if (map.containsKey(new Position(x-1,y))) {
//			ret.add(new Position(x-1,y));			
//		}
//		if (map.containsKey(new Position(x+1,y))) {
//			ret.add(new Position(x+1,y));			
//		}
//		if (map.containsKey(new Position(x-1,y+1))) {
//			ret.add(new Position(x-1,y+1));			
//		}
//		if (map.containsKey(new Position(x,y+1))) {
//			ret.add(new Position(x,y+1));			
//		}
//		if (map.containsKey(new Position(x+1,y+1))) {
//			ret.add(new Position(x+1,y+1));			
//		}
		return ret;
		
	}

	@Override
	public List<Stone> getResult(Stone stone) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Map<Position, Stone> getMap() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setMap(Map<Position, Stone> map) {
		// TODO Auto-generated method stub
		
	}

}
