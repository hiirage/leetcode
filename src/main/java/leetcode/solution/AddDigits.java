package leetcode.solution;

public class AddDigits {
    public int addDigits(int num) {
        if(num < 0){
            return 0;
        }

        int n = 0;

        do{
            n = 0;
            while(num != 0){
                n += num % 10;
                num /= 10;
            }
        }while((num = n) >= 10);

        return n;
    }

    /*
          0. adding 9 to a number won't change its digit root
          1. if digit root of a is i, b = a + j -> digit root of b = digit root of (i + j)
          3. any given number x can be represented as x = 9a + b, where b < 9
          4. digit root of 9a = (9 + 9 + ... + 9) = 9
        thus, digit root of x = b whenever b != 0
        when b = 0, digit root of x = 9 if x !=0
     */
    public int oneLineSolution(int num){
        return num==0?0:(num%9==0?9:(num%9));
    }
}
