package ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;


public class SearchPanel extends JPanel{

	/**
	 * Đây là phần panel bao gồm search field, student list và nút Add
	 */
	private static final long serialVersionUID = 1L;
	JTextField txtSearch;
	JPanel searchPanel;
	JButton btnAdd;
	JLabel lbSearch;
	JLabel lbStudentId;
	JScrollPane spStudentId;
	DefaultListModel<String> lmStudentId;
	JList<String> listStudentId;
	
	public SearchPanel() {
		this.setLayout(new BorderLayout());
		addControls();
		addEvents();
		setting();
	}

	private void setting() {
		this.add(txtSearch,BorderLayout.PAGE_START);
		this.add(spStudentId,BorderLayout.CENTER);
		this.add(btnAdd, BorderLayout.PAGE_END);
	}
	//Sự kiện thì chỉ được code trong addEvent
	private void addEvents() {
		//Sự kiện của nút Add ở đây
		btnAdd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				FormInfoFrame addFrame = new FormInfoFrame();
				addFrame.setVisible(true);
				addFrame.setTitle("Add student information");
				addFrame.setResizable(false);
				//Nút add
				addFrame.inforForm.btn1.setText("Add");
				
				//Nút cancel
				addFrame.inforForm.btn2.setText("Cancel");
				
				//Sự kiện của nút Add ở đây
				addFrame.inforForm.btn1.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						addFrame.setVisible(false);
					}
				});
				
				//Sự kiện của nút Cancel ở đây
				addFrame.inforForm.btn2.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						addFrame.setVisible(false);
					}
				});
				
			}
		});
	}

	private void addControls() {
		txtSearch = new JTextField();
		btnAdd = new JButton("Add");
		lbSearch = new JLabel("Search:");
		lbStudentId = new JLabel("Student id:");
		
		lmStudentId = new DefaultListModel<>();
		lmStudentId.addElement("Nguyên óc cứt");
		lmStudentId.addElement("Nguyên óc cứt");
		lmStudentId.addElement("Nguyên óc cứt");
		lmStudentId.addElement("Nguyên óc cứt");
		lmStudentId.addElement("Nguyên óc cứt");
		lmStudentId.addElement("Nguyên óc cứt");
		lmStudentId.addElement("Nguyên óc cứt");
		lmStudentId.addElement("Nguyên óc cứt");
		lmStudentId.addElement("Nguyên óc cứt");
		lmStudentId.addElement("Nguyên óc cứt");
		lmStudentId.addElement("Nguyên óc cứt");
		lmStudentId.addElement("Nguyên óc cứt");
		lmStudentId.addElement("Nguyên óc cứt");
		lmStudentId.addElement("Nguyên óc cứt");
		lmStudentId.addElement("Nguyên óc cứt");
		
		listStudentId = new JList<>(lmStudentId);
		listStudentId.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listStudentId.setLayoutOrientation(JList.VERTICAL);
		listStudentId.setVisibleRowCount(-1);
		
		spStudentId = new JScrollPane(listStudentId);
		spStudentId.setPreferredSize(new Dimension(150, 50));
		
	}
}
