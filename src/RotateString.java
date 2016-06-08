/**
 * Created by Administrator on 2016/3/27.
 */
//lintcode  旋转字符串
public class RotateString {
    //时间复杂度O(n*d),空间复杂度O(1)
    public void rotateString(char[] str, int offset) {
        // write your code here
        assert offset <= str.length;

        for (int i = 0; i < offset; i++) {
            rightRotateOne(str);
        }
    }

    public void rightRotateOne(char[] str) {
        int len = str.length;
        char tmp = str[len - 1];
        //数组移动，从len-2往后移动，不然整个数组都会变成第一个元素
        if (str.toString() != "") {
            for (int i = len - 2; i >= 0; i--) {
                str[i + 1] = str[i];
            /*System.arraycopy(str,0,str,1,len-1);*/
            }
            str[0] = tmp;
        }
    }

    public int hashCode(char[] key, int HASH_SIZE) {
        // write your code here
        int len = key.length;
        double code = 0.0;
        for (int i = 0; i < len; i++) {
            code += (int) key[i] * (Math.pow(33, len - 1 - i) % HASH_SIZE);//超过范围了！！！！
        }
        System.out.println(code);
        code = code % HASH_SIZE;
        System.out.println(code);
        return (int) code;
    }

    public static void main(String[] args) {
        /*char[] str = new char[]{'a', 'b', 'c', 'd', 'e', 'f'};*/

       /* System.out.println( Math.pow(2,3));
        System.out.println((int)'a');
        System.out.println(new Character('a').hashCode());*/
        String str = "abcdefghijklmnopqrstuvwxyz";
       /* char[] arr=str.toCharArray();

        System.out.println(new RotateString().hashCode(arr, 2607));

        *//*BigInteger.valueOf(1232);*//*
        System.out.println((int)'a');
        System.out.println(Integer.valueOf('a'));


        int[ ][ ] jjj={{1,2,3},{4,5,6}};
        System.out.println(jjj.length);//行数
        System.out.println(jjj[0].length);//列

        int[] a={};
        System.out.println(a.length);*/
       /* [1,5,10,11,16,23,24,26,29,34,41,48,49,56,63,67,71,74,75],
        [97,118,131,150,160,182,202,226,251,273,289,310,326,349,368,390,401,412,428],
        [445,455,466,483,501,519,538,560,581,606,631,643,653,678,702,726,748,766,781],
        [792,817,837,858,872,884,901,920,936,957,972,982,1001,1024,1044,1063,1086,1098,1111],
        [1129,1151,1172,1194,1213,1224,1234,1250,1267,1279,1289,1310,1327,1348,1371,1393,1414,1436,1452],
        [1467,1477,1494,1510,1526,1550,1568,1585,1599,1615,1625,1649,1663,1674,1693,1710,1735,1750,1769]*/
        String s = "abc";
        String ss = "a" + "bc";
        String sss = new String("abc");
        System.out.println(s == ss);
        System.out.println(sss == s);
    }
}
