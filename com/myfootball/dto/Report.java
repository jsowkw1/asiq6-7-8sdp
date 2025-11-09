package com.myfootball.dto;

public final class Report {
    private final String content;

    public Report(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return content;
    }
}
