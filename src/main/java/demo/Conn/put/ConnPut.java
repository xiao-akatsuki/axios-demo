package demo.Conn.put;

import com.axios.Conn;
import com.axios.request.Body;

import java.util.Map;

/**
 * [Conn的post请求方法](Conn Put request method)
 * @author LZH
 * @version V1.0
 * @description zh - Conn的put请求方法
 * @description en - Conn Put request method
 * @since 2021/12/17 10:19
 */
public class ConnPut {
    /**
     * [传输参数的put请求](put request for transmission parameters)
     * @description zh - 传输参数的put请求
     * @description en - put request for transmission parameters
     * @version V1.0
     * @author LZH
     * @date 11:37 2021/12/17
     * @param url URL
     * @param name 传参A
     * @return void
     **/
    public void basicPut(String url,String name){
        Map<String,Object> paraMap = null;
        paraMap.put("name",name);
        Conn.put(url,paraMap);
    }

    /**
     * [带有超时时间和参数的put请求](Put request with timeout and parameters)
     * @description zh - 带有超时时间和参数的put请求
     * @description en - Put request with timeout and parameters
     * @version V1.0
     * @author LZH
     * @date 11:38 2021/12/17
     * @param url URL
     * @param name 传参A
     * @param timeout 超时时间 单位毫秒
     * @return void
     **/
    public void basicPut(String url,String name,int timeout){
        Map<String,Object> paraMap = null;
        paraMap.put("name",name);
        Conn.put(url,paraMap,timeout);
    }

    /**
     * [传输json格式的参数的put请求](Put request to transmit json format parameters)
     * @description zh - 传输json格式的参数的put请求
     * @description en - Put request to transmit json format parameters
     * @version V1.0
     * @author LZH
     * @date 11:48 2021/12/17
     * @param url URL
     * @param name 传参A
     * @return void
     **/
    public void jsonPut(String url,String name){
        Conn.put(
                url,
                new Body().add("name",name)
                        .toBody()
        );
    }
}
