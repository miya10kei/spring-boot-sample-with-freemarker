package com.example.springbootsamplewithfreemarker.bean;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.lang.NonNull;

@Getter
@RequiredArgsConstructor
public class Content {

  @NonNull private final String value;
}
