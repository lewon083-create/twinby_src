package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.u3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0524u3 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0624y3 fromModel(@NotNull C0499t3 c0499t3) {
        C0624y3 c0624y3 = new C0624y3();
        c0624y3.f25069a = a(c0499t3.f24754a);
        int size = c0499t3.f24755b.size();
        C0549v3[] c0549v3Arr = new C0549v3[size];
        for (int i = 0; i < size; i++) {
            c0549v3Arr[i] = a((C0474s3) c0499t3.f24755b.get(i));
        }
        c0624y3.f25070b = c0549v3Arr;
        return c0624y3;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0499t3 toModel(@NotNull C0624y3 c0624y3) {
        C0549v3 c0549v3 = c0624y3.f25069a;
        if (c0549v3 == null) {
            c0549v3 = new C0549v3();
        }
        C0474s3 c0474s3A = a(c0549v3);
        C0549v3[] c0549v3Arr = c0624y3.f25070b;
        ArrayList arrayList = new ArrayList(c0549v3Arr.length);
        for (C0549v3 c0549v32 : c0549v3Arr) {
            arrayList.add(a(c0549v32));
        }
        return new C0499t3(c0474s3A, arrayList);
    }

    public static C0549v3 a(C0474s3 c0474s3) {
        C0599x3 c0599x3;
        C0549v3 c0549v3 = new C0549v3();
        Map map = c0474s3.f24724a;
        int i = 0;
        if (map != null) {
            c0599x3 = new C0599x3();
            int size = map.size();
            C0574w3[] c0574w3Arr = new C0574w3[size];
            for (int i10 = 0; i10 < size; i10++) {
                c0574w3Arr[i10] = new C0574w3();
            }
            c0599x3.f25003a = c0574w3Arr;
            int i11 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                C0574w3 c0574w3 = c0599x3.f25003a[i11];
                c0574w3.f24955a = str;
                c0574w3.f24956b = str2;
                i11++;
            }
        } else {
            c0599x3 = null;
        }
        c0549v3.f24867a = c0599x3;
        int iOrdinal = c0474s3.f24725b.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                i = 2;
                if (iOrdinal != 2) {
                    i = 3;
                    if (iOrdinal != 3) {
                        throw new ij.j();
                    }
                }
            } else {
                i = 1;
            }
        }
        c0549v3.f24868b = i;
        return c0549v3;
    }

    public static C0474s3 a(C0549v3 c0549v3) {
        LinkedHashMap linkedHashMap;
        T7 t72;
        C0599x3 c0599x3 = c0549v3.f24867a;
        if (c0599x3 != null) {
            C0574w3[] c0574w3Arr = c0599x3.f25003a;
            int iB = kotlin.collections.i0.b(c0574w3Arr.length);
            if (iB < 16) {
                iB = 16;
            }
            linkedHashMap = new LinkedHashMap(iB);
            for (C0574w3 c0574w3 : c0574w3Arr) {
                linkedHashMap.put(c0574w3.f24955a, c0574w3.f24956b);
            }
        } else {
            linkedHashMap = null;
        }
        int i = c0549v3.f24868b;
        if (i == 0) {
            t72 = T7.f23004b;
        } else if (i == 1) {
            t72 = T7.f23005c;
        } else if (i == 2) {
            t72 = T7.f23006d;
        } else if (i != 3) {
            t72 = T7.f23004b;
        } else {
            t72 = T7.f23007e;
        }
        return new C0474s3(linkedHashMap, t72);
    }
}
