package org.example.hojin.springboot.web.dto;


import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class TestHelloResponseDto {

    @Test
    public void rbTest(){
        String name = "test";
        int amount = 1000;

        HelloResponseDto dto = new HelloResponseDto(name,amount);

        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);

    }


}
