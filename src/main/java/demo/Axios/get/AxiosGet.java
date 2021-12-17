package demo.Axios.get;

import com.axios.Axios;
import com.axios.request.Request;

/**
 * [Axios的get请求方法](Axios Get request method)
 * @author LZH
 * @version V1.0
 * @description zh - Axios的Get请求方法
 * @description en - Axios Get request method
 * @since 2021/12/16 18:19
 */
public class AxiosGet {

    /**
     * [基础的get请求](Basic get request)
     * @param
     * @return void
     * @description zh - 简单的get请求
     * @description en - Basic get request
     * @version V1.0
     * @author LZH
     * @date 19:37 2021/12/16
     * @param url URL
     **/
    public void basicGet(String url) {
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
     * [基础的get请求带有一个传参](The basic get request comes with a parameter)
     * @description zh - 基础的get请求带有一个传参
     * @description en - The basic get request comes with a parameter
     * @version V1.0
     * @author LZH
     * @date 19:44 2021/12/16
     * @param url URL
     * @param name 传参A
     * @return void
     **/
    public void basicGet(String url, String name) {
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
     * [把url中的传参的特殊字符进行转义](Escape the special characters passing parameters in the URL)
     * @description zh - 把url中的传参的特殊字符进行转义
     * @description en - Escape the special characters passing parameters in the URL
     * @version V1.0
     * @author LZH
     * @date 20:15 2021/12/16
     * @param url URL
     * @param name 传参A
     * @return void
     **/
    public void conversionGet(String url,String name){
        Request request = new Request();
        name = request.add("name", name).toParam();
        try {
            Axios.get(
                    url,
                    request.add("name",name)
            ).then(response -> {
                System.out.println(response);
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
