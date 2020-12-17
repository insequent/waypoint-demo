package com.example.things.models;


import java.util.List;


public class Things {
    public String name;
    public List<Thing> things;

    public static class Thing {
        public String color;
        public String description;
        public Integer count;
    }
}
