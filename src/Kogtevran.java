public class Kogtevran extends Hogwards{
    private int smart;
    private int ostroumn;
    private int mudriy;
    private int tvorchestvo;

    public Kogtevran(int powerOfMagic, int trans, int smart, int ostroumn, int mudriy, int tvorchestvo, String name) {
        super(name, powerOfMagic, trans);
        this.mudriy = mudriy;
        this.ostroumn = ostroumn;
        this.smart = smart;
        this.tvorchestvo = tvorchestvo;
    }

    public int getTvorchestvo() {
        return tvorchestvo;
    }

    public int getMudriy() {
        return mudriy;
    }

    public int getOstroumn() {
        return ostroumn;
    }

    public int getSmart() {
        return smart;
    }

    @Override
    public String toString() {
        return super.toString() + ". Мудрость: " + this.mudriy + ". Остроумность: " + this.ostroumn + ". Ум: " + this.smart + ". Творчество: " + this.tvorchestvo;
    }

    public void compare(Kogtevran kogtevran) {
        if (this == kogtevran) {
            System.out.println("Вы решили сравнить одного и того же ученика");
        } else if (this.getPowerOfMagic() + this.getTrans() + this.getMudriy() + this.getOstroumn() + this.getSmart() + this.getTvorchestvo() > kogtevran.getPowerOfMagic() + kogtevran.getTrans() + kogtevran.getMudriy() + kogtevran.getOstroumn() + kogtevran.getSmart() + kogtevran.getTvorchestvo()) {
            System.out.println(this.getName() + " имеет большую мощность, чем " + kogtevran.getName());
        } else if (this.getPowerOfMagic() + this.getTrans() + this.getMudriy() + this.getOstroumn() + this.getSmart() + this.getTvorchestvo() == kogtevran.getPowerOfMagic() + kogtevran.getTrans() + kogtevran.getMudriy() + kogtevran.getOstroumn() + kogtevran.getSmart() + kogtevran.getTvorchestvo()) {
            System.out.println(this.getName() + " имеет одинаковый навык с " + kogtevran.getName());
        } else System.out.println(kogtevran.getName() + " имеет более сильный скилл, чем " + this.getName());

    }
}
