package com.royarn.spring.core;

/**
 * Description:
 *
 * @author dell
 * @date 2018-10-12
 */
public class BeanFactory {
    
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
    }

    private void doLoadProperties() {
    }
}
