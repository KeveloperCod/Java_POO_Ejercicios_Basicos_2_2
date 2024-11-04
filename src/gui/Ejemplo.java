package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import semana_02.Video;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejemplo extends JFrame {

	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JTextArea txtReporte;
	private JButton btnCalcular;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejemplo frame = new Ejemplo();
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
	public Ejemplo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 717, 570);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 93, 681, 427);
			contentPane.add(scrollPane);
		}
		{
			btnCalcular = new JButton("Calcular");
			btnCalcular.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					
					Video a = new Video(1020 , "El amor" , 127 , 10.50, 3.98  );
				
					listado(a);
					
					a.setpSoles(a.getpSoles() + 5.50);
					
					listado(a);
				}
				
				
				void imprimir (String s){
					txtReporte.append(s + "\n");
				};
				
				void listado (Video x) {
					imprimir("DirMem    :   "   +  x);
					imprimir("Codigo    :   "   +  x.getCodigo());
					imprimir("Nombre    :   "   +  x.getNomVid());
					imprimir("Duracion    :   "   +  x.getDuracion());
					imprimir("Precio en soles    :   "   +  x.getpSoles());
					imprimir("Tipo de Cambio    :   "   +  x.gettCambio());
					imprimir("Precio en Dolares    :   "   +  x.pDolares());
					imprimir("");
				}
			
				
			});
			btnCalcular.setBounds(289, 35, 89, 23);
			contentPane.add(btnCalcular);
		}
		{
			txtReporte = new JTextArea();
			txtReporte.setBounds(10, 93, 679, 412);
			contentPane.add(txtReporte);
		}
	}

}
