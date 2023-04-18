package checkpoint2;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;


import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class login extends JFrame {

	private JPanel contentPane;
	private JTextField usuario;
	private JTextField caixaU;
	private JTextField senha;
	private JTextField caixaS;
	private JTextField espaco;
	private JButton Novo;
	private JButton entrar;
	private JButton cancelar;
	private JTextField esqueciSenha;
	

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout());
		
		// o setBounds serve para escolher o x e y, o local onde ficara
		
		Box caixaUsu = Box.createHorizontalBox();
		
		
		usuario = new JTextField("Usuario",6);
		caixaU = new JTextField("", 25);
		usuario.setEditable(false);
		usuario.setBorder(null);
		
		getContentPane().add(caixaUsu);
		caixaUsu.add(usuario);
		caixaUsu.add(caixaU);
		
		senha = new JTextField("Senha",6);
		caixaS = new JTextField("",25);
		contentPane.add(senha);
		senha.setEditable(false);
		senha.setBorder(null);
		
		Box caixaSen = Box.createHorizontalBox();
		
		add(caixaSen);
		caixaSen.add(senha);
		caixaSen.add(caixaS);
		
		Box botoes = Box.createHorizontalBox();
		entrar = new JButton("Entrar");		
		cancelar = new JButton("Cancelar");
		
		// tentar aumentar o tamanho do botao se der tempo.
		
		espaco = new JTextField("", 5);
		espaco.setEditable(false);
		espaco.setBorder(null);
		
		add(botoes);
		botoes.add(entrar);
		botoes.add(espaco);
		botoes.add(cancelar);
		
		esqueciSenha = new JTextField("Esqueci minha senha", 15);
		esqueciSenha.setForeground(Color.black);
		
		Font font = esqueciSenha.getFont();
	
		
		esqueciSenha.setBorder(null);
		add(esqueciSenha);
		
	}

}
