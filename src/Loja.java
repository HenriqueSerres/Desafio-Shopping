import java.util.Scanner;

public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;
    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
    }
    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        salarioBaseFuncionario = -1;
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

    public String toString() {
        return "Nome da loja: "+getNome()+
                ".\nPossui "+getQuantidadeFuncionarios()+" funcionários.\nCom base salarial de R$ "+getSalarioBaseFuncionario()+
                "\nEndereço: "+getEndereco()+"\nFundada em "+ getDataFundacao();
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
        Endereco address = new Endereco(rua,cidade, estado,pais,cep,numero,complemento);
        Data date = new Data(dia, mes, ano);
        Loja store = new Loja(name, func, salario, address, date);
        System.out.println(store);
    }
}
