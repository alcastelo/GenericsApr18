package superextends;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface Change<E, F> {
  F operate(E e);
}

class LengthGetter implements Change<String, Integer> {
  @Override
  public Integer operate(String s) {
    return s.length();
  }
}

interface Criterion<E> {
  boolean test(E e);
}

class LengthCriterion implements Criterion<String> {
  @Override
  public boolean test(String s) {
    return s.length() > 3;
  }
}

class RandomCriterion implements Criterion<Object> {
  @Override
  public boolean test(Object o) {
    return Math.random() > 0.5;
  }
}

public class Operation {
  public static <E, F> List<F> map(List<E> ls, Change<? super E, F> op) {
    List<F> rv = new ArrayList<>();
    for (E e : ls) {
      rv.add(op.operate(e));
    }
    return rv;
  }

  public static <E, F> void map(List<E> ls,
                                List<F> out,
                                Change<? super E, ? extends F> op) {
    for (E e : ls) {
      out.add(op.operate(e));
    }
  }

  public static <E> List<E> filter(List<E> ls, Criterion<? super E> crit) {
    List<E> rv = new ArrayList<>();
    for (E e : ls) {
      if (crit.test(e)) {
        rv.add(e);
      }
    }
    return rv;
  }

  public static void main(String[] args) {
    List<String> ls = Arrays.asList("Fred", "Jim", "Sheila");
    List<String> longish = filter(ls, new LengthCriterion());
    for (String s : longish) {
      System.out.println("> " + s);
    }
    System.out.println("------------------------------");
    List<String> randStrings = filter(ls, new RandomCriterion());
    for (String s : randStrings) {
      System.out.println("> " + s);
    }
    System.out.println("------------------------------");
    List<Integer> lengths = map(ls, new LengthGetter());
    for (Integer i : lengths) {
      System.out.println("> " + i);
    }
    System.out.println("------------------------------");
    List<Object> out = new ArrayList<>();
    map(ls, out, new LengthGetter());
    for (Object i : out) {
      System.out.println("> " + i);
    }
  }
}
