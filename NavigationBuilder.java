package com.company;

public class NavigationBuilder extends BuilderDecorator{

    public NavigationBuilder(Builder builder) {
        super(builder);
    }

    public String addNavigation(){
        return "Add Navigation \n";
    }

    @Override
    public String buildWebsite() {
        return super.buildWebsite() + addNavigation();
    }
}
