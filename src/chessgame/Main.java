package chessgame;
import java.util.TreeMap;

import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class Main {
	public static TreeMap<String, ImageIcon> images;
	public static Board b;
	
	public static void main(String[] args){
		
		images = new TreeMap<String, ImageIcon>();
		images.put("blackPawn",new ImageIcon("./images/BlackPawn.png"));
		images.put("whitePawn",new ImageIcon("./images/whitePawn.png"));
		images.put("blackRook",new ImageIcon("./images/BlackRook.png"));
		images.put("whiteRook",new ImageIcon("./images/whiteRook.png"));
		images.put("blackBishop",new ImageIcon("./images/BlackBishop.png"));
		images.put("whiteBishop",new ImageIcon("./images/whiteBishop.png"));
		images.put("blackKnight",new ImageIcon("./images/BlackKnight.png"));
		images.put("whiteKnight",new ImageIcon("./images/whiteKnight.png"));
		images.put("blackKing",new ImageIcon("./images/BlackKing.png"));
		images.put("whiteKing",new ImageIcon("./images/whiteKing.png"));
		images.put("blackQueen",new ImageIcon("./images/BlackQueen.png"));
		images.put("whiteQueen",new ImageIcon("./images/whiteQueen.png"));
		
		JFrame mainFrame = new JFrame();
		BoardPanel bp = new BoardPanel();
		b = new Board(bp);
		b.processInputs();
		mainFrame.add(bp);
		mainFrame.pack();
		mainFrame.setVisible(true);
	}
}
