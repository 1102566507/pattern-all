package com.wing.strategy.parser;

import java.util.HashMap;
import java.util.Map;

public class MessageParserFactory {

    private static Map<TransDataType, IMessageParser> messageParserMap = new HashMap<>();

    static {
        messageParserMap.put(TransDataType.XY_POS, new XyPosMessageParser());
        messageParserMap.put(TransDataType.TEST_MOBILE, new TestMobileMessageParser());
    }

    /**
     * 获取报文解析器
     *
     * @param type 报文场景类型
     * @return 报文解析器
     */
    public static IMessageParser getMessageParser(TransDataType type) {
        return messageParserMap.get(type);
    }
}
