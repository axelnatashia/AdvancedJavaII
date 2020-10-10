/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;

import java.util.Scanner;

/**
 *
 * @author axel
 */
public class salarysurvey {
    public static void main(String[] args)
    {
        int survey;
        double paidd = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("calculate the survey paid: ");
        survey = input.nextInt();
        
        if(survey<5)
        {
            paidd = survey*10.00;
            System.out.println("your paid daily is RM"+paidd);
        }
        else if(survey==5)
        {
            System.out.println("your paid daily is RM 70.00");
        }
        else if(survey>5)
        {
            double resultfinal =(survey%5)*10.00;
            double payment =(survey/5)*70.00;
            paidd = resultfinal * payment;
            System.out.println("your paid daily is RM"+ paidd);
        }
    }
}
