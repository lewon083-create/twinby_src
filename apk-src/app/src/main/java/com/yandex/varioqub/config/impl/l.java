package com.yandex.varioqub.config.impl;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicLong[] f15387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f15388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f15389c;

    static {
        int length = k.a(3).length;
        AtomicLong[] atomicLongArr = new AtomicLong[length];
        for (int i = 0; i < length; i++) {
            atomicLongArr[i] = new AtomicLong();
        }
        f15387a = atomicLongArr;
        f15388b = new LinkedHashMap();
        f15389c = new Object();
    }

    public static void a(int i) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        AtomicLong[] atomicLongArr = f15387a;
        if (i == 0) {
            throw null;
        }
        long andSet = atomicLongArr[i - 1].getAndSet(0L);
        if (andSet > 0) {
            long j10 = jCurrentTimeMillis - andSet;
            String str = "Finish tracking metric " + j.a(i) + " with elapsed time - " + j10;
            if (C.f15354a) {
                Log.d("Varioqub/PerformanceMeter", str);
            }
            synchronized (f15389c) {
                f15388b.put(j.a(i), Long.valueOf(j10));
                Unit unit = Unit.f27471a;
            }
        }
    }

    public static void b(int i) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        AtomicLong[] atomicLongArr = f15387a;
        if (i == 0) {
            throw null;
        }
        atomicLongArr[i - 1].set(jCurrentTimeMillis);
        String strConcat = "Start tracking metric - ".concat(j.a(i));
        if (C.f15354a) {
            Log.d("Varioqub/PerformanceMeter", strConcat);
        }
    }
}
