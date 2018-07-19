package com.example.springbootsamplewithfreemarker.bean;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;

@Builder
@Getter
public class MailModel {

  @NonNull private final Address from;

  @NonNull private final Address to;

  @NonNull private final Subject subject;

  @NonNull private final Content content;
}
