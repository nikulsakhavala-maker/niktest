class testingback2 {

	public static void testingback2() {
		tg.wait("ele_emailorpho148", ComparisonType.IS_VISIBLE);
		tg.click("ele_emailorpho148", 1);
		tg.wait("ele_emailorpho148", ComparisonType.IS_VISIBLE);
		tg.type("ele_emailorpho148", "Mukund");
		tg.wait("ele_password662", ComparisonType.IS_VISIBLE);
		tg.click("ele_password662", 1);
		tg.wait("ele_password174", ComparisonType.IS_VISIBLE);
		tg.click("ele_password174", 1);
		tg.wait("ele_password174", ComparisonType.IS_VISIBLE);
		tg.typeEncrypted("ele_password174", "3drhIPuS/gb9ZOl5v6Bp0Q==:MTIzNDU2Nzg5MTAxMTEyMQ==");
	}
}