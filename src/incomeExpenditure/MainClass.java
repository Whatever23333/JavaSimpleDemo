package incomeExpenditure;

import java.util.ArrayList;
import java.util.Iterator;

public class MainClass {

    static int Balance = 10000;
    static String detail;
    static ArrayList<String> Info = new ArrayList<String>();
    public static void main(String[] args){
        MainClass.mainFunc();
    }
    public static void  mainFunc(){
        /**
         * 主方法
         */
        boolean opentag = true;
        while(opentag){
            System.out.println("----------------------------家庭收支系统-------------------------------");
            System.out.println("1.收支明细");
            System.out.println("2.计入收入");
            System.out.println("3.计入支出");
            System.out.println("4.退出");

            /**
             * 从console中读取输入的数字，如果出现错误则循环调用
             */
            String Keyvalue = Utility.OptionReader();
            while (Keyvalue.equals("error")){
                Keyvalue = Utility.OptionReader();
            }
            System.out.println(Keyvalue);

            switch (Keyvalue){
                case "1":
                    System.out.println("----------------------------收支明细-------------------------------");
                    System.out.println("类型"+"\t"+"金额"+"\t"+"余额"+"\t"+"说明");
                    Iterator it1 = Info.iterator();
                    while (it1.hasNext())
                        System.out.println(it1.next());
                    System.out.println("\n-------------------------------------------------------------------");
                    break;
                case "2":
                    int amount = Utility.AmountReader();
                    while(amount==-1)
                        amount = Utility.AmountReader();
                    String comments = Utility.CommentsReader();
                    while (comments.equals("error")){
                        comments = Utility.OptionReader();
                    }

                    Balance = amount + Balance;
                    detail ="收入\t"+amount+"\t"+Balance+"\t"+comments;
                    Info.add(detail);
                    System.out.println("添加完成");
                    break;
                case "3":
                    amount = Utility.AmountReader();
                    while(amount==-1)
                        amount = Utility.AmountReader();
                    comments = Utility.CommentsReader();
                    while (comments.equals("error")){
                        comments = Utility.OptionReader();
                    }

                    Balance = Balance - amount;
                    detail ="支出\t"+amount+"\t"+Balance+"\t"+comments;
                    Info.add(detail);
                    System.out.println("添加完成");
                    break;
                case "4":
                    opentag= false;
                    break;
            }

        }
    }
}
