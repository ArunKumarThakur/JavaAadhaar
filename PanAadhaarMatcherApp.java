package Project;

import java.util.Scanner;

public class PanAadhaarMatcherApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AadhaarService aadhaarService = new AadhaarService();
        PanService panService = new PanService();

        System.out.println("Enter the Aadhaar Number :");
        String aadhaarNumber = sc.nextLine();
        int cnt = 3;
        while(cnt > 0 && aadhaarNumber.length() != 12) {
            System.out.println("Aadhaar Number must be length of 12, Try again");
            System.out.println("You can only try "+ cnt + " times");
            cnt -= 1;
            aadhaarNumber = sc.nextLine();
            if(cnt == 0) {
                System.out.println("You succeed today's limit... Have a good day");
                return ;
            }
        }

        Aadhaar aadhaar = aadhaarService.getAadhaarByNumber(aadhaarNumber);
        Pan pan = panService.getPanByAadharNumber(aadhaarNumber);

        if(aadhaar != null && pan != null) {
            System.out.println("Aadhaar Details" + " " +aadhaar);
            System.out.println("Pan Details" + " " +pan);
        } else {
            System.out.println("No Match Found.....");
        }
    }
}
