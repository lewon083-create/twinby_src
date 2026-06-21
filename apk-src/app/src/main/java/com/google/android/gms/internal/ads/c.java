package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pi f3974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f3975b;

    public c(pi piVar, int[] iArr) {
        if (iArr.length == 0) {
            rs.H("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.f3974a = piVar;
        this.f3975b = iArr;
    }
}
