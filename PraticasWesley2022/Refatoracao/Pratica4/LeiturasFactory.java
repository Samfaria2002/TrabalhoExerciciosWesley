package Refatoracao.Pratica4;

public class LeiturasFactory {
    public enum padroes{
        LeituraIdade, LeituraNota, LeituraSalario, LeituraSexo
    }

    public LeituraInterface getLeitura(padroes padrao) {
        LeituraInterface leitura = null;

        switch (padrao) {
            case LeituraIdade:
                leitura = new LeituraIdade();
                break;
            
            case LeituraNota:
                leitura = new LeituraNota();
                break;

            case LeituraSalario:
                leitura = new LeituraSalario();
                break;

            case LeituraSexo:
                leitura = new LeituraSexo();
                break;
            default:
                break;
        }
        return leitura;
    }
}
