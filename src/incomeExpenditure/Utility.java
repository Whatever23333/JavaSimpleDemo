package incomeExpenditure;
import java.util.Scanner;


public class Utility {
    public static String OptionReader(){
        /**
         * 从键盘读取输入并进行校验，如果校验通过则返回输入数字的字符串格式，如果未通过则返回”error“
         */
        String input;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入1到4的数字");
        input = scanner.nextLine();
        String Choise = String.valueOf(input);
        if (Choise.equals("1") || Choise.equals("2") ||Choise.equals("3") ||Choise.equals("4") ){
            return Choise;
        }
        else{
            System.out.println("输入有误");
            return "error";
        }

    }
    public static int AmountReader(){
        /**
         * 从键盘读取输入并进行校验，如果校验通过则返回输入的金额，如果未通过则返回-1
         */
        String input;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入4位数以内的正整数");
        input = scanner.nextLine();
        int inputInt = Integer.parseInt(input);
        if(inputInt>0 && inputInt<=9999)
            return inputInt;
        else{
            System.out.println("输入有误，请输入4位数以内的正整数");
            return -1;
        }


    }
    public static String CommentsReader(){
        /**
         * 从键盘读取输入并进行校验，如果校验字符串格式，如果未通过则返回”error“
         */
        String input;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入备注信息");
        input = scanner.nextLine();
        if (input.length()<=8){
            return input;
        }
        else{
            System.out.println("输入有误");
            return "error";
        }
    }
    public static void getAccountInfo(){

    }
}
