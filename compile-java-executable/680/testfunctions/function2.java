class function2 {

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