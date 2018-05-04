package com.linkedin.rxjavaspringreactive.cmd;

import com.linkedin.rxjavaspringreactive.service.CoinbaseService;
import java.util.concurrent.TimeUnit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CmdLineUI implements CommandLineRunner {

  @Autowired
  CoinbaseService coinbaseService;

  private boolean explicitExit = true;

  @Override
  public void run(String... args) throws Exception {

    System.out.println(
        "\n========================================================="
            + "\n                                                         "
            + "\n          Coinbase Price Service                         "
            + "\n          LinkedIn Learning                              "
            + "\n                                                         "
            + "\n Built by:  Chris Anatalio                               "
            + "\n=========================================================");
    System.out.println();

    while (true) {
      Thread.sleep(10); //10-millisecond pause between each check

      System.out.println(
          "Current BTC price: " + coinbaseService.getBtcPrice().getBody().getData()
              .getAmount());
      TimeUnit.MILLISECONDS.sleep(5000);
    }

    //Write batched results file after processing completes

  }


}