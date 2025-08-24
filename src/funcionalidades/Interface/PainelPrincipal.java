package funcionalidades.Interface;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
//import java.awt.color.*;

public class PainelPrincipal extends JPanel{
    public PainelPrincipal(final Dimension dimensao) {
        this.setSize(dimensao);
        this.setPreferredSize(dimensao);
        this.setBackground(Color.BLUE);
    }
}
