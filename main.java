public class main {
    public static void main(String[] args){
        NotificationService notificationService = new NotificationService();
        Observer emailObserver = new EmailObserver("Email");
        Observer phoneObserver = new PhoneObserver("Mobile");
        Observer pagerDutyObserver = new PagerDutyObserver("PagerDuty");
        notificationService.addObserver(emailObserver);
        notificationService.addObserver(phoneObserver);
        notificationService.addObserver(pagerDutyObserver);
        NotificationMessage notificationMessage = new NotificationMessage(1 , "Hello World", "Greeting");
        notificationService.notifyObservers(notificationMessage);
    }
}
