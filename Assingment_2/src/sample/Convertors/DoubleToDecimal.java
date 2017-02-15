package sample.Convertors;

/**
 * Created by Adam on 2/13/2017.
 */
public class DoubleToDecimal
{
    public static void main (String args [])
    {
        DoubleToDecimal doubleToDecimal = new DoubleToDecimal();
        doubleToDecimal.convert("0100000001100011100000000000000000000000000000000000000000000000");
    }
    public String convert (String doubleP)
    {
        double deciFinal;
        doubleP = doubleP.trim();
        deciFinal = Double.longBitsToDouble(Long.parseLong(doubleP,2));
//        System.out.println(deciFinal);
        return String.valueOf(deciFinal);
    }
}
