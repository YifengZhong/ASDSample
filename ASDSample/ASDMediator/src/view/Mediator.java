package view;

import java.util.List;
import java.util.Map;

import application.Position;

public interface Mediator {
	public List<Position> changeColor(int x, int y);
	public List<Stone> getResult(Stone stone);
	public Map<Position, Stone> getMap();
	public void setMap(Map<Position, Stone> map);
}
