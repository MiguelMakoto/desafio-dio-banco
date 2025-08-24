package funcionalidades.Interface;
import javax.swing.*;
import java.awt.Dimension;

public class TelaPrincipal extends JFrame {
    public TelaPrincipal(final Dimension dimension, final JPanel painelPrincipal) {
        super("Testao");
        this.setSize(dimension);
        this.setPreferredSize(dimension);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.add(painelPrincipal);
    }
}
