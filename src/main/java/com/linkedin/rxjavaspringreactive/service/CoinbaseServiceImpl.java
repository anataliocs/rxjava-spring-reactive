package com.linkedin.rxjavaspringreactive.service;

import com.linkedin.rxjavaspringreactive.model.CoinBaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CoinbaseServiceImpl implements CoinbaseService {

  @Autowired
  private RestTemplate restTemplate;

  @Override
  public ResponseEntity<CoinBaseResponse> getBtcPrice() {
    ResponseEntity<CoinBaseResponse> response = restTemplate
        .getForEntity("https://api.coinbase.com/v2/prices/BTC-USD/buy", CoinBaseResponse.class);

    return response;
  }
}
