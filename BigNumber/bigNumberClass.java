package BigNumber;

import java.math.BigInteger;

public class bigNumberClass {
    public static void main(String[] args) {
        BigInteger bigOne=new BigInteger("111122998376366288181111229983763662881811112299837636628818111122998376366288181111229983763662881811112299837636628818");
        BigInteger bigTwo=new BigInteger("13636767623528938926136367676235289389261363676762352893892613636767623528938926");
        System.out.println("加法操作"+bigOne.add(bigTwo));
        System.out.println("乘法操作"+bigOne.multiply(bigTwo));
        System.out.println("减法操作"+bigOne.subtract(bigTwo));
        System.out.println("除法操作"+bigOne.divide(bigTwo));

    }
}
