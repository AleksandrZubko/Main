package testAnnotate;


import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException{

        Class cl = Class.forName("testAnnotate.Cookies");
        if(!cl.isAnnotationPresent(ControlledObject.class)){
            System.err.println("no annotation");
        } else {
            System.out.println("class annotated ; name  -  " + cl.getAnnotation(ControlledObject.class));
        }
        boolean hasStart=false;
        boolean hasStop=false;
        Method[] method = cl.getMethods();
        for(Method md: method){
            if(md.isAnnotationPresent(StartObject.class)) {hasStart=true;}
            if(md.isAnnotationPresent(StopObject.class)) {hasStop=true;}
            if(hasStart && hasStop){break;}
        }
        System.out.println("Start annotaton  - " + hasStart + ";  Stop annotation  - " + hasStop );



    }
}
