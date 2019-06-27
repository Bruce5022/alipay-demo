package com.sky.webpay.config;

import java.io.FileWriter;
import java.io.IOException;

public class AlipayConfig {

    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2016100200645787";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCJQJ7IlDYonpP6LPOPTEkB197iEFgo8mbjVog2nPdPc5uVnjL403S4cU6vVmmC0Dh4DYxltX5YdTrS7d4kusM2N0avdfM7QLME7YlbYiaSbSORoXPlvTRNW9PxMhNlioPSmuD0OQP80wN7GCzot/iVfP+2CyhEwR5lKi5zHD1uEdMhqPQwBl/WKwwJBDVxdCdHFWSkxoPfy/2TpT0Sa+heLsSLULVHj78634usXkkh5ocWoCrLbPOmGMry8wI2xHRdZiWBweAiMf0ES1h6QwxebB14ztWmwrOVOQlaeOrBB2E7acxAAqTT/yUGCY5KUI2KLVAVPg8OWxKROBc+j1ifAgMBAAECggEAXf0pfvO3zsMhVI2Z0ISN7jw0vhwxMwEkIgQszTFaTkc9wQyPnUO4x2GYX4vOPy11rgihHzlVJyBIQw9vMznN2n+p4Rflk6rvrK05haHGBjnExMKKSkXx3hPHJIGFNODQ+tTivXuZ1nVuCcp5Xng1O7FYrwIe9k5FEUP8gQlSq993PBGCddxI8FRPaXERSXGS8l0bWFohAw4qQD55DRkNsL5VgCLmWUbtfnTg8546ul4OXWL6eX/UXunz5wSpN/7N2t9DLBUt7LtGhBg+b2s4bNSeTbM6XzQ37WzBUhxGFfqPbca1CGrdnKp7jeNwc+4PMblNERex4t3wU7qe15Y0EQKBgQDaVxjgfZdpy4PNp+8MnL/RXraxEVOy0fCflnYUIoMVNLmo3t0dyrlPoRW9C+4AYiQiLlNwgxT1C2QiHdiQRSB1tOwbXxHspS3pPZnLiekDueoj37e6I2v/KbQZqCIi0Yx2I/dhrMMw7AN5+Op+Q7OZF8ERX4TSO6Np08kIpn9mhwKBgQCg7Q7Gte0GkadgV/btu299MWx0vcVq3hgqsEUel5WqBL08lZeoJJpji6avEuSUeZfHh+44iBHSZ1q6SxG3XcaHbKxFUJwrOBod8dYDv5mBbegXX0w2olllezJBR31edQkFCz02zYuvEraAzzDKFY4lX5Q1wIGE0ZPbueuZjybrKQKBgBSV76eCz9rOsF+cfMJgqQkxd+Ib8xtCBgDV684cLuW58eNFF+3uJiim1GjdjhQFLMj4Oy+5fClaaJd63udDTTsr0rMF9KeuLzT1dOGm4AxU5Al711O6cT0+jld47bcAsNCWtYVFB6Y+Klm+qUU8VtuRTMe5jMlRjCe3KxYgtJRTAoGAKBBcqWQJiqUggn/j3fPYIdb4JWhJif2ZDqerzZ33iMh9RGQJybazKS1PZi7R8ZUEEIzq5fAaX8OTduXRl1ElZ/nKOceD2c6x0dqvaWd+FBcEvSzgkImCsB0nudDOiYGhqTvPFaG+sOt7vD3Y67bKGMve3jL7C9IReZaj7SsSiWECgYEAkZUKK3LjNPRlpw1L+j13JH86xDgdE9/OmJIrYgwaVj6J6kZXCzkPJDs65oU0G3Tfje4/VE5HQ53E39wdp3eH6zyfWyR+gBox5dFD76krV6DHpt6ettNfEJaiEEKPbEoTxWYjeZ5CKwwOHNeEBBRiL0ITakm3SVSHOBx2Ha5VRE4=";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAhTAwY9Cy581pqDDfoM7vxW0n4Pqhc/piNfXE98Posp9VLQ0BDGfFaai8L04n1gnDgIW1t/HpTt0dbkQW04XJ6WSkc66gSakqljNwujvPESl6Tp1VIwsOIqjE3PM2T1IYJOQNWELip5qR6VoibeGJw+dFVO3VElsiweXKPP8ABCx0/8GwYnhN6Imq986io7AWBYzeincsdyiXyAk4TctzckapS8VLoJzMgvh8kfthlLRe6X0HRQ3eCLzvKXEbTojZ9+YFj2JtL0ikRrXyt+59c2GYVUKby2G+7Z32aijED9PVkBxzK6o74VZaKiMX9RmG6KSycv+L5JXAOEGmySpahQIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://40bc23b1.ngrok.io/notify_url";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://40bc23b1.ngrok.io/return_url";

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
