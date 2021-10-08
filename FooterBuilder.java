package com.company;

public class FooterBuilder extends BuilderDecorator{

    public FooterBuilder(Builder builder) {
        super(builder);
    }

    public  String addFooter(){
        return  "Add Footer \n";
    }

    @Override
    public String buildWebsite() {
        return super.buildWebsite() + addFooter();
    }
}
