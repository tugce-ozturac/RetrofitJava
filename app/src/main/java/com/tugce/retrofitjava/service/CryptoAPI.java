package com.tugce.retrofitjava.service;

import com.tugce.retrofitjava.model.CryptoModel;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;

public interface CryptoAPI {
    //GET , POST , UPDATE , DELETE
    //https://raw.githubusercontent.com/atilsamancioglu/K21-JSONDataSet/refs/heads/master/crypto.json

    @GET("atilsamancioglu/K21-JSONDataSet/refs/heads/master/crypto.json")
    Observable<List<CryptoModel>> getData();

}
