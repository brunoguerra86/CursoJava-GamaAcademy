import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Telinha extends JFrame implements Runnable{
	
	private JLabel      imagem;
	private int         imagemAtual;
	private ImageIcon[] imagens;
	
	private int posX;
	private int direcao;
	
	public Telinha() {
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		super.setTitle("Game do Isidro");
		
		this.imagemAtual = 0;
		this.imagens = new ImageIcon[3];
		this.imagens[0] = new ImageIcon("/Users/isidro/Desktop/workspace_java/IsiGame/run0.png");
		this.imagens[1] = new ImageIcon("/Users/isidro/Desktop/workspace_java/IsiGame/run1.png");
		this.imagens[2] = new ImageIcon("/Users/isidro/Desktop/workspace_java/IsiGame/run2.png");
	   
		this.setLayout(null);
		this.imagem = new JLabel();
		this.imagem.setBounds(0, 0,96, 128);
		this.imagem.setText("Teste");
		this.imagem.setIcon(imagens[imagemAtual]);
		
		this.posX = 1;
		this.direcao = 1;
		
		getContentPane().add(imagem);
		pack();
		
		super.setSize(320, 240);
		super.setVisible(true);
		
		repaint();
		new Thread(this).start();
	}
	
	public void desenha() {
		this.imagem.setBounds(posX,0,96,128);
		this.imagem.setIcon(this.imagens[imagemAtual]);
		repaint();
		
	}
	public void atualiza() {
		imagemAtual = (imagemAtual + 1)%this.imagens.length;
		if (posX < 0  || posX >=230) {
			direcao = direcao * -1;
		}
		posX = posX + 10 * direcao;
		
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			try {
				atualiza();
				desenha();
				Thread.sleep(150);
			}
			catch(Exception ex) {
				System.out.println("ERRO AO ATUALIZAR!!");
			}
		}
	}
}
