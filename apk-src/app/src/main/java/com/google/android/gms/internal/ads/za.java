package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class za {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f12923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f12925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f12926d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f12927e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f12928f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f12929g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f12930h;

    public za(String str, String str2, long j10, long j11, long j12, long j13, List list) {
        this.f12924b = str;
        this.f12925c = true == "".equals(str2) ? null : str2;
        this.f12926d = j10;
        this.f12927e = j11;
        this.f12928f = j12;
        this.f12929g = j13;
        this.f12930h = list;
    }

    public static za a(ab abVar) throws IOException {
        if (cb.g(abVar) != 538247942) {
            throw new IOException();
        }
        String strK = cb.k(abVar);
        String strK2 = cb.k(abVar);
        long jI = cb.i(abVar);
        long jI2 = cb.i(abVar);
        long jI3 = cb.i(abVar);
        long jI4 = cb.i(abVar);
        int iG = cb.g(abVar);
        if (iG < 0) {
            throw new IOException(l7.o.j(iG, "readHeaderList size=", new StringBuilder(String.valueOf(iG).length() + 20)));
        }
        List arrayList = iG == 0 ? Collections.EMPTY_LIST : new ArrayList();
        for (int i = 0; i < iG; i++) {
            arrayList.add(new ka(cb.k(abVar).intern(), cb.k(abVar).intern()));
        }
        return new za(strK, strK2, jI, jI2, jI3, jI4, arrayList);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.List] */
    public za(String str, ga gaVar) {
        String str2 = gaVar.f5720b;
        long j10 = gaVar.f5721c;
        long j11 = gaVar.f5722d;
        long j12 = gaVar.f5723e;
        long j13 = gaVar.f5724f;
        ?? arrayList = gaVar.f5726h;
        if (arrayList == 0) {
            Map map = gaVar.f5725g;
            arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(new ka((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        this(str, str2, j10, j11, j12, j13, arrayList);
    }
}
