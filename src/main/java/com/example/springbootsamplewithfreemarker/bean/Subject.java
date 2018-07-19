package com.example.springbootsamplewithfreemarker.bean;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.lang.NonNull;

@Getter
@RequiredArgsConstructor
public class Subject {

  @NonNull private final String value;
}
