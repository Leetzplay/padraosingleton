package padroescriacao.singleton;

public class Loja {

    private Loja() {};
    private static Loja instance = new Loja();
    public static Loja getInstance() {
        return instance;
    }

    private String nomeLoja;
    private String funcionarioCaixa;

    public String getNomeLoja() {
        return nomeLoja;
    }

    public void setNomeLoja(String nomeLoja) {
        this.nomeLoja = nomeLoja;
    }

    public String getUsuarioLogado() {
        return funcionarioCaixa;
    }

    public void setUsuarioLogado(String funcionarioCaixa) {
        this.funcionarioCaixa = funcionarioCaixa;
    }