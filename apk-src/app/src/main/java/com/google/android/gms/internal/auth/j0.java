package com.google.android.gms.internal.auth;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i0 f13245a = new i0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i0 f13246b;

    static {
        i0 i0Var = null;
        try {
            i0Var = (i0) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f13246b = i0Var;
    }
}
