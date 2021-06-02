package com.panel.game.states;

import java.awt.Graphics2D;

import com.panel.game.entity.Player;
import com.panel.game.graphics.Font;
import com.panel.game.graphics.Sprite;
import com.panel.game.util.KeyHandler;
import com.panel.game.util.MouseHandler;
import com.panel.game.util.Vector2f;

public class PlayState extends GameState{
	
	private Font font;
	private Player player;
	
	public PlayState(GameStateManager gsm) { 
		super(gsm);
		font = new Font("font/ZeldaFont.png", 16, 16);
		player = new Player(new Sprite("entity/linkFormatted.png"), new Vector2f(300, 300), 128);
	}
	
	public void update() {
		player.update();
	}
	
	public void input(MouseHandler mouse, KeyHandler key) {
		player.input(mouse, key);
	}
	
	public void render(Graphics2D g) {
		Sprite.drawArray(g, font, "asdfadfasd", new Vector2f(200, 200), 128, 128, 64, 0);
		player.render(g);
	}
}
