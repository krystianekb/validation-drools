package org.krystianekb.poc.validation.rest;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.kie.api.runtime.KieSession;
import org.krystianekb.poc.validation.domain.Trade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller()
@Api
public class ValidationController {

    @Autowired
    KieSession session;

    @RequestMapping("/validate")
    @ResponseBody
    @ApiOperation(value = "/validate")
    String validationResult(Trade trade) {
        session.insert(trade);
        session.fireAllRules();
        return "Hello World!";
    }

}
