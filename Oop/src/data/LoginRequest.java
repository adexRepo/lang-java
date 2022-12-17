package data;

public record LoginRequest(String name, String password)  // ini itu constructor default!
{
   // * Dia butuh constructor karena tujuan utama pembuatan record class untuk menyimpan

   public LoginRequest{
    // Ini diakses setelah constructor default nya si record di akses
    // bahkan sebelum method toString nya di generate sama si record
    System.out.println("TEST after load");
   }

   // constructor overloading
   public LoginRequest(String userName){
    this(userName,"");
   }

   public LoginRequest(){
    this("","");
   }

   // method
   public void sayHello(){
    System.out.println(this.name);
   }

    // NOTE gabisa di set karena semua yang masuk di record final
    //    public void setName(String name){
    //     this.name = name;
    //    }

}
