package funcionalidades.Interface;
import java.awt.Dimension;

import javax.swing.*;
public class BancoService {
    public static void main(String[] arg) {
        Dimension dimensao = new Dimension(600, 600);
        JPanel painelPrincipal = new PainelPrincipal(dimensao);
        JFrame telaPrincipal = new TelaPrincipal(dimensao, painelPrincipal);
        telaPrincipal.revalidate();
        telaPrincipal.repaint();
    }
}
