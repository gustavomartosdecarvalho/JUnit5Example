package preandpos;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import utilsexamples.LoginUserExample;

public class BeforeAllAndAfterAll {

	private static String loginUserPath = "src/test/resources/LoginUserExample.json";
	private static LoginUserExample loginUser;
	
	@BeforeAll
	public static void setUpBeforeClass() throws IOException {
		Gson gson = new Gson();
		Reader reader = Files.newBufferedReader(Paths.get(loginUserPath));
		loginUser = gson.fromJson(reader, LoginUserExample.class);
	}

	@Test
	public void VerifyName() {
		assertEquals("New System User", loginUser.getName());
	}

	@Test
	public void VerifyAge() {
		assertEquals(32, loginUser.getAge());
	}

	@Test
	public void VerifyUser() {
		assertEquals("nsysuser", loginUser.getUser());
	}

	@Test
	public void VerifyLogin() {
		assertTrue(loginUser.login());
	}

	@AfterAll
	public static void tearDownAfterClass() throws IOException {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		loginUser.setTested(true);
		String json = gson.toJson(loginUser);
		FileWriter writer = new FileWriter(loginUserPath);
		writer.write(json);
		writer.close();
	}
}
