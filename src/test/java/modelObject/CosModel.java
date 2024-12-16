package modelObject;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CosModel extends BaseModel{

    private String numePrenume;
    private String telefon;
    private String email;
    private String selectatiJudet;
    private String localitate;
    private String adresa;

    public CosModel(String jsonFilePath) {
        super(jsonFilePath);
    }
}
