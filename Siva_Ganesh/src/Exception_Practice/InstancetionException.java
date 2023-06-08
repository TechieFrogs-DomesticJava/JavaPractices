package Exception_Practice;

public class InstancetionException {
  public static Object newInstance(String name) {
    try {
      return forName(name).newInstance();
    } catch (InstantiationException e) {
      throw new IllegalStateException(e.getMessage(), e);
    } catch (IllegalAccessException e) {
      throw new IllegalStateException(e.getMessage(), e);
    }
  }
}
