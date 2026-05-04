

    void main() {
        Scanner sc = new Scanner( System.in);
        ArrayList <Veiculo> frota = new ArrayList<>();
        int menu= 0;
        while (menu !=4){

            System.out.println(" 1 para adiciona  Carro ");
            System.out.println(" 2 para adicionar  Moto  ");
            System.out.println("3 para verifica veiculos ");
            System.out.println(" 4 para sair ");

            menu= sc.nextInt();
            sc.nextLine();
            switch (menu){

                case 1:
                    System.out.println(" digite um carro ");
                    String modelo= sc.nextLine();

                    System.out.println(" digite o ano ");
                    int ano= sc.nextInt();
                    sc.nextLine();

                    System.out.println("qual a cor ");
                    String cor = sc.nextLine();

                    System.out.println("qual o aro da roda ");
                    int aro = sc.nextInt();

                    System.out.println("qual o valor ");
                    double valor = sc.nextDouble();

                    System.out.println("qual a quantidade ? ");
                    int quantidade = sc.nextInt();

                    frota.add(new Carro(modelo, ano, cor,aro, valor, quantidade));
                    break;
                case 2:
                    System.out.println(" digite uma moto  ");
                    String modelo_m= sc.nextLine();

                    System.out.println(" digite o ano ");
                    int ano_m= sc.nextInt();
                    sc.nextLine();

                    System.out.println("qual a cor ");
                    String cor_m = sc.nextLine();

                    System.out.println("qual a cilindrada da moto  roda ");
                    int cilindrada = sc.nextInt();



                    System.out.println("qual o valor ");
                    double valor_m = sc.nextDouble();

                    System.out.println("qual a quantidade ? ");
                    int quantidade_m  = sc.nextInt();

                    frota.add(new Moto(modelo_m, ano_m, cor_m, cilindrada, valor_m, quantidade_m));
                    break;
                case 3:
                    System.out.println(" qual tipo de veiculo deseja localiaza  ");

                    double valorTotal = 0;

                    for (Veiculo v : frota){
                        valorTotal += v.getValor()*v.getQuantidade();
                        System.out.println("temos cadastrados "+ v);
                    }
                    System.out.println( "o valor das unidades em estoque é de "+ valorTotal);

                    break;
                case 4:
                    System.out.println(" fim do programa ");
                    break;
                default:
                    System.out.println(" fim ");
                    break;

            }

        }









    }





