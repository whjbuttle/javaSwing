package lotto;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LottoUI extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	Lotto lotto;
	JButton btn;
	JPanel panelNorth, panelSouth;
	ImageIcon icon;
	List<JButton> btns;
	
	public LottoUI() {
		// �ʵ尪 �ʱ�ȭ�� �����ڿ��� �ϴµ� ������ ������ų� Ȥ�� ������ �޼ҵ�� 
		// �ʱ�ȭ ����� ó���ϰ��� �ϸ� �޼ҵ带 ȣ���ϴ� ������ �����ϴ�
		init();
	}
	
	private void init() {
		setTitle("�ζ� �߻���");
		lotto = new Lotto();
		btns = new ArrayList<JButton>();
		panelNorth = new JPanel();
		panelSouth = new JPanel();
		btn = new JButton("�ζ� ��ȣ ��÷");
		// ����
		btn.addActionListener(this);		// JFrame�� ��ӹ��� ��ü�̹Ƿ� ����
		panelNorth.add(btn);
		add(panelNorth,BorderLayout.NORTH);	// ������ ���ʿ� �г��� ���δ�.
		add(panelSouth,BorderLayout.SOUTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 400, 1200, 300);		// ȭ�鿡�� x��ǥ 300, y��ǥ 400, ���� 1200�ȼ�, ���� 300�ȼ�
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (btns.size()==0) {
			makeBtns();
		}
		lotto.setLotto();
		showLotto();
	}

	private void showLotto() {
		int[] arr = lotto.getLotto();
		for (int i = 0; i < arr.length; i++) {
			btns.get(i).setIcon(getIcon(arr[i]));
		}
		
	}

	private Icon getIcon(int i) {
		Icon icon = null;
		String imgPath = "src/images/" + Integer.toString(i) + ".gif";
		icon = new ImageIcon(imgPath);
		return icon;
	 // return new ImageIcon(imgPath);   �� ó���ϸ� �� ���� �ڵ�
	}

	private void makeBtns() {
		JButton temp = null;
		for (int i = 0; i < 6; i++) {	
			temp = new JButton();
			btns.add(temp);
			panelSouth.add(temp);
			
		}
	}
	
}
