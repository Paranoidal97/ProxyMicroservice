package com.paranoidal97.ProxyMicroservice.errorDecoders;

import feign.Response;
import feign.codec.ErrorDecoder;

public class ShoppingCartErrorDecoder implements ErrorDecoder {
    @Override
    public Exception decode(String s, Response response) {
        return null;
    }
}
