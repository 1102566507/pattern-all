package com.wing.strategy.parser;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class XyPosMessageParser implements IMessageParser {

    private static Logger log = LoggerFactory.getLogger(IMessageParser.class);

    @Override
    public ParseResult parse(String message) {
        log.debug("Trying to parse XyPos message: {}", message);
        ParseResult parseResult = null;
        //JsonNode node = JsonUtils.parse(message);
        //parseResult = new ParseResult();
        ////源客户
        //CuswingerDto cuswinger = new CuswingerDto(null, node.get("证件号").asText(), "1", null, null);
        ////设备
        //POSMachineDto machine = new POSMachineDto(node.get("商户代码").asText(), node.get("商户类别").asText(), null, null, null, node.get("终端编号").asText());
        //DeviceDto device = new DeviceDto(node.get("终端编号").asText(), DeviceType.POS, machine);
        ////商户
        //MerchantDto merchant = new MerchantDto(null, node.get("商户代码").asText(), node.get("商户类别").asText());
        ////源账户
        //TransactionAccountDto account = new TransactionAccountDto("1", "1", "1", node.get("卡号").asText());
        ////交易
        //TransactionDto transaction = new TransactionDto(node.get("交易序号").asText(), LocalDateTime.parse(node.get("交易日期/时间").asText()), node.get("交易类型").asText(), new BigDecimal(node.get("交易金额").asText()), null, node.get("交易渠道").asText());
        ////解析结果
        //parseResult.setTransaction(transaction);
        //parseResult.setCuswinger(cuswinger);
        //parseResult.setDevice(device);
        //parseResult.setMerchant(merchant);
        //parseResult.setAccount(account);
        return parseResult;
    }
}
