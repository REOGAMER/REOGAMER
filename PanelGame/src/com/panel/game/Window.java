package com.panel.game;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;

public class Window extends JFrame{
//	static GraphicsDevice device = GraphicsEnvironment
//	        .getLocalGraphicsEnvironment().getScreenDevices()[0];
	public Window() {
	//	device.setFullScreenWindow(this);
		setTitle("Your mom");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new GamePanel(1280, 720));
		pack();
		setLocationRelativeTo(null);
//		setUndecorated(true);
//		setExtendedState(MAXIMIZED_BOTH);
		setResizable(false);
		setVisible(true);
	}
}
