package Refatoracao.Pratica3;

public class CalculoSomaVetor implements InterfaceCalculo{

    private double vet1[] = { 90, 88, 78, 76 };
    private double vet2[] = { 865, 564, 43, 12 };
    private double soma = 0;

    @Override
    public void soma() {
        for (int i = 0; i < 4; i++) {
            this.soma = soma + vet1[i];
        }
        media();
        for (int i = 0; i < 4; i++) {
            this.soma = soma + vet2[i];
        }
        media();
    }


    @Override
    public void media() {
        double media = soma / 4;
        System.out.println("Média do vetor 1: " + media);
        
    }
}
