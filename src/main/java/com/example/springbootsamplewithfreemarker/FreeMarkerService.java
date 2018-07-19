package com.example.springbootsamplewithfreemarker;

import com.example.springbootsamplewithfreemarker.bean.Address;
import com.example.springbootsamplewithfreemarker.bean.Content;
import com.example.springbootsamplewithfreemarker.bean.MailModel;
import com.example.springbootsamplewithfreemarker.bean.Subject;
import freemarker.template.Configuration;
import freemarker.template.Template;
import lombok.RequiredArgsConstructor;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;

@Component
@RequiredArgsConstructor
public class FreeMarkerService {

  @NonNull private final Configuration freeMarkerConfig;

  void out() throws Exception {
    MailModel model =
        MailModel.builder()
            .from(new Address("hoge@example.com", "hoge"))
            .to(new Address("fuga@example.com", "fuga"))
            .subject(new Subject("sample mail"))
            .content(new Content("sample mail content"))
            .build();
    Template t = freeMarkerConfig.getTemplate("mail-template.ftl");
    String rawMail = FreeMarkerTemplateUtils.processTemplateIntoString(t, model);
    System.out.println(rawMail);
  }
}
