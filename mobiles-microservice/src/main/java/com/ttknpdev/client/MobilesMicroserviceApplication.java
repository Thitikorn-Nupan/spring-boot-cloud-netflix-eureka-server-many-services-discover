package com.ttknpdev.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient // ** The @EnableEurekaClient annotation makes your Spring Boot application act as a Eureka client.
/*
@EnableEurekaClient ไว้ที่ main class ทำให้ทุกครั้งทันทีหลังจากที่ service start
ตัว eureka-client จะส่ง request ไปที่ eureka-server เพื่อกำการลงทะเบียนว่า
service รันและพร้อมใช้งานที่ address (IP) ไหน และ port number และจะมีการส่ง heartbeat
ไปยัง eureka-server เพื่อ update สถานะของตัวเองเป็นระยะ
*/
public class MobilesMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MobilesMicroserviceApplication.class, args);
    }

}
