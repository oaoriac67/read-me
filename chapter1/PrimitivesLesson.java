package chapter1;

public class PrimitivesLesson {
    public static void main(String[] args) {
        boolean isRunning = true;
        char c = 65535; //65535 max, not negative
        byte b =1;//2^8
        short s= 128;
        int i= 32_767;
        long longer = 2_147_483_648L;
        float f=31.21F; //31f, 31.0F or 31.0f
        double d= 1.6;//  1.6d or  1.6D;
        System.out.println((Math.pow(2,8)));
        System.out.println((Math.pow(2,16)));
        // System.out.println((long)(Math.powExact(2,32)));
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        System.out.println(b );
        System.out.println(c);
        System.out.println(123_345.678_9);
        //additional info
        System.out.println(10);
        System.out.println(050); //0## 0 prefix is octal    
        System.out.println(0xa); //0X## or 0x## 0x prefix is hexadecimal
        System.out.println(0B101);//0B## or 0b## 0b prefix is binary

        // 8 4 2 1
        // 0 1 0 1

    }
}