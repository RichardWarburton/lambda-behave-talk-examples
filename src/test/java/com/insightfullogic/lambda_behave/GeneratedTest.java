package com.insightfullogic.lambda_behave;

import com.insightfullogic.lambdabehave.JunitSuiteRunner;
import org.junit.runner.RunWith;

import static com.insightfullogic.lambdabehave.Suite.describe;
import static com.insightfullogic.lambdabehave.generators.Generator.integersUpTo;
import static com.insightfullogic.lambdabehave.generators.Generator.strings;
import static com.insightfullogic.lambdabehave.generators.SourceGenerator.randomNumbers;

@RunWith(JunitSuiteRunner.class)
public class GeneratedTest {{

    describe("reversing strings", it -> {

        it.requires(10)
          .example(strings())
          .toShow("reversing %1$s twice returns %1$s", (expect, str) -> {
              String result = new StringBuilder(str).reverse().reverse().toString();
              expect.that(str).is(result);
          });

        it.requires(10)
          .withSource(randomNumbers(10))
          .example(strings(), integersUpTo(9))
          .toShow("adding a digit to a string increases its length by one", (expect, str, x) -> {
              String result = str + x;
              expect.that(result.length()).is(str.length() + 1);
          });

    });

}}
