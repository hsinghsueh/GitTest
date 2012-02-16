package com.tasc.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.tasc.util.test.Addition_Test;
import com.tasc.util.test.Multiply_Test;

@RunWith(Suite.class)
@Suite.SuiteClasses({Addition_Test.class, Multiply_Test.class })

public class AllTests {

}
