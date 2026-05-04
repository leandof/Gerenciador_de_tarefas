public abstract class  Veiculo  {
    private String modelo;
    private int ano;
    private String cor;
    private double valor;
    private int quantidade;
    private int estoque = 0 ;
    private double valor_estoque = 0.00;

    public Veiculo ( String modelo, int ano, String cor, double valor, int quantidade ){
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void buzina () {
    }
    public abstract void acelera();

    public String getModelo() {
        return modelo;
    }

    public void setModelo (String modelo){
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void estoque(){
        if(getQuantidade() > 0){
            this.estoque = getQuantidade();
        }
    }


    @Override
    public String toString() {
        return " seu veiculo "+ getModelo() +
                " | cor "+ getCor()+
                " | ano "+getAno()+
                " | valor "+ getValor()+
                " | quantidade  "+ getQuantidade();
    }
}


