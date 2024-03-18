public class Main {

    public static void main(String[] args) {
        Griffendor HarryPotter = new Griffendor(88, 34, 54, 43, 88, "Гарри");
        Griffendor Germiona = new Griffendor(75, 66, 32, 55, 70, "Гермиона");
        Griffendor RonUizli = new Griffendor(22, 66, 5, 67, 35, "Рон");

        Puffenduy ZahariaSmit = new Puffenduy(44, 32, 77, 56, 87, "Захария");
        Puffenduy Sedrik = new Puffenduy(65, 43, 57, 99, 77,"Седрик");
        Puffenduy Jastin = new Puffenduy(22, 80, 65, 43, 78,"Джастин");

        Slizerin Malfoy = new Slizerin(85, 68, 90, 45, 100, 45, 100,"Драго Малфой");
        Slizerin Grehem = new Slizerin(23, 54, 12, 9, 45, 22, 51,"Грекхем");
        Slizerin Gregeri = new Slizerin(34, 56, 78, 32, 45, 21, 45,"Гредери");

        Kogtevran Chang = new Kogtevran(48, 79, 54, 43, 67, 78,"Чанг");
        Kogtevran Padma = new Kogtevran(67, 54, 23, 67, 89, 65,"Падма");
        Kogtevran Markus = new Kogtevran(56, 43, 57, 43, 76, 98, "Маркус");

       Malfoy.compareStudents(HarryPotter);
    }
}