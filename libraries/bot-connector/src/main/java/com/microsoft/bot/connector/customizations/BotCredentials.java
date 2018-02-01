package com.microsoft.bot.connector.customizations;

public class BotCredentials {
    private String appId;
    private String appPassword;

    public String appId() { return this.appId; }

    public BotCredentials withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    public String appPassword() { return this.appPassword; }

    public BotCredentials withAppPassword(String appPassword) {
        this.appPassword = appPassword;
        return this;
    }
}
