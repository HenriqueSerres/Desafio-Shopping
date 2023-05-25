import java.util.Arrays;

public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    public Shopping(String nome, Endereco endereco, int numeroDeLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[numeroDeLojas];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }

    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }

    @Override
    public String toString() {
        return "Shopping{" +
                "nome='" + nome + '\'' +
                ", endereco=" + endereco +
                ", lojas=" + Arrays.toString(lojas) +
                '}';
    }
    public boolean insereLoja(Loja l) {
        boolean isAdded = false;
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] == null) {
                lojas[i] = l;
                return isAdded = true;
            }
        }
        return isAdded;
    }
    public boolean removeLoja(String storeName) {
        boolean isRemoved = false;
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] != null && lojas[i].getNome().equalsIgnoreCase(storeName)) {
                lojas[i] = null;
                return isRemoved = true;
            }
        }
        return isRemoved;
    }
    public int quantidadeLojasPorTipo(String tipoLoja) {
        int count = 0;
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i].getClass().getSimpleName().equals(tipoLoja)) {
                count += 1;
            }
        }
        if (count == 0) {
            return -1;
        } else {
            return count;
        }
    }
    public Informatica lojaSeguroMaisCaro() {
        double maisCaro = 0;
        for (Loja l: lojas) {
            if (l instanceof Informatica) {
                if (((Informatica) l).getSeguroEletronicos() > maisCaro) {
                    maisCaro = ((Informatica) l).getSeguroEletronicos();
                }
            }
        }
        for (Loja l: lojas) {
            if (l instanceof Informatica) {
                if (((Informatica) l).getSeguroEletronicos() == maisCaro) {
                    return (Informatica) l;
                }
            }
        }
        return null;
    }
}
