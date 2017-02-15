package sample.Convertors;

/**
 * Created by Adam on 2/13/2017.
 */
public class DecimalToDouble
{
    public static void main (String args [])
    {
        DecimalToDouble dtoDouble = new DecimalToDouble();
        dtoDouble.convert(-2);
    }
    public String convert (double deciNum)
    {
        String dPrecision;
        dPrecision = Long.toString(Double.doubleToLongBits(deciNum), 2);
        if (deciNum > 1.0)
        {
//            System.out.println("0" + dPrecision);
            dPrecision = "0" + dPrecision;
            return dPrecision;
        }
        else if (deciNum == 0.0)
        {
            dPrecision = "0000000000000000000000000000000000000000000000000000000000000000";
            return dPrecision;
        }
        else if (deciNum <= 1.0 && deciNum > 0)
        {
//            System.out.println("0" + dPrecision);
            dPrecision = "0" + "0" + dPrecision;
            return dPrecision;
        }
        else
        {
//            System.out.println(dPrecision);
            return dPrecision;

        }
    }
}
