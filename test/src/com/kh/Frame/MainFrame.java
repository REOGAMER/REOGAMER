package com.kh.Frame;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.kh.Panel.BorderPanel;
import com.kh.Panel.GridPanel;
import com.kh.Panel.MainPanel;

public class MainFrame extends JFrame{
	
	GridPanel pnl = new GridPanel();
	MainPanel info = new MainPanel();
	Container c = getContentPane();
	
	public final static int WIDTH = 1280;
	public final static int HEIGHT = 720;
	public static Dimension border_w = new Dimension(WIDTH / 6, HEIGHT);	
	
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setPreferredSize(new Dimension(WIDTH , HEIGHT));
		c.add(pnl, BorderLayout.CENTER);
		c.add(info, BorderLayout.NORTH);
		c.add(new BorderPanel(), BorderLayout.EAST);
		c.add(new BorderPanel(), BorderLayout.WEST);
		setResizable(false);
		setVisible(true);
		pack();
		setLocationRelativeTo(null);
	}
	
	public static void main(String[] args) {
		new MainFrame();
		//new InsertFrame();
	}
}
