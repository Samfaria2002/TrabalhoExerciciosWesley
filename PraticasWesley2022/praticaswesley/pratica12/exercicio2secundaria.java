package praticaswesley.pratica12;

public class exercicio2secundaria {
    private int num1;
    private int num2;

    public exercicio2secundaria() {
        this.num1 = 0;
        this.num2 = 0;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum2() {
        return num2;
    }

    public int divide() throws Exception {
        if (num1 == 0 || num2 == 0) {
            throw new ArithmeticException("O valor 1 não pode ser maior que o valor 2");
        } else {
            return num1/num2;
        }
    }
}
