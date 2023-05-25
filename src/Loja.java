import java.util.Arrays;
import java.util.Scanner;

public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;
    private Produto[] estoqueProdutos;
    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int qtdProdutos) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[qtdProdutos];
    }
    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, int qtdProdutos) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        salarioBaseFuncionario = -1;
        this.estoqueProdutos = new Produto[qtdProdutos];
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public double getSalarioBaseFuncionario() {
        return salarioBaseFuncionario;
    }

    public Data getDataFundacao() {
        return dataFundacao;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public Produto[] getEstoqueProdutos() {
        return estoqueProdutos;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }
    public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public void setDataFundacao(Data dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setEstoqueProdutos(Produto[] estoqueProdutos) {
        this.estoqueProdutos = estoqueProdutos;
    }

    @Override
    public String toString() {
        return "Loja{" +
                "nome='" + nome + '\'' +
                ", quantidadeFuncionarios=" + quantidadeFuncionarios +
                ", salarioBaseFuncionario=" + salarioBaseFuncionario +
                ", endereco=" + endereco +
                ", dataFundacao=" + dataFundacao +
                ", estoqueProdutos=" + Arrays.toString(estoqueProdutos) +
                '}';
    }

    public double gastosComSalario() {
        if (salarioBaseFuncionario == -1) return -1;
        return salarioBaseFuncionario * quantidadeFuncionarios;
    }
    public char tamanhoDaLoja() {
        if (quantidadeFuncionarios < 10) return 'P';
        else if (quantidadeFuncionarios <= 30) return 'M';
        else return 'G';
    }

    public void imprimeProdutos() {
        for (Produto p: estoqueProdutos) {
            if (p != null) {
                System.out.println(p);
            }
        }
    }
    public boolean insereProduto(Produto p) {
        boolean isAdded = false;
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] == null) {
                estoqueProdutos[i] = p;
                return isAdded = true;
            }
        }
        return isAdded;
    }
    public boolean removeProduto(String productName) {
        boolean isRemoved = false;
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] != null && estoqueProdutos[i].getNome().equalsIgnoreCase(productName)) {
                estoqueProdutos[i] = null;
                return isRemoved = true;
            }
        }
        return isRemoved;
    }
    public static void criaLoja(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nome da loja: ");
        String name = sc.next();
        System.out.println("Quantidade de funcionários: ");
        int func = sc.nextInt();
        System.out.println("Salário base dos funcionários: ");
        double salario = sc.nextDouble();
        System.out.println("Nome da rua: ");
        String rua = sc.next();
        System.out.println("Cidade: ");
        String cidade = sc.next();
        System.out.println("Estado: ");
        String estado = sc.next();
        System.out.println("País: ");
        String pais = sc.next();
        System.out.println("CEP: ");
        String cep = sc.next();
        System.out.println("Número: ");
        String numero = sc.next();
        System.out.println("Complemento: ");
        String complemento = sc.next();
        System.out.println("Dia de fundação: ");
        int dia = sc.nextInt();
        System.out.println("Mês de fundação: ");
        int mes = sc.nextInt();
        System.out.println("Ano de fundação: ");
        int ano = sc.nextInt();
        System.out.println("Quantidade de Produtos da Loja: ");
        int qtdProdutos = sc.nextInt();
        Endereco address = new Endereco(rua,cidade, estado,pais,cep,numero,complemento);
        Data date = new Data(dia, mes, ano);
        Loja store = new Loja(name, func, salario, address, date, qtdProdutos);
        System.out.println(store);
    }
}
