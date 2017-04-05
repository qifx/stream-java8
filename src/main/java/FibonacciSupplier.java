import java.util.function.Supplier;

/**
 * Created by qiuzhanghua on 2017/2/7.
 */
public class FibonacciSupplier implements Supplier<Long> {
  private long previous1 = 1;
  private long previous2 = 2;
  private long current = 4;
  
  
  @Override
  public Long get() {
    long p1 = previous1;
    long p2 = previous2;
    long c = current;
    long next = c + p1 + p2;
    previous1 = p2;
    previous2 = c;
    current = next;
    return p1;
  }
  
}
