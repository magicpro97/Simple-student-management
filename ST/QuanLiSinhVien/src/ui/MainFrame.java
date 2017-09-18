package ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MainFrame extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	SearchPanel searchPanel;
	StudentInfoPanel studentInfoPanel;
	JMenuBar menuBar;
	JMenu mnFile;
	JMenu mnAbout;
	JMenuItem mtExit;
	
	
	public MainFrame() throws HeadlessException {
		super();
		addControls();
		addEvents();
		setting();
	}

	private void addEvents() {
		
	}

	private void addControls() {
		searchPanel = new SearchPanel();
		
		menuBar = new JMenuBar();
		mnFile = new JMenu("File");
		mtExit = new JMenuItem("Exit");
		mtExit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnFile.add(mtExit);
		mnAbout = new JMenu("About");
		menuBar.add(mnFile);
		menuBar.add(mnAbout);
		
		studentInfoPanel = new StudentInfoPanel();
	}

	private void setting() {
		this.setTitle("Quản lí thông tin sinh viên");
		this.setVisible(true);
		this.setSize(new Dimension(800, 600));
		this.setResizable(false);
		this.setLayout(new BorderLayout());
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		// add component
		//this.add(new JButton("Khu vuc nut bam"), BorderLayout.PAGE_START);
		//this.add(new JButton("Khu vuc hinh"),BorderLayout.LINE_END);
		this.add(new JLabel("Ngô Thế Linh - Võ Ngọc Rơ - Nguyễn Anh Nguyên - Trần Hồng Phúc"), BorderLayout.PAGE_END);
		this.add(searchPanel, BorderLayout.LINE_START);
		this.setJMenuBar(menuBar);
		this.add(studentInfoPanel, BorderLayout.CENTER);
		
		this.pack();
		this.setVisible(true);
	}
	
}
