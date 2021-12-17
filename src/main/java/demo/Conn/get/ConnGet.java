package demo.Conn.get;

import com.axios.Conn;

import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

/**
 * [Conn的get请求方法](Conn Get request method)
 * @author LZH
 * @version V1.0
 * @description zh - Conn的Get请求方法
 * @description en - Conn Get request method
 * @since 2021/12/17 10:48
 */
public class ConnGet {

    /**
     * [基础的get请求](Basic get request)
     * @description zh - 基础的get请求
     * @description en - Basic get request
     * @version V1.0
     * @author LZH
     * @date 10:50 2021/12/17
     * @param url URL
     * @return void
     **/
    public void basicGet(String url) {
        Conn.get(url);
    }

    /**
     * [传输参数的get请求](Get request for transmission parameters)
     * @description zh - 传输参数的get请求
     * @description en - Get request for transmission parameters
     * @version V1.0
     * @author LZH
     * @date 10:59 2021/12/17
     * @param url URL
     * @param name 传参A
     * @return void
     **/
    public void basicGet(String url, String name) {
        Map<String, Object> paramMap = null;
        paramMap.put("name", name);
        Conn.get(
                url,
                paramMap
        );
    }

    /**
     * [带有超时时间的get请求](Get request with timeout)
     * @description zh - 带有超时时间的get请求
     * @description en - Get request with timeout
     * @version V1.0
     * @author LZH
     * @date 11:06 2021/12/17
     * @param url URL
     * @param timeout 超时时间 单位毫秒
     * @return void
     **/
    public void basicGet(String url, int timeout) {
        Conn.get(url,timeout);
    }

    /**
     * [带有超时时间和传参的get请求](Get request with timeout and parameters)
     * @description zh - 带有超时时间和单个传参的get请求
     * @description en - Get request with timeout and parameters
     * @version V1.0
     * @author LZH 
     * @date 11:10 2021/12/17
     * @param url URL
     * @param name 传参A
     * @param timeout 超时时间 单位毫秒
     * @return void
     **/
    public void basicGet(String url,String name, int timeout) {
        Map<String, Object> paramMap = null;
        paramMap.put("name", name);
        Conn.get(url,paramMap,timeout);
    }

}
