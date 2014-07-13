package com.insightfullogic.lambda_behave;

import com.insightfullogic.lambdabehave.JunitSuiteRunner;
import org.junit.runner.RunWith;

import static com.insightfullogic.lambdabehave.Suite.describe;

@RunWith(JunitSuiteRunner.class)
public class DataDrivenTest {{

    describe("properties of numbers", it -> {

        it.uses(1, 3, 3)
          .and(-7, 4, 4)
          .and(0, 0, 0)
          .toShow("the max of %d and %d is %d", (expect, x, y, expectedMax) -> {
              expect.that(Math.max(x, y)).is(expectedMax);
          });

    });

}}
