import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Controller {
    // for surname, name, patronymic "sas'as-casc"
    public static final String REGEX_WORD = "^[A-Za-z-']+$";
    // for nickname, skype "a1_as-a@asd.qwd"
    public static final String REGEX_NICKNAME = "^[\\w-@.]{1,15}$";
    // for homePhoneNumber, mobilePhoneNumber "+38(066)2147777
    public static final String REGEX_PHONE = "^\\+\\d{2}\\(\\d{3}\\)\\d{7}$";
    // for e-mail «example@gmail.com»
    public static final String REGEX_MAIL = "^([\\w-]+\\.)*[\\w-]+@[\\w-]+(\\.[\\w-]+)*\\.[a-z]{2,4}$";
    // for groups
    public static final String REGEX_GROUP = "^(FAMILY|WORK|FRIENDS)$";
    // apartaments and house numbers
    public static final String REGEX_BUILD_NUMBER = "^[0-9a-z]{3}$";
    // for comments
    public static final String REGEX_COMMENTS = "^.*$";
    // postal index
    public static final String REGEX_POST_INDEX="[0-9]{6}";

    Notebook notebook;
    View view;

    public Controller(Notebook notebook, View view) {
        this.notebook  = notebook;
        this.view = view;
    }

    public void processUser(){
        String surname = inputValue(REGEX_WORD, view.SURNNAME);
        String name = inputValue(REGEX_WORD, view.NAME);
        String patronymic = inputValue(REGEX_WORD, view.PATRONYMIC);
        String nickname = inputValue(REGEX_NICKNAME, view.NICKNAME);
        String comment = inputValue(REGEX_COMMENTS, view.COMMENT);
        Groups group = Groups.valueOf(inputValue(REGEX_GROUP,View.GROUP));
        String homePhoneNumber = inputValue(REGEX_PHONE, view.HOME_PHONE);
        String mobilePhoneNumber = inputValue(REGEX_PHONE, view.MOBILE_NUMBER);
        String email = inputValue(REGEX_MAIL, view.EMAIL);
        String skype = inputValue(REGEX_NICKNAME, view.SKYPE);
        String adressWithoutIndex = inputValue(REGEX_WORD,View.CITY) + ", " + inputValue(REGEX_WORD,View.STREET) + ", " +
                inputValue(REGEX_BUILD_NUMBER,View.HOUSE_NUMBER) + ", " + inputValue(REGEX_BUILD_NUMBER,View.APARTAMENT_NUMBER);
        String adressWithIndex = inputValue(REGEX_POST_INDEX,View.INDEX) + adressWithoutIndex;
        Date recordDate = new Date(System.currentTimeMillis());
        Date dateOfChange = new Date(System.currentTimeMillis());
        notebook.setValue(surname + " " + name.charAt(0) + ". " + patronymic.charAt(0) + ". ", nickname, comment,
                group, homePhoneNumber, mobilePhoneNumber, email, skype, adressWithoutIndex, adressWithIndex, recordDate, dateOfChange);
        notebook.printValues();
    }

    public String inputValue(String pattern, String message) {
        view.message(message);
        String str;
        Scanner sc = new Scanner(System.in);
        Pattern p = Pattern.compile(pattern);
        str = sc.nextLine();
        Matcher m = p.matcher(str);

        while( m.matches() == false ) {
            view.message(view.WRONG_DATA + "\n");
            view.message(message);
            str = sc.nextLine();
            m = p.matcher(str);
        }
        return str;
    }


}
