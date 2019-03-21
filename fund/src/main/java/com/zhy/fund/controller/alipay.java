package com.zhy.fund.controller;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.internal.util.AlipaySignature;
import com.alipay.api.request.AlipayTradePagePayRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


@Controller
public class alipay{


        // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
        public static String app_id = "2016092600600292";

        // 商户私钥，您的PKCS8格式RSA2私钥
        public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCeUqNMqHGLHQXEZrsa8tD7bHl1JmcZR+n/JCLNC27KqDn+RTLqMG/EuoMCnsUgKJXaXh+Ab9zCxCs+WBaUECKG6ZHbhQAxEafD0GviM1/tm+yOORfDxtZ7z7sDs1xNYcNzTuHQZz54RJPbntoeL3ZdWC9V3OKR9aOfJGYmFNgsrh/Y5HSB3kTgEHyPUiH0fFBaLhutOsL5B0DFY+5PbUj0ydEyUzYCFVsC1yGrrxu744pETTDUHlwIyqkneMHThrxLl95CuX70Gt7DDrl8YTu68nP6fiNTaGJXx/X0jYst92qPxjlb7gpKbV18HOHWD+oVi89qucyL/XQVJXheX5D/AgMBAAECggEAV7AZdfnNeWlHqnHjq5dVHAwGcVYlwCDOf1u6UqrEYEYwaJ5XBtJw9RsAONFLCPaxmNKMzAwoz07rTIppZvRQyzxOZrERXBwVOSUUu6IMvYOgz1zbxrk4TjbNs80BkHJXWGQWOeEU/nOtGPSwhgtvmV+gSAQhEQpl51y3ntvop0WgzB6oKj6MncRBr+jPb3OjSUfzPQ0kXmgDXiveczAAMogTIWMzHZg0ZcA3TsWA93coJOZIISujC/HNu6I8jJF2fFccGpb8JrJ45JrTXu2hzUjs2xpgzktI0FMjeTlkURraADiZX5NCKcQy4gvf6DTg48DrlVpIU/Chx6T4HkBXwQKBgQDlB4Je9g0S4HGqsSXmr/cUG1gHWKXZoShD3N4STbXkBRqF2l7m9n0jTGx5GSxdf3hq7gYsWLA2n4WeO1dEC6uNyNOknnm65pscfL239HlGlAl/M2aVntNfLozqurpMYQOJaC8ju1Q6N8uGWfWJu11kFMX9sRBF2xp2lh1nPLwFTwKBgQCw945uAl5Xsz9NLTddhylDNQKXs5uEVlSzF9aGLn9/qZCIXhobnHZkjdvulbiV4zby9fn3WpSNxC//5VioECy/Ai8ZXtQUW3vXKEJ6P0UeeXpsvpPk0OQfP27XLJaRHdbXuYHGJFArhn3sXENJkzkU8XvXPRHS/F9RVk3DgB0tUQKBgEmh5mo9VOqyuhiUp4jJHfia6exCtd+IDnfy9HqR/V53vZU3Jbe/m2/TzDQKwda1erN2Hwn24YBOPRkoHuBDmD4XSOPuB1jtdwTrndscgDkOsxbwIZUM4QwC3U9CBU81CXwNwMoOGgA1m/tvxJ8pW9cnTphHauHqlVF25bEhN5nFAoGAA3j4HISDYWktBtCqU3WBg8YYhO2LUa93/gOru/pRmimzollmXcBWOmbmN+pMMvTAcUgOXaIzZAzDfFv9v16B4kWisva/Zp7c8T3jAA8Zxh1QH64lrMnEkDBodmRzl+lj+9uyBjdUM2ZyNh8hWuI+roCGk5SpMuCs5iWxZPKwn+ECgYEAv+UfV//mf10Qw0bEzmqT2XK7GflrXhdTuIXC6Pfosrv+RBynI/A7G2XA3JpxzIdoEJXwiK5a91VDE+T3vqoBY4mbDP+Gh/dssKq9VHjfzWExN25Jyz/tbd5IyfA9ebx0/Q6Bu7BxJ/PnDXkdo4TR7X2xdEOLi+ANdzPzZedH65c=";

        // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
        public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA4DeXRrHilHLW9z9tjDwmcBRcNf2ufFxM06W2VfLKVoFfiPui/SsSqsYajhTUJrGN/aD5N2ekomTKTKM/YWb9wTOTjrkQbCNAbkBU6EzOUWMCXPwpP1GrdOJMFEjoYffnqgLtyjZhnyhjsAlOl5/BWtzYKtfV4i9z38gP/GkD22IrX+tecX3daHsRRxX6SuVa/wkuJVQHG5YfKeQkecsYkABiA604Ykpa0yfe4formZaspFhnb8sZp9LpPze87iz3AEI3pBy3ytF2efb9yVlwBjMfKMl8pRdvtJ07F4FB3T6vF7g1dMtTrtuDFhFXoqL6dYLsWmdNe8JJgrY5WZ2aiQIDAQAB";

        // 服务器异步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
        public static String notify_url = "http://localhost:8100/notifyUrl";

        // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
        public static String return_url = "http://localhost:8100/returnUrl";

        // 签名方式
        public static String sign_type = "RSA2";

        // 字符编码格式
        public static String charset = "utf-8";

        //沙箱网关
        public static String gatewayUrl ="https://openapi.alipaydev.com/gateway.do";

        // 仅支持JSON
        public static String format = "JSON";



    //@ApiOperation(value = "发起支付", notes = "支付宝")
    @RequestMapping(value = "alipay_pay", method = RequestMethod.POST)
    public void pay(HttpServletRequest httpRequest, HttpServletResponse httpResponse)
            throws ServletException, IOException {
        AlipayClient alipayClient = new DefaultAlipayClient(gatewayUrl, app_id, merchant_private_key, format, charset,
                alipay_public_key, sign_type); // 获得初始化的AlipayClient
        AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();// 创建API对应的request
        alipayRequest.setReturnUrl(return_url);
        alipayRequest.setNotifyUrl(notify_url);// 在公共参数中设置回跳和通知地址
        alipayRequest.setBizContent("{" + "    \"out_trade_no\":\"2015032001010100"+(int)(Math.random()*1000)+"\","
                + "    \"product_code\":\"FAST_INSTANT_TRADE_PAY\"," + "    \"total_amount\":"+(int)(Math.random()*10)+0.88+","
                + "    \"subject\":\"Iphone6 16G\"," + "    \"body\":\"Iphone6 16G 耐克金\","
                + "    \"passback_params\":\"merchantBizType%3d3C%26merchantBizNo%3d2016010101111\","
                + "    \"extend_params\":{" + "    \"sys_service_provider_id\":\"2088511833207846\"" + "    }" + "  }");// 填充业务参数
        String form = "";
        try {
            form = alipayClient.pageExecute(alipayRequest).getBody(); // 调用SDK生成表单
        } catch (AlipayApiException e) {
            e.printStackTrace();
        }
        httpResponse.setContentType("text/html;charset=" + charset);
        httpResponse.getWriter().write(form);// 直接将完整的表单html输出到页面
        httpResponse.getWriter().flush();
        httpResponse.getWriter().close();
    }

    //@ApiOperation(value = "支付同步回调", notes = "支付宝")
    @RequestMapping(value = "/returnUrl", method = RequestMethod.GET)
    public String returnUrl(HttpServletRequest request, HttpServletResponse response)
            throws IOException, AlipayApiException {
        System.out.println("=================================同步回调=====================================");

        // 获取支付宝GET过来反馈信息
        Map<String, String> params = new HashMap<String, String>();
        Map<String, String[]> requestParams = request.getParameterMap();
        for (Iterator<String> iter = requestParams.keySet().iterator(); iter.hasNext();) {
            String name = (String) iter.next();
            String[] values = (String[]) requestParams.get(name);
            String valueStr = "";
            for (int i = 0; i < values.length; i++) {
                valueStr = (i == values.length - 1) ? valueStr + values[i] : valueStr + values[i] + ",";
            }
            // 乱码解决，这段代码在出现乱码时使用
            valueStr = new String(valueStr.getBytes("ISO-8859-1"), "utf-8");
            params.put(name, valueStr);
        }

        System.out.println(params);
        boolean signVerified =  AlipaySignature.rsaCheckV1(params, alipay_public_key, charset, sign_type);

        // ——请在这里编写您的程序（以下代码仅作参考）——
        if (signVerified) {
            // 商户订单号
            String out_trade_no = new String(request.getParameter("out_trade_no").getBytes("ISO-8859-1"), "UTF-8");

            // 支付宝交易号
            String trade_no = new String(request.getParameter("trade_no").getBytes("ISO-8859-1"), "UTF-8");

            // 付款金额
            String total_amount = new String(request.getParameter("total_amount").getBytes("ISO-8859-1"), "UTF-8");

            System.out.println("商户订单号="+out_trade_no);
            System.out.println("支付宝交易号="+trade_no);
            System.out.println("付款金额="+total_amount);

            //response.getWriter().write("trade_no:" + trade_no + "<br/>out_trade_no:" + out_trade_no + "<br/>total_amount:" + total_amount);
            //return "admin/index";
        } else {
            response.getWriter().write("验签失败");
        }
//        response.getWriter().flush();
//        response.getWriter().close();
        return "admin/index";
    }

