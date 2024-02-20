//package EsameProg;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.*;

public class FrameCampiInserimento extends TabellaDinamicaFrame {
    private JTextField campo1, campo2, campo3, campo4, campo5;
    private  JCheckBox boxLode;
    private boolean selezionato;
    private JButton salvaBottone;
    public Esame newRecord;

    public FrameCampiInserimento() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Impostazioni del frame
        JPanel panelText = new JPanel();
        setTitle("Frame con Campi di Inserimento");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);

        // Creazione dei campi di inserimento
        campo1 = new JTextField(20);
        campo2 = new JTextField(20);
        campo3 = new JTextField(20);
        campo4 = new JTextField(20);
        campo5 = new JTextField(20);
        boxLode = new JCheckBox("Lode");
        salvaBottone = new JButton("Salva e carica");

        panelText.add(campo1);
        panelText.add(campo2);
        panelText.add(campo3);
        panelText.add(campo4);
        panelText.add(campo5);
        panelText.add(boxLode);
        panelText.add(salvaBottone);
        
        add(panelText, BorderLayout.CENTER);

        // Creazione di un layout per il frame
        setLayout(new GridLayout(4, 2));

        // Aggiunta dei componenti al frame
        add(new JLabel("Nome studente: "));
        add(campo1);
        add(new JLabel("Cognome studente: "));
        add(campo2);
        add(new JLabel("Nome insegnamento: "));
        add(campo3);
        add(new JLabel("Voto Finale: "));
        add(campo4);
        add(new JLabel("Numero crediti: "));
        add(campo5);
        add(new JLabel("Lode:"));
        add(boxLode);
        add(salvaBottone);

        boxLode.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                selezionato = boxLode.isSelected();
                System.out.println("Valore selezionato: " + selezionato);
            }
        });

        salvaBottone.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                int votoF = Integer.parseInt(campo4.getText());
                int CFU = Integer.parseInt(campo5.getText());
                newRecord = new Esame(campo1.getText(), campo2.getText(), campo3.getText(), votoF, selezionato, CFU);
                tableModel.addRow(new Object[]{newRecord.getNome(), newRecord.getCognome(),
                    newRecord.getInsegnamento() ,newRecord.getVotoFinale(), newRecord.isLode(), newRecord.getNumeroCrediti()});
            }
        });
    }
}

