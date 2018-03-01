public class WarmLogger extends AbstractLogger {

    public WarmLogger(int level) {
        this.level = level;
    }

    @Override
    public void writeLog(String lonMessage) {
        System.out.println("WARM logger :"+lonMessage);
    }
}
