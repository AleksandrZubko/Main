package ua.spring5.ch2.decoupled;

public class HelloWorldMessageProvider implements MessageProvider{
    @Override
    public String getMassage() {
        return "Hello world!";
    }
}
