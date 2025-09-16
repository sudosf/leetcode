import java.util.Arrays;

public class TestConvertTemperature {

  void main() {
    IO.println(Arrays.toString(convertTemperature(30)));
  }

  double[] convertTemperature(double celsius) {
    return new double[] {celsius + 273.15, (celsius * 1.8) + 32.00};
  }
}
