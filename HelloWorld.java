public class HelloWorld{
  public static void main(String args[]){
    System.out.println("Hello World!");
    string s = "";
    try {
      s = "Hello world";
    }
    catch (Exception e) {  // 不规范
      throw e;
    }
    
    int param =0 ;
    param =4;
    switch (param) {  //没有default语句
    case 0:
      doSomething();
      break;
    case 1:
      doSomethingElse();
      break;
    }
  }
}
