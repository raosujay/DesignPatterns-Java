public class Demo {
    public static void main(String[] args){
        AbstractLogger infoLogger = new INFOLogger(1);
        AbstractLogger warmLogger = new WarmLogger(2);
        AbstractLogger errorLogger = new ErrorLogger(3);

        infoLogger.setNextLogger(warmLogger);
        warmLogger.setNextLogger(errorLogger);

        infoLogger.log(3,"执行");
    }
}
