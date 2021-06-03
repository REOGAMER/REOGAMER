package com.kh.Frame;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import com.kh.DB.StudentDao;
import com.kh.DB.StudentVo;
import com.kh.Panel.InsertPanel;
import com.kh.Panel.MainPanel;

public class InsertFrame extends JFrame{
	Container c = getContentPane();
	StudentDao stDao = StudentDao.getInstance();
	public static InsertPanel insert = new InsertPanel();
	public InsertFrame() {
		setPreferredSize(new Dimension(900 , 600));
		setAlwaysOnTop(true);
		setUndecorated(true);
		setVisible(true);
		pack();
		setLocationRelativeTo(null);
		c.add(insert);
		insert.submit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int st_num 	= Integer.parseInt(insert.field[0].getText());
				String st_name 	= insert.field[1].getText();
				String st_major = insert.field[2].getText();
				int st_year	= Integer.parseInt(insert.field[3].getText());
				int st_score	= Integer.parseInt(insert.field[4].getText());
				String st_etc	= insert.Area.getText();
				MainPanel.scrCheck = false;
				
				StudentVo vo = new StudentVo(st_num, st_name, st_major, st_year, st_score, st_etc);
				
				stDao.insertStdnt(vo);
				
				dispose();
			}
		});
	}
}
