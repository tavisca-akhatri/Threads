import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample2
{
    ExecutorService service = Executors.newFixedThreadPool(4);
    List<Future<String>> list = new ArrayList<>();
    Callable<String> c = new TestCallable();
    for(int i = 0 ; i < 1000 ; i++)
    {

    }
}

class TestCallable implements Callable<String>
{
    @Override
    public String call() throws InterruptedException {
        Thread.sleep(1000);
        return Thread.currentThread().getName();

    }
}