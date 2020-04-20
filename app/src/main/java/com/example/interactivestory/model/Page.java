package com.example.interactivestory.model;

public class Page {
    private int imageId;
    private int textId1;
    private int textId2;
    private boolean isFinalPage=false;
    Choice c1;
    Choice c2;

    public Page(int imageId, int textId1, int textId2, Choice c1, Choice c2) {
        this.imageId = imageId;
        this.textId1 = textId1;
        this.textId2 = textId2;
        this.c1 = c1;
        this.c2 = c2;
    }

    public boolean isFinalPage() {
        return this.isFinalPage;
    }

    public void setFinalPage(boolean finalPage) {
        this.isFinalPage = finalPage;
    }

    public Page(int imageId, int thank_you,int t2) {
        this.imageId = imageId;
        this.textId1=thank_you;
        this.textId2=t2;
        this.isFinalPage=true;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public int getTextId1() {
        return textId1;
    }

    public void setTextId1(int textId1) {
        this.textId1 = textId1;
    }

    public int getTextId2() {
        return textId2;
    }

    public void setTextId2(int textId2) {
        this.textId2 = textId2;
    }

    public Choice getC1() {
        return c1;
    }

    public void setC1(Choice c1) {
        this.c1 = c1;
    }

    public Choice getC2() {
        return c2;
    }

    public void setC2(Choice c2) {
        this.c2 = c2;
    }




}
