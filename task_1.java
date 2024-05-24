@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
assertEquals(Expected true when age is more than 18, true, isAdult);
}