    //@ApiOperation(value = "支付异步回调", notes = "支付宝")
    @RequestMapping(value = "/notifyUrl", method = RequestMethod.POST)
    public void notifyUrl(HttpServletRequest request, HttpServletResponse response)
            throws AlipayApiException, IOException {
        System.out.println("#######################################################################");

        // 获取支付宝POST过来反馈信息
        Map<String, String> params = new HashMap<String, String>();
        Map<String, String[]> requestParams = request.getParameterMap();
        for (Iterator<String> iter = requestParams.keySet().iterator(); iter.hasNext();) {
            String name = (String) iter.next();
            String[] values = (String[]) requestParams.get(name);
            String valueStr = "";
            for (int i = 0; i < values.length; i++) {
                valueStr = (i == values.length - 1) ? valueStr + values[i] : valueStr + values[i] + ",";
            }
            // 乱码解决，这段代码在出现乱码时使用
            //valueStr = new String(valueStr.getBytes("ISO-8859-1"), "utf-8");
            params.put(name, valueStr);
        }

        System.out.println(params);
        boolean signVerified = AlipaySignature.rsaCheckV1(params, alipay_public_key, charset, sign_type); // 调用SDK验证签名

        // ——请在这里编写您的程序（以下代码仅作参考）——

        /*
         * 实际验证过程建议商户务必添加以下校验： 1、需要验证该通知数据中的out_trade_no是否为商户系统中创建的订单号，
         * 2、判断total_amount是否确实为该订单的实际金额（即商户订单创建时的金额）， 3、校验通知中的seller_id（或者seller_email)
         * 是否为out_trade_no这笔单据的对应的操作方（有的时候，一个商户可能有多个seller_id/seller_email）
         * 4、验证app_id是否为该商户本身。
         */
        if (signVerified) {// 验证成功
            // 商户订单号
            String out_trade_no = new String(request.getParameter("out_trade_no").getBytes("ISO-8859-1"), "UTF-8");

            // 支付宝交易号
            String trade_no = new String(request.getParameter("trade_no").getBytes("ISO-8859-1"), "UTF-8");

            // 交易状态
            String trade_status = new String(request.getParameter("trade_status").getBytes("ISO-8859-1"), "UTF-8");

            System.out.println("商户订单号="+out_trade_no);
            System.out.println("支付宝交易号="+trade_no);
            System.out.println("交易状态="+trade_status);
            if (trade_status.equals("TRADE_FINISHED")) {
                // 判断该笔订单是否在商户网站中已经做过处理
                // 如果没有做过处理，根据订单号（out_trade_no）在商户网站的订单系统中查到该笔订单的详细，并执行商户的业务程序
                // 如果有做过处理，不执行商户的业务程序

                // 注意：
                // 退款日期超过可退款期限后（如三个月可退款），支付宝系统发送该交易状态通知
            } else if (trade_status.equals("TRADE_SUCCESS")) {
                // 判断该笔订单是否在商户网站中已经做过处理
                // 如果没有做过处理，根据订单号（out_trade_no）在商户网站的订单系统中查到该笔订单的详细，并执行商户的业务程序
                // 如果有做过处理，不执行商户的业务程序

                // 注意：
                // 付款完成后，支付宝系统发送该交易状态通知
            }

            System.out.println("异步回调验证成功");
            response.getWriter().write("success");

        } else {// 验证失败
            System.out.println("异步回调验证失败");
            response.getWriter().write("fail");

            // 调试用，写文本函数记录程序运行情况是否正常
            // String sWord = AlipaySignature.getSignCheckContentV1(params);
            // AlipayConfig.logResult(sWord);
        }
        response.getWriter().flush();
        response.getWriter().close();
    }
}
