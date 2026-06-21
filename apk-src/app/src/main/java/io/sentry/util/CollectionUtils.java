package io.sentry.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class CollectionUtils {

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public interface Mapper<T, R> {
        R map(T t10);
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public interface Predicate<T> {
        boolean test(T t10);
    }

    private CollectionUtils() {
    }

    public static <T> boolean contains(@NotNull T[] tArr, @NotNull T t10) {
        for (T t11 : tArr) {
            if (t10.equals(t11)) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public static <T> List<T> filterListEntries(@NotNull List<T> list, @NotNull Predicate<T> predicate) {
        ArrayList arrayList = new ArrayList(list.size());
        for (T t10 : list) {
            if (predicate.test(t10)) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    @NotNull
    public static <K, V> Map<K, V> filterMapEntries(@NotNull Map<K, V> map, @NotNull Predicate<Map.Entry<K, V>> predicate) {
        HashMap map2 = new HashMap();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (predicate.test(entry)) {
                map2.put(entry.getKey(), entry.getValue());
            }
        }
        return map2;
    }

    @NotNull
    public static <T, R> List<R> map(@NotNull List<T> list, @NotNull Mapper<T, R> mapper) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mapper.map(it.next()));
        }
        return arrayList;
    }

    @Nullable
    public static <T> List<T> newArrayList(@Nullable List<T> list) {
        if (list != null) {
            return new ArrayList(list);
        }
        return null;
    }

    @Nullable
    public static <K, V> Map<K, V> newConcurrentHashMap(@Nullable Map<K, V> map) {
        if (map == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                concurrentHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return concurrentHashMap;
    }

    @Nullable
    public static <K, V> Map<K, V> newHashMap(@Nullable Map<K, V> map) {
        if (map != null) {
            return new HashMap(map);
        }
        return null;
    }

    @NotNull
    public static <T> ListIterator<T> reverseListIterator(@NotNull CopyOnWriteArrayList<T> copyOnWriteArrayList) {
        CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList(copyOnWriteArrayList);
        return copyOnWriteArrayList2.listIterator(copyOnWriteArrayList2.size());
    }

    public static int size(@NotNull Iterable<?> iterable) {
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        Iterator<?> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
        }
        return i;
    }
}
