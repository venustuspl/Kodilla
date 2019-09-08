package com.kodilla.spring.Fancy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.scheduling.config.Task;

@Configuration
public class TextWriterConfig {
    @Qualifier("text1")
    @Autowired
    Text text;

    @Qualifier("text2")
    @Autowired
    Text text2;


    @Bean
    public TextWriter getTextWriter() {

        return new TextWriter(this.text);
    }

    @Bean(name = "text1")
    @Scope("prototype")
    public Text getText() {

        return new Text();
    }
    @Bean(name = "text2")
    @Scope("prototype")
    public Text getFancyText() {

        return new Text();
    }


}
