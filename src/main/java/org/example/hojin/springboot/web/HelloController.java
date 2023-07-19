package org.example.hojin.springboot.web;

import org.apache.coyote.Response;
import org.example.hojin.springboot.web.dto.HelloResponseDto;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam("name") String name,@RequestParam("amount") int amount){
        return new HelloResponseDto(name,amount);
    }

    @GetMapping("/hi")
    public ResponseEntity<String> test(){

        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("Content-Type","application/json");
        //responseEntity를 쓰는것이 http스탯 리턴도 되고 중간에 리스폰스 헤더에 값 추가도 되기떄문에 좀더 정밀한 리스폰스 가능
        return new ResponseEntity<>("hi", responseHeaders, HttpStatus.OK);
    }
}
