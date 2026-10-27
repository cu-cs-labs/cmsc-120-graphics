// Pyret's map, filter and fold, for Java.
//
// Given: keep this file beside yours and do not edit it. In your own file,
//
//     List<Integer> hours = List.of(6, 9, 4, 11);
//     Lists.filter(h -> h > 8, hours)                  // [9, 11]
//     Lists.map(h -> h * 2, hours)                     // [12, 18, 8, 22]
//     Lists.fold((total, h) -> total + h, 0, hours)    // 30
//
// The arguments come in week 3's order: the function first, then the list,
// and fold's starting value between them. `h -> h > 8` is Java's lam: a
// function written in place, its parameter before the arrow and its value
// after. fold's function takes two, the value so far and the next element,
// in that order, as Pyret's did.
//
// You are welcome to read it. Each function is one line of Java's own list
// library, its *streams*, which Java programmers write directly; the names
// in angle brackets say "a list of anything", and are week 15.

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

class Lists {
    // The elements for which keep says true, in order.
    static <T> List<T> filter(Predicate<T> keep, List<T> xs) {
        return xs.stream().filter(keep).toList();
    }

    // f of each element, in order.
    static <T, R> List<R> map(Function<T, R> f, List<T> xs) {
        return xs.stream().map(f).toList();
    }

    // combine(base, first), then combine(that, second), and so on to the end;
    // base itself for an empty list.
    static <T, R> R fold(BiFunction<R, T, R> combine, R base, List<T> xs) {
        R soFar = base;
        for (T x : xs) {   // a loop over the list: week 11
            soFar = combine.apply(soFar, x);
        }
        return soFar;
    }
}
