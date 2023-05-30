package Repository;

import Models.Mail;
import java.util.List;

public interface MailReositoryiInterface {
        Mail save(Mail email);

        List<Mail> findAll();
        List<Mail> findSent(String username);
        List<Mail> findReceived(String username);
        void  deleteMail(String email);
        void  deleteAll(String email);
    }

