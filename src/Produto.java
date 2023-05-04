import java.util.Scanner;
public class Produto {
    private final static Data FINAL_DATE = new Data(20,10,2023);
    private String nome;
    private double preco;
    private Data dataValidade;
    public Produto(String nome, double preco, Data dataValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public Data getDataValidade() {
        return dataValidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }
    public boolean estaVencido(Data vence) {
        if (vence.getAno() < dataValidade.getAno()) {
            return false;
        } else if (vence.getMes() < dataValidade.getMes()) {
            return  false;
        } else if (vence.getDia() < dataValidade.getDia()) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", dataValidade=" + dataValidade +
                '}';
    }

    public static void criaProduto() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o nome do produto: ");
        String name = sc.next();
        System.out.println("Qual preço: ");
        double price = sc.nextDouble();
        System.out.println("Dia de vencimento: ");
        int dia = sc.nextInt();
        System.out.println("Mês de vencimento: ");
        int mes = sc.nextInt();
        System.out.println("Ano de vencimento: ");
        int ano = sc.nextInt();
        Data date = new Data(dia, mes, ano);
        Produto product = new Produto(name,price,date);
        System.out.println(product.estaVencido(FINAL_DATE) ? "PRODUTO VENCIDO" : "PRODUTO NÃO VENCIDO");
    }
}
