package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ul1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ul1 f10978d = new ul1("", "", false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f10981c;

    static {
        new ul1("\n", "  ", true);
    }

    public ul1(String str, String str2, boolean z5) {
        if (!str.matches("[\r\n]*")) {
            throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
        }
        if (!str2.matches("[ \t]*")) {
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        this.f10979a = str;
        this.f10980b = str2;
        this.f10981c = z5;
    }
}
