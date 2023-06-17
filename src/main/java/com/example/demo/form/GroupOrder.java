package com.example.demo.form;

import jakarta.validation.GroupSequence;

@GroupSequence({ ValidGroup1.class, ValidGroup2.class })
/* this annotation sets the order of validation */
public interface GroupOrder {}
