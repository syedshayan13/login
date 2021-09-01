package com.Spring.login.controller;

import org.junit.jupiter.api.Test;
import org.springframework.web.servlet.ModelAndView;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class AuthenticationControllerTest {
  private AuthenticationController auth_C;
  @Test
  void login() {
    assertThat(auth_C).isNull();
  }
}