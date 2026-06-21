package io.appmetrica.analytics.impl;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Cl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f22233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f22234d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f22235e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Boolean f22236f;

    public Cl(String str, String str2, Integer num, Integer num2, String str3, Boolean bool) {
        this.f22231a = str;
        this.f22232b = str2;
        this.f22233c = num;
        this.f22234d = num2;
        this.f22235e = str3;
        this.f22236f = bool;
    }

    public Cl(StackTraceElement stackTraceElement) {
        this(stackTraceElement.getClassName(), stackTraceElement.getFileName(), Integer.valueOf(stackTraceElement.getLineNumber()), null, stackTraceElement.getMethodName(), Boolean.valueOf(stackTraceElement.isNativeMethod()));
    }
}
