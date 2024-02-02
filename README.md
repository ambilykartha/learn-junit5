INTRODUCTION

What is Unit Testing?
	
	A method in which we write code to test a unit of a program.  A unit can be a method, or a class or multiple classes.
	
Benefits of Unit testing?
	
	Helps to find bugs in the early stages of software development.
	Make sure the code works as expected
	Makes it easy during code refactoring
	Helps new developers to understand the system
	
Good unit test

	Should be consistent, ie. It should return the same result for multiple runs
	Should be isolated. Should not depend on other test cases
	Should run quickly
	Should be automated and repeatable
	Should be readable.

**ARCHITECTURE**
	
Till Junit 5 the entire Junit was a single Jar file and everyone had to use this file to use any of the modules.

In Junit 5, there are three modules which deals with test execution, test definintion and tooling support.


	 1.  Junit Jupiter : 
		
		Helps developers to write tests and extensions.
		Provides a TestEngine API to run tests on the platform
		Provides annotations and extensions
		
	2. Junit Platform
		
		Platform developers like IDEs and test frameworks use it to launch and run tests from their platforms.
		Provides an API based on the interface Launcher

	3. Junit Vintage

Provides TestEngine implementation support backward compatibility for tests written in 3 and 4

**CORE CONCEPTS**

AAA Aproach (Approach Act Assert)

	- Approach - create object of the unit and test data //Given
	- Act - execute the code to be verified. Usually a method or a function // when
	- Assert - verify the behaviour matches expectation //then


Assertions

	Provides static methods to verify the behaviour of the tests.
	
		Purpose
	Assert Method
	assertEquals	Assert that expected and actual values are equal.
	assertNotEquals	Assert that expected and actual values are not equal.
	assertTrue	Assert that condition is true.
	assertFalse	Assert that condition is false.
	assertNull	Assert that object is null.
	assertNotNull	Assert that object is not null.
	assertSame	Assert that expected and actual values refer to the same object.
	assertNotSame	Assert that expected and actual values do not refer to the same object.
	assertArrayEquals	Assert that expected and actual arrays are equals.
	assertThrows	Assert that execution of the supplied code throws an exception.
	


Assumptions

	At times, we have to make sure a set of preconditions are fulfilled before executing the test.
	These can be  achieved using the assumption methods. These methods are part of the org.junit.jupiter.api.Assumptions class.
	
	The following are some cases where assumptions are useful:
		• To run tests only in CI environments and exclude developer machines.
		• To run tests based on some external environment configuration.
		• To run tests only on a specific operating system (OS).
	
	The following are some methods that are part of the org.junit.jupiter.api.Assumptions class.
	
	Method Names	Purpose
	assumeTrue	Validate the given assumption is true.
	assumeFalse	Validate the given assumption is false.
	assumingThat	Executes the assertion only if the given assumption is true.

 **LIFE CYCLE**

 	1. SetUp

		- Preparing configurations and test infrastructure.
		- Prepared at two levels
			§ Class level - like DB conncection and insertion of data to DB. Runs only once per class
				□ @BeforeAll , should be a static method.
			§ Test Level - object initialization, helps to remove duplicated code, runs before every test
				□ @BeforeEach
			
	2. Execution

		- Tests are executed and verified.
		
	3. CleanUp
		- Test level cleanup - after every method
			§ @AfterEach
		- Class level cleanup - once per test class
			@AfterAll - should be a static method

Conditional execution of tests

- Allows to execute test cases based on OS, JRE, System Property , environment variable or custom conditions
- @EnabledOnOs - @EnabledOnOs({OS.LINUX, OS.MAC})
- @DisabledOnOs
- @EnabledOnJre - @EnabledOnJre(JRE.JAVA_17)
- @DisabledOnJre
- @EnabledForJreRange -  @EnabledForJreRange(min = JRE.JAVA_8, max = JRE.JAVA_17)
- @DisabledForJreRange
- @EnabledIfSystemProperty - @EnabledIfSystemProperty( named= "os.arch", matches = ".*64.*")
- @DisabledIfSystemProperty
- @EnabledIfEnvironmentVariable - @EnabledIfEnvironmentVariable(named = "ENV", matches = "staging-server")
- @DisabledIfEnvironmentVariable
- Custom conditions
- @DisabledIf("customCondition")
- @EnabledIf("customCondition")

Parameterized Tests

- Allows to run a test for different inputs
- Annotated with @ParameterizedTest instead of @Test
- Need to add dependency as below
       <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter-params</artifactId>
            <version>5.7.2</version>
            <scope>test</scope>
        </dependency>
- @ValueSource specifies the input source
- @EnumSource helps to give an enum as input to the test
- @MethodSource allows return values of a method to be passed as parameter to a test
- @CsvSource allows inputs to be comma separated values

Disabled Tests

	 Test can be disabled using @Disabled annotation




