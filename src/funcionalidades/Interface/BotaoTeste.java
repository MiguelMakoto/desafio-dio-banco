package funcionalidades.Interface;

import javax.swing.JButton;
import java.awt.event.ActionListener;

public class BotaoTeste extends JButton{
    public BotaoTeste(final ActionListener actionListener) {
        this.setText("Teste 123");
        this.addActionListener(actionListener);
    }
}
