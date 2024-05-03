public class BinarySystem {

    public static void printBinary(int num) {
        for(int i=31; i>=0; i--){
            System.out.println( (num & (1<<i))!= 0 );
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int a =78;
        System.out.println(a);
        printBinary(a);
        System.out.println("=====a====");

        int b = -4;
        System.out.println(b);
        printBinary(b);
        System.out.println("=====b====");

        int c=0b10011110;
        System.out.println(c);
        printBinary(c);
        System.out.println("=====c====");

        int d =0x4e;
        System.out.println(d);
        printBinary(d);
        System.out.println("=====d====");

        //相反数

        System.out.println(a);
        printBinary(a);
        printBinary(~a);
        int e =~a+1;//相反数就是取反加一
        System.out.println(e);
        printBinary(e);
        System.out.println("=====e====");

        //int，long 的最小值 ，取反和绝对值都是自己
        int f = Integer.MIN_VALUE;
        System.out.println(f);
        printBinary(f);
        System.out.println(-f);
        printBinary(-f);
        System.out.println(~f+1);
        printBinary(~f+1);//绝对值，相反数
        System.out.println("=====f====");

        //!^&
        int g = 0b0001010;
        int h = 0b0001100;
        System.out.println(g|h);
        printBinary(g|h);

        System.out.println(g&h);
        printBinary(g&h);

        System.out.println(g^h);
        printBinary(g^h);

        System.out.println("=====g====");

        System.out.println("测试一");
        boolean test2 =returnTrue()|returnFalse();
        System.out.println(test2);
        System.out.println("测试二");
        boolean test3 =returnTrue()&returnFalse();
        System.out.println(test3);
        System.out.println("测试三");
        boolean test4 =returnTrue()^returnFalse();
        System.out.println(test4);
        System.out.println("测试四");
        //左移

        int i = 0b11110000;
        System.out.println(i);
        printBinary(i);
        System.out.println(i<<1);
        printBinary(i<<1);
        System.out.println(i<<2);
        printBinary(i<<2);
        //>>>

        System.out.println(i>>>1);
        printBinary(i>>>1);
        System.out.println(i>>>2);
        printBinary(i>>>2);
        //>>

        System.out.println(i>>1);
        printBinary(i>>1);
        System.out.println(i>>2);
        printBinary(i>>2);
        //非负数>> 和>>> 结果相同

        //负数>> 和>>> 结果不同
        int j = -10;
        System.out.println(j);
        printBinary(j);
        System.out.println(j>>1);
        printBinary(j>>1);
        System.out.println(j>>>1);
        printBinary(j>>>1);

        //非负数 << 相当于乘以2
        //非负数 >>> 相当于除以2
        //负数 << 相当于乘以2
        //负数 >>> 相当于除以2 向下取整


    }

    public static boolean returnTrue(){
        System.out.println("进入returnTrue");
        return true;
    }
    public static boolean returnFalse(){
        System.out.println("进入returnFalse");
        return false;
    }
};
