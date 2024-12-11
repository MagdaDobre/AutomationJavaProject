package modelObject;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserModel extends BaseModel{
    private String numePrenume;
    private String nickname;
    private String email;
    private String telefon;
    private String judet;
    private String localitate;
    private String adresa;
    private String parola;
    private String repetaParola;


    public UserModel(String jsonFilePath) {
        super(jsonFilePath);
    }
}
