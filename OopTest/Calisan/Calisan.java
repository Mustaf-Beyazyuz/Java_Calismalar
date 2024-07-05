package OopTest.Calisan;

public class Calisan {
    public int no;
    public String name;
    public String surname;
    public int maas;
    public int tecrube;

    public Calisan(int no, String name, String surname, int maas, int tecrube)  {
        this.no = no;
        this.name = name;
        this.surname = surname;
        this.maas = maas;
        this.tecrube = tecrube;
    }
    public void calisanBilgileriGoster()
    {
        System.out.println("*******Calisan Bilgileri*******");
        System.out.println("No : " + no);
        System.out.println("Name : " + name);
        System.out.println("Surname : " + surname);
        System.out.println("Maas : " + maas);
        System.out.println("Tecrube : " + tecrube);
    }
    public void zamYap(int zam)
    {
        System.out.println("Maaşınıza "+ zam +"Tl zam yapıldı");
        System.out.println("Şuanki güncel maaşınız  : " + (maas+zam));
    }
}
