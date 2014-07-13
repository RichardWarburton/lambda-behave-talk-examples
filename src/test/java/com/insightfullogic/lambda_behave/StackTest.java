package com.insightfullogic.lambda_behave;

import com.insightfullogic.lambdabehave.JunitSuiteRunner;
import org.junit.runner.RunWith;

import java.util.Stack;

import static com.insightfullogic.lambdabehave.Suite.describe;

@RunWith(JunitSuiteRunner.class)
public class StackTest {{

    Stack<Integer> stack = new Stack<>();

    describe("a stack", it -> {

        it.shouldSetup(stack::clear);

        it.should("be empty when created", expect -> {
            expect.that(stack).isEmpty();
        });

        it.should("push new elements onto the top of the stack", expect -> {
            stack.push(1);
            stack.push(2);

            expect.that(stack.peek()).isEqualTo(2);
        });

        it.should("pop the last element pushed onto the stack", expect -> {
            expect.that(stack).isEmpty();

            stack.push(2);
            stack.push(1);

            expect.that(stack.pop()).isEqualTo(1);
        });

    });

}}
