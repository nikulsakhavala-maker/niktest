class backuptest1 {

	public static void backuptest1() {
		tg.wait("ele_emailorpho448", ComparisonType.IS_VISIBLE);
		tg.click("ele_emailorpho448", 1);
		tg.wait("ele_emailorpho448", ComparisonType.IS_VISIBLE);
		tg.type("ele_emailorpho448", "Mukund");
		tg.wait("ele_password718", ComparisonType.IS_VISIBLE);
		tg.click("ele_password718", 1);
		tg.wait("ele_password718", ComparisonType.IS_VISIBLE);
		tg.typeEncrypted("ele_password718", "3drhIPuS/gb9ZOl5v6Bp0Q==:MTIzNDU2Nzg5MTAxMTEyMQ==");
	}
}