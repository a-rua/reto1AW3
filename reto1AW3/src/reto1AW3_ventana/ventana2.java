package reto1AW3_ventana;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

import modelo.reservasModelo;
import objetos.reservas;

public class ventana2 extends JFrame {

	private JPanel panel;

	private JButton formulario;

	private JButton filtro;

	private JPanel logo;

	private JTable tabla;

	private JComboBox<String> combobox;

	private JFrame frame;

	public ventana2() {

		frame = new JFrame();
		frame.setBounds(400, 100, 800, 450);

		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());

		JPanel panel2 = new JPanel(new GridLayout(0, 2));

		DefaultTableModel cartadesuicidio = new DefaultTableModel();
		JTable tabla = new JTable();

		JScrollPane scroll = new JScrollPane();
		
		cartadesuicidio = suicidios();
		tabla.setModel(cartadesuicidio);
		scroll.setViewportView(tabla);
		panel2.add(scroll);
//		panel.add(tabla, BorderLayout.EAST);
		frame.add(panel);
		panel.add(panel2);
		frame.setVisible(true);
	}

	public static DefaultTableModel suicidios() {
		DefaultTableModel cartadesuicidio = new DefaultTableModel();
		cartadesuicidio.addColumn("identificador_reserva");
		cartadesuicidio.addColumn("DNI");
		cartadesuicidio.addColumn("nombre_evento");
		cartadesuicidio.addColumn("grupo");
		cartadesuicidio.addColumn("identificador_concierto");
		ArrayList<reservas> ListaReserva = reservasModelo.getReserva();
		for (int v = 0; v < ListaReserva.size(); v++) {
			cartadesuicidio.addRow(new Object[] { ListaReserva.get(v).getIdentificador_reserva(),
					ListaReserva.get(v).getDNI(), ListaReserva.get(v).getNombre_evento(),
					ListaReserva.get(v).getGrupo(), ListaReserva.get(v).getIdentificador_concierto() });
		}
		return cartadesuicidio;
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				ventana2 ventanas = new ventana2();
				ventanas.frame.setVisible(true);

			}

		});
	}

}
