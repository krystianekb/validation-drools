package org.krystianekb.poc.validation.rest;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.StatelessKieSession;
import org.krystianekb.poc.validation.domain.Trade;
import org.krystianekb.poc.validation.domain.result.ValidationResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;

@Controller()
@Api
class ValidationController {

    private static final Logger LOG = LoggerFactory.getLogger(ValidationController.class);
    private static final Logger RULES_LOGGER = LoggerFactory.getLogger("ValidationRulesEngine");

    @Autowired
    private KieContainer kieContainer;

    @RequestMapping(value = "/validate", method = RequestMethod.POST, consumes = "application/json")
    @ResponseBody
    @ApiOperation(value = "/validate")
    ValidationResult validationResult(@RequestBody Trade trade) {

        LOG.debug("Received : {}", trade);
        StatelessKieSession session = kieContainer.newStatelessKieSession();
        session.setGlobal("logger", RULES_LOGGER);
        ValidationResult validationResult = new ValidationResult(trade.getUuid());
        session.execute(Arrays.asList(trade, validationResult));
        return validationResult;
    }

}
