//package EsameProg;

class Esame {
    private String nome;
    private String cognome;
    private String insegnamento;
    private int votoFinale;
    private boolean lode;   
    private int numeroCrediti;

    public Esame(String nome, String cognome, String insegnamento, int votoFinale, boolean lode, int numeroCrediti) {
        this.nome = nome;
        this.cognome = cognome;
        this.insegnamento = insegnamento;
        this.votoFinale = votoFinale;
        this.lode = lode;
        this.numeroCrediti = numeroCrediti;
    }

    // Getters and Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getInsegnamento() {
        return insegnamento;
    }

    public void setInsegnamento(String insegnamento) {
        this.insegnamento = insegnamento;
    }

    public float getVotoFinale() {
        return votoFinale;
    }

    public void setVotoFinale(int votoFinale) {
        this.votoFinale = votoFinale;
    }

    public boolean isLode() {
        return lode;
    }

    public void setLode(boolean lode) {
        this.lode = lode;
    }

    public int getNumeroCrediti() {
        return numeroCrediti;
    }

    public void setNumeroCrediti(int numeroCrediti) {
        this.numeroCrediti = numeroCrediti;
    }
    ///////////
    public String toString() {
        return "nome: " + nome +
                "\nInsegnamento: " + insegnamento +
                "\nVoto Finale: " + votoFinale +
                "\nLode: " + (lode ? "Sì" : "No") +
                "\nNumero Crediti: " + numeroCrediti;
    }
}