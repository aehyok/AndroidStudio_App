package com.aehyok.app.aehyok;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class Net {
    public static IRequestService serviceProvider() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://39.104.26.38:8177")   // 设置网络请求的Url地址
                .addConverterFactory(GsonConverterFactory.create())        // 设置数据解析器
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create()) // 支持RxJava平台
                .build();
        IRequestService service = retrofit.create(IRequestService.class);    //创建网络请求接口实例
        return service;
    }
}
