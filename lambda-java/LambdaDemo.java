import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class LambdaDemo {
	public static void main(String... args) {
		final List<Integer> numbers = Arrays.asList(1, 2, 3);
		final List<Integer> numbersPlusOne = 
		    numbers.stream().map(number -> number / 0).collect(Collectors.toList());
		    // numbers.stream().map(number -> number + 1).collect(Collectors.toList());
		numbersPlusOne.stream().forEach(number -> System.out.println(number));
	}
}

// public class LambdaDemo {
// 	public LambdaDemo() {
// 	}

// 	public void testLambda() {
// 		final List<Integer> numbers = Arrays.asList(1, 2, 3);
// 		final List<Integer> numbersPlusOne = 
// 		    numbers.stream().map(number -> number / 0).collect(Collectors.toList());
// 		    // numbers.stream().map(number -> number + 1).collect(Collectors.toList());
// 		numbersPlusOne.stream().forEach(number -> System.out.println(number));
// 	}

// 	public static void main(String... args) {
// 		final LambdaDemo demo = new LambdaDemo();
// 		System.out.println("About to start!");
// 		demo.testLambda();
// 		System.out.println("Done!");
// 	}
// }

/*
About to start!
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at LambdaDemo.lambda$0(LambdaDemo.java:1)
	at LambdaDemo$$Lambda$1.apply(Unknown Source)
	at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:188)
	at java.util.Spliterators$ArraySpliterator.forEachRemaining(Spliterators.java:948)
	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:467)
	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:457)
	at java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:710)
	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:231)
	at java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:474)
	at LambdaDemo.testLambda(LambdaDemo.java:12)
	at LambdaDemo.main(LambdaDemo.java:20)
*/