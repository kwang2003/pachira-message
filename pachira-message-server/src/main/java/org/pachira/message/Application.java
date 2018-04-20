package org.pachira.message;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 应用启动入口函数
 * @author KevinWang
 *
 */
@EnableScheduling
@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}
