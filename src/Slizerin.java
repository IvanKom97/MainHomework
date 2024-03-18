public class Slizerin extends Hogwards {
    private int hitrost;
    private int reshitelnost;
    private int ambichioznost;
    private int nahodchivost;
    private int gagdaVlasti;

    public Slizerin(int powerOfMagic, int trans, int hitrost, int reshitelnost, int ambichioznost, int nahodchivost, int gagdaVlasti, String name) {
        super(name, powerOfMagic, trans);
        this.ambichioznost = ambichioznost;
        this.gagdaVlasti = gagdaVlasti;
        this.hitrost = hitrost;
        this.nahodchivost = nahodchivost;
        this.reshitelnost = reshitelnost;
    }

    public int getGagdaVlasti() {
        return gagdaVlasti;
    }

    public int getNahodchivost() {
        return nahodchivost;
    }

    public int getAmbichioznost() {
        return ambichioznost;
    }

    public int getReshitelnost() {
        return reshitelnost;
    }

    public int getHitrost() {
        return hitrost;
    }

    @Override
    public String toString() {
        return super.toString() + ". Амбициозность: " + this.ambichioznost + ". Жажда власти: " + this.gagdaVlasti + ". Хитрость: " + this.hitrost + ". Находчивость: " + this.nahodchivost + ". Решительность: " + this.reshitelnost;
    }

    public void compare(Slizerin slizerin) {
        if (this == slizerin) {
            System.out.println("Вы сравниваете одного и того же ученика. ");
        } else if (this.getAmbichioznost() +
                this.getPowerOfMagic() + this.getTrans() +
                this.getHitrost() + this.getGagdaVlasti() +
                this.getNahodchivost() + this.getReshitelnost() > slizerin.getAmbichioznost() +
                slizerin.getPowerOfMagic() + slizerin.getTrans() +
                slizerin.getHitrost() + slizerin.getGagdaVlasti() +
                slizerin.getNahodchivost() + slizerin.getReshitelnost()) {
            System.out.println(this.getName() + " имеет большую силу, чем " + slizerin.getName());
        } else if (this.getPowerOfMagic() + this.getTrans() +
                this.getHitrost() + this.getGagdaVlasti() +
                this.getNahodchivost() + this.getReshitelnost() == slizerin.getAmbichioznost() +
                slizerin.getPowerOfMagic() + slizerin.getTrans() +
                slizerin.getHitrost() + slizerin.getGagdaVlasti() +
                slizerin.getNahodchivost() + slizerin.getReshitelnost()) {
            System.out.println(this.getName() + " имеет одинаковую силу по очкам с " + slizerin.getName());
        } else System.out.println(slizerin.getName() + " имеет большую силу по очкам, чем " + this.getName());
    }
}
