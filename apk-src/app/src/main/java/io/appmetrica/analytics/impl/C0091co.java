package io.appmetrica.analytics.impl;

import android.util.SparseArray;
import java.util.HashMap;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.co, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0091co {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f23642c = {0, 1, 2, 3};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray f23643a = new SparseArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23644b = 0;

    public C0091co(int[] iArr) {
        for (int i : iArr) {
            this.f23643a.put(i, new HashMap());
        }
    }
}
