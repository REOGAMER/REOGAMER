package com.kh.Panel;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class GridPanel extends JPanel{
	
	String header[] = {"학번","이름","학과","학년"};
	String contents[][] = {{"1","2","3","4"}};
	DefaultTableCellRenderer CellRender = new DefaultTableCellRenderer();
	DefaultTableModel model = new DefaultTableModel(contents, header);
	JTable table = new JTable(model);
	JScrollPane scrollpane = new JScrollPane(table);
	public GridPanel() {
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		CellRender.setHorizontalAlignment(SwingConstants.CENTER);
		TableColumnModel tcm = table.getColumnModel();
		
		for(int i = 0; i < tcm.getColumnCount(); i++) {
			tcm.getColumn(i).setCellRenderer(CellRender);
		}
		add(scrollpane);
		table.setFont(new Font("Kostar",Font.BOLD,20));
		scrollpane.setBackground(Color.WHITE);
	}

}
