package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/** Spring Bootアプリケーションのエントリーポイントです。 */
@SpringBootApplication
public class DemoApplication {

  /**
   * アプリケーションを起動します。
   *
   * @param args コマンドライン引数
   */
  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }
}
