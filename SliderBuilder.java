package com.company;

public class SliderBuilder extends BuilderDecorator{

    public SliderBuilder(Builder builder) {
        super(builder);
    }

    public String addSlider(){
        return "Add Slider \n";
    }

    @Override
    public String buildWebsite() {
        return super.buildWebsite() + addSlider();
    }
}
