package funcionalidades.Interface.input;
import funcionalidades.Elementos.Conta;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class NumeroEntrada extends JTextField {
    private final Integer numero;
    
    public NumeroEntrada(Integer numero) {
        this.numero = numero;
        Dimension dimensao = new Dimension(50, 50);
        //customização de tamanho
        this.setSize(dimensao);
        this.setPreferredSize(dimensao);
        //customizacao do visual do campo
        this.setVisible(true);
        this.setFont(new Font("Arial", Font.PLAIN, 20));
        this.setHorizontalAlignment(CENTER);
        this.setEnabled(true);
        this.getDocument().addDocumentListener(new DocumentListener() {

            private void mudarConta() {
                
            }
            
            @Override
            public void insertUpdate(DocumentEvent e) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'insertUpdate'");
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'removeUpdate'");
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'changedUpdate'");
            }
            
        })

    }
}