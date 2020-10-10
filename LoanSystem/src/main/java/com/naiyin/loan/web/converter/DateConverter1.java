package com.naiyin.loan.web.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter1 implements Converter<String, Date>{
    @Override
    public Date convert(String s) {
        Date date=null;
        SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd'T'HH:mm");
        try {
            date=df.parse(s);
        } catch (ParseException e) {
            System.out.println("日期转换器解析异常！");
        }
        return date;
    }
}
