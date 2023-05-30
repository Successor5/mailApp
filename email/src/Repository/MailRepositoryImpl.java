package Repository;

import Models.Mail;

import java.util.ArrayList;
import java.util.List;

public class MailRepositoryImpl implements MailReositoryiInterface {

    private List<Mail> mails;

    @Override
    public Mail save(Mail email) {
        this.mails.add(email);
        return email;
    }

    @Override
    public List<Mail> findAll() {
        return this.mails;
    }

    @Override
    public List<Mail> findSent(String username) {
        List<Mail> sent = new ArrayList<>();
        return sent;
    }

    @Override
    public List<Mail> findReceived(String username) {
        List<Mail> receivedByUser = new ArrayList<>();
        for (Mail email : this.mails) {
            if (email.getRecipients().equals(username)) {
                receivedByUser.add(email);
            }
        }
        return receivedByUser;
    }

    @Override
    public void deleteMail(String email) {
        mails.remove(email);
    }

    @Override
    public void deleteAll(String email) {
        mails.clear();
    }
}






