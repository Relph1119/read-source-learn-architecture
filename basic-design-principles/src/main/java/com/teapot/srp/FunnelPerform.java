package com.teapot.srp;

import com.teapot.basic.Animal;

import java.util.ArrayList;
import java.util.List;

/**
 * P4 漏斗型程序员
 * 动物园演出需求：动物园需要构建一个动物演出系统，该系统需要罗列出所有的动物，并且保证动物按顺序逐个演出
 * 新追加需求：
 * 1. 有时候会有隔壁动物园的动物参与
 * 2. 小体积的动物在前面表演，大体积的动物在后面表演
 * 3. 表演超过15分钟时要有提醒
 */
public class FunnelPerform {
    /**
     * 动物园表演
     */
    public void perform() {
        List<Animal> animalList = listAnimal();

        // 加入动物合并逻辑：有时候会有隔壁动物园汇演，会有隔壁动物园的动物参与

        // 加入排序逻辑：小体积的动物在前面表演，大体积的动物在后面表演

        // 加入提醒逻辑：表演超过15分钟时要有提醒
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
        FunnelPerform perform = new FunnelPerform();
        perform.perform();
    }
}
