package com.linkedin.rxjavaspringreactive.service;

import com.linkedin.rxjavaspringreactive.model.CoinBaseResponse;
import org.springframework.http.ResponseEntity;

public interface CoinbaseService {

  ResponseEntity<CoinBaseResponse> getBtcPrice();
}
