package com.animal;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.List;

public class ZooTest {

 @Test
 public void testAddAndGetAnimals() {
     Zoo zoo = new Zoo();
     assertTrue("Mới khởi tạo, sở thú phải chưa có con vật nào", zoo.getAnimals().isEmpty());
     Lion lion1 = new Lion("Simba", 180.5, 5.5);
     Monkey monkey1 = new Monkey("Alex", 200.0, "Banana");
     Snake snake1 = new Snake("Lucifer", 100, 6.23);
     zoo.addAnimals(lion1);
     zoo.addAnimals(monkey1);
     zoo.addAnimals(snake1);

     List<Animal> animalList = zoo.getAnimals();

     assertEquals("Sở thú phải có chính xác 3 con vật", 3, animalList.size());

     assertEquals("Con vật đầu tiên phải là Simba", "Simba", animalList.get(0).name);
     assertEquals("Con vật thứ hai phải là Alex", "Alex", animalList.get(1).name);
     assertEquals("Con vật thứ hai phải là Lucifer", "Lucifer", animalList.get(2).name);
 }

 @Test
 public void testAddNullAnimal() {
     Zoo zoo = new Zoo();
     zoo.addAnimals(null);
     assertEquals("Không được phép thêm đối tượng null vào danh sách", 0, zoo.getAnimals().size());
 }
}
