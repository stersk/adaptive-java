import java.util.logging.Handler;

/**
 * It represents a handler and has two methods: one for handling requests and other for combining handlers
 */
@FunctionalInterface
public interface RequestHandler {
  // !!! write a method handle that accept request and returns new request here
  // it allows to use lambda expressions for creating handlers below

  // !!! write a default method for combining this and other handler single one
  // the order of execution may be any but you need to consider it when composing handlers
  // the method may has any name
  Request handle(Request request);

  default RequestHandler appendNext(RequestHandler nextHandler) {
    return request -> nextHandler.handle(handle(request));
    };
  }
}
