import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.Font;
import javax.swing.JButton;

public class Mastermind {

	private JFrame frmMastermind;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mastermind window = new Mastermind();
					window.frmMastermind.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public ArrayList<Integer> array = new ArrayList<Integer>(4);
	/**
	 * Create the application.
	 */
	public Mastermind() {
		randomize();
		initialize();
	}

	public int attempt = 1;
	public int correct = 0, dif_pos = 0, check_used = 0;
	public void randomize() {
	Random rand = new Random();
	int upperbound = 6;
	int int_random;
	for (int i = 0; i < 4; i++){
	    int_random = rand.nextInt(upperbound) + 1;
	    while (array.contains(int_random)){
	        int_random = rand.nextInt(upperbound) + 1;
	    }
	    array.add(int_random);
	}}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMastermind = new JFrame();
		frmMastermind.setTitle("Mastermind");
		frmMastermind.setResizable(false);
		frmMastermind.getContentPane().setBackground(new Color(102, 255, 51));
		frmMastermind.setBounds(100, 100, 453, 652);
		frmMastermind.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMastermind.getContentPane().setLayout(null);
		
		JLabel lbl2 = new JLabel("2");
		lbl2.setBounds(60, 572, 40, 40);
		frmMastermind.getContentPane().add(lbl2);
		Image im2 = new ImageIcon(this.getClass().getResource("/Jelly (2).png")).getImage().getScaledInstance(lbl2.getWidth(), lbl2.getHeight(),  java.awt.Image.SCALE_SMOOTH);
		lbl2.setIcon(new ImageIcon(im2));
		
		JLabel lbl3 = new JLabel("3");
		lbl3.setBounds(110, 572, 40, 40);
		frmMastermind.getContentPane().add(lbl3);
		Image im3 = new ImageIcon(this.getClass().getResource("/Jelly (3).png")).getImage().getScaledInstance(lbl3.getWidth(), lbl3.getHeight(),  java.awt.Image.SCALE_SMOOTH);
		lbl3.setIcon(new ImageIcon(im3));
		
		JLabel lbl4 = new JLabel("4");
		lbl4.setBounds(160, 572, 40, 40);
		frmMastermind.getContentPane().add(lbl4);
		Image im4 = new ImageIcon(this.getClass().getResource("/Jelly (4).png")).getImage().getScaledInstance(lbl4.getWidth(), lbl4.getHeight(),  java.awt.Image.SCALE_SMOOTH);
		lbl4.setIcon(new ImageIcon(im4));
		
		JLabel lbl5 = new JLabel("5");
		lbl5.setBounds(210, 572, 40, 40);
		frmMastermind.getContentPane().add(lbl5);
		Image im5 = new ImageIcon(this.getClass().getResource("/Jelly (5).png")).getImage().getScaledInstance(lbl5.getWidth(), lbl5.getHeight(),  java.awt.Image.SCALE_SMOOTH);
		lbl5.setIcon(new ImageIcon(im5));
		
		JLabel lbl6 = new JLabel("6");
		lbl6.setBounds(260, 572, 40, 40);
		frmMastermind.getContentPane().add(lbl6);
		Image im6 = new ImageIcon(this.getClass().getResource("/Jelly (6).png")).getImage().getScaledInstance(lbl6.getWidth(), lbl6.getHeight(),  java.awt.Image.SCALE_SMOOTH);
		lbl6.setIcon(new ImageIcon(im6));
		
