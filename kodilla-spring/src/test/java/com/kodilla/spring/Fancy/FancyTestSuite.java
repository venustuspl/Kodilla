package com.kodilla.spring.Fancy;

import com.kodilla.spring.Fancy.TextWriter;
import com.kodilla.spring.Fancy.TextWriterConfig;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FancyTestSuite {

    @Test
    public void testText() {

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(TextWriterConfig.class);
        TextWriter tw = context.getBean(TextWriter.class);
        //When & Then

        Assert.assertNotNull(tw.getText());

        Assert.assertNotNull(tw.getFancyText());
    }
}