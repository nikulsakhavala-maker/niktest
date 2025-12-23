@Listeners(TestListener.class)
public class T2 {

    public static int var_ROLLNO = 7;

    public static void function1() {
        tg.wait("ele_searchamaz318", ComparisonType.IS_VISIBLE, 1);
        tg.click("ele_searchamaz318", 1);
        tg.wait("ele_searchamaz318", ComparisonType.IS_VISIBLE, 1);
        tg.type("ele_searchamaz318", "SMARTPHONE");
        tg.wait("ele_under724", ComparisonType.IS_VISIBLE, 1);
        tg.click("ele_under724", 1);
        tg.wait("ele_samsunggal007", ComparisonType.IS_VISIBLE, 1);
        tg.click("ele_samsunggal007", 1);
        tg.switchToTab(1);
        tg.wait("ele_inputtgweb414", ComparisonType.IS_VISIBLE, 1);
        tg.click("ele_inputtgweb414", 1);
        tg.wait("ele_inputtgweb098", ComparisonType.IS_VISIBLE, 1);
        tg.click("ele_inputtgweb098", 1);
        tg.wait("ele_inputtgweb171", ComparisonType.IS_VISIBLE, 1);
        tg.click("ele_inputtgweb171", 1);
        tg.wait("ele_buynowbutt618", ComparisonType.IS_VISIBLE, 1);
        tg.click("ele_buynowbutt618", 1);
    }

    public static void function2() {
        tg.wait("ele_searchforp943", ComparisonType.IS_VISIBLE, 1);
        tg.click("ele_searchforp943", 1);
        tg.wait("ele_searchforp943", ComparisonType.IS_VISIBLE, 1);
        tg.type("ele_searchforp943", "shoes");
        tg.wait("ele_shoesforme629", ComparisonType.IS_VISIBLE, 1);
        tg.click("ele_shoesforme629", 1);
        tg.wait("ele_imgtgwebco190", ComparisonType.IS_VISIBLE, 1);
        tg.click("ele_imgtgwebco190", 1);
        tg.switchToTab(1);
        tg.wait("ele_addtocart790", ComparisonType.IS_VISIBLE, 1);
        tg.click("ele_addtocart790", 1);
    }
}
