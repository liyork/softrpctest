package com.wolf.softrpctest;

/**
 * Description:
 * <br/> Created on 2019-01-23
 *
 * @author 李超
 * @since 1.0.0
 */

import com.alipay.sofa.rpc.config.ConsumerConfig;

/**
 * Quick Start client
 */
public class QuickStartClient {
    public static void main(String[] args) {
        ConsumerConfig<HelloService> consumerConfig = new ConsumerConfig<HelloService>()
                .setInterfaceId(HelloService.class.getName()) // 指定接口
                .setProtocol("bolt") // 指定协议
                .setDirectUrl("bolt://127.0.0.1:12200"); // 指定直连地址
        // 生成代理类
        HelloService helloService = consumerConfig.refer();
        while (true) {
            System.out.println(helloService.sayHello("world"));
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
            }
        }
    }
}
