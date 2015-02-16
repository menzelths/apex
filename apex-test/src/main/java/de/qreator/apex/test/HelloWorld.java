package de.qreator.apex.test;

import io.vertx.core.Vertx;
import io.vertx.ext.apex.Router;

/**
 * @author <a href="http://tfox.org">Tim Fox</a>
 */
public class HelloWorld {

  public static void main(String[] args) {

    Vertx vertx = Vertx.vertx();

    Router router = Router.router(vertx);
    router.route().handler(rc -> rc.response().putHeader("content-type", "text/plain").end("Hallo Leute 2 geht doch ganz gut!"));

    vertx.createHttpServer().requestHandler(router::accept).listen(8080);
    
  }
}