package io.appmetrica.analytics.coreutils.internal.collection;

import android.os.Bundle;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.i0;
import kotlin.collections.j0;
import kotlin.collections.p;
import kotlin.collections.t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public final class CollectionUtils {

    @NotNull
    public static final CollectionUtils INSTANCE = new CollectionUtils();

    private CollectionUtils() {
    }

    public static final boolean areCollectionsEqual(@Nullable Collection<? extends Object> collection, @Nullable Collection<? extends Object> collection2) {
        HashSet hashSet;
        if (collection == null && collection2 == null) {
            return true;
        }
        if (collection == null || collection2 == null || collection.size() != collection2.size()) {
            return false;
        }
        if (collection instanceof HashSet) {
            hashSet = (HashSet) collection;
            collection = collection2;
        } else if (collection2 instanceof HashSet) {
            hashSet = (HashSet) collection2;
        } else {
            HashSet hashSet2 = new HashSet(collection);
            collection = collection2;
            hashSet = hashSet2;
        }
        Iterator<? extends Object> it = collection.iterator();
        while (it.hasNext()) {
            if (!hashSet.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Nullable
    public static final <T> List<T> arrayListCopyOfNullableCollection(@Nullable Collection<? extends T> collection) {
        if (collection != null) {
            return CollectionsKt.R(collection);
        }
        return null;
    }

    @NotNull
    public static final Map<String, byte[]> bundleToMap(@Nullable Bundle bundle) {
        HashMap map = new HashMap();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                byte[] byteArray = bundle.getByteArray(str);
                if (byteArray != null) {
                    map.put(str, byteArray);
                }
            }
        }
        return map;
    }

    @NotNull
    public static final <T> Map<String, T> convertMapKeysToLowerCase(@NotNull Map<String, ? extends T> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(i0.b(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            linkedHashMap.put(str != null ? str.toLowerCase(Locale.getDefault()) : null, entry.getValue());
        }
        return linkedHashMap;
    }

    @Nullable
    public static final <K, V> Map<K, V> copyOf(@Nullable Map<K, V> map) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        return new HashMap(map);
    }

    @NotNull
    public static final List<String> createSortedListWithoutRepetitions(@NotNull String... strArr) {
        String[] strArr2 = strArr;
        Intrinsics.checkNotNullParameter(strArr2, "<this>");
        TreeSet treeSet = new TreeSet();
        p.t(strArr2, treeSet);
        return unmodifiableListCopy(treeSet);
    }

    @Nullable
    public static final <T> T getFirstOrNull(@Nullable List<? extends T> list) {
        if (list != null) {
            return (T) CollectionsKt.firstOrNull(list);
        }
        return null;
    }

    @Nullable
    public static final <T> T getFromMapIgnoreCase(@NotNull Map<String, ? extends T> map, @NotNull String str) {
        T next;
        Iterator<T> it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Map.Entry entry = (Map.Entry) next;
            CharSequence charSequence = (CharSequence) entry.getKey();
            if (charSequence != null && charSequence.length() != 0 && a0.i((String) entry.getKey(), str)) {
                break;
            }
        }
        Map.Entry entry2 = (Map.Entry) next;
        if (entry2 != null) {
            return (T) entry2.getValue();
        }
        return null;
    }

    @Nullable
    public static final <K, V> List<Map.Entry<K, V>> getListFromMap(@Nullable Map<K, ? extends V> map) {
        if (map == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(map.size());
        Iterator<Map.Entry<K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(new AbstractMap.SimpleEntry(it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V> Map<K, V> getMapFromList(@Nullable List<? extends Map.Entry<? extends K, ? extends V>> list) {
        if (list == null) {
            return new LinkedHashMap();
        }
        int iB = i0.b(t.j(list, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static final <K, V> Map<K, V> getMapFromListOrNull(@Nullable List<? extends Map.Entry<? extends K, ? extends V>> list) {
        if (list == null) {
            return null;
        }
        int iB = i0.b(t.j(list, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        return linkedHashMap;
    }

    public static final <K, V> V getOrDefault(@NotNull Map<K, ? extends V> map, K k7, V v5) {
        V v10 = map.get(k7);
        return v10 == null ? v5 : v10;
    }

    @NotNull
    public static final Set<Integer> hashSetFromIntArray(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        HashSet destination = new HashSet(i0.b(iArr.length));
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (int i : iArr) {
            destination.add(Integer.valueOf(i));
        }
        return destination;
    }

    public static final boolean isNullOrEmpty(@Nullable Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    @Nullable
    public static final <K, V> Map<K, V> mapCopyOfNullableMap(@Nullable Map<K, ? extends V> map) {
        if (map != null) {
            return j0.l(map);
        }
        return null;
    }

    @NotNull
    public static final Bundle mapToBundle(@NotNull Map<String, byte[]> map) {
        Bundle bundle = new Bundle(map.size());
        for (Map.Entry<String, byte[]> entry : map.entrySet()) {
            bundle.putByteArray(entry.getKey(), entry.getValue());
        }
        return bundle;
    }

    @NotNull
    public static final <T> Set<T> merge(@NotNull Set<T> set, @NotNull Set<? extends T> set2) {
        set.addAll(set2);
        return set;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static final <T> List<T> nullIfEmptyList(@Nullable List<? extends T> list) {
        if (list == 0 || list.isEmpty()) {
            return null;
        }
        return list;
    }

    public static final <K, V> void putOpt(@NotNull Map<K, V> map, @Nullable K k7, @Nullable V v5) {
        if (k7 == null || v5 == null) {
            return;
        }
        map.put(k7, v5);
    }

    @NotNull
    public static final List<Integer> toIntList(@NotNull int[] iArr) {
        return p.u(iArr);
    }

    @NotNull
    public static final <T> List<T> unmodifiableListCopy(@NotNull Collection<? extends T> collection) {
        return Collections.unmodifiableList(new ArrayList(collection));
    }

    @NotNull
    public static final <K, V> Map<K, V> unmodifiableMapCopy(@NotNull Map<K, ? extends V> map) {
        return Collections.unmodifiableMap(new HashMap(map));
    }

    @NotNull
    public static final <K, V> Map<K, V> unmodifiableSameOrderMapCopy(@NotNull Map<K, ? extends V> map) {
        return Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    @NotNull
    public static final <T> Set<T> unmodifiableSetOf(@NotNull T... tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        HashSet hashSet = new HashSet(i0.b(tArr.length));
        p.t(tArr, hashSet);
        return Collections.unmodifiableSet(hashSet);
    }
}
