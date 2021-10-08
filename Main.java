package com.company;

public class Main {

    public static void main(String[] args) {
        Builder builder = new FooterBuilder(new SliderBuilder( new NavigationBuilder( new HeaderBuilder(new WebsiteBuilder()))));

        System.out.println(builder.buildWebsite());


    }


}
