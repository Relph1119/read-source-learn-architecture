package com.teapot.ocp;

import com.teapot.basic.Animal;

import java.util.ArrayList;
import java.util.List;

/**
 * P10 动物出场顺序修改
 * 动物园演出需求：动物园需要构建一个动物演出系统，该系统需要罗列出所有的动物，并且保证动物按顺序逐个演出
 * 出差顺序修改需求：
 *  在动物园的表演动物中，有马这个角色，然而，马有不同的颜色，这样会使得它们的出场顺序混乱，
 *  所以期望按照一定的顺序出场，比如白色先出场，黑色后出场
 */
public class PerformWithHorse {
    /**
     * 动物园表演
     */
    public void perform() {
        List<Animal> animalList = listAnimal();

        // 先排动物：按照体积大小

        // 加入动物中有马，再排序马

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
        PerformWithHorse perform = new PerformWithHorse();
        perform.perform();
    }
}
