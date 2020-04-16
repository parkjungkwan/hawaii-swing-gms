package com.jse.game;

public interface GameService {
	public void add(Game game);
	public Game[] list();
	public Game detail(Game game);
	public int count();
	public void update(Game game);
	public void delete(Game game);

}
