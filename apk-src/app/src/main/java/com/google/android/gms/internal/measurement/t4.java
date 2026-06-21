package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.om1;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t4 {
    protected int zza;

    public static void c(Iterable iterable, List list) {
        Charset charset = r5.f13944a;
        iterable.getClass();
        if (iterable instanceof v5) {
            List listH = ((v5) iterable).h();
            v5 v5Var = (v5) list;
            int size = list.size();
            for (Object obj : listH) {
                if (obj == null) {
                    int size2 = v5Var.size() - size;
                    String strL = l7.o.l(new StringBuilder(String.valueOf(size2).length() + 26), "Element at index ", size2, " is null.");
                    int size3 = v5Var.size();
                    while (true) {
                        size3--;
                        if (size3 < size) {
                            throw new NullPointerException(strL);
                        }
                        v5Var.remove(size3);
                    }
                } else if (obj instanceof z4) {
                    v5Var.j();
                } else if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    z4.f(bArr, 0, bArr.length);
                    v5Var.j();
                } else {
                    v5Var.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof i6) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size4 = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size4);
            } else if (list instanceof k6) {
                k6 k6Var = (k6) list;
                int i = k6Var.f13856d + size4;
                int length = k6Var.f13855c.length;
                if (i > length) {
                    if (length != 0) {
                        while (length < i) {
                            length = om1.g(length, 3, 2, 1, 10);
                        }
                        k6Var.f13855c = Arrays.copyOf(k6Var.f13855c, length);
                    } else {
                        k6Var.f13855c = new Object[Math.max(i, 10)];
                    }
                }
            }
        }
        int size5 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    j5.a(size5, list);
                    throw null;
                }
                list.add(obj2);
            }
            return;
        }
        List list2 = (List) iterable;
        int size6 = list2.size();
        for (int i10 = 0; i10 < size6; i10++) {
            Object obj3 = list2.get(i10);
            if (obj3 == null) {
                j5.a(size5, list);
                throw null;
            }
            list.add(obj3);
        }
    }

    public final byte[] a() {
        try {
            k5 k5Var = (k5) this;
            int iK = k5Var.k();
            byte[] bArr = new byte[iK];
            a5 a5Var = new a5(iK, bArr);
            k5Var.d(a5Var);
            if (iK - a5Var.f13657f == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e3) {
            String name = getClass().getName();
            throw new RuntimeException(t.z.g(new StringBuilder(name.length() + 72), "Serializing ", name, " to a byte array threw an IOException (should never happen)."), e3);
        }
    }

    public abstract int b(m6 m6Var);
}
