package com.company;

public class BuilderDecorator implements Builder{

    private Builder builder;

    public BuilderDecorator(Builder builder) {
        this.builder = builder;
    }

    @Override
    public String buildWebsite() {
        return this.builder.buildWebsite();
    }
}
