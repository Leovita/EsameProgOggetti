//package EsameProg;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {
    private JButton gestioneEsami, salvaCarica, visualizzaDati;
    public MyFrame() {
        super("Main Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        // Layout manager
        setLayout(new GridLayout(2, 2));

        // Aggiungi 4 bottoni
        gestioneEsami = new JButton("GestioneEsami");
        salvaCarica = new JButton("Salvataggio e caricamento");
        visualizzaDati = new JButton("Visualizzazione dati statistici");

        gestioneEsami.addActionListener(new ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent e) {
                FrameCampiInserimento frame = new FrameCampiInserimento();
                frame.setSize(600, 600);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
        //salvaCarica.addActionListener(new ActionPerformed());
        //visualizzaDati.addActionListener(new ActionListener());

        add(gestioneEsami);
        add(salvaCarica);
        add(visualizzaDati);
    }
}