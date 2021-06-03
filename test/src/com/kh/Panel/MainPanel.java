package com.kh.Panel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.kh.Frame.InsertFrame;
import com.kh.Frame.MainFrame;

public class MainPanel extends JPanel{
	JLabel Title = new JLabel("학생 관리");
	JLabel Info = new JLabel("학생 관리 페이지 입니다.");
	JPanel T_pnl = new JPanel();
	JPanel I_pnl = new JPanel();
	JButton insert = new JButton("등록");
	Dimension T_size = new Dimension(MainFrame.WIDTH, MainFrame.HEIGHT / 4);
	public static boolean scrCheck = false;
	public static InsertFrame insF;
	public MainPanel() {
		setLayout(new BorderLayout());
		add(new BorderPanel(), BorderLayout.EAST);
		add(new BorderPanel(), BorderLayout.WEST);
		add(T_pnl, BorderLayout.NORTH);
		add(I_pnl, BorderLayout.CENTER);
		
		I_pnl.setLayout(null);
		I_pnl.setBackground(Color.WHITE);
		T_pnl.add(Title);
		I_pnl.add(Info);
		I_pnl.add(insert);
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(scrCheck == false) {
					insF = new InsertFrame();
					scrCheck = true;
				}
			}
		});
		Info.setBounds(300, 0, 300, 20);
		insert.setBounds(0,	70, 80, 30);
		Title.setFont(new Font("Kostar",Font.BOLD,40));
		Info.setFont(new Font("Kostar",Font.BOLD,20));
		T_pnl.setBackground(Color.WHITE);
		setPreferredSize(T_size);
	}
}
