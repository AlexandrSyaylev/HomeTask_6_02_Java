import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class BonusMilesServiceTest {


    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    void calculateFormCsvFileSource(int fromSourceFile) {
        BonusMilesService service = new BonusMilesService();
        //int actual = fromSourceFile;
        //System.out.println(actual);
        int actual = service.calculate(fromSourceFile);
        int expected = 50;
        assertEquals(expected, actual);
    }
}