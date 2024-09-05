package Project;
import java.util.HashMap;
public class AadhaarService {
    private static HashMap<String, Aadhaar> aadhaarMap = new HashMap<>();

    static {
        aadhaarMap.put("469603649478", new Aadhaar("469603649478", "Arun",
                "Mr. Girdhari Thakur", "Dhanbad"));
        aadhaarMap.put("789623459807", new Aadhaar("789623459807", "Suraj",
                "Mr. Babu", "Tarapur"));
        aadhaarMap.put("879064732981", new Aadhaar("879064732981", "Kundan",
                "Mr. Keshri", "Patna"));
        aadhaarMap.put("567498704561", new Aadhaar("567498704561", "Nicky",
                "Mr. Pramod saw", "Dhanbad"));
    }

    public Aadhaar getAadhaarByNumber(String aadhaarNumber) {
        return aadhaarMap.get(aadhaarNumber);
    }

    public boolean validAadhaar(String aadhaarNumber){
        for(String it : aadhaarMap.keySet()) {
            if(aadhaarNumber.equals(it)) {
                return true;
            }
        }
        return false;
    }

    public void updateName(String aadhaarNumber, String name) {
        Aadhaar aadhaar = aadhaarMap.get(aadhaarNumber);

        aadhaar.setName(name);
    }
}
