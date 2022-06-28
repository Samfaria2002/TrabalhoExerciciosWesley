package Refatoracao.Pratica4;

public class LeituraMain {
    public static void main(String[] args) {
        
        LeiturasFactory lf = new LeiturasFactory();

        LeituraInterface li1 = lf.getLeitura(LeiturasFactory.padroes.LeituraIdade);
        LeituraInterface li2 = lf.getLeitura(LeiturasFactory.padroes.LeituraNota);
        LeituraInterface li3 = lf.getLeitura(LeiturasFactory.padroes.LeituraSalario);
        LeituraInterface li4 = lf.getLeitura(LeiturasFactory.padroes.LeituraSexo);
        li1.leitura();
        li2.leitura();
        li3.leitura();
        li4.leitura();
    }
}
