import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDatePractice {
	public static void main(String[] args) {
		LocalDate d1 = LocalDate.now();
		LocalDate d2 = LocalDate.of(1986, 4, 28);
		LocalDate d3 = LocalDate.parse("2017-09-04", DateTimeFormatter.ISO_LOCAL_DATE);
		LocalDate d4 = LocalDate.parse("2017/09/04", DateTimeFormatter.ofPattern("yyyy/MM/dd"));
		String d4Formated = d4.format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));
		System.out.println(d1); //2017-09-04
		System.out.println(d2); //1986-04-28
		System.out.println(d3); //2017-09-04
		System.out.println(d4); //2017-09-04 toStringで出力されるので出力フォーマットはyyyy-mm-dd
		System.out.println(d4Formated);

		System.out.println("年：" + d1.getYear());
		System.out.println("月：" + d1.getMonth());
		System.out.println("日：" + d1.getDayOfMonth());
		System.out.println("曜日：" + d1.getDayOfWeek());

		System.out.println(d1 + "の10日後：" + d1.plusDays(10));
		System.out.println(d1 + "の10日前：" + d1.minusDays(10));

		System.out.println(d1 + "の1年後：" + d1.plusYears(1));
		System.out.println(d1 + "の1年前：" + d1.minusYears(1));
	}
}
