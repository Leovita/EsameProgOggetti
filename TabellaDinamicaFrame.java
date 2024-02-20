//package EsameProg;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TabellaDinamicaFrame extends JFrame  {
    public DefaultTableModel tableModel;
    private JTable table;
    
    public TabellaDinamicaFrame() {
        super("Gestione Esami");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);
        setLocationRelativeTo(null);

        tableModel = new DefaultTableModel();

        String[] columnNames = {"Nome", "Cognome", "Insegnamento", "Voto Finale", "Lode", "Numero Crediti"};

        tableModel.setColumnIdentifiers(columnNames);

        table = new JTable(tableModel);

        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane);

        // Creazione di un pulsante per aggiungere una nuova riga alla tabella
        JButton addButton = new JButton("Aggiungi esame semplice: ");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrameCampiInserimento frameCampi = new FrameCampiInserimento();
                frameCampi.setVisible(true);
            }
        });

        // Aggiungi il pulsante al JFrame
        add(addButton, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TabellaDinamicaFrame tabellaDinamicaFrame = new TabellaDinamicaFrame();
            tabellaDinamicaFrame.setVisible(true);
        });
    }
}
