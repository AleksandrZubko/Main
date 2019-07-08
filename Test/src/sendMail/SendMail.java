package sendMail;

import org.apache.commons.mail.SimpleEmail;

public class SendMail {
    public static void main(String[] args) {

        SimpleEmail email = new SimpleEmail();
        /*email.setAuthentication("dribr.nrm@privatbank.ua", "softcollection");
        email.setHostName("smtp.gmail.com");
        email.setHostName("smtp70.pbank.com.ua");
        email.setSmtpPort(25);
        email.setTLS(true);*/
        //email.setAuthentication("nrm.privatbank@gmail.com", "NrmPrivatbank2016");
        email.setAuthentication("zubko.alexander@gmail.com", "iATXe65l");
        email.setHostName("smtp.gmail.com");
        email.setSmtpPort(587);
    }
}
