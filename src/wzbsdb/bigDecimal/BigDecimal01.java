package wzbsdb.bigDecimal;

import java.math.BigDecimal;

public class BigDecimal01 {
    public static void main(String[] args) throws IllegalAccessException {
        System.out.println(1.01 + 2.02);
        //创建BigDecimal对象主要有两种
        BigDecimal b1 = new BigDecimal("1.34");//1.34
        BigDecimal b2 = BigDecimal.valueOf(1.34);//1.34
        BigDecimal zero = BigDecimal.ZERO;
        BigDecimal one = BigDecimal.ONE;
        BigDecimal ten = BigDecimal.TEN;
        double divide = div(Double.valueOf(String.valueOf(b1)),Double.valueOf(String.valueOf(b2)),2);
        System.out.println(divide);
    }
    /**
     * 提供精确的除法运算方法div
     * @param value1 被除数
     * @param value2 除数
     * @param scale 精确范围
     * @return 两个参数的商
     * @throws IllegalAccessException
     */
    public static double div(double value1,double value2,int scale) throws IllegalAccessException{
        //如果精确范围小于0，抛出异常信息
        if(scale<0){
            throw new IllegalAccessException("精确度不能小于0");
        }
        BigDecimal b1 = new BigDecimal(Double.valueOf(value1));
        BigDecimal b2 = new BigDecimal(Double.valueOf(value2));
        return b1.divide(b2, scale).doubleValue();
    }
}
