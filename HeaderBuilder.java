package com.company;

public class HeaderBuilder extends BuilderDecorator{

    public HeaderBuilder(Builder builder) {
        super(builder);
    }

    public String addHeader(){
        return "Add Header \n";
    }

    @Override
    public String buildWebsite() {
        return super.buildWebsite() + addHeader();
    }
}
