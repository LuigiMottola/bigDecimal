import java.math.BigDecimal;
import java.math.RoundingMode;

public class Operation {

    public void selezioneOperzione(BigDecimal numero1, BigDecimal numero2, OperationEnum operationEnum) throws Exception {
        BigDecimal result;
        switch (operationEnum){
            case SUM :
                result = numero1.add(numero2);
                System.out.println("Il risultato della somma "+ numero1 +" + "+ numero2 + " è " + result);
                break;
            case  SUBTRACTION:
                result = numero1.subtract(numero2);
                System.out.println("Il risultato della sottrazione "+ numero1 +"-"+ numero2 + " è " + result);
                break;
            case MULTIPLICATION:
                result = numero1.multiply(numero2);
                System.out.println("Il risultato della moltiplicazione "+ numero1 +"*"+ numero2 + " è " + result);
                break;
            case DIVISION:
                result = numero1.divide(numero2, RoundingMode.UNNECESSARY);
                System.out.println("Il risultato della divisione "+ numero1 +"/"+ numero2 + " è " + result);
                break;
            case MIN:
                result = numero1.min(numero2);
                System.out.println("Il più piccolo tra " + numero1 +" e "+ numero2 + " è = " + result);
                break;
            case MAX:
                result = numero1.max(numero2);
                System.out.println("Il più grande tra " + numero1 +" e "+ numero2 + " è = " + result);
                break;
            default:
                System.out.println("Operazione non valida");
        }
    }
}
