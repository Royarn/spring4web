package com.royarn.spring.core;

import java.io.*;
import java.util.Properties;

/**
 * Description:
 *
 * @author dell
 * @date 2018-10-12
 */
public class BeanFactory {

    private String basePath = "";
    
    public void init() {
        //加载配置文件
        doLoadProperties();
        
        //解析配置文件
        doScanner();
        
        //初始化bean
        doInitBean();
        
        //依赖注入
        doAutowire();
    }

    private void doAutowire() {
    }

    private void doInitBean() {
    }

    private void doScanner() {
        if ("".equals(basePath)) {return;}
        //递归读取所有class文件

    }

    private void doLoadProperties() {
        Properties properties = new Properties();
        try {
            BufferedReader bufferedReader = new BufferedReader(
                    new FileReader("D:/project/gitpro/spring4web/src/main/resources/scanPack"));
            properties.load(bufferedReader);
            basePath = properties.getProperty("baseScanPack");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static BeanFactory startUp() {
        return new BeanFactory();
    }

    public static void main(String[] args) {
        BeanFactory.startUp().init();
    }
}
