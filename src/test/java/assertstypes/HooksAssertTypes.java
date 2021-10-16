package assertstypes;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.jupiter.api.BeforeAll;

import com.google.gson.Gson;

import utilsexamples.PreHistoryExample;

public class HooksAssertTypes {
	
	protected static PreHistoryExample preHistory;
	
	@BeforeAll
	public static void setup() throws IOException {
		Gson gson = new Gson();
		Reader reader = Files.newBufferedReader(Paths.get("src/test/resources/PreHistoryExample.json"));
		preHistory = gson.fromJson(reader, PreHistoryExample.class);
		//System.out.println(preHistory.Palaeolithic().getMaterial());
		//System.out.println(preHistory.Neolithic().getMaterial());
		//System.out.println(preHistory.Chalcolithic().getMaterial());
		//System.out.println(preHistory.IronAge().getMaterial());
	}
}
