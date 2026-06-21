package yads;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class qb2 extends IOException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f42242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f42243c;

    public qb2(String str, Exception exc, boolean z5, int i) {
        super(str, exc);
        this.f42242b = z5;
        this.f42243c = i;
    }

    public static qb2 a(String str) {
        return new qb2(str, null, true, 1);
    }

    public static qb2 b(String str) {
        return new qb2(str, null, false, 1);
    }
}
