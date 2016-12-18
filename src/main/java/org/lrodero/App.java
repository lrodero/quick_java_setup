package org.lrodero;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
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

    System.out.println();
    
    Observable.fromArray(names).subscribe(new Observer<String>() {
      @Override
      public void onComplete() {
        System.out.println("Completed");
      }
      @Override
      public void onError(Throwable e) {
        System.out.println("Error: " + e);
      }
      @Override
      public void onNext(String s) {
        System.out.println("Hello " + s + "!!");
      }
      @Override
      public void onSubscribe(Disposable d) {
        System.out.println("Subscribed with disposable " + d);
      }
    });
  }
}
