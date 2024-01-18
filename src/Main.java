import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) throws Exception {
        Operation operation = new Operation();
        operation.selezioneOperzione(BigDecimal.valueOf(5.002), BigDecimal.valueOf(11.06), OperationEnum.SUM);
    }
}
