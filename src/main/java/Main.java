import zero.App;
import zero.ui.Label;
import zero.ui.TextField;
import zero.ui.Button;
import zero.ui.Column;


public class Main extends App {
    @Override public void settings() {
        title("Greeting");
        size(420, 240);
        padding(20);
    }
    public void setup() {
        Label greeting = new Label("Hello, world!");
        TextField name = new TextField();
        name.setPromptText("Your name");
        Button button = new Button("Say hello");
        button.onClick(() ->
                greeting.setText("Hello, " + name.getText() + "!"));
        show(new Column(10, greeting, name, button));
    }
    public static void main(String[] args) { launch(args); }
}