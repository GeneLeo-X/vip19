//package lovecoding.day13.bean;
//
//
//
//import java.lang.reflect.InvocationTargetException;
//import java.util.HashMap;
//import java.util.Map;
//
//public class TestUser {
//
//    public static void main(String[] args) {
//        //name = "zhangsan" &age = "23"&email = "262926400@qq.com"
//        User user = new User();
//
//        /*user.setName("zhangsan");
//        user.setAge(Integer.valueOf("23"));
//        user.setEmail("262926400@qq.com");*/
//
//        try {
//            //帮我们快速封装JavaBean实体
//            /*BeanUtils.setProperty(user , "name" , "zhangsan");
//            BeanUtils.setProperty(user , "age" , "23");
//            BeanUtils.setProperty(user , "email" , "262926400@qq.com");*/
//
//            System.out.println("---------------------");
//            //学习J2EE之后，此Map中的封装属性值，会自动封装好
//            Map<String , String> map = new HashMap<>();
//            map.put("name" , "zhangsan");
//            map.put("age" , "23");
//            map.put("email" , "262926400@qq.com");
//
//            BeanUtils.populate(user , map);
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (InvocationTargetException e) {
//            e.printStackTrace();
//        }
//
//        register(user);
//    }
//
//    private static void register(User user){
//        System.out.println(user);
//    }
//}
