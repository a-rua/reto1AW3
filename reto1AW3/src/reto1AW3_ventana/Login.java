package reto1AW3_ventana;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JSplitPane;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Logger;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import objetos.persona;

import java.awt.Font;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import java.awt.Component;
import javax.swing.JButton;
import java.awt.Color;

public class Login {

	private JFrame frame;
	private JTextField txtLogin;
	private JTextField txtUsuario;
	private JTextField txtContrasea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * 
	 * @throws IOException
	 */
	public Login() throws IOException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws IOException 
	 */
	private void initialize() throws IOException {

		frame = new JFrame();
		frame.setBounds(100,100,1000,600);
		frame.setResizable(false);
		frame.setAlwaysOnTop(true);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JPanel LoginHeader = new JPanel();
		GridBagConstraints gbc_LoginHeader = new GridBagConstraints();
		gbc_LoginHeader.insets = new Insets(0, 0, 5, 0);
		gbc_LoginHeader.fill = GridBagConstraints.BOTH;
		gbc_LoginHeader.gridx = 1;
		gbc_LoginHeader.gridy = 0;
		frame.getContentPane().add(LoginHeader, gbc_LoginHeader);
		LoginHeader.setLayout(new BoxLayout(LoginHeader, BoxLayout.X_AXIS));
		
		txtLogin = new JTextField();
		txtLogin.setBackground(Color.WHITE);
		txtLogin.setEditable(false);
		txtLogin.setFont(new Font("Tahoma", Font.PLAIN, 21));
		txtLogin.setHorizontalAlignment(SwingConstants.CENTER);
		txtLogin.setText("LOGIN");
		LoginHeader.add(txtLogin);
		txtLogin.setColumns(1);
		
		JPanel LoginImagen = new JPanel();
		LoginImagen.setBackground(Color.BLACK);
		GridBagConstraints gbc_LoginImagen = new GridBagConstraints();
		gbc_LoginImagen.gridheight = 5;
		gbc_LoginImagen.insets = new Insets(0, 0, 5, 5);
		gbc_LoginImagen.fill = GridBagConstraints.BOTH;
		gbc_LoginImagen.gridx = 0;
		gbc_LoginImagen.gridy = 0;
		frame.getContentPane().add(LoginImagen, gbc_LoginImagen);
		BufferedImage Logo = ImageIO.read(new File("./src/imagenes/logo.png"));
		LoginImagen.setLayout(new GridLayout(0, 1, 0, 0));
		JLabel picLabel = new JLabel(new javax.swing.ImageIcon(Logo));
		picLabel.setBackground(Color.BLACK);
		LoginImagen.add(picLabel);
		
		JPanel LoginTexto = new JPanel();
		LoginTexto.setBackground(Color.RED);
		LoginTexto.setLayout(null);
		GridBagConstraints gbc_LoginTexto = new GridBagConstraints();
		gbc_LoginTexto.gridheight = 4;
		gbc_LoginTexto.insets = new Insets(0, 0, 5, 0);
		gbc_LoginTexto.fill = GridBagConstraints.BOTH;
		gbc_LoginTexto.gridx = 1;
		gbc_LoginTexto.gridy = 1;
		frame.getContentPane().add(LoginTexto, gbc_LoginTexto);
		
		JTextField txtUsuario = new JTextField();
		TextPrompt usuario = new TextPrompt("DNI", txtUsuario);
		usuario.changeAlpha(0.50f);
		usuario.changeStyle(Font.ITALIC);
		txtUsuario.setBounds(27, 45, 164, 27);
		LoginTexto.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JTextField txtContrasea = new JTextField();
		TextPrompt contrasena = new TextPrompt("Contraseña", txtContrasea);
		contrasena.changeAlpha(0.50f);
		contrasena.changeStyle(Font.ITALIC);
		txtContrasea.setBounds(27, 82, 164, 27);
		LoginTexto.add(txtContrasea);
		txtContrasea.setColumns(10);
		
		JButton btnLogin = new JButton("login");
		btnLogin.setBounds(67, 131, 85, 21);
		LoginTexto.add(btnLogin);
		
		btnLogin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String usuario = txtUsuario.getText();
				String contraseina = txtContrasea.getText();

				boolean login = false;
				for (persona p : ConexionBases.getUsuarios()) {
					if (p.getDNI().equals(usuario) && p.getContraseina().equals(contraseina)) {
						login = true;
					} else {
						login = false;
					}
				}
				if (login == true) {
					JOptionPane.showMessageDialog(frame, "sesion iniciada");
				} else {
					JOptionPane.showMessageDialog(frame, "error en el login");
				}
			}
		});
	}
	
	private static final Logger LOGGER = Logger.getLogger("LOGS");
}
