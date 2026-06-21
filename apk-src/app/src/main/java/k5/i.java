package k5;

import q4.x;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f26948c = new i(true);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i f26949d = new i(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f26950b;

    public i(boolean z5) {
        this.f26950b = z5;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IncorrectFragmentation{expected=");
        sb2.append(!this.f26950b);
        sb2.append("}");
        return sb2.toString();
    }
}
