package data.SocialMedia;

public class SocialMedia {
    String name;


}

final class Facebook extends SocialMedia{
    
}


// * ERROR : because cannot make a child from final class
// class TryExtendFacebook extends Facebook{
// }
    
class Instagram extends SocialMedia{
    final void login(String username, String password){
    }
    
}

class tryExtendInstaWithFinalMethood extends Instagram{

    // * ERROR : bacause method login is final
    // @Override
    // final void login(String username, String password){
    // }
}