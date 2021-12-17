package demo.Axios.post;

import com.axios.Axios;
import com.axios.header.Header;
import com.axios.request.Body;
import com.axios.request.Request;

/**
 * [Axios的post请求方法](Axios Post request method)
 * @author LZH
 * @version V1.0
 * @description zh - Axios的Post请求方法
 * @description en - Axios Post request method
 * @since 2021/12/17 8:40
 */
public class AxiosPost {

    /**
     * [基础的post请求](Basic post request)
     * @param
     * @return void
     * @description zh - 简单的post请求
     * @description en - Basic post request
     * @version V1.0
     * @author LZH
     * @date 19:37 2021/12/16
     * @param url URL
     **/
    public void basicPost(String url) {
        try {
            Axios.get(
                    url
            ).then(response -> {
                System.out.println(response);
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * [基础的post请求带有一个传参](The basic post request comes with a parameter)
     * @description zh - 基础的post请求带有一个传参
     * @description en - The basic post request comes with a parameter
     * @version V1.0
     * @author LZH
     * @date 19:44 2021/12/16
     * @param url URL
     * @param name 传参A
     * @return void
     **/
    public void basicPost(String url, String name) {
        try {
            Axios.get(
                    url,
                    new Request().add("name", name)
            ).then(response -> {
                System.out.println(response);
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * [把post请求中的参数在请求头中传输](Transmit the parameters in the post request in the request header)
     * @description zh - 把post请求中的参数在请求头中传输
     * @description en - Transmit the parameters in the post request in the request header
     * @version V1.0
     * @author LZH
     * @date 8:45 2021/12/17
     * @param url URL
     * @param name 传参A
     * @return void
     **/
    public void headPost(String url, String name) {
        Header header = new Header();
        header.add("name", name);
        try {
            Axios.post(
                    url,
                    header
            ).then(response -> {
                System.out.println(response);
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * [把post请求中的参数以键值对的形式在请求体中传输](Transmit the parameters in the post request in the form of key-value pairs in the request body)
     * @description zh - 把post请求中的参数以键值对的形式在请求体中传输
     * @description en - Transmit the parameters in the post request in the form of key-value pairs in the request body
     * @version V1.0
     * @author LZH
     * @date 8:45 2021/12/17
     * @param url URL
     * @param name 传参A
     * @return void
     **/
    public void bodyPost(String url, String name) {
        Body body = new Body();
        body.add("name", name);
        try {
            Axios.post(
                    url,
                    body
            ).then(response -> {
                System.out.println(response);
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * [把post请求中的参数转换为json格式并且在请求体中传输](Convert the parameters in the post request to json format and transmit in the request body)
     * @description zh - 把post请求中的参数转换为json格式并且在请求体中传输
     * @description en - Convert the parameters in the post request to json format and transmit in the request body
     * @version V1.0
     * @author LZH
     * @date 8:45 2021/12/17
     * @param url URL
     * @param name 传参A
     * @return void
     **/
    public void bodyJsonPost(String url, String name) {
        Body body = new Body();
        name = body.add("name", name).toBody();
        body.add("name", name);
        try {
            Axios.post(
                    url,
                    body
            ).then(response -> {
                System.out.println(response);
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * [使用post请求传输请求头和请求体](Use post request to transmit request header and request body)
     * @description zh - 使用post请求传输请求头和请求体
     * @description en - Use post request to transmit request header and request body
     * @version V1.0
     * @author LZH
     * @date 10:12 2021/12/17
     * @param url URL
     * @param headName 在请求头中的传参
     * @param bodyName 在请求体中的传参
     * @return void
     **/
    public void headBodyJsonPost(String url,String headName,String bodyName){
        Body body = new Body();
        Header header = new Header();
        bodyName = body.add("bodyName", bodyName).toBody();
        body.add("bodyName", bodyName);
        header.add("headName",headName);
        try {
            Axios.post(
                    url,
                    body,
                    header
            ).then(response -> {
                System.out.println(response);
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
