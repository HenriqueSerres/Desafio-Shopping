import java.util.Scanner;
public class Produto {
    private String nome;
    private double preco;
    private Data dataDeValidade;
    public Produto(String nome, double preco, Data dataDeValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataDeValidade = dataDeValidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public Data getDataDeValidade() {
        return dataDeValidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setDataDeValidade(Data dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }
    public boolean estaVencido(Data vencimento) {
        if (vencimento.getAno() > dataDeValidade.getAno()) {
            System.out.println(vencimento.getAno()+" "+dataDeValidade.getAno());
            return false;
        } else if (vencimento.getMes() > dataDeValidade.getMes()) {
            return  false;
        } else if (vencimento.getDia() > dataDeValidade.getDia()) {
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
                ", dataDeValidade=" + dataDeValidade +
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
        Data vencimento = new Data(20,10,2023);
        Produto product = new Produto(name,price,date);
        System.out.println(product.estaVencido(vencimento) ? "PRODUTO VENCIDO" : "PRODUTO NÃO VENCIDO");
    }
}
