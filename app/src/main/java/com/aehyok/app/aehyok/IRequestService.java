package com.aehyok.app.aehyok;

import com.aehyok.app.aehyok.Model.Login;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface IRequestService {

    /**
     * 登录
     * @param loginMap
     * @return
     */
    @POST("/api/Account/Login")
    Call<Login> getLogin(@Body()Map<String,String> loginMap);
}