		JLabel lbl1 = new JLabel("1");
		lbl1.setBounds(10, 572, 40, 40);
		frmMastermind.getContentPane().add(lbl1);
		Image im = new ImageIcon(this.getClass().getResource("/Jelly (1).png")).getImage().getScaledInstance(lbl1.getWidth(), lbl1.getHeight(),  java.awt.Image.SCALE_SMOOTH);
		lbl1.setIcon(new ImageIcon(im));
		
		
		JLabel lblNewLabel = new JLabel("Selected:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(10, 11, 91, 27);
		frmMastermind.getContentPane().add(lblNewLabel);
		
		JLabel lblT1_1 = new JLabel("0");
		lblT1_1.setBounds(40, 503, 40, 40);
		frmMastermind.getContentPane().add(lblT1_1);
		Image imT1 = new ImageIcon(this.getClass().getResource("/Orb.png")).getImage().getScaledInstance(lblT1_1.getWidth(), lblT1_1.getHeight(),  java.awt.Image.SCALE_SMOOTH);
		lblT1_1.setIcon(new ImageIcon(imT1));
		
		JLabel lblT1_2 = new JLabel("0");
		lblT1_2.setBounds(90, 503, 40, 40);
		frmMastermind.getContentPane().add(lblT1_2);
		lblT1_2.setIcon(new ImageIcon(imT1));
		
		JLabel lblT1_3 = new JLabel("0");
		lblT1_3.setBounds(140, 503, 40, 40);
		frmMastermind.getContentPane().add(lblT1_3);
		lblT1_3.setIcon(new ImageIcon(imT1));
		
		JLabel lblT1_4 = new JLabel("0");
		lblT1_4.setBounds(190, 503, 40, 40);
		frmMastermind.getContentPane().add(lblT1_4);
		lblT1_4.setIcon(new ImageIcon(imT1));
		
		JLabel lblT4_1 = new JLabel("0");
		lblT4_1.setBounds(40, 350, 40, 40);
		frmMastermind.getContentPane().add(lblT4_1);
		lblT4_1.setIcon(new ImageIcon(imT1));
		
		JLabel lblT4_2 = new JLabel("0");
		lblT4_2.setBounds(90, 350, 40, 40);
		frmMastermind.getContentPane().add(lblT4_2);
		lblT4_2.setIcon(new ImageIcon(imT1));
		
		JLabel lblT4_3 = new JLabel("0");
		lblT4_3.setBounds(140, 350, 40, 40);
		frmMastermind.getContentPane().add(lblT4_3);
		lblT4_3.setIcon(new ImageIcon(imT1));
		
		JLabel lblT4_4 = new JLabel("0");
		lblT4_4.setBounds(190, 350, 40, 40);
		frmMastermind.getContentPane().add(lblT4_4);
		lblT4_4.setIcon(new ImageIcon(imT1));
		
		JLabel lblT5_1 = new JLabel("0");
		lblT5_1.setBounds(40, 294, 40, 40);
		frmMastermind.getContentPane().add(lblT5_1);
		lblT5_1.setIcon(new ImageIcon(imT1));
		
		JLabel lblT5_2 = new JLabel("0");
		lblT5_2.setBounds(90, 294, 40, 40);
		frmMastermind.getContentPane().add(lblT5_2);
		lblT5_2.setIcon(new ImageIcon(imT1));
		
		JLabel lblT5_3 = new JLabel("0");
		lblT5_3.setBounds(140, 294, 40, 40);
		frmMastermind.getContentPane().add(lblT5_3);
		lblT5_3.setIcon(new ImageIcon(imT1));
		
		JLabel lblT5_4 = new JLabel("0");
		lblT5_4.setBounds(190, 294, 40, 40);
		frmMastermind.getContentPane().add(lblT5_4);
		lblT5_4.setIcon(new ImageIcon(imT1));
		
		JLabel lblT6_1 = new JLabel("0");
		lblT6_1.setBounds(40, 237, 40, 40);
		frmMastermind.getContentPane().add(lblT6_1);
		lblT6_1.setIcon(new ImageIcon(imT1));
		
		JLabel lblT6_2 = new JLabel("0");
		lblT6_2.setBounds(90, 237, 40, 40);
		frmMastermind.getContentPane().add(lblT6_2);
		lblT6_2.setIcon(new ImageIcon(imT1));
		
		JLabel lblT6_3 = new JLabel("0");
		lblT6_3.setBounds(140, 237, 40, 40);
		frmMastermind.getContentPane().add(lblT6_3);
		lblT6_3.setIcon(new ImageIcon(imT1));
		
		JLabel lblT6_4 = new JLabel("0");
		lblT6_4.setBounds(190, 237, 40, 40);
		frmMastermind.getContentPane().add(lblT6_4);
		lblT6_4.setIcon(new ImageIcon(imT1));
		
		JLabel lblT7_1 = new JLabel("0");
		lblT7_1.setBounds(40, 182, 40, 40);
		frmMastermind.getContentPane().add(lblT7_1);
		lblT7_1.setIcon(new ImageIcon(imT1));
		
		JLabel lblT7_2 = new JLabel("0");
		lblT7_2.setBounds(90, 182, 40, 40);
		frmMastermind.getContentPane().add(lblT7_2);
		lblT7_2.setIcon(new ImageIcon(imT1));
		
		JLabel lblT7_3 = new JLabel("0");
		lblT7_3.setBounds(140, 182, 40, 40);
		frmMastermind.getContentPane().add(lblT7_3);
		lblT7_3.setIcon(new ImageIcon(imT1));
		
		JLabel lblT7_4 = new JLabel("0");
		lblT7_4.setBounds(190, 182, 40, 40);
		frmMastermind.getContentPane().add(lblT7_4);
		lblT7_4.setIcon(new ImageIcon(imT1));
		
		JLabel lblT8_1 = new JLabel("0");
		lblT8_1.setBounds(40, 124, 40, 40);
		frmMastermind.getContentPane().add(lblT8_1);
		lblT8_1.setIcon(new ImageIcon(imT1));
		
		JLabel lblT8_2 = new JLabel("0");
		lblT8_2.setBounds(90, 124, 40, 40);
		frmMastermind.getContentPane().add(lblT8_2);
		lblT8_2.setIcon(new ImageIcon(imT1));
		
		JLabel lblT8_3 = new JLabel("0");
		lblT8_3.setBounds(140, 124, 40, 40);
		frmMastermind.getContentPane().add(lblT8_3);
		lblT8_3.setIcon(new ImageIcon(imT1));
		
		JLabel lblT8_4 = new JLabel("0");
		lblT8_4.setBounds(190, 124, 40, 40);
		frmMastermind.getContentPane().add(lblT8_4);
		lblT8_4.setIcon(new ImageIcon(imT1));
		
		JLabel lblT9_1 = new JLabel("0");
		lblT9_1.setBounds(40, 73, 40, 40);
		frmMastermind.getContentPane().add(lblT9_1);
		lblT9_1.setIcon(new ImageIcon(imT1));
		
		JLabel lblT9_2 = new JLabel("0");
		lblT9_2.setBounds(90, 73, 40, 40);
		frmMastermind.getContentPane().add(lblT9_2);
		lblT9_2.setIcon(new ImageIcon(imT1));
		
		JLabel lblT9_3 = new JLabel("0");
		lblT9_3.setBounds(140, 73, 40, 40);
		frmMastermind.getContentPane().add(lblT9_3);
		lblT9_3.setIcon(new ImageIcon(imT1));
		
		JLabel lblT9_4 = new JLabel("0");
		lblT9_4.setBounds(190, 73, 40, 40);
		frmMastermind.getContentPane().add(lblT9_4);
		lblT9_4.setIcon(new ImageIcon(imT1));
		
		JLabel lblT2_1 = new JLabel("0");
		lblT2_1.setBounds(40, 451, 40, 40);
		frmMastermind.getContentPane().add(lblT2_1);
		lblT2_1.setIcon(new ImageIcon(imT1));
		
		JLabel lblT2_2 = new JLabel("0");
		lblT2_2.setBounds(90, 451, 40, 40);
		frmMastermind.getContentPane().add(lblT2_2);
		lblT2_2.setIcon(new ImageIcon(imT1));
		
		JLabel lblT2_3 = new JLabel("0");
		lblT2_3.setBounds(140, 451, 40, 40);
		frmMastermind.getContentPane().add(lblT2_3);
		lblT2_3.setIcon(new ImageIcon(imT1));
		
		JLabel lblT2_4 = new JLabel("0");
		lblT2_4.setBounds(190, 451, 40, 40);
		frmMastermind.getContentPane().add(lblT2_4);
		lblT2_4.setIcon(new ImageIcon(imT1));
		
		JLabel lblT3_1 = new JLabel("0");
		lblT3_1.setBounds(40, 400, 40, 40);
		frmMastermind.getContentPane().add(lblT3_1);
		lblT3_1.setIcon(new ImageIcon(imT1));
		
		JLabel lblT3_2 = new JLabel("0");
		lblT3_2.setBounds(90, 400, 40, 40);
		frmMastermind.getContentPane().add(lblT3_2);
		lblT3_2.setIcon(new ImageIcon(imT1));
		
		JLabel lblT3_3 = new JLabel("0");
		lblT3_3.setBounds(140, 400, 40, 40);
		frmMastermind.getContentPane().add(lblT3_3);
		lblT3_3.setIcon(new ImageIcon(imT1));
		
		JLabel lblT3_4 = new JLabel("0");
		lblT3_4.setBounds(190, 400, 40, 40);
		frmMastermind.getContentPane().add(lblT3_4);
		lblT3_4.setIcon(new ImageIcon(imT1));
		
		JLabel lblSelected = new JLabel("0");
		lblSelected.setBounds(103, 11, 40, 40);
		frmMastermind.getContentPane().add(lblSelected);
		lblSelected.setIcon(new ImageIcon(imT1));
		
		JButton btnCheck1 = new JButton("Check");
		btnCheck1.setBounds(258, 503, 80, 40);
		frmMastermind.getContentPane().add(btnCheck1);
		
		JButton btnCheck2 = new JButton("Check");
		btnCheck2.setEnabled(false);
		btnCheck2.setBounds(258, 451, 80, 40);
		frmMastermind.getContentPane().add(btnCheck2);
		
		JButton btnCheck3 = new JButton("Check");
		btnCheck3.setEnabled(false);
		btnCheck3.setBounds(258, 400, 80, 40);
		frmMastermind.getContentPane().add(btnCheck3);
		
		JButton btnCheck4 = new JButton("Check");
		btnCheck4.setEnabled(false);
		btnCheck4.setBounds(258, 350, 80, 40);
		frmMastermind.getContentPane().add(btnCheck4);
		
		JButton btnCheck5 = new JButton("Check");
		btnCheck5.setEnabled(false);
		btnCheck5.setBounds(258, 294, 80, 40);
		frmMastermind.getContentPane().add(btnCheck5);
		
		JButton btnCheck6 = new JButton("Check");
		btnCheck6.setEnabled(false);
		btnCheck6.setBounds(258, 237, 80, 40);
		frmMastermind.getContentPane().add(btnCheck6);
		
		JButton btnCheck7 = new JButton("Check");
		btnCheck7.setEnabled(false);
		btnCheck7.setBounds(258, 182, 80, 40);
		frmMastermind.getContentPane().add(btnCheck7);
		
		JButton btnCheck8 = new JButton("Check");
		btnCheck8.setEnabled(false);
		btnCheck8.setBounds(258, 124, 80, 40);
		frmMastermind.getContentPane().add(btnCheck8);
		
		JButton btnCheck9 = new JButton("Check");
		btnCheck9.setEnabled(false);
		btnCheck9.setBounds(258, 73, 80, 40);
		frmMastermind.getContentPane().add(btnCheck9);
		
		JButton btnNewGame = new JButton("New game");
		btnNewGame.setBounds(338, 576, 97, 32);
		frmMastermind.getContentPane().add(btnNewGame);
		
		JLabel lblC1_1 = new JLabel("New label");
		lblC1_1.setBounds(348, 503, 20, 20);
		frmMastermind.getContentPane().add(lblC1_1);
		Image imC = new ImageIcon(this.getClass().getResource("/Orb.png")).getImage().getScaledInstance(lblC1_1.getWidth(), lblC1_1.getHeight(),  java.awt.Image.SCALE_SMOOTH);
		lblC1_1.setIcon(new ImageIcon(imC));
		Image Red = new ImageIcon(this.getClass().getResource("/Red.png")).getImage().getScaledInstance(lblC1_1.getWidth(), lblC1_1.getHeight(),  java.awt.Image.SCALE_SMOOTH);
		Image Yellow = new ImageIcon(this.getClass().getResource("/Yellow.png")).getImage().getScaledInstance(lblC1_1.getWidth(), lblC1_1.getHeight(),  java.awt.Image.SCALE_SMOOTH);
		
		JLabel lblC1_2 = new JLabel("New label");
		lblC1_2.setBounds(377, 503, 20, 20);
		frmMastermind.getContentPane().add(lblC1_2);
		lblC1_2.setIcon(new ImageIcon(imC));
		
		JLabel lblC1_3 = new JLabel("New label");
		lblC1_3.setBounds(348, 523, 20, 20);
		frmMastermind.getContentPane().add(lblC1_3);
		lblC1_3.setIcon(new ImageIcon(imC));
		
		JLabel lblC1_4 = new JLabel("New label");
		lblC1_4.setBounds(377, 523, 20, 20);
		frmMastermind.getContentPane().add(lblC1_4);
		lblC1_4.setIcon(new ImageIcon(imC));
		
		JLabel lblC2_1 = new JLabel("New label");
		lblC2_1.setBounds(348, 451, 20, 20);
		frmMastermind.getContentPane().add(lblC2_1);
		lblC2_1.setIcon(new ImageIcon(imC));
		
		JLabel lblC2_2 = new JLabel("New label");
		lblC2_2.setBounds(377, 451, 20, 20);
		frmMastermind.getContentPane().add(lblC2_2);
		lblC2_2.setIcon(new ImageIcon(imC));
		
		JLabel lblC2_3 = new JLabel("New label");
		lblC2_3.setBounds(348, 471, 20, 20);
		frmMastermind.getContentPane().add(lblC2_3);
		lblC2_3.setIcon(new ImageIcon(imC));
		
		JLabel lblC2_4 = new JLabel("New label");
		lblC2_4.setBounds(377, 471, 20, 20);
		frmMastermind.getContentPane().add(lblC2_4);
		lblC2_4.setIcon(new ImageIcon(imC));
		
		JLabel lblC3_1 = new JLabel("New label");
		lblC3_1.setBounds(348, 400, 20, 20);
		frmMastermind.getContentPane().add(lblC3_1);
		lblC3_1.setIcon(new ImageIcon(imC));
		
		JLabel lblC3_2 = new JLabel("New label");
		lblC3_2.setBounds(377, 400, 20, 20);
		frmMastermind.getContentPane().add(lblC3_2);
		lblC3_2.setIcon(new ImageIcon(imC));
		
		JLabel lblC3_3 = new JLabel("New label");
		lblC3_3.setBounds(348, 420, 20, 20);
		frmMastermind.getContentPane().add(lblC3_3);
		lblC3_3.setIcon(new ImageIcon(imC));
		
		JLabel lblC3_4 = new JLabel("New label");
		lblC3_4.setBounds(377, 420, 20, 20);
		frmMastermind.getContentPane().add(lblC3_4);
		lblC3_4.setIcon(new ImageIcon(imC));
		
		JLabel lblC4_1 = new JLabel("New label");
		lblC4_1.setBounds(348, 350, 20, 20);
		frmMastermind.getContentPane().add(lblC4_1);
		lblC4_1.setIcon(new ImageIcon(imC));
		
		JLabel lblC4_2 = new JLabel("New label");
		lblC4_2.setBounds(377, 350, 20, 20);
		frmMastermind.getContentPane().add(lblC4_2);
		lblC4_2.setIcon(new ImageIcon(imC));
		
		JLabel lblC4_3 = new JLabel("New label");
		lblC4_3.setBounds(348, 370, 20, 20);
		frmMastermind.getContentPane().add(lblC4_3);
		lblC4_3.setIcon(new ImageIcon(imC));
		
		JLabel lblC4_4 = new JLabel("New label");
		lblC4_4.setBounds(377, 370, 20, 20);
		frmMastermind.getContentPane().add(lblC4_4);
		lblC4_4.setIcon(new ImageIcon(imC));
		
		JLabel lblC5_1 = new JLabel("New label");
		lblC5_1.setBounds(348, 294, 20, 20);
		frmMastermind.getContentPane().add(lblC5_1);
		lblC5_1.setIcon(new ImageIcon(imC));
		
		JLabel lblC5_2 = new JLabel("New label");
		lblC5_2.setBounds(377, 294, 20, 20);
		frmMastermind.getContentPane().add(lblC5_2);
		lblC5_2.setIcon(new ImageIcon(imC));
		
		JLabel lblC5_3 = new JLabel("New label");
		lblC5_3.setBounds(348, 314, 20, 20);
		frmMastermind.getContentPane().add(lblC5_3);
		lblC5_3.setIcon(new ImageIcon(imC));
		
		JLabel lblC5_4 = new JLabel("New label");
		lblC5_4.setBounds(377, 314, 20, 20);
		frmMastermind.getContentPane().add(lblC5_4);
		lblC5_4.setIcon(new ImageIcon(imC));
		
		JLabel lblC6_1 = new JLabel("New label");
		lblC6_1.setBounds(348, 237, 20, 20);
		frmMastermind.getContentPane().add(lblC6_1);
		lblC6_1.setIcon(new ImageIcon(imC));
		
		JLabel lblC6_2 = new JLabel("New label");
		lblC6_2.setBounds(377, 237, 20, 20);
		frmMastermind.getContentPane().add(lblC6_2);
		lblC6_2.setIcon(new ImageIcon(imC));
		
		JLabel lblC6_3 = new JLabel("New label");
		lblC6_3.setBounds(348, 257, 20, 20);
		frmMastermind.getContentPane().add(lblC6_3);
		lblC6_3.setIcon(new ImageIcon(imC));
		
		JLabel lblC6_4 = new JLabel("New label");
		lblC6_4.setBounds(377, 257, 20, 20);
		frmMastermind.getContentPane().add(lblC6_4);
		lblC6_4.setIcon(new ImageIcon(imC));
		
		JLabel lblC7_1 = new JLabel("New label");
		lblC7_1.setBounds(348, 182, 20, 20);
		frmMastermind.getContentPane().add(lblC7_1);
		lblC7_1.setIcon(new ImageIcon(imC));
		
		JLabel lblC7_2 = new JLabel("New label");
		lblC7_2.setBounds(377, 182, 20, 20);
		frmMastermind.getContentPane().add(lblC7_2);
		lblC7_2.setIcon(new ImageIcon(imC));
		
		JLabel lblC7_3 = new JLabel("New label");
		lblC7_3.setBounds(348, 202, 20, 20);
		frmMastermind.getContentPane().add(lblC7_3);
		lblC7_3.setIcon(new ImageIcon(imC));
		
		JLabel lblC7_4 = new JLabel("New label");
		lblC7_4.setBounds(377, 202, 20, 20);
		frmMastermind.getContentPane().add(lblC7_4);
		lblC7_4.setIcon(new ImageIcon(imC));
		
		JLabel lblC8_1 = new JLabel("New label");
		lblC8_1.setBounds(348, 124, 20, 20);
		frmMastermind.getContentPane().add(lblC8_1);
		lblC8_1.setIcon(new ImageIcon(imC));
		
		JLabel lblC8_2 = new JLabel("New label");
		lblC8_2.setBounds(377, 124, 20, 20);
		frmMastermind.getContentPane().add(lblC8_2);
		lblC8_2.setIcon(new ImageIcon(imC));
		
		JLabel lblC8_3 = new JLabel("New label");
		lblC8_3.setBounds(348, 144, 20, 20);
		frmMastermind.getContentPane().add(lblC8_3);
		lblC8_3.setIcon(new ImageIcon(imC));
		
		JLabel lblC8_4 = new JLabel("New label");
		lblC8_4.setBounds(377, 144, 20, 20);
		frmMastermind.getContentPane().add(lblC8_4);
		lblC8_4.setIcon(new ImageIcon(imC));
		
		JLabel lblC9_1 = new JLabel("New label");
		lblC9_1.setBounds(348, 73, 20, 20);
		frmMastermind.getContentPane().add(lblC9_1);
		lblC9_1.setIcon(new ImageIcon(imC));
		
		JLabel lblC9_2 = new JLabel("New label");
		lblC9_2.setBounds(377, 73, 20, 20);
		frmMastermind.getContentPane().add(lblC9_2);
		lblC9_2.setIcon(new ImageIcon(imC));
		
		JLabel lblC9_3 = new JLabel("New label");
		lblC9_3.setBounds(348, 93, 20, 20);
		frmMastermind.getContentPane().add(lblC9_3);
		lblC9_3.setIcon(new ImageIcon(imC));
		
		JLabel lblC9_4 = new JLabel("New label");
		lblC9_4.setBounds(377, 93, 20, 20);
		frmMastermind.getContentPane().add(lblC9_4);
		lblC9_4.setIcon(new ImageIcon(imC));
		
		lblT1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (attempt == 1) {
					lblT1_1.setIcon(lblSelected.getIcon());
					lblT1_1.setText(lblSelected.getText());}
			}
		});
		lblT1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (attempt == 1) {
					lblT1_2.setIcon(lblSelected.getIcon());
					lblT1_2.setText(lblSelected.getText());}
			}
		});
		lblT1_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (attempt == 1) {
					lblT1_3.setIcon(lblSelected.getIcon());
					lblT1_3.setText(lblSelected.getText());}
			}
		});
		lblT1_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (attempt == 1) {
					lblT1_4.setIcon(lblSelected.getIcon());
					lblT1_4.setText(lblSelected.getText());}
			}
		});
		lblT2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (attempt == 2) {
					lblT2_1.setIcon(lblSelected.getIcon());
					lblT2_1.setText(lblSelected.getText());}
			}
		});
		lblT2_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (attempt == 2) {
					lblT2_2.setIcon(lblSelected.getIcon());
					lblT2_2.setText(lblSelected.getText());}
			}
		});
		lblT2_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (attempt == 2) {
					lblT2_3.setIcon(lblSelected.getIcon());
					lblT2_3.setText(lblSelected.getText());}
			}
		});
		lblT2_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (attempt == 2) {
					lblT2_4.setIcon(lblSelected.getIcon());
					lblT2_4.setText(lblSelected.getText());}
			}
		});
		lblT3_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (attempt == 3) {
					lblT3_1.setIcon(lblSelected.getIcon());
					lblT3_1.setText(lblSelected.getText());}
			}
		});
		lblT3_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (attempt == 3) {
					lblT3_2.setIcon(lblSelected.getIcon());
					lblT3_2.setText(lblSelected.getText());}
			}
		});
		lblT3_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (attempt == 3) {
					lblT3_3.setIcon(lblSelected.getIcon());
					lblT3_3.setText(lblSelected.getText());}
			}
		});
		lblT3_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (attempt == 3) {
					lblT3_4.setIcon(lblSelected.getIcon());
					lblT3_4.setText(lblSelected.getText());}
			}
		});
		lblT4_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (attempt == 4) {
					lblT4_1.setIcon(lblSelected.getIcon());
					lblT4_1.setText(lblSelected.getText());}
			}
		});
		lblT4_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (attempt == 4) {
					lblT4_2.setIcon(lblSelected.getIcon());
					lblT4_2.setText(lblSelected.getText());}
			}
		});
		lblT4_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (attempt == 4) {
					lblT4_3.setIcon(lblSelected.getIcon());
					lblT4_3.setText(lblSelected.getText());}
			}
		});
		lblT4_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (attempt == 4) {
					lblT4_4.setIcon(lblSelected.getIcon());
					lblT4_4.setText(lblSelected.getText());}
			}
		});
		lblT5_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (attempt == 5) {
					lblT5_1.setIcon(lblSelected.getIcon());
					lblT5_1.setText(lblSelected.getText());}
			}
		});
		lblT5_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (attempt == 5) {
					lblT5_2.setIcon(lblSelected.getIcon());
					lblT5_2.setText(lblSelected.getText());}
			}
		});
		lblT5_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (attempt == 5) {
					lblT5_3.setIcon(lblSelected.getIcon());
					lblT5_3.setText(lblSelected.getText());}
			}
		});
		lblT5_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (attempt == 5) {
					lblT5_4.setIcon(lblSelected.getIcon());
					lblT5_4.setText(lblSelected.getText());}
			}
		});
		lblT6_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (attempt == 6) {
					lblT6_1.setIcon(lblSelected.getIcon());
					lblT6_1.setText(lblSelected.getText());}
			}
		});
		lblT6_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (attempt == 6) {
					lblT6_2.setIcon(lblSelected.getIcon());
					lblT6_2.setText(lblSelected.getText());}
			}
		});
		lblT6_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (attempt == 6) {
					lblT6_3.setIcon(lblSelected.getIcon());
					lblT6_3.setText(lblSelected.getText());}
			}
		});
		lblT6_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (attempt == 6) {
					lblT6_4.setIcon(lblSelected.getIcon());
					lblT6_4.setText(lblSelected.getText());}
			}
		});
		lblT7_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (attempt == 7) {
					lblT7_1.setIcon(lblSelected.getIcon());
					lblT7_1.setText(lblSelected.getText());}
			}
		});
		lblT7_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (attempt == 7) {
					lblT7_2.setIcon(lblSelected.getIcon());
					lblT7_2.setText(lblSelected.getText());}
			}
		});
		lblT7_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (attempt == 7) {
					lblT7_3.setIcon(lblSelected.getIcon());
					lblT7_3.setText(lblSelected.getText());}
			}
		});
		lblT7_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (attempt == 7) {
					lblT7_4.setIcon(lblSelected.getIcon());
					lblT7_4.setText(lblSelected.getText());}
			}
		});
		lblT8_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (attempt == 8) {
					lblT8_1.setIcon(lblSelected.getIcon());
					lblT8_1.setText(lblSelected.getText());}
			}
		});
		lblT8_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (attempt == 8) {
					lblT8_2.setIcon(lblSelected.getIcon());
					lblT8_2.setText(lblSelected.getText());}
			}
		});
		lblT8_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (attempt == 8) {
					lblT8_3.setIcon(lblSelected.getIcon());
					lblT8_3.setText(lblSelected.getText());}
			}
		});
		lblT8_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (attempt == 8) {
					lblT8_4.setIcon(lblSelected.getIcon());
					lblT8_4.setText(lblSelected.getText());}
			}
		});
		lblT9_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (attempt == 9) {
					lblT9_1.setIcon(lblSelected.getIcon());
					lblT9_1.setText(lblSelected.getText());}
			}
		});
		lblT9_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (attempt == 9) {
					lblT9_2.setIcon(lblSelected.getIcon());
					lblT9_2.setText(lblSelected.getText());}
			}
		});
		lblT9_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (attempt == 9) {
					lblT9_3.setIcon(lblSelected.getIcon());
					lblT9_3.setText(lblSelected.getText());}
			}
		});
		lblT9_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (attempt == 9) {
					lblT9_4.setIcon(lblSelected.getIcon());
					lblT9_4.setText(lblSelected.getText());}
			}
		});
		lbl1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblSelected.setIcon(new ImageIcon(im));
				lblSelected.setText("1");
			}
		});
		lbl2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblSelected.setIcon(new ImageIcon(im2));
				lblSelected.setText("2");
			}
		});
		lbl3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblSelected.setIcon(new ImageIcon(im3));
				lblSelected.setText("3");
			}
		});
		lbl4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblSelected.setIcon(new ImageIcon(im4));
				lblSelected.setText("4");
			}
		});
		lbl5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblSelected.setIcon(new ImageIcon(im5));
				lblSelected.setText("5");
			}
		});
		lbl6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblSelected.setIcon(new ImageIcon(im6));
				lblSelected.setText("6");
			}
		});
		btnCheck1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (lblT1_1.getText()=="0" || lblT1_2.getText()=="0" || lblT1_3.getText()=="0" || lblT1_4.getText()=="0")
					JOptionPane.showMessageDialog(frmMastermind, "Row is not complete!");
				else {
					if (Integer.parseInt(lblT1_1.getText()) == array.get(0) && Integer.parseInt(lblT1_2.getText()) == array.get(1) && Integer.parseInt(lblT1_3.getText()) == array.get(2) && Integer.parseInt(lblT1_4.getText()) == array.get(3)) {
						JOptionPane.showMessageDialog(frmMastermind, "Congratulations! You win!!!");
						attempt = 10;
						btnCheck1.setEnabled(false);}
					else {
						if (Integer.parseInt(lblT1_1.getText()) == array.get(0))
							correct++;
						if (Integer.parseInt(lblT1_2.getText()) == array.get(1))
							correct++;
						if (Integer.parseInt(lblT1_3.getText()) == array.get(2))
							correct++;
						if (Integer.parseInt(lblT1_4.getText()) == array.get(3))
							correct++;
						for (int i = 0; i < 4; i++) {
							if (array.get(i) == Integer.parseInt(lblT1_1.getText()) && i != 0) {
								dif_pos++;
							}
							if (array.get(i) == Integer.parseInt(lblT1_2.getText()) && i != 1) {
								dif_pos++;
							}
							if (array.get(i) == Integer.parseInt(lblT1_3.getText()) && i != 2) {
								dif_pos++;
							}
							if (array.get(i) == Integer.parseInt(lblT1_4.getText()) && i != 3) {
								dif_pos++;
							}
						}
						while (correct > 0) {
							if (check_used == 0) {
								lblC1_1.setIcon(new ImageIcon(Red));
								correct--;
								check_used++;}
							else if (check_used == 1) {
								lblC1_2.setIcon(new ImageIcon(Red));
								correct--;
								check_used++;}
							else if (check_used == 2) {
								lblC1_3.setIcon(new ImageIcon(Red));
								correct--;
								check_used++;}
						}
						while (dif_pos > 0) {
							if (check_used == 0) {
								lblC1_1.setIcon(new ImageIcon(Yellow));
								dif_pos--;
								check_used++;}
							else if (check_used == 1) {
								lblC1_2.setIcon(new ImageIcon(Yellow));
								dif_pos--;
								check_used++;}
							else if (check_used == 2) {
								lblC1_3.setIcon(new ImageIcon(Yellow));
								dif_pos--;
								check_used++;}
							else if (check_used == 3) {
								lblC1_4.setIcon(new ImageIcon(Yellow));
								dif_pos--;
								check_used++;}
						}
						btnCheck2.setEnabled(true);
						btnCheck1.setEnabled(false);
						attempt++;}}
				
			}
		});
		btnCheck2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (lblT1_2.getText()=="0" || lblT2_2.getText()=="0" || lblT2_3.getText()=="0" || lblT2_4.getText()=="0")
					JOptionPane.showMessageDialog(frmMastermind, "Row is not complete!");
				else {
					if (Integer.parseInt(lblT2_1.getText()) == array.get(0) && Integer.parseInt(lblT2_2.getText()) == array.get(1) && Integer.parseInt(lblT2_3.getText()) == array.get(2) && Integer.parseInt(lblT2_4.getText()) == array.get(3)) {
						JOptionPane.showMessageDialog(frmMastermind, "Congratulations! You win!!!");
						attempt = 10;
						btnCheck2.setEnabled(false);}
					else {
						check_used=0;
						correct=0;
						dif_pos=0;
						if (Integer.parseInt(lblT2_1.getText()) == array.get(0))
							correct++;
						if (Integer.parseInt(lblT2_2.getText()) == array.get(1))
							correct++;
						if (Integer.parseInt(lblT2_3.getText()) == array.get(2))
							correct++;
						if (Integer.parseInt(lblT2_4.getText()) == array.get(3))
							correct++;
						for (int i = 0; i < 4; i++) {
							if (array.get(i) == Integer.parseInt(lblT2_1.getText()) && i != 0) {
								dif_pos++;
							}
							if (array.get(i) == Integer.parseInt(lblT2_2.getText()) && i != 1) {
								dif_pos++;
							}
							if (array.get(i) == Integer.parseInt(lblT2_3.getText()) && i != 2) {
								dif_pos++;
							}
							if (array.get(i) == Integer.parseInt(lblT2_4.getText()) && i != 3) {
								dif_pos++;
							}
						}
						while (correct > 0) {
							if (check_used == 0) {
								lblC2_1.setIcon(new ImageIcon(Red));
								correct--;
								check_used++;}
							else if (check_used == 1) {
								lblC2_2.setIcon(new ImageIcon(Red));
								correct--;
								check_used++;}
							else if (check_used == 2) {
								lblC2_3.setIcon(new ImageIcon(Red));
								correct--;
								check_used++;}
						}
						while (dif_pos > 0) {
							if (check_used == 0) {
								lblC2_1.setIcon(new ImageIcon(Yellow));
								dif_pos--;
								check_used++;}
							else if (check_used == 1) {
								lblC2_2.setIcon(new ImageIcon(Yellow));
								dif_pos--;
								check_used++;}
							else if (check_used == 2) {
								lblC2_3.setIcon(new ImageIcon(Yellow));
								dif_pos--;
								check_used++;}
							else if (check_used == 3) {
								lblC2_4.setIcon(new ImageIcon(Yellow));
								dif_pos--;
								check_used++;}
						}
				btnCheck3.setEnabled(true);
				btnCheck2.setEnabled(false);
				attempt++;}}
				
			}
		});
		btnCheck3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (lblT3_1.getText()=="0" || lblT3_2.getText()=="0" || lblT3_3.getText()=="0" || lblT3_4.getText()=="0")
					JOptionPane.showMessageDialog(frmMastermind, "Row is not complete!");
				else {
					if (Integer.parseInt(lblT3_1.getText()) == array.get(0) && Integer.parseInt(lblT3_2.getText()) == array.get(1) && Integer.parseInt(lblT3_3.getText()) == array.get(2) && Integer.parseInt(lblT3_4.getText()) == array.get(3)) {
						JOptionPane.showMessageDialog(frmMastermind, "Congratulations! You win!!!");
						attempt = 10;
						btnCheck3.setEnabled(false);}
					else {
						check_used=0;
						correct=0;
						dif_pos=0;
						if (Integer.parseInt(lblT3_1.getText()) == array.get(0))
							correct++;
						if (Integer.parseInt(lblT3_2.getText()) == array.get(1))
							correct++;
						if (Integer.parseInt(lblT3_3.getText()) == array.get(2))
							correct++;
						if (Integer.parseInt(lblT3_4.getText()) == array.get(3))
							correct++;
						for (int i = 0; i < 4; i++) {
							if (array.get(i) == Integer.parseInt(lblT3_1.getText()) && i != 0) {
								dif_pos++;
							}
							if (array.get(i) == Integer.parseInt(lblT3_2.getText()) && i != 1) {
								dif_pos++;
							}
							if (array.get(i) == Integer.parseInt(lblT3_3.getText()) && i != 2) {
								dif_pos++;
							}
							if (array.get(i) == Integer.parseInt(lblT3_4.getText()) && i != 3) {
								dif_pos++;
							}
						}
						while (correct > 0) {
							if (check_used == 0) {
								lblC3_1.setIcon(new ImageIcon(Red));
								correct--;
								check_used++;}
							else if (check_used == 1) {
								lblC3_2.setIcon(new ImageIcon(Red));
								correct--;
								check_used++;}
							else if (check_used == 2) {
								lblC3_3.setIcon(new ImageIcon(Red));
								correct--;
								check_used++;}
						}
						while (dif_pos > 0) {
							if (check_used == 0) {
								lblC3_1.setIcon(new ImageIcon(Yellow));
								dif_pos--;
								check_used++;}
							else if (check_used == 1) {
								lblC3_2.setIcon(new ImageIcon(Yellow));
								dif_pos--;
								check_used++;}
							else if (check_used == 2) {
								lblC3_3.setIcon(new ImageIcon(Yellow));
								dif_pos--;
								check_used++;}
							else if (check_used == 3) {
								lblC3_4.setIcon(new ImageIcon(Yellow));
								dif_pos--;
								check_used++;}
						}
				btnCheck4.setEnabled(true);
				btnCheck3.setEnabled(false);
				attempt++;}}
				
			}
		});
		btnCheck4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (lblT4_1.getText()=="0" || lblT4_2.getText()=="0" || lblT4_3.getText()=="0" || lblT4_4.getText()=="0")
					JOptionPane.showMessageDialog(frmMastermind, "Row is not complete!");
				else {
					if (Integer.parseInt(lblT4_1.getText()) == array.get(0) && Integer.parseInt(lblT4_2.getText()) == array.get(1) && Integer.parseInt(lblT4_3.getText()) == array.get(2) && Integer.parseInt(lblT4_4.getText()) == array.get(3)) {
						JOptionPane.showMessageDialog(frmMastermind, "Congratulations! You win!!!");
						attempt = 10;
						btnCheck4.setEnabled(false);}
					else {
						check_used=0;
						correct=0;
						dif_pos=0;
						if (Integer.parseInt(lblT4_1.getText()) == array.get(0))
							correct++;
						if (Integer.parseInt(lblT4_2.getText()) == array.get(1))
							correct++;
						if (Integer.parseInt(lblT4_3.getText()) == array.get(2))
							correct++;
						if (Integer.parseInt(lblT4_4.getText()) == array.get(3))
							correct++;
						for (int i = 0; i < 4; i++) {
							if (array.get(i) == Integer.parseInt(lblT4_1.getText()) && i != 0) {
								dif_pos++;
							}
							if (array.get(i) == Integer.parseInt(lblT4_2.getText()) && i != 1) {
								dif_pos++;
							}
							if (array.get(i) == Integer.parseInt(lblT4_3.getText()) && i != 2) {
								dif_pos++;
							}
							if (array.get(i) == Integer.parseInt(lblT4_4.getText()) && i != 3) {
								dif_pos++;
							}
						}
						while (correct > 0) {
							if (check_used == 0) {
								lblC4_1.setIcon(new ImageIcon(Red));
								correct--;
								check_used++;}
							else if (check_used == 1) {
								lblC4_2.setIcon(new ImageIcon(Red));
								correct--;
								check_used++;}
							else if (check_used == 2) {
								lblC4_3.setIcon(new ImageIcon(Red));
								correct--;
								check_used++;}
						}
						while (dif_pos > 0) {
							if (check_used == 0) {
								lblC4_1.setIcon(new ImageIcon(Yellow));
								dif_pos--;
								check_used++;}
							else if (check_used == 1) {
								lblC4_2.setIcon(new ImageIcon(Yellow));
								dif_pos--;
								check_used++;}
							else if (check_used == 2) {
								lblC4_3.setIcon(new ImageIcon(Yellow));
								dif_pos--;
								check_used++;}
							else if (check_used == 3) {
								lblC4_4.setIcon(new ImageIcon(Yellow));
								dif_pos--;
								check_used++;}
						}
				btnCheck5.setEnabled(true);
				btnCheck4.setEnabled(false);
				attempt++;}}
				
			}
		});
		btnCheck5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (lblT5_1.getText()=="0" || lblT5_2.getText()=="0" || lblT5_3.getText()=="0" || lblT5_4.getText()=="0")
					JOptionPane.showMessageDialog(frmMastermind, "Row is not complete!");
				else {
					if (Integer.parseInt(lblT5_1.getText()) == array.get(0) && Integer.parseInt(lblT5_2.getText()) == array.get(1) && Integer.parseInt(lblT5_3.getText()) == array.get(2) && Integer.parseInt(lblT5_4.getText()) == array.get(3)) {
						JOptionPane.showMessageDialog(frmMastermind, "Congratulations! You win!!!");
						attempt = 10;
						btnCheck5.setEnabled(false);}
					else {
						check_used=0;
						correct=0;
						dif_pos=0;
						if (Integer.parseInt(lblT5_1.getText()) == array.get(0))
							correct++;
						if (Integer.parseInt(lblT5_2.getText()) == array.get(1))
							correct++;
						if (Integer.parseInt(lblT5_3.getText()) == array.get(2))
							correct++;
						if (Integer.parseInt(lblT5_4.getText()) == array.get(3))
							correct++;
						for (int i = 0; i < 4; i++) {
							if (array.get(i) == Integer.parseInt(lblT5_1.getText()) && i != 0) {
								dif_pos++;
							}
							if (array.get(i) == Integer.parseInt(lblT5_2.getText()) && i != 1) {
								dif_pos++;
							}
							if (array.get(i) == Integer.parseInt(lblT5_3.getText()) && i != 2) {
								dif_pos++;
							}
							if (array.get(i) == Integer.parseInt(lblT5_4.getText()) && i != 3) {
								dif_pos++;
							}
						}
						while (correct > 0) {
							if (check_used == 0) {
								lblC5_1.setIcon(new ImageIcon(Red));
								correct--;
								check_used++;}
							else if (check_used == 1) {
								lblC5_2.setIcon(new ImageIcon(Red));
								correct--;
								check_used++;}
							else if (check_used == 2) {
								lblC5_3.setIcon(new ImageIcon(Red));
								correct--;
								check_used++;}
						}
						while (dif_pos > 0) {
							if (check_used == 0) {
								lblC5_1.setIcon(new ImageIcon(Yellow));
								dif_pos--;
								check_used++;}
							else if (check_used == 1) {
								lblC5_2.setIcon(new ImageIcon(Yellow));
								dif_pos--;
								check_used++;}
							else if (check_used == 2) {
								lblC5_3.setIcon(new ImageIcon(Yellow));
								dif_pos--;
								check_used++;}
							else if (check_used == 3) {
								lblC5_4.setIcon(new ImageIcon(Yellow));
								dif_pos--;
								check_used++;}
						}
				btnCheck6.setEnabled(true);
				btnCheck5.setEnabled(false);
				attempt++;}}
				
			}
		});
		btnCheck6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (lblT6_1.getText()=="0" || lblT6_2.getText()=="0" || lblT6_3.getText()=="0" || lblT6_4.getText()=="0")
					JOptionPane.showMessageDialog(frmMastermind, "Row is not complete!");
				else {
					if (Integer.parseInt(lblT6_1.getText()) == array.get(0) && Integer.parseInt(lblT6_2.getText()) == array.get(1) && Integer.parseInt(lblT6_3.getText()) == array.get(2) && Integer.parseInt(lblT6_4.getText()) == array.get(3)) {
						JOptionPane.showMessageDialog(frmMastermind, "Congratulations! You win!!!");
						attempt = 10;
						btnCheck6.setEnabled(false);}
					else {
						check_used=0;
						correct=0;
						dif_pos=0;
						if (Integer.parseInt(lblT6_1.getText()) == array.get(0))
							correct++;
						if (Integer.parseInt(lblT6_2.getText()) == array.get(1))
							correct++;
						if (Integer.parseInt(lblT6_3.getText()) == array.get(2))
							correct++;
						if (Integer.parseInt(lblT6_4.getText()) == array.get(3))
							correct++;
						for (int i = 0; i < 4; i++) {
							if (array.get(i) == Integer.parseInt(lblT6_1.getText()) && i != 0) {
								dif_pos++;
							}
							if (array.get(i) == Integer.parseInt(lblT6_2.getText()) && i != 1) {
								dif_pos++;
							}
							if (array.get(i) == Integer.parseInt(lblT6_3.getText()) && i != 2) {
								dif_pos++;
							}
							if (array.get(i) == Integer.parseInt(lblT6_4.getText()) && i != 3) {
								dif_pos++;
							}
						}
						while (correct > 0) {
							if (check_used == 0) {
								lblC6_1.setIcon(new ImageIcon(Red));
								correct--;
								check_used++;}
							else if (check_used == 1) {
								lblC6_2.setIcon(new ImageIcon(Red));
								correct--;
								check_used++;}
							else if (check_used == 2) {
								lblC6_3.setIcon(new ImageIcon(Red));
								correct--;
								check_used++;}
						}
						while (dif_pos > 0) {
							if (check_used == 0) {
								lblC6_1.setIcon(new ImageIcon(Yellow));
								dif_pos--;
								check_used++;}
							else if (check_used == 1) {
								lblC6_2.setIcon(new ImageIcon(Yellow));
								dif_pos--;
								check_used++;}
							else if (check_used == 2) {
								lblC6_3.setIcon(new ImageIcon(Yellow));
								dif_pos--;
								check_used++;}
							else if (check_used == 3) {
								lblC6_4.setIcon(new ImageIcon(Yellow));
								dif_pos--;
								check_used++;}
						}
				btnCheck7.setEnabled(true);
				btnCheck6.setEnabled(false);
				attempt++;}}
				
			}
		});
		btnCheck7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (lblT7_1.getText()=="0" || lblT7_2.getText()=="0" || lblT7_3.getText()=="0" || lblT7_4.getText()=="0")
					JOptionPane.showMessageDialog(frmMastermind, "Row is not complete!");
				else {
					if (Integer.parseInt(lblT7_1.getText()) == array.get(0) && Integer.parseInt(lblT7_2.getText()) == array.get(1) && Integer.parseInt(lblT7_3.getText()) == array.get(2) && Integer.parseInt(lblT7_4.getText()) == array.get(3)) {
						JOptionPane.showMessageDialog(frmMastermind, "Congratulations! You win!!!");
						attempt = 10;
						btnCheck7.setEnabled(false);}
					else {
						check_used=0;
						correct=0;
						dif_pos=0;
						if (Integer.parseInt(lblT7_1.getText()) == array.get(0))
							correct++;
						if (Integer.parseInt(lblT7_2.getText()) == array.get(1))
							correct++;
						if (Integer.parseInt(lblT7_3.getText()) == array.get(2))
							correct++;
						if (Integer.parseInt(lblT7_4.getText()) == array.get(3))
							correct++;
						for (int i = 0; i < 4; i++) {
							if (array.get(i) == Integer.parseInt(lblT7_1.getText()) && i != 0) {
								dif_pos++;
							}
							if (array.get(i) == Integer.parseInt(lblT7_2.getText()) && i != 1) {
								dif_pos++;
							}
							if (array.get(i) == Integer.parseInt(lblT7_3.getText()) && i != 2) {
								dif_pos++;
							}
							if (array.get(i) == Integer.parseInt(lblT7_4.getText()) && i != 3) {
								dif_pos++;
							}
						}
						while (correct > 0) {
							if (check_used == 0) {
								lblC7_1.setIcon(new ImageIcon(Red));
								correct--;
								check_used++;}
							else if (check_used == 1) {
								lblC7_2.setIcon(new ImageIcon(Red));
								correct--;
								check_used++;}
							else if (check_used == 2) {
								lblC7_3.setIcon(new ImageIcon(Red));
								correct--;
								check_used++;}
						}
						while (dif_pos > 0) {
							if (check_used == 0) {
								lblC7_1.setIcon(new ImageIcon(Yellow));
								dif_pos--;
								check_used++;}
							else if (check_used == 1) {
								lblC7_2.setIcon(new ImageIcon(Yellow));
								dif_pos--;
								check_used++;}
							else if (check_used == 2) {
								lblC7_3.setIcon(new ImageIcon(Yellow));
								dif_pos--;
								check_used++;}
							else if (check_used == 3) {
								lblC7_4.setIcon(new ImageIcon(Yellow));
								dif_pos--;
								check_used++;}
						}
				btnCheck8.setEnabled(true);
				btnCheck7.setEnabled(false);
				attempt++;}}
				
			}
		});
		btnCheck8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (lblT8_1.getText()=="0" || lblT8_2.getText()=="0" || lblT8_3.getText()=="0" || lblT8_4.getText()=="0")
					JOptionPane.showMessageDialog(frmMastermind, "Row is not complete!");
				else {
					if (Integer.parseInt(lblT8_1.getText()) == array.get(0) && Integer.parseInt(lblT8_2.getText()) == array.get(1) && Integer.parseInt(lblT8_3.getText()) == array.get(2) && Integer.parseInt(lblT8_4.getText()) == array.get(3)) {
						JOptionPane.showMessageDialog(frmMastermind, "Congratulations! You win!!!");
						attempt = 10;
						btnCheck8.setEnabled(false);}
					else {
						check_used=0;
						correct=0;
						dif_pos=0;
						if (Integer.parseInt(lblT8_1.getText()) == array.get(0))
							correct++;
						if (Integer.parseInt(lblT8_2.getText()) == array.get(1))
							correct++;
						if (Integer.parseInt(lblT8_3.getText()) == array.get(2))
							correct++;
						if (Integer.parseInt(lblT8_4.getText()) == array.get(3))
							correct++;
						for (int i = 0; i < 4; i++) {
							if (array.get(i) == Integer.parseInt(lblT8_1.getText()) && i != 0) {
								dif_pos++;
							}
							if (array.get(i) == Integer.parseInt(lblT8_2.getText()) && i != 1) {
								dif_pos++;
							}
							if (array.get(i) == Integer.parseInt(lblT8_3.getText()) && i != 2) {
								dif_pos++;
							}
							if (array.get(i) == Integer.parseInt(lblT8_4.getText()) && i != 3) {
								dif_pos++;
							}
						}
						while (correct > 0) {
							if (check_used == 0) {
								lblC8_1.setIcon(new ImageIcon(Red));
								correct--;
								check_used++;}
							else if (check_used == 1) {
								lblC8_2.setIcon(new ImageIcon(Red));
								correct--;
								check_used++;}
							else if (check_used == 2) {
								lblC8_3.setIcon(new ImageIcon(Red));
								correct--;
								check_used++;}
						}
						while (dif_pos > 0) {
							if (check_used == 0) {
								lblC8_1.setIcon(new ImageIcon(Yellow));
								dif_pos--;
								check_used++;}
							else if (check_used == 1) {
								lblC8_2.setIcon(new ImageIcon(Yellow));
								dif_pos--;
								check_used++;}
							else if (check_used == 2) {
								lblC8_3.setIcon(new ImageIcon(Yellow));
								dif_pos--;
								check_used++;}
							else if (check_used == 3) {
								lblC8_4.setIcon(new ImageIcon(Yellow));
								dif_pos--;
								check_used++;}
						}
				btnCheck9.setEnabled(true);
				btnCheck8.setEnabled(false);
				attempt++;}}
				
			}
		});
		btnCheck9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (lblT9_1.getText()=="0" || lblT9_2.getText()=="0" || lblT9_3.getText()=="0" || lblT9_4.getText()=="0")
					JOptionPane.showMessageDialog(frmMastermind, "Row is not complete!");
				else {
					if (Integer.parseInt(lblT9_1.getText()) == array.get(0) && Integer.parseInt(lblT9_2.getText()) == array.get(1) && Integer.parseInt(lblT9_3.getText()) == array.get(2) && Integer.parseInt(lblT9_4.getText()) == array.get(3)) {
						JOptionPane.showMessageDialog(frmMastermind, "Congratulations! You win!!!");
						attempt = 10;
						btnCheck9.setEnabled(false);}
					else {
						check_used=0;
						correct=0;
						dif_pos=0;
						if (Integer.parseInt(lblT9_1.getText()) == array.get(0))
							correct++;
						if (Integer.parseInt(lblT9_2.getText()) == array.get(1))
							correct++;
						if (Integer.parseInt(lblT9_3.getText()) == array.get(2))
							correct++;
						if (Integer.parseInt(lblT9_4.getText()) == array.get(3))
							correct++;
						for (int i = 0; i < 4; i++) {
							if (array.get(i) == Integer.parseInt(lblT9_1.getText()) && i != 0) {
								dif_pos++;
							}
							if (array.get(i) == Integer.parseInt(lblT9_2.getText()) && i != 1) {
								dif_pos++;
							}
							if (array.get(i) == Integer.parseInt(lblT9_3.getText()) && i != 2) {
								dif_pos++;
							}
							if (array.get(i) == Integer.parseInt(lblT9_4.getText()) && i != 3) {
								dif_pos++;
							}
						}
						while (correct > 0) {
							if (check_used == 0) {
								lblC9_1.setIcon(new ImageIcon(Red));
								correct--;
								check_used++;}
							else if (check_used == 1) {
								lblC9_2.setIcon(new ImageIcon(Red));
								correct--;
								check_used++;}
							else if (check_used == 2) {
								lblC9_3.setIcon(new ImageIcon(Red));
								correct--;
								check_used++;}
						}
						while (dif_pos > 0) {
							if (check_used == 0) {
								lblC9_1.setIcon(new ImageIcon(Yellow));
								dif_pos--;
								check_used++;}
							else if (check_used == 1) {
								lblC9_2.setIcon(new ImageIcon(Yellow));
								dif_pos--;
								check_used++;}
							else if (check_used == 2) {
								lblC9_3.setIcon(new ImageIcon(Yellow));
								dif_pos--;
								check_used++;}
							else if (check_used == 3) {
								lblC9_4.setIcon(new ImageIcon(Yellow));
								dif_pos--;
								check_used++;}
						}
				JOptionPane.showMessageDialog(frmMastermind, "Game over!");
				btnCheck9.setEnabled(false);
				attempt++;}}
				
			}
		});
		btnNewGame.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblSelected.setText("0");
				lblSelected.setIcon(new ImageIcon(imT1));
				lblT1_1.setText("0");
				lblT1_1.setIcon(new ImageIcon(imT1));
				lblT1_2.setText("0");
				lblT1_2.setIcon(new ImageIcon(imT1));
				lblT1_3.setText("0");
				lblT1_3.setIcon(new ImageIcon(imT1));
				lblT1_4.setText("0");
				lblT1_4.setIcon(new ImageIcon(imT1));
				lblT2_1.setText("0");
				lblT2_1.setIcon(new ImageIcon(imT1));
				lblT2_2.setText("0");
				lblT2_2.setIcon(new ImageIcon(imT1));
				lblT2_3.setText("0");
				lblT2_3.setIcon(new ImageIcon(imT1));
				lblT2_4.setText("0");
				lblT2_4.setIcon(new ImageIcon(imT1));
				lblT3_1.setText("0");
				lblT3_1.setIcon(new ImageIcon(imT1));
				lblT3_2.setText("0");
				lblT3_2.setIcon(new ImageIcon(imT1));
				lblT3_3.setText("0");
				lblT3_3.setIcon(new ImageIcon(imT1));
				lblT3_4.setText("0");
				lblT3_4.setIcon(new ImageIcon(imT1));
				lblT4_1.setText("0");
				lblT4_1.setIcon(new ImageIcon(imT1));
				lblT4_2.setText("0");
				lblT4_2.setIcon(new ImageIcon(imT1));
				lblT4_3.setText("0");
				lblT4_3.setIcon(new ImageIcon(imT1));
				lblT4_4.setText("0");
				lblT4_4.setIcon(new ImageIcon(imT1));
				lblT5_1.setText("0");
				lblT5_1.setIcon(new ImageIcon(imT1));
				lblT5_2.setText("0");
				lblT5_2.setIcon(new ImageIcon(imT1));
				lblT5_3.setText("0");
				lblT5_3.setIcon(new ImageIcon(imT1));
				lblT5_4.setText("0");
				lblT5_4.setIcon(new ImageIcon(imT1));
				lblT6_1.setText("0");
				lblT6_1.setIcon(new ImageIcon(imT1));
				lblT6_2.setText("0");
				lblT6_2.setIcon(new ImageIcon(imT1));
				lblT6_3.setText("0");
				lblT6_3.setIcon(new ImageIcon(imT1));
				lblT6_4.setText("0");
				lblT6_4.setIcon(new ImageIcon(imT1));
				lblT7_1.setText("0");
				lblT7_1.setIcon(new ImageIcon(imT1));
				lblT7_2.setText("0");
				lblT7_2.setIcon(new ImageIcon(imT1));
				lblT7_3.setText("0");
				lblT7_3.setIcon(new ImageIcon(imT1));
				lblT7_4.setText("0");
				lblT7_4.setIcon(new ImageIcon(imT1));
				lblT8_1.setText("0");
				lblT8_1.setIcon(new ImageIcon(imT1));
				lblT8_2.setText("0");
				lblT8_2.setIcon(new ImageIcon(imT1));
				lblT8_3.setText("0");
				lblT8_3.setIcon(new ImageIcon(imT1));
				lblT8_4.setText("0");
				lblT8_4.setIcon(new ImageIcon(imT1));
				lblT9_1.setText("0");
				lblT9_1.setIcon(new ImageIcon(imT1));
				lblT9_2.setText("0");
				lblT9_2.setIcon(new ImageIcon(imT1));
				lblT9_3.setText("0");
				lblT9_3.setIcon(new ImageIcon(imT1));
				lblT9_4.setText("0");
				lblT9_4.setIcon(new ImageIcon(imT1));
				btnCheck1.setEnabled(true);
				btnCheck2.setEnabled(false);
				btnCheck3.setEnabled(false);
				btnCheck4.setEnabled(false);
				btnCheck5.setEnabled(false);
				btnCheck6.setEnabled(false);
				btnCheck7.setEnabled(false);
				btnCheck8.setEnabled(false);
				btnCheck9.setEnabled(false);
				lblC1_1.setIcon(new ImageIcon(imC));
				lblC1_2.setIcon(new ImageIcon(imC));
				lblC1_3.setIcon(new ImageIcon(imC));
				lblC1_4.setIcon(new ImageIcon(imC));
				lblC2_1.setIcon(new ImageIcon(imC));
				lblC2_2.setIcon(new ImageIcon(imC));
				lblC2_3.setIcon(new ImageIcon(imC));
				lblC2_4.setIcon(new ImageIcon(imC));
				lblC3_1.setIcon(new ImageIcon(imC));
				lblC3_2.setIcon(new ImageIcon(imC));
				lblC3_3.setIcon(new ImageIcon(imC));
				lblC3_4.setIcon(new ImageIcon(imC));
				lblC4_1.setIcon(new ImageIcon(imC));
				lblC4_2.setIcon(new ImageIcon(imC));
				lblC4_3.setIcon(new ImageIcon(imC));
				lblC4_4.setIcon(new ImageIcon(imC));
				lblC5_1.setIcon(new ImageIcon(imC));
				lblC5_2.setIcon(new ImageIcon(imC));
				lblC5_3.setIcon(new ImageIcon(imC));
				lblC5_4.setIcon(new ImageIcon(imC));
				lblC6_1.setIcon(new ImageIcon(imC));
				lblC6_2.setIcon(new ImageIcon(imC));
				lblC6_3.setIcon(new ImageIcon(imC));
				lblC6_4.setIcon(new ImageIcon(imC));
				lblC7_1.setIcon(new ImageIcon(imC));
				lblC7_2.setIcon(new ImageIcon(imC));
				lblC7_3.setIcon(new ImageIcon(imC));
				lblC7_4.setIcon(new ImageIcon(imC));
				lblC8_1.setIcon(new ImageIcon(imC));
				lblC8_2.setIcon(new ImageIcon(imC));
				lblC8_3.setIcon(new ImageIcon(imC));
				lblC8_4.setIcon(new ImageIcon(imC));
				lblC9_1.setIcon(new ImageIcon(imC));
				lblC9_2.setIcon(new ImageIcon(imC));
				lblC9_3.setIcon(new ImageIcon(imC));
				lblC9_4.setIcon(new ImageIcon(imC));
				attempt = 1;
				correct = 0;
				dif_pos = 0;
				check_used = 0;
				array.clear();
				randomize();
			}
		});
		
	}
}
