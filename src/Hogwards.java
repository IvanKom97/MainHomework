abstract class Hogwards {
    private String name;
   private int powerOfMagic;
   private int trans;

    public Hogwards(String name,int powerOfMagic, int trans) {
        this.powerOfMagic = powerOfMagic;
        this.trans = trans;
        this.name = name;
    }

    public String toString() {
        return "сила магии: : " + this.powerOfMagic + ". Сила транса : " + this.trans + ". Имя: " + this.name;
    }

    public String getName() {
        return this.name;
    }

    public int getTrans() {
        return trans;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public void compareStudents(Hogwards hogwards) {
        if (this == hogwards) {
            System.out.println("Вы сравниваете одного и того же");
        } else if (this.getTrans() + this.getPowerOfMagic() > hogwards.getPowerOfMagic() + hogwards.getTrans()) {
            System.out.println(this.getName() + " имеет большую силу магии и транс чего-то там, чем: " + hogwards.getName());
        } else if (this.getTrans() + this.getPowerOfMagic() == hogwards.getPowerOfMagic() + hogwards.getTrans()) {
            System.out.println(this.getName() + " имеет равную мощность в магии и транс прыжках с " + hogwards.getName());
        } else
            System.out.println(hogwards.getName() + " имеет большую мощность в магии и транс движухах, чем " + this.getName());
    }
}
