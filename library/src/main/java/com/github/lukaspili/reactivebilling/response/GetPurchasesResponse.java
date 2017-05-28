package com.github.lukaspili.reactivebilling.response;

import java.util.List;

/**
 * Created by lukasz on 04/05/16.
 */
public class GetPurchasesResponse extends Response {

    private final List<PurchaseResponse> list;
    private final String continuationToken;

    public GetPurchasesResponse(int responseCode, List<PurchaseResponse> list, String continuationToken) {
        super(responseCode);
        this.list = list;
        this.continuationToken = continuationToken;
    }

    public List<PurchaseResponse> getList() {
        return list;
    }

    public String getContinuationToken() {
        return continuationToken;
    }
}
