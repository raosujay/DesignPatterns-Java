public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    public void writeLog(String lonMessage) {
        System.out.println("ERROR logger :"+lonMessage);
    }
}
