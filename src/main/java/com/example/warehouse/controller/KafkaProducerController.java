package com.example.warehouse.controller;

import com.example.warehouse.utils.R;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.common.protocol.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(value = "kafkaProducer")
public class KafkaProducerController {
    @Autowired
    private KafkaTemplate<String ,Object> kafkaTemplate;

    private Gson gson = new GsonBuilder().create();

    @GetMapping(value = "/sendMessage")
    public R sendMessage(){


        log.info("+++++++++++++++++++++  message = {}", gson.toJson("这里是warehouse天堂"));
        kafkaTemplate.send("test",gson.toJson("这里是warehouse天堂"));
        return  R.ok();
    }
}