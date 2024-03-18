public class Griffendor extends Hogwards {
    private int hrabrost;
    private int chest;
    private int blagorodstvo;

    public Griffendor(int powerOfMagic, int trans, int hrabrost, int chest, int blagorodstvo, String name) {
        super(name, powerOfMagic, trans);
        this.blagorodstvo = blagorodstvo;
        this.chest = chest;
        this.hrabrost = hrabrost;
    }

    public int getHrabrost() {
        return this.hrabrost;
    }

    public int getChest() {
        return this.chest;
    }

    public int getBlagorodstvo() {
        return this.blagorodstvo;
    }
    @Override
    public String toString() {
        return super.toString() + ". Уровень храбрости: " + this.hrabrost + ". Уровень чести: " + this.chest + ". Уровень благородства: " + this.blagorodstvo;
    }

    public void compare(Griffendor griffendor) {
        if (this == griffendor) {
            System.out.println("Вы решили сравнить одного и того же ученика");
        }  else if (this.getPowerOfMagic() + this.getTrans() + this.getBlagorodstvo() + this.getChest() + this.getHrabrost() > griffendor.getPowerOfMagic() + griffendor.getTrans() + griffendor.getHrabrost() + griffendor.getBlagorodstvo() + getChest()) {
                System.out.println(this.getName() + " имеет большую силу в общей сложности, чем " + griffendor.getName());
            } else if (this.getPowerOfMagic() + this.getTrans() + this.getBlagorodstvo() + this.getChest() + this.getHrabrost() == griffendor.getPowerOfMagic() + griffendor.getTrans() + griffendor.getHrabrost() + griffendor.getBlagorodstvo() + getChest()) {
                System.out.println(this.getName() + " и " + griffendor.getName() + " имеют равные показатели в силе");
            } else {
                System.out.println(griffendor.getName() + " имеет большую силу по всем показателям, чем " + this.getName());
            }
        }
    }
