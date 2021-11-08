package com.kanishevskii.producer.restclient.servicies;

import com.kanishevskii.dto.Data;

import java.util.List;

public interface ApiService {
    List<Data> getData(Integer limits);
}
