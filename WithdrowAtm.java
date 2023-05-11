package org.jsp;



import java.util.Scanner;

public class WithdrowAtm
{  static  double deposite=1000000000.0;
    static  int count=0;
    public static void main(String[] args) {
        System.out.println(" welcome to the ATM machine ");
        System.out.println("enter the pin ");
        int pin;
        Scanner in = new Scanner(System.in);
        int input;
        double moneydeposite;
        double transfer;
        double withdraw;
        pin = in.nextInt();
        if ( pin == 8750){

            System.out.println("1.Transactions History");
            System.out.println(" 2.Withdraw");
            System.out.println("  3.Deposit");
            System.out.println("  4.Transfer");
            System.out.println(" 5.Quit ");
            input=in.nextInt();

            switch(input)
            {
                case 1:
                    showdata();
                    showmenu();
                    break;
                case 2:
                    System.out.println("the amount you want to withdraw from your account ");
                    withdraw=in.nextDouble();
                    if(withdraw<deposite) {
                        getwithdraw(withdraw);
                    }
                    else {
                        System.out.println("withdraw amount is greater than deposite amount ");
                    }
                    showmenu();
                    break;
                case 3:
                    System.out.println("how much money you want deposite");
                    moneydeposite=in.nextDouble();
                    getdeposite(moneydeposite);
                    showmenu();
                    break;

                case 4:
                    System.out.println("the amount you want to transfer from your account ");
                    transfer=in.nextDouble();
                    if(transfer<deposite) {
                        gettransfer(transfer);
                    }else
                    {
                        System.out.println("transfer amount is greater than deposite amount ");
                    }
                    showmenu();
                    break;
                case 5 :
                    break;
                default:
                    System.out.println("invalid entry");

            }

        }else{
            System.out.println("wrong pin");
        }
    }
    static void getdeposite(double money)
    {   count++;
        deposite+=money;
    }
    static  void showmenu(){
        int input;
        Scanner in = new Scanner(System.in);

        System.out.println("1.Transactions History");
        System.out.println(" 2.Withdraw");
        System.out.println("  3.Deposit");
        System.out.println("  4.Transfer");
        System.out.println(" 5.Quit ");
        input=in.nextInt();
        double transfer;
        double moneydeposite;
        double withdraw;
        switch(input)
        {
            case 1:
                showdata();
                showmenu();
                break;
            case 2:
                System.out.println("the amount you want to withdraw from your account ");
                withdraw=in.nextDouble();
                if(withdraw<deposite) {
                    getwithdraw(withdraw);
                }
                else {
                    System.out.println("withdraw amount is greater than deposite amount ");
                }
                showmenu();
                break;
            case 3:
                System.out.println("how much money you want deposite");
                moneydeposite=in.nextDouble();
                getdeposite(moneydeposite);
                showmenu();
                break;

            case 4:
                System.out.println("the amount you want to transfer from your account ");
                transfer=in.nextDouble();
                if(transfer<deposite) {
                    gettransfer(transfer);
                }else
                {
                    System.out.println("transfer amount is greater than deposite amount ");
                }
                showmenu();
                break;
            case 5 :
                break;
            default:
                System.out.println("invalid entry");

        }

    }
    static  void showdata()
    {
        System.out.println(" number of transaction done "+count);
        System.out.println(" your current bank amount is = "+deposite+ " rupees");
    }

    static void getwithdraw(double withdraw)
    {
        deposite-=withdraw;
    }
    static void gettransfer(double transfermoney){
        deposite-=transfermoney;
    }


}
