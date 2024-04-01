package test1;

import java.util.Scanner;

/**
 * 字符串的右旋转操作是把字符串尾部的若干个字符转移到字符串的前面。给定一个字符串 s 和一个正整数 k，
 * 请编写一个函数，将字符串中的后面 k 个字符移到字符串的前面，实现字符串的右旋转操作。
 * 例如，对于输入字符串 "abcdefg" 和整数 2，函数应该将其转换为 "fgabcde"。
 */
public class StringRightRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        //注意nextInt()方法不读取换行符,所以如果紧接着要读取字符串的话需要把之前int值后面的换行符"过滤"掉
        //不然的话就统一按照字符串读取 : int n = Integer.parseInt(scanner.nextLine());
        scanner.nextLine();
        String s = scanner.nextLine();

        int len = s.length();
        char[] ch = s.toCharArray();
        reverse(ch, 0, len - n - 1);
        reverse(ch, len - n, len - 1);
        reverse(ch, 0, len - 1);

        System.out.println(ch);
    }

    //反转字符串在下标[start,end]区间里的部分
    private static void reverse(char[] ch, int start, int end) {
        while (start < end) {
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
    }
}
