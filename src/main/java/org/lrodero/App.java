package org.lrodero;

import io.reactivex.Observable;
import io.reactivex.functions.Consumer;


/**
 * Hello world application, adapted to RxJava 2
 */
public class App {

  public static void main(String[] args) {
    hello("this","is","a","test");
  }


  public static void hello(String... names) {
    Observable.fromArray(names).subscribe(new Consumer<String>() {

      @Override
      public void accept(String s) {
        System.out.println("Hello " + s + "!");
      }

    });
  }
}
