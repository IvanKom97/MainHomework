public class Puffenduy extends Hogwards{
    private int honest;
    private int verniy;
    private int trud;

    public int getTrud() {
        return trud;
    }

    public int getVerniy() {
        return verniy;
    }

    public int getHonest() {
        return honest;
    }

    public Puffenduy(int powerOfMagic, int trans, int honest, int verniy, int trud, String name) {
        super(name, powerOfMagic, trans);
        this.honest = honest;
        this.trud = trud;
        this.verniy = verniy;
    }

    @Override
    public String toString() {
        return super.toString() + ". Честность: " + this.honest + ". Верность: " + this.verniy + ". Трудолюбивость: " + this.trud;
    }

    public void compare(Puffenduy puffenduy) {
        if (this == puffenduy) {
            System.out.println("Вы решили сравнить одного и того же ученика. ");
        } else if (this.getHonest() + this.getPowerOfMagic() + this.getTrud() + this.getTrans() + this.getVerniy() > puffenduy.getTrans() + puffenduy.getPowerOfMagic() + puffenduy.getVerniy() + puffenduy.getTrud() + puffenduy.getHonest()) {
            System.out.println(this.getName() + " имеет большую силу, чем " + puffenduy.getName());
        } else if (this.getHonest() + this.getPowerOfMagic() + this.getTrud() + this.getTrans() + this.getVerniy() == puffenduy.getTrans() + puffenduy.getPowerOfMagic() + puffenduy.getVerniy() + puffenduy.getTrud() + puffenduy.getHonest()) {
            System.out.println(this.getName() + " имеет равные показатели в силе с: " + puffenduy.getName() );
        } else System.out.println(puffenduy.getName() + " имеет большую мощность, чем " + this.getName());
    }
}
