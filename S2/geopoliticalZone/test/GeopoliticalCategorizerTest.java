import org.junit.jupiter.api.Test;

public class GeopoliticalCategorizerTest {

    @Test
    public void testGeopoliticalCategorizer() {
      //GeopoliticalCategorizer[] geopoliticalCategorizer =  GeopoliticalCategorizer.values();

      for (GeopoliticalCategorizer zone : GeopoliticalCategorizer.values()) {
          System.out.println(zone.getLocation("LAGOS"));
      }
    }

}
