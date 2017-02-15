package sample.Convertors;

/**
 * Created by Adam on 2/13/2017.
 */
public class SingleToDecimal {
    public static void main (String args [])
    {
        SingleToDecimal singleToDecimal = new SingleToDecimal();
        singleToDecimal.convert("01000011000111000000000000000000");
    }
    public String convert (String singleP)
    {
        float deciFinal;
        deciFinal = Float.intBitsToFloat(Integer.parseInt(singleP, 2));
//        System.out.println(deciFinal);
        return String.valueOf(deciFinal);
    }
}
