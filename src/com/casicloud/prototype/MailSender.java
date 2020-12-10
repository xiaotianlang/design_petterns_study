package com.casicloud.prototype;

import com.casicloud.prototype.model.AdvTemplate;
import com.casicloud.prototype.model.Mail;

import java.util.Random;

/**
 * @Author: lsc
 * @DATE: 2020/12/9 11:14
 * @Version: 1.0
 * @类功能:
 **/
public class MailSender {
    public static void main(String[] args) {
        AdvTemplate advTemplate = new AdvTemplate();
        Mail mail = new Mail(advTemplate);

        for (int i = 0; i <10 ; i++) {
            Mail mail1=mail.clone();
            if(i%2==0){
                mail1.setAppellation("先生");
            }else{
                mail1.setAppellation("女士");
            }
            mail1.setSender(getMailAdress());
            mail1.setReceiver(getMailAdress());
            System.out.println("-------------");
            mail1.sendEmail();
        }
    }

    public static String getMailAdress(){
        Random random = new Random();
        String nameString="abcdefghigklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789";
        StringBuffer a = new StringBuffer();
        for (int i = 0; i < 8; i++) {
            int num = random.nextInt(9);
            while(num==0){
                num = random.nextInt(9);
            }
            a.append(num);
        }
        a.append("@");
        for (int i = 0; i <4 ; i++) {
            a.append( nameString.charAt(random.nextInt(nameString.length())));
        }
        a.append(".com");
        return a.toString();
    }
}
