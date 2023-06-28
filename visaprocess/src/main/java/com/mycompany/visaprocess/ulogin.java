package com.mycompany.visaprocess;

import java.sql.*;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 * User Registration using Swing
 *
 * 
 */
public class ulogin extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField uemail;

	private JPasswordField passwordField;
	private JButton btnNewButton;
	private JButton btnNewButton1;
	 private final String url = "jdbc:mysql://localhost:3306/visa";
		private final String username = "root";
		private final String pwd = "kanan";
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ulogin frame = new ulogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		});
			
	}

	/**
	 * Create the frame.
	 */

	public ulogin() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Desktop\\STDM.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1013, 659);
		setResizable(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblvisas= new JLabel("VISA PROCESSING SYSTEM");
		lblvisas.setFont(new Font("TimesNewRoman", Font.ITALIC, 18));
		lblvisas.setBounds(0,0,257, 22);
		contentPane.add(lblvisas);

		JLabel lbllogin = new JLabel("User Login/Sign-up");
		lbllogin.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lbllogin.setBounds(450,100,150,21);
		contentPane.add(lbllogin);

		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUsername.setBounds(58, 152, 99, 43);
		contentPane.add(lblUsername);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPassword.setBounds(542, 159, 99, 29);
		contentPane.add(lblPassword);

		uemail = new JTextField();

		uemail.setFont(new Font("Tahoma", Font.PLAIN, 32));
		uemail.setBounds(214, 151, 228, 50);
		contentPane.add(uemail);
		uemail.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 32));
		passwordField.setBounds(707, 151, 228, 50);
		contentPane.add(passwordField);
		passwordField.setColumns(10);
		
		
		btnNewButton1 = new JButton("New Registration");
		btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {

				String userName = uemail.getText();

				String password = passwordField.getText();
				

				String msg = "" + uemail;
				msg += " \n";
				
				try {
					
					Connection connect = DriverManager.getConnection(url, username, pwd);
					String query = "INSERT INTO login values('" + userName + "','" +  password + "')";
					Statement sta = connect.createStatement();
					int x = sta.executeUpdate(query);
					if (x == 0) {
						JOptionPane.showMessageDialog(btnNewButton, "login unsuccessful");
					} else {
						JOptionPane.showMessageDialog(btnNewButton,
								"Welcome, " + msg + "You have successfully loged in");
					}
					connect.close();
				} catch (SQLException e1) {
					System.out.println("connection issues");
					e1.printStackTrace();
				}

	        }
		});
	

	
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnNewButton.setBounds(214, 235, 228, 50);
		contentPane.add(btnNewButton);
		btnNewButton1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnNewButton1.setBounds(542, 245, 228, 50);
		contentPane.add(btnNewButton1);
		btnNewButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            dispose();
				UserRegistration ur=new UserRegistration();
                                ur.setVisible(true);
                 
			}

		});
		JFrame frame = new JFrame("ulogin");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				dispose();
				Dashboard ds= new Dashboard();
                ds.setVisible(true);
				
			}

		});
		
		
	}
}
