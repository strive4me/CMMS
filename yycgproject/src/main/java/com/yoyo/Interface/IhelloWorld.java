package com.yoyo.Interface;

import javax.jws.WebService;
@WebService
public interface IhelloWorld {
    public String sayHi(String who) throws Exception;
    
}