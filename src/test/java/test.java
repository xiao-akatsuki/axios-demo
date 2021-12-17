import com.axios.request.Request;
import org.junit.Test;

/**
 * []()
 *
 * @author LZH
 * @version V1.0
 * @description zh -
 * @description en -
 * @since 2021/12/16 19:59
 */
public class test {
    @Test
    public void test(){
        Request request = new Request();
        request.add("name","LZH");
        System.out.println( "this is request to body --> " + request.toBody());
        System.out.println( "this is request to param  --> " + request.toParam());
    }
}
