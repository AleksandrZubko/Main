package testAnnotate;

@ControlledObject(name = "biscuits")
public class Cookies {
    @StartObject
    public void createCookie(){
        //бизнес логика
    }
    @StopObject(info = "test2", info1 = "")
    public void stopCookie(){
        //бизнес логика
    }
}
