public  class Carro extends Veiculo implements Segurança, Ecologico  {
    private int aro;

    public Carro (String modelo, int ano, String cor, int aro , double valor, int quantidade ){
        super(modelo, ano, cor,valor, quantidade);
        this.aro = aro;

    }

    public int getAro() {
        return aro;
    }

    public void setAro(int aro) {
        this.aro = aro;
    }

    @Override
    public void buzina() {
        System.out.println("Pam Pam buzina do (carro) ");
    }

    @Override
    public void acelera() {
        System.out.println("80 mk por hora ");
    }

    @Override
    public void alarme() {
        System.out.println("alarme ativo ");
    }

    @Override
    public void trava() {
        System.out.println( " portas travadas ");
    }

    @Override
    public void medirEmissao() {

    }

    @Override
    public void estoque() {
        super.estoque();
    }

    @Override
    public String toString() {
        return super.toString() + " aro "+ getAro();

    }


}
