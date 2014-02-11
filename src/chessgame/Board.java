package chessgame;

import java.awt.*;
import java.security.KeyStore.*;

import javax.swing.*;

public class Board {
	private JButton b;
	private BoardPanel m_boardPanel;
	public Integer moveCount;
	String key;
	public Board(BoardPanel bp){
		m_boardPanel = bp;
	}
	public void processInputs(){
		for( Component i : m_boardPanel.getComponents() ){
				b = (JButton) i;
		        for(java.util.Map.Entry<String, ImageIcon> entry: Main.images.entrySet()){
		        	 ImageIcon icon = (ImageIcon) b.getIcon();
		        	 if(icon != null)
				            if(icon.equals(entry.getValue())){
				 
				                key = entry.getKey();
				                break;
				            }
		        }
		        if(key.contains("white"))
		        	b.setEnabled(true);
		}
	}
	
}
