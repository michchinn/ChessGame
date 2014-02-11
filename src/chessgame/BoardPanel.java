package chessgame;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import static chessgame.Main.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class BoardPanel extends JPanel{
	
	public BoardPanel(){
		for( int i = 0; i < 8; i++ )
			for(int j = 0; j < 8; j++ ){
				JButton b = null;
				switch(i){
					case 0:
						switch(j){
							case 0:
							case 7:
								b = new JButton(images.get("blackRook"));break;
							case 1:
							case 6:
								b = new JButton(images.get("blackKnight"));break;
							case 2:
							case 5:
								b = new JButton(images.get("blackBishop"));break;
							case 3:
								b = new JButton(images.get("blackKing"));break;
							case 4:
								b = new JButton(images.get("blackQueen"));break;
						}break;
					case 1:
						b = new JButton(images.get("blackPawn"));break;
					case 6:
						b = new JButton(images.get("whitePawn"));break;
					case 7:
						switch(j){
						case 0:
						case 7:
							b = new JButton(images.get("whiteRook"));break;
						case 1:
						case 6:
							b = new JButton(images.get("whiteKnight"));break;
						case 2:
						case 5:
							b = new JButton(images.get("whiteBishop"));break;
						case 3:
							b = new JButton(images.get("whiteKing"));break;
						case 4:
							b = new JButton(images.get("whiteQueen"));break;
					}break;
					default:
						b = new JButton();break;
				}
				if(i % 2 == 0 && j % 2 == 0)
					b.setBackground(Color.getHSBColor(882,940,722));
				else if( i % 2 != 0 && j%2 != 0 )
					b.setBackground(Color.getHSBColor(882,940,722));
				else if(i % 2 == 1 && j % 2 == 0)
					b.setBackground(Color.getHSBColor(30, 93, 68));
				else
					b.setBackground(Color.getHSBColor(30, 93, 68));
				//ImageIcon ic = (ImageIcon) b.getIcon();
				//if(ic == null)
					//System.out.println(j + " " + i + " null");
				b.setEnabled(false);
				b.setPreferredSize(new Dimension(50,50));
				add(b);
			}
		setLayout(new GridLayout(8,8));
	}
		
}
