package com.eaiesb.studentdata;

import org.springframework.data.annotation.Id;
import lombok.Data;

@Data
public class StudentData {

@Id
public String _id;

public String get_id() {
		return _id;
}

public void set_id(String _id) {
		this._id = _id;
}

    private String firstname;
    private String lastname;
    private String emailid;
    private String city;
    private String branch;
    private String phone;
}


