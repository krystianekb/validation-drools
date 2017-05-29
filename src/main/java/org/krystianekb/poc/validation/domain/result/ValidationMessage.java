package org.krystianekb.poc.validation.domain.result;

public class ValidationMessage {

    private String field;
    private String msg;

    public ValidationMessage(String field, String msg) {
        this.field = field;
        this.msg = msg;
    }

    public String getField() {
        return field;
    }

    public String getMsg() {
        return msg;
    }

    @Override
    public String toString() {
        return "ValidationMessage{" +
                "field='" + field + '\'' +
                ", msg='" + msg + '\'' +
                '}';
    }
}
