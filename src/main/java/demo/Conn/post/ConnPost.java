package demo.Conn.post;

import com.axios.Conn;
import com.axios.request.Body;

import java.util.Map;

/**
 * [Conn的post请求方法](Conn Post request method)
 * @author LZH
 * @version V1.0
 * @description zh - Conn的post请求方法
 * @description en - Conn Post request method
 * @since 2021/12/17 11:18
 */
public class ConnPost {
    /**
     * [传输参数的post请求](Post request for transmission parameters)
     * @description zh - 传输参数的post请求
     * @description en - Post request for transmission parameters
     * @version V1.0
     * @author LZH 
     * @date 11:21 2021/12/17
     * @param url URL
     * @param name 传参A
     * @return void
     **/
    public void basicPost(String url,String name){
        Map<String,Object> paraMap = null;
        paraMap.put("name",name);
        Conn.post(url,paraMap);
    }

    /**
     * [带有超时时间和参数的post请求](Post request with timeout and parameters)
     * @description zh - 传输参数的post请求
     * @description en - Post request with timeout and parameters
     * @version V1.0
     * @author LZH
     * @date 11:21 2021/12/17
     * @param url URL
     * @param name 传参A
     * @param timeout 超时时间 单位毫秒
     * @return void
     **/
    public void basicPost(String url,String name,int timeout){
        Map<String,Object> paraMap = null;
        paraMap.put("name",name);
        Conn.post(url,paraMap,timeout);
    }

    /**
     * [传输json格式的参数的post请求](Post request to transmit json format parameters)
     * @description zh - 传输参数的post请求
     * @description en - Post request to transmit json format parameters
     * @version V1.0
     * @author LZH
     * @date 11:21 2021/12/17
     * @param url URL
     * @param name 传参A
     * @return void
     **/
    public void jsonPost(String url,String name){
        Conn.post(
                url,
                new Body().add("name",name)
                        .toBody()
        );
    }
}
