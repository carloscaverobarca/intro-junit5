package guru.springframework;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {

    Greeting greeting;

    @BeforeAll
    public static void beforeClass() {
        System.out.println("Before - Only call once");
    }

    @BeforeEach
    void setUp() {
        System.out.println("In Before Each...");

        greeting = new Greeting();
    }

    @Test
    void helloWorld() {
        System.out.println(greeting.helloWorld());
    }

    @Test
    void testHelloWorld() {
        System.out.println(greeting.helloWorld("Carlos"));
    }

    @AfterEach
    void tearDown() {
        System.out.println("In After Each");

    }

    @AfterAll
    public static void afterClass() {
        System.out.println("After - Only call once");
    }
}