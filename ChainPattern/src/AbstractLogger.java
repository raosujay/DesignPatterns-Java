
public abstract class AbstractLogger {

    public static final int INFO = 1;
    public static final int WARM = 2;
    public static final int ERROR = 3;

    protected int level;

    private AbstractLogger nextLogger;

    public void log(int level,String lonMessage){
        if (this.level <= level){
            writeLog(lonMessage);
        }
        if (nextLogger !=null){
            nextLogger.log(level,lonMessage);
        }
    }

    public abstract void writeLog(String lonMessage);

    public AbstractLogger getNextLogger() {
        return nextLogger;
    }

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }


}
