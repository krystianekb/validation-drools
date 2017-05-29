package org.krystianekb.poc.validation.domain.result;

import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

public class ValidationResult {

    private UUID uuid;
    private List<ValidationRuleResult> results;

    public ValidationResult(UUID uuid) {
        this.uuid = uuid;
        this.results = new LinkedList<>();
    }

    public UUID getUuid() {
        return uuid;
    }

    public List<ValidationRuleResult> getResults() {
        return results;
    }

    public void addResult(ValidationRuleResult result) {
        results.add(result);
    }
}
