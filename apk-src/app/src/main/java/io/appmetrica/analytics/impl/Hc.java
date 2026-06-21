package io.appmetrica.analytics.impl;

import android.util.SparseArray;
import io.sentry.protocol.DebugImage;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Hc {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final SparseArray f22417c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22419b;

    static {
        SparseArray sparseArray = new SparseArray();
        f22417c = sparseArray;
        EnumC0078cb enumC0078cb = EnumC0078cb.EVENT_TYPE_UNDEFINED;
        sparseArray.put(5891, new Hc(DebugImage.JVM, "binder"));
        sparseArray.put(5890, new Hc(DebugImage.JVM, "file"));
        sparseArray.put(5889, new Hc(DebugImage.JVM, "file"));
        sparseArray.put(5897, new Hc("jni_native", "file"));
        sparseArray.put(5898, new Hc("jni_native", "file"));
    }

    public Hc(String str, String str2) {
        this.f22418a = str;
        this.f22419b = str2;
    }
}
