//package EsameProg;

class ProvaIntermedia {
    private float voto;
    private float peso;
    private int crediti;


    public ProvaIntermedia(float voto, float peso, int crediti) {
        this.voto = voto;
        this.peso = peso;
        this.crediti = crediti;
    }

    public float getVoto() {
        return voto;
    }

    public void setVoto(float voto) {
        this.voto = voto;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getCrediti() {
        return crediti;
    }

    public void setCrediti(int crediti) {
        this.crediti = crediti;
    }

    @Override
    public String toString() {
        return "\n  Voto: " + voto +
                "\n  Peso: " + peso +
                "\n  Crediti: " + crediti;
    }
}
