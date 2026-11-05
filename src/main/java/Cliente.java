public class Cliente {

    private static final int DESCONTO_MIN = 0;
    private static final int DESCONTO_MAX = 100;
    private static final String GENERO_PADRAO = "nd";

    private final int id;
    private final String nome;
    private int desconto;
    private final String genero;

    public Cliente(int id, String nome, int desconto) {
        validarId(id);
        validarNome(nome);
        validarDesconto(desconto);
        this.id = id;
        this.nome = nome;
        this.desconto = desconto;
        this.genero = GENERO_PADRAO;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public int getDesconto() {
        return desconto;
    }

    public void setDesconto(int desconto) {
        validarDesconto(desconto);
        this.desconto = desconto;
    }

    private static void validarId(int id) {
        if (id < 0) {
            throw new IllegalArgumentException("Id não pode ser negativo.");
        }
    }

    private static void validarNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome é obrigatório.");
        }
    }

    private static void validarDesconto(int desconto) {
        if (desconto < DESCONTO_MIN || desconto > DESCONTO_MAX) {
            throw new IllegalArgumentException(
                "Desconto deve estar entre " + DESCONTO_MIN + " e " + DESCONTO_MAX + ".");
        }
    }

    @Override
    public String toString() {
        return nome + "(" + id + ")(" + desconto + "%)";
    }
}
