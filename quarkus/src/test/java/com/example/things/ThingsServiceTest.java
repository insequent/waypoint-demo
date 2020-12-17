package com.example.things;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;


@QuarkusTest
public class ThingsServiceTest {
    @Test
    public void testThingsEndpoint() throws Throwable {
        given()
                .when()
                    .get("/")
                .then()
                    .statusCode(200);
    }
}
