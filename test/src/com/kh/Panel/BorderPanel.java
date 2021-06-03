package com.kh.Panel;

import java.awt.Color;

import javax.swing.JPanel;

import com.kh.Frame.MainFrame;

public class BorderPanel extends JPanel{
	public BorderPanel(){
		setPreferredSize(MainFrame.border_w);
		setBackground(Color.WHITE);
	}
}
