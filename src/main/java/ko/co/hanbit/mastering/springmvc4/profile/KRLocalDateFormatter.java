package ko.co.hanbit.mastering.springmvc4.profile;

import org.springframework.format.Formatter;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * Created by bys on 2017-08-10.
 */
public class KRLocalDateFormatter implements Formatter<LocalDate> {
    private static final String KR_PATTERN = "yyyy/mm/dd";
    private static final String NORMAL_PATTERN = "dd/MM/yyyy";

    @Override
    public LocalDate parse(String text, Locale locale) throws ParseException {
        return  LocalDate.parse(text,DateTimeFormatter.ofPattern(getPattern(locale)));
    }

    @Override
    public String print(LocalDate object, Locale locale) {
        return DateTimeFormatter.ofPattern(getPattern(locale)).format(object);
    }
    public static  String getPattern(Locale locale){
        return  iskorea(locale)? KR_PATTERN:NORMAL_PATTERN;

    }
    private static boolean iskorea(Locale locale){
        return Locale.KOREA.getCountry().equals(locale.getCountry());
    }
}
