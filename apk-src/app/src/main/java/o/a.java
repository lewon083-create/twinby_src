package o;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f29582f = new HashMap();

    @Override // o.f
    public final c a(Object obj) {
        return (c) this.f29582f.get(obj);
    }

    @Override // o.f
    public final Object c(Object obj) {
        Object objC = super.c(obj);
        this.f29582f.remove(obj);
        return objC;
    }
}
