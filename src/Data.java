public class Data {
    private int dia;
    private int mes;
    private int ano;
    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        dateIsValid();
    }
    private void setDefaultDate() {
        System.out.println("Data inválida!!");
        dia = 1;
        mes = 1;
        ano = 2000;
    }
    public boolean dateIsValid() {
        if (verificaAnoBissexto() && mes == 2 && dia <= 29) {
            return true;
        } else if (mes == 2 && dia >= 1 && dia > 28) {
            System.out.println("Fevereiro vai até o dia 28!");
            return false;
        } else if (verificaMes30() && dia >= 1 && dia <= 30) {
            return true;
        } else if (verificaMes31() && dia >= 1 && dia <= 31) {
            return true;
        }
        setDefaultDate();
        return false;
    }

    public int getAno() {
        return ano;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public String toString() {
        return dia+"/"+mes+"/"+ano;
    }
    public boolean verificaAnoBissexto () {
        if(ano % 4 == 0) {
            return true;
        }
        return false;
    }
    public boolean verificaMes30() {
        int[] meses = {2,4,6,9,11};
        boolean areHere = false;
        for (int i = 0; i < meses.length; i++) {
            if (meses[i] == mes) {
                areHere = true;
            }
        }
        return areHere;
    }
    public boolean verificaMes31() {
        int[] meses = {1,3,5,7,8,10,12};
        boolean areHere = false;
        for (int i = 0; i < meses.length; i++) {
            if (meses[i] == mes) {
                areHere = true;
            }
        }
        return areHere;
    }
}
