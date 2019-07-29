import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.function.Function;

public class CallableExample2
{
    public static void main(String args[]) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(10);  //submit has return type future
        List<Future<String>> list = new ArrayList<Future<String>>(); //return stored in future and then executed safely
        Callable<String> call = new TestCallable();
        for(int i = 0 ; i < 1000 ; i++)
        {
            Future<String> future = service.submit(call);  //start thread
            list.add(future);

        }

        //functional interface
       Function<Future<String>,String> function = (f)-> {
            String name="";
            try {
                name = f.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
            return name;
        };
        list.stream().map(function).forEach(System.out::println);
        for(Future<String> f: list) {
            System.out.println(System.currentTimeMillis()+"::::"+f.get());

        }
        service.shutdown();
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