package Parcial1FilaA.Pregunta5;

public class TerminalSuma extends AbstractExpresion{
    public TerminalSuma(int amountDigit) {
        this.amountDigit=amountDigit;
    }

    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("sumar")) {
            context.signo=1;
            context.input = context.input.substring(this.amountDigit);
        }
    }
}
