//
//
//package Lesson10;
//
//import java.util.Objects;
//
//public class Contact implements Comparable<Contact>{
//    private String name;
//    private String phone;
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Contact contact  = (Contact) o;
//        return name == contact.name && phone == contact.phone;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, phone);
//    }
//
//    @Override
//    public int compareTo(Contact o) {
//        return 0;
//    }
//}
