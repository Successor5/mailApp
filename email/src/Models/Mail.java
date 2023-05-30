package Models;

public class Mail {
    private String sender;
    private String[] recipients;
    private String subject;
    private String messageBody;
    private boolean isRead;
    private boolean isArchived;

    public Mail(String sender, String[] recipients, String subject, String messageBody, boolean isRead, boolean isArchived) {
        this.sender = sender;
        this.recipients = recipients;
        this.subject = subject;
        this.messageBody = messageBody;
        this.isRead = isRead;
        this.isArchived = isArchived;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String[] getRecipients() {
        return recipients;
    }

    public void setRecipients(String[] recipients) {
        this.recipients = recipients;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessageBody() {
        return messageBody;
    }

    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }

    public boolean isRead() {
        return isRead;
    }

    public void setRead(boolean read) {
        isRead = read;
    }

    public boolean isArchived() {
        return isArchived;
    }

    public void setArchived(boolean archived) {
        isArchived = archived;
    }

    public void remove(Mail email) {
        email.remove( email);
    }
}