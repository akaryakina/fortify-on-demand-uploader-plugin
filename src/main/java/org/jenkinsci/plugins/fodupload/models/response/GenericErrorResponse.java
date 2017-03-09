package org.jenkinsci.plugins.fodupload.models.response;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

import java.util.List;

public class GenericErrorResponse {
    private List<ErrorResponse> errors;

    public List<ErrorResponse> getErrors() {
        return errors;
    }

    @Override
    public String toString() {
        String result = "\n";
        for (ErrorResponse error : errors) {
            int errorNumber = errors.indexOf(error) + 1;
            result += errorNumber + ") " + error.getMessage() + (errorNumber > 1 ? "\n" : "");
        }
        return result;
    }
}

class ErrorResponse {
    private int errorCode;
    private String message;

    public int getErrorCode() {
        return errorCode;
    }

    @SuppressFBWarnings("UWF_UNWRITTEN_FIELD")
    public String getMessage() {
        return message;
    }
}