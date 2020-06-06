import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class Bot extends TelegramLongPollingBot {
    public void onUpdateReceived(Update update) {
        update.getUpdateId();// Обновляет информацию о пользователе

        SendMessage sendMessage = new SendMessage()
                .setChatId(update.getMessage().getChatId());

        if (update.getMessage().getText().equals("Hello")) {
            sendMessage.setText("Hi body");

            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }

    public String getBotUsername() {
        return "MyFirstMedBot";
    }

    public String getBotToken() {
        return "1443406867:AAEQd_qu436GNWPFKQhhE1Hs6YosdPeoB_w";
    }
}
