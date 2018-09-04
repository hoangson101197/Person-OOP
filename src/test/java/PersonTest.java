import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PersonTest {
    @Test
    public void testPerson() {
        Person person = new Person("Sơn", "Việt Trì");

        String expected = "Person [name: Sơn, address: Việt Trì]";
        String result = person.toString();

        assertEquals(expected, result);
    }

    @Test
    public void testStaff() {
        Staff staff = new Staff("Hùng", "Việt Trì", "Gia Cẩm", 8);

        String expected = "Staff[ Person[ name: Hùng, address: Việt Trì], school: Gia Cẩm, pay: 8.0]";
        String result = staff.toString();

        assertEquals(expected, result);
    }

    @Test
    public void testStudent() {
        Student student = new Student("Bảo", "Hà Nội", "???", 2010, 6);

        String expected = "Student[ Person [ name: Bảo, address: Hà Nội], program: ???, year: 2010, fee: 6.0]";
        String result = student.toString();

        assertEquals(expected, result);
    }
}
