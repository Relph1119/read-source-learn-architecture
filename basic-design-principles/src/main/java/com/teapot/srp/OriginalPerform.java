package com.teapot.srp;

import com.teapot.basic.Animal;

import java.util.ArrayList;
import java.util.List;

/**
 * P3 动物园演出示例
 * 动物园演出需求：动物园需要构建一个动物演出系统，该系统需要罗列出所有的动物，并且保证动物按顺序逐个演出
 */
public class OriginalPerform {
    /**
     * 动物园表演
     */
    public void perform() {
        List<Animal> animalList = listAnimal();
        for(Animal animal : animalList) {
            animal.perform();
        }
    }

    /**
     * 获取动物园动物清单
     * @return
     */
    private List<Animal> listAnimal() {
        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Animal("狮子"));
        animalList.add(new Animal("海豹"));
        animalList.add(new Animal("盒马"));
        return animalList;
    }

    public static void main(String[] args) {
        OriginalPerform perform = new OriginalPerform();
        perform.perform();
    }
}
