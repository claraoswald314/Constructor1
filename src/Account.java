public class Account {

    private String hesapNo;
    private double bakiye;
    private String Isim;

    private String email;

    private String telefonNo;

    public Account(){

      /*this.hesapNo = "Bilgi Yok";
      this.bakiye = 0.0;
      this.Isim = "Bilgi Yok";
      this.email = "Bilgi Yok";
      this.telefonNo = "Bilgi Yok";

       */



      this("Bilgi Yok",0.0,"Bilgi Yok","Bilgi Yok","Bilgi Yok");


    }

    public Account(String Isim,String email,String telefonNo){

        /*this.Isim = Isim;
        this.email = email;
        this.telefonNo = telefonNo;

        this.bakiye = 0.0;
        this.hesapNo = "Bilgi Yok";

         */

        this("Bilgi Yok",0.0,Isim,email,telefonNo);
    }



    public Account(String hesapNo,double bakiye,String Isim,String email,String telefonNo){

        this.hesapNo = hesapNo;

        this.bakiye = bakiye;
        this.Isim = Isim;

        this.email = email;
        this.telefonNo = telefonNo;

    }

    public void paraYatir(double miktar){

        bakiye += miktar;

        System.out.println("Yeni bakiye = "+ bakiye);
    }

    public void bilgilerigoster(){

        System.out.println("Hesap no : "+ this.hesapNo);
        System.out.println("Bakiye : "+ this.bakiye);
        System.out.println("İsim : "+ this.Isim);
        System.out.println("Email : "+ this.email);
        System.out.println("Telefon no : "+ this.telefonNo);
    }

    public void paraCekme(double miktar){

        if (miktar > 1500){
            System.out.println("Bir günde 1500 tlden fazla para çekemezsiniz...");
        }
        if (bakiye - miktar < 0){
            System.out.println("Yeterli bakiye yok. Bakiye = "+ bakiye);
        }
        else{

            bakiye -=miktar;
            System.out.println("Yeni bakiye = "+ bakiye);
        }
    }

    public String getHesapNo() {
        return hesapNo;
    }

    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    public String getIsim(String Isim) {
        return Isim;
    }

    public void setIsim(String isim) {
        this.Isim = isim;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefonNo() {
        return telefonNo;
    }

    public void setTelefonNo(String telefonNo) {
        this.telefonNo = telefonNo;
    }
}
