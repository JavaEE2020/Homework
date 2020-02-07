import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(RuntimeException.class)
    public Map<String, Object> exceptionHandler(){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("errorCode", "101");
        map.put("errorMessage", "系统错误！");
        return map;
    }
}
