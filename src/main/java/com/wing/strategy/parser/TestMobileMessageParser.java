package com.wing.strategy.parser;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.IOException;

public class TestMobileMessageParser implements IMessageParser {

    private static Logger log = LoggerFactory.getLogger(TestMobileMessageParser.class);

    @Override
    public ParseResult parse(String message) {
        log.debug("Trying to parse TestMobile message: {}", message);
        ParseResult parseResult = null;
        //JsonNode node = JsonUtils.parse(message);
        //parseResult = new ParseResult();
        ////源客户
        //CustomerDto customer = new CustomerDto(node.get("姓名").asText(), node.get("身份证").asText(), "1", null, null);
        ////目标客户
        //CustomerDto targetCustomer = new CustomerDto(node.get("姓名").asText(), node.get("身份证").asText(), "1", null, null);
        ////设备
        //DeviceDto device;
        //String deviceNumber = node.get("设备编号").asText();
        //if (node.get("设备类型").asText().equals("ios")) {
        //    device = new DeviceDto(deviceNumber, DeviceType.IOS, new IOSMobileDto(deviceNumber));
        //} else {
        //    device = new DeviceDto(deviceNumber, DeviceType.ANDROID, new AndroidMobileDto(deviceNumber));
        //}
        ////源账户
        //TransactionAccountDto account = new TransactionAccountDto("1", "1", "1", node.get("账户编号").asText());
        ////目标账户
        //TransactionAccountDto targetAccount = new TransactionAccountDto("1", "1", "1", node.get("目标账户编号").asText());
        ////交易
        //TransactionDto transaction = new TransactionDto(node.get("进件ID").asText(), LocalDateTime.parse(node.get("交易时间").asText()), node.get("交易方式").asText(), new BigDecimal(node.get("交易金额").asText()), node.get("交易地区").asText(), "手机银行");
        ////解析结果
        //parseResult.setTransaction(transaction);
        //parseResult.setCustomer(customer);
        //parseResult.setTargetCustomer(targetCustomer);
        //parseResult.setDevice(device);
        //parseResult.setAccount(account);
        //parseResult.setTargetAccount(targetAccount);
        return parseResult;
    }
}
