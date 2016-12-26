package org.lrodero;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world application, adapted to RxJava 2
 */
public class App {

  private final static Logger log = LogManager.getFormatterLogger(App.class);

  public static void main(String[] args) {
    hello("this","is","a","test");
  }


  public static void hello(String... names) {

    final Observable<String> o = Observable.fromArray(names);

    o.subscribe(new Consumer<String>() {
      @Override
      public void accept(String s) {
        log.info("Accepting '%s'", s);
      }
    });

    o.subscribe(new Observer<String>() {
      @Override
      public void onComplete() {
        log.info("Completed");
      }
      @Override
      public void onError(Throwable e) {
        log.info("Error: " + e);
      }
      @Override
      public void onNext(String s) {
        log.info("Hello " + s + "!!");
      }
      @Override
      public void onSubscribe(Disposable d) {
        log.info("Subscribed with disposable " + d);
      }
    });

    final Observable<Integer> o2 = Observable.range(1,20);
    final Observable<Integer> o3 = o2.skip(10).take(5).map(i -> i * 1000);
    o2.subscribe(i -> log.info(i));
    o3.subscribe(i -> log.info(i));

  }
}
