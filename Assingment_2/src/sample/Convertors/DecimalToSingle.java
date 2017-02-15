package sample.Convertors;

/**
 * Created by adama on 2/12/2017.
 */
public class DecimalToSingle
{
    public static void main (String args [])
    {
        DecimalToSingle dtoS = new DecimalToSingle();
        dtoS.convert(1024);
        System.out.print(Integer.toHexString(1024));
        String hexNumber = "1024";
        int decimal = Integer.parseInt(hexNumber, 16);
        System.out.println("Hex value is " + decimal);
    }

    public String convert(double deciNum)
    {
        int bits;
        String sPrecision;
        float f = (float)deciNum;
        bits = Float.floatToIntBits(f);
        //System.out.println(Float.toHexString(f));
        sPrecision = Integer.toBinaryString(bits);
        if (deciNum > 1.0)
        {
//            System.out.println("0" + sPrecision);
            sPrecision = "0" + sPrecision;
            return sPrecision;
        }
        else if (deciNum == 0.0)
        {
            sPrecision = "00000000000000000000000000000000";
            return sPrecision;
        }
        else if (deciNum <= 1.0 && deciNum > 0)
        {
//            System.out.println("0" + sPrecision);
            sPrecision = ("0" + "0" + sPrecision);
            return sPrecision;
        }
        else
        {
//            System.out.println(sPrecision);
            return sPrecision;
        }
    }


}
