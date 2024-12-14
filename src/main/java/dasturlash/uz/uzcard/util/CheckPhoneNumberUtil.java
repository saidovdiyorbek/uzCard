package dasturlash.uz.uzcard.util;

import dasturlash.uz.uzcard.handler.InvalidPhoneNumberExceptionHandler;

public class CheckPhoneNumberUtil {

    public static String setPhoneNumber(String phoneNumber) {
        if (phoneNumber == null || phoneNumber.isEmpty()){
            throw new InvalidPhoneNumberExceptionHandler("phone number is empty");
        }

        if (phoneNumber.startsWith("+998")){
            if (!phoneNumber.matches("\\+998\\d{9}")){
                throw new InvalidPhoneNumberExceptionHandler("Invalid phone number");
            }
        }else {
            throw new InvalidPhoneNumberExceptionHandler("Invalid country or invalid phone number");
        }

        return phoneNumber;
    }

}
