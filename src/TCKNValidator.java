import java.util.ArrayList;
import java.util.List;
public class TCKNValidator {
    public boolean validateTCKN(String TCKN)
    {
        boolean flag=true;

        List<Integer> tckn=ConvertTCKNToIntegerList(TCKN);

        if(tckn.size()!=11||tckn.get(0)==0||CheckTCKNbySingleAndDoubledigits(tckn)!=tckn.get(9)
        ||CheckTCKNbyFirst10Digits(tckn)!=tckn.get(10)) flag=false;

        for(int i=0; i<TCKN.length(); i++)
        {
            if (tckn.get(i) < 0) {
                flag = false;
            }
        }
        return flag;
    }

    private int CheckTCKNbySingleAndDoubledigits(List<Integer> TCKN)
    {

        int SingleSum=(TCKN.get(0)+ TCKN.get(2)+ TCKN.get(4)+ TCKN.get(6)+ TCKN.get(8))*7;
        int DoubleSum=TCKN.get(1)+ TCKN.get(3)+ TCKN.get(5)+ TCKN.get(7);

        int result=(SingleSum-DoubleSum)%10;

        return result;
    }

    private int CheckTCKNbyFirst10Digits(List<Integer> TCKN)
    {
        int result=(TCKN.get(0)+ TCKN.get(2)+ TCKN.get(4)+ TCKN.get(6)+ TCKN.get(8)+
                    TCKN.get(1)+ TCKN.get(3)+ TCKN.get(5)+ TCKN.get(7)+ TCKN.get(9))%10;
        return result;
    }

    private List<Integer> ConvertTCKNToIntegerList(String TCKN)
    {
        List<Integer> tckn=new ArrayList<>();
        for(int i=0; i<TCKN.length(); i++)
        {
            char charAtIndex=TCKN.charAt(i);

            if(Character.isDigit(charAtIndex)) tckn.add(Character.getNumericValue(charAtIndex));
            else tckn.add(-1);
        }
        return tckn;
    }
}
