package com.wing.strategy.parser;

public interface IMessageParser {

    /**
     * 解析报文并入库
     *
     * @param message 报文
     */
    ParseResult parse(String message);
}
