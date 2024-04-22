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

public class ventana1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana1 window = new ventana1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ventana1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JPanel LoginHeader = new JPanel();
		GridBagConstraints gbc_LoginHeader = new GridBagConstraints();
		gbc_LoginHeader.gridwidth = 2;
		gbc_LoginHeader.insets = new Insets(0, 0, 5, 0);
		gbc_LoginHeader.fill = GridBagConstraints.BOTH;
		gbc_LoginHeader.gridx = 0;
		gbc_LoginHeader.gridy = 0;
		frame.getContentPane().add(LoginHeader, gbc_LoginHeader);
		
		JPanel LoginTexto = new JPanel();
		GridBagConstraints gbc_LoginTexto = new GridBagConstraints();
		gbc_LoginTexto.gridheight = 3;
		gbc_LoginTexto.insets = new Insets(0, 0, 5, 5);
		gbc_LoginTexto.fill = GridBagConstraints.BOTH;
		gbc_LoginTexto.gridx = 0;
		gbc_LoginTexto.gridy = 1;
		frame.getContentPane().add(LoginTexto, gbc_LoginTexto);
		
		JPanel LoginImagen = new JPanel();
		GridBagConstraints gbc_LoginImagen = new GridBagConstraints();
		gbc_LoginImagen.gridheight = 3;
		gbc_LoginImagen.insets = new Insets(0, 0, 5, 0);
		gbc_LoginImagen.fill = GridBagConstraints.BOTH;
		gbc_LoginImagen.gridx = 1;
		gbc_LoginImagen.gridy = 1;
		frame.getContentPane().add(LoginImagen, gbc_LoginImagen);
	}

}
