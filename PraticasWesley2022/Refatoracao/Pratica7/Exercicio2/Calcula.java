package Refatoracao.Pratica7.Exercicio2;

public class Calcula {
    private int num1, num2, indice;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public void calcula() throws Exception {
        switch (indice) {
            case 1:
                System.out.println("Soma: " + (getNum1() + getNum2()));
                break;
            case 2:
                System.out.println("Subtração: " + (getNum1() - getNum2()));
                break;
            case 3:
                System.out.println("Multiplicação: " + (getNum1() * getNum2()));
                break;
            case 4:
                if (getNum1() == 0 || getNum2() == 0) {
                    throw new ArithmeticException("Um ou mais números introduzidos para a divisão são iguais a zero");
                } else {
                    System.out.println("Divisão: " + (getNum1() / getNum2()));
                }
                break;
        
            default:
                break;
        }
    }
    
}
