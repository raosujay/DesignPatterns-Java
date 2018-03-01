public class INFOLogger extends AbstractLogger {

    public INFOLogger(int level) {
        this.level = level;
    }

    @Override
    public void writeLog(String lonMessage) {
        System.out.println("INFO logger :"+lonMessage);
    }
}
