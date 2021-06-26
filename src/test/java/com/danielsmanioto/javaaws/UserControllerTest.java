package com.danielsmanioto.javaaws;

import com.danielsmanioto.javaaws.controller.UserController;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class UserControllerTest {

    @InjectMocks
    private UserController userController;

    @Test
    @DisplayName("Validate Hello")
    void validarHello() {
        var response = userController.hello();
        assertThat(response).isNotNull();
        assertThat(response.getBody()).isEqualTo("Hello");
    }

}
