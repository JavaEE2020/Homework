import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;

public class HelloWorld {

    public static void main(String[] args) {
        //Logger logger = LoggerFactory.getLogger("HelloWorld");
        Logger logger = LoggerFactory.getLogger(HelloWorld.class);
        logger.debug("Hello world.");
// 查看加载状态
        LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
        StatusPrinter.print(lc);
    }
}
