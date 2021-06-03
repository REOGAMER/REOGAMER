package com.kh.Panel;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.kh.Frame.InsertFrame;

public class InsertPanel extends JPanel{
	String[] label = {"�й�","�̸�","�а�","�г�","����","���"};
	JLabel[] lbl = new JLabel[label.length];
	public JTextField[] field = new JTextField[label.length];
	public JTextArea Area = new JTextArea(10, 40);
	JPanel head = new JPanel();
	JPanel insertPnl = new JPanel();
	JPanel bottom = new JPanel();
	FlowLayout InsLayout = new FlowLayout(SwingConstants.CENTER,300,10);
	GridLayout HLayout = new GridLayout(2,1);
	JLabel Title = new JLabel("�л� ���");
	JLabel info = new JLabel("�л� ��� ��� �Դϴ�.\n �������� ��Ȯ�� �Է����ּ���");
	public JButton submit = new JButton("���");
	JPanel[] gridpnl = new JPanel[label.length];
	
	JScrollPane sc = new JScrollPane(Area);
	public InsertPanel() {
		Title.setHorizontalAlignment(JLabel.CENTER);
		info.setHorizontalAlignment(JLabel.CENTER);
		setLayout(new BorderLayout());
		insertPnl.setLayout(InsLayout);
		head.setLayout(HLayout);
		add(head, BorderLayout.NORTH);
		add(insertPnl, BorderLayout.CENTER);
		add(bottom, BorderLayout.SOUTH);
		bottom.setLayout(new BorderLayout());
		sc.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		for(int i = 0; i < label.length - 1; i++) {
			lbl[i] = new JLabel(label[i]);
			field[i] = new JTextField(30);
			lbl[i].setHorizontalAlignment(JLabel.CENTER);
			gridpnl[i] = new JPanel();
			gridpnl[i].add(lbl[i]);
			gridpnl[i].add(field[i]);
			insertPnl.add(gridpnl[i]);
		}
		lbl[label.length-1] = new JLabel(label[label.length-1]);
		insertPnl.add(lbl[label.length-1]);
		insertPnl.add(Area);
		head.add(Title);
		head.add(info);
		Title.setFont(new Font("Kostar",Font.BOLD,40));
		bottom.add(submit);
		
		
	}
}
