package com.zhy.fund.util;

import java.io.FileWriter;
import java.io.IOException;

public class AlipayConfig {
    //↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2016092600600292";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCeUqNMqHGLHQXEZrsa8tD7bHl1JmcZR+n/JCLNC27KqDn+RTLqMG/EuoMCnsUgKJXaXh+Ab9zCxCs+WBaUECKG6ZHbhQAxEafD0GviM1/tm+yOORfDxtZ7z7sDs1xNYcNzTuHQZz54RJPbntoeL3ZdWC9V3OKR9aOfJGYmFNgsrh/Y5HSB3kTgEHyPUiH0fFBaLhutOsL5B0DFY+5PbUj0ydEyUzYCFVsC1yGrrxu744pETTDUHlwIyqkneMHThrxLl95CuX70Gt7DDrl8YTu68nP6fiNTaGJXx/X0jYst92qPxjlb7gpKbV18HOHWD+oVi89qucyL/XQVJXheX5D/AgMBAAECggEAV7AZdfnNeWlHqnHjq5dVHAwGcVYlwCDOf1u6UqrEYEYwaJ5XBtJw9RsAONFLCPaxmNKMzAwoz07rTIppZvRQyzxOZrERXBwVOSUUu6IMvYOgz1zbxrk4TjbNs80BkHJXWGQWOeEU/nOtGPSwhgtvmV+gSAQhEQpl51y3ntvop0WgzB6oKj6MncRBr+jPb3OjSUfzPQ0kXmgDXiveczAAMogTIWMzHZg0ZcA3TsWA93coJOZIISujC/HNu6I8jJF2fFccGpb8JrJ45JrTXu2hzUjs2xpgzktI0FMjeTlkURraADiZX5NCKcQy4gvf6DTg48DrlVpIU/Chx6T4HkBXwQKBgQDlB4Je9g0S4HGqsSXmr/cUG1gHWKXZoShD3N4STbXkBRqF2l7m9n0jTGx5GSxdf3hq7gYsWLA2n4WeO1dEC6uNyNOknnm65pscfL239HlGlAl/M2aVntNfLozqurpMYQOJaC8ju1Q6N8uGWfWJu11kFMX9sRBF2xp2lh1nPLwFTwKBgQCw945uAl5Xsz9NLTddhylDNQKXs5uEVlSzF9aGLn9/qZCIXhobnHZkjdvulbiV4zby9fn3WpSNxC//5VioECy/Ai8ZXtQUW3vXKEJ6P0UeeXpsvpPk0OQfP27XLJaRHdbXuYHGJFArhn3sXENJkzkU8XvXPRHS/F9RVk3DgB0tUQKBgEmh5mo9VOqyuhiUp4jJHfia6exCtd+IDnfy9HqR/V53vZU3Jbe/m2/TzDQKwda1erN2Hwn24YBOPRkoHuBDmD4XSOPuB1jtdwTrndscgDkOsxbwIZUM4QwC3U9CBU81CXwNwMoOGgA1m/tvxJ8pW9cnTphHauHqlVF25bEhN5nFAoGAA3j4HISDYWktBtCqU3WBg8YYhO2LUa93/gOru/pRmimzollmXcBWOmbmN+pMMvTAcUgOXaIzZAzDfFv9v16B4kWisva/Zp7c8T3jAA8Zxh1QH64lrMnEkDBodmRzl+lj+9uyBjdUM2ZyNh8hWuI+roCGk5SpMuCs5iWxZPKwn+ECgYEAv+UfV//mf10Qw0bEzmqT2XK7GflrXhdTuIXC6Pfosrv+RBynI/A7G2XA3JpxzIdoEJXwiK5a91VDE+T3vqoBY4mbDP+Gh/dssKq9VHjfzWExN25Jyz/tbd5IyfA9ebx0/Q6Bu7BxJ/PnDXkdo4TR7X2xdEOLi+ANdzPzZedH65c=";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA4DeXRrHilHLW9z9tjDwmcBRcNf2ufFxM06W2VfLKVoFfiPui/SsSqsYajhTUJrGN/aD5N2ekomTKTKM/YWb9wTOTjrkQbCNAbkBU6EzOUWMCXPwpP1GrdOJMFEjoYffnqgLtyjZhnyhjsAlOl5/BWtzYKtfV4i9z38gP/GkD22IrX+tecX3daHsRRxX6SuVa/wkuJVQHG5YfKeQkecsYkABiA604Ykpa0yfe4formZaspFhnb8sZp9LpPze87iz3AEI3pBy3ytF2efb9yVlwBjMfKMl8pRdvtJ07F4FB3T6vF7g1dMtTrtuDFhFXoqL6dYLsWmdNe8JJgrY5WZ2aiQIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
   public static String notify_url = "http://工程公网访问地址/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://工程公网访问地址/alipay.trade.page.pay-JAVA-UTF-8/return_url.jsp";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
