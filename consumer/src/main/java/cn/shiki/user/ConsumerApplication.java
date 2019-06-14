package cn.shiki.user;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author: shiki
 * @Date: 2019/06/01 9:37
 */
//@EnableCircuitBreaker
//@EnableDiscoveryClient
//@SpringBootApplication
@EnableFeignClients
@SpringCloudApplication
public class ConsumerApplication {
//    @Bean
//    @LoadBalanced
//    public RestTemplate restTemplate() {
//        return new RestTemplate();
//    }

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class);
    }
}
