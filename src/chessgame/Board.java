package chessgame;

import java.awt.Component;
import java.security.KeyStore.Entry;

import javax.swing.ImageIcon;
import javax.swing.JButton;

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
				                break; //breaking because its one to one map
				            }
		        }
		        if(key.contains("white"))
		        	b.setEnabled(true);
		}
	}
	
}
