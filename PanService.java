package Project;

import java.util.HashMap;

public class PanService {
    private static HashMap<String, Pan> panMap = new HashMap<>();

    static {
        panMap.put("EWDV76KI", new Pan("EWDV76KI", "469603649478",
                "Bank Of India",
                "Stock, ELSS, FD"));
        panMap.put("NKI7685K", new Pan("NKI7685K", "879065436790",
                "HDFC", "Stock, FD"));
    }

    public Pan getPanByAadharNumber(String aadhaarNumber) {
        for(Pan pan : panMap.values()) {
            if(pan.getAadhaarNumber().equals(aadhaarNumber)) {
                return pan;
            }
        }
        return null;
    }
}
