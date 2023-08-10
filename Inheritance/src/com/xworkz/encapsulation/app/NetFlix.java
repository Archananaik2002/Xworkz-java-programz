package com.xworkz.encapsulation.app;

public class NetFlix {
  
    protected String accountName;
    protected String subscriptionPlan;
    protected boolean isPremium;
    protected boolean isFamilyPlan;
    protected int numberOfDevices;
    protected boolean isOfflinePlaybackSupported;
    protected int numberOfProfiles;
    protected String profileNames;
    protected boolean isKidProfileEnabled;
    protected String paymentMethod;
    protected String billingAddress;
    protected boolean isAutoRenewalEnabled;
    protected String renewalDate;
    protected boolean isEmailNotificationEnabled;

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getSubscriptionPlan() {
        return subscriptionPlan;
    }

    public void setSubscriptionPlan(String subscriptionPlan) {
        this.subscriptionPlan = subscriptionPlan;
    }

    public boolean isPremium() {
        return isPremium;
    }

    public void setPremium(boolean isPremium) {
        this.isPremium = isPremium;
    }

    public boolean isFamilyPlan() {
        return isFamilyPlan;
    }

    public void setFamilyPlan(boolean isFamilyPlan) {
        this.isFamilyPlan = isFamilyPlan;
    }

    public int getNumberOfDevices() {
        return numberOfDevices;
    }

    public void setNumberOfDevices(int numberOfDevices) {
        this.numberOfDevices = numberOfDevices;
    }

    public boolean isOfflinePlaybackSupported() {
        return isOfflinePlaybackSupported;
    }

    public void setOfflinePlaybackSupported(boolean isOfflinePlaybackSupported) {
        this.isOfflinePlaybackSupported = isOfflinePlaybackSupported;
    }

    public int getNumberOfProfiles() {
        return numberOfProfiles;
    }

    public void setNumberOfProfiles(int numberOfProfiles) {
        this.numberOfProfiles = numberOfProfiles;
    }

    public String getProfileNames() {
        return profileNames;
    }

    public void setProfileNames(String profileNames) {
        this.profileNames = profileNames;
    }

    public boolean isKidProfileEnabled() {
        return isKidProfileEnabled;
    }

    public void setKidProfileEnabled(boolean isKidProfileEnabled) {
        this.isKidProfileEnabled = isKidProfileEnabled;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    public boolean isAutoRenewalEnabled() {
        return isAutoRenewalEnabled;
    }

    public void setAutoRenewalEnabled(boolean isAutoRenewalEnabled) {
        this.isAutoRenewalEnabled = isAutoRenewalEnabled;
    }

    public String getRenewalDate() {
        return renewalDate;
    }

    public void setRenewalDate(String renewalDate) {
        this.renewalDate = renewalDate;
    }

    public boolean isEmailNotificationEnabled() {
        return isEmailNotificationEnabled;
    }

    public void setEmailNotificationEnabled(boolean isEmailNotificationEnabled) {
        this.isEmailNotificationEnabled = isEmailNotificationEnabled;
    }

    
}

