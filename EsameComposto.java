//package EsameProg;
import java.util.ArrayList;

class EsameComposto extends Esame {
    private ArrayList<ProvaIntermedia> proveIntermedie;

    public EsameComposto(String nome, String cognome, String insegnamento, ArrayList<ProvaIntermedia> proveIntermedie) {
        super(nome, cognome, insegnamento, 0, false, 0);
        this.proveIntermedie = proveIntermedie;
    }

    public void calcolaVotoFinale() {
        if (!proveIntermedie.isEmpty()) {
            float totalCrediti = 0;
            float weightedSum = 0;

            for (ProvaIntermedia prova : proveIntermedie) {
                totalCrediti += prova.getCrediti();
                weightedSum += prova.getVoto() * (prova.getPeso() / 100);
            }

            setVotoFinale((int)(weightedSum / totalCrediti));
        }
    }
}