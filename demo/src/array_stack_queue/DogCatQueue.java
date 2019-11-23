package array_stack_queue;

import java.util.LinkedList;
import java.util.Queue;

public class DogCatQueue {
    private Queue<PetEntry> dogQ;
    private Queue<PetEntry> catQ;
    private long count;

    public DogCatQueue() {
        this.dogQ = new LinkedList<>();
        this.catQ = new LinkedList<>();
        this.count = 0;
    }

    public void add(Pet pet) {
        if (pet.getPetType().equals("dog")) {
            this.dogQ.offer(new PetEntry(pet, this.count++));
        } else if (pet.getPetType().equals("cat")) {
            this.catQ.offer(new PetEntry(pet, this.count++));
        } else {
            throw new RuntimeException("宠物需为猫或狗");
        }
    }

    public Pet pollAll() {
        if (!this.dogQ.isEmpty() && !this.catQ.isEmpty()) {
            if (this.dogQ.peek().getCount() < this.catQ.peek().getCount()) {
                return this.dogQ.poll().getPet();
            } else {
                return this.catQ.poll().getPet();
            }
        } else if (this.dogQ.isEmpty()) {
            return this.catQ.poll().getPet();
        } else if (this.catQ.isEmpty()) {
            return this.dogQ.poll().getPet();
        } else {
            throw new RuntimeException("队列已空！");
        }
    }

    public Dog pollDog() {
        if (this.dogQ.isEmpty()) {
            throw new RuntimeException("狗队列为空！");
        }
        return (Dog) this.dogQ.poll().getPet();
    }

    public Cat pollCat() {
        if (this.catQ.isEmpty()) {
            throw new RuntimeException("猫队列为空！");
        }
        return (Cat) this.catQ.poll().getPet();
    }

    public boolean isEmpty() {
        return this.dogQ.isEmpty() && this.catQ.isEmpty();
    }

    public boolean isDogQueueEmpty() {
        return this.dogQ.isEmpty();
    }

    public boolean isCatQueueEmpty() {
        return this.catQ.isEmpty();
    }
}


class Pet {
    private String type;

    public Pet(String type) {
        this.type = type;
    }

    public String getPetType() {
        return this.type;
    }
}

class Dog extends Pet {
    public Dog() {
        super("dog");
    }
}

class Cat extends Pet {
    public Cat() {
        super("cat");
    }
}

class PetEntry {
    private Pet pet;
    private long count;

    public PetEntry(Pet pet, long count) {
        this.pet = pet;
        this.count = count;
    }

    public Pet getPet() {
        return this.pet;
    }

    public long getCount() {
        return this.count;
    }

    public String getEntryPetType() {
        return this.pet.getPetType();
    }
}

class DogCatQueueTest {
    public static void main(String[] args) {
        DogCatQueue test = new DogCatQueue();

        Pet dog1 = new Dog();
        Pet cat1 = new Cat();
        Pet dog2 = new Dog();
        Pet cat2 = new Cat();
        Pet dog3 = new Dog();
        Pet cat3 = new Cat();

        test.add(dog1);
        test.add(cat1);
        test.add(dog2);
        test.add(cat2);
        test.add(dog3);
        test.add(cat3);

        test.add(dog1);
        test.add(cat1);
        test.add(dog2);
        test.add(cat2);
        test.add(dog3);
        test.add(cat3);

        test.add(dog1);
        test.add(cat1);
        test.add(dog2);
        test.add(cat2);
        test.add(dog3);
        test.add(cat3);
        while (!test.isDogQueueEmpty()) {
            System.out.println(test.pollDog().getPetType());
        }
        while (!test.isEmpty()) {
            System.out.println(test.pollAll().getPetType());
        }
    }
}