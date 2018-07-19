package com.example.springbootsamplewithfreemarker.bean;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.lang.NonNull;

@Getter
@RequiredArgsConstructor
public class Address {

  @NonNull private final String address;

  @NonNull private final String displayName;
}
