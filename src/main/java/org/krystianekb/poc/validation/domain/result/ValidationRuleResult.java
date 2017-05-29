package org.krystianekb.poc.validation.domain.result;

public class ValidationRuleResult {

    private String ruleName;
    private ValidationRuleStatus status;
    private ValidationMessage msg;

    public ValidationRuleResult(String ruleName, ValidationRuleStatus status) {
        this(ruleName, status,null);
    }


    public ValidationRuleResult(String ruleName, ValidationRuleStatus status, ValidationMessage msg) {
        this.status = status;
        this.msg = msg;
        this.ruleName = ruleName;
    }

    @Override
    public String toString() {
        return "ValidationResult{" +
                "ruleName=" + ruleName +
                ", status=" + status +
                ", msg=" + msg +
                '}';
    }

    public String getRuleName() {
        return ruleName;
    }

    public ValidationRuleStatus getStatus() {
        return status;
    }

    public ValidationMessage getMsg() {
        return msg;
    }
}
