public class Personagem {


    private String classe;
    private String especie;
    private String inclinacaoMoral;

    public Personagem( String classe, String especie, String inclinacaoMoral) {
        this.classe = classe;
        this.especie = especie;
        this.inclinacaoMoral = inclinacaoMoral;
    }

    public String getClasse() {
        return classe;
    }


    public String getEspecie() {
        return especie;
    }


    public String getInclinacaoMoral() {
        return inclinacaoMoral;
    }
}
