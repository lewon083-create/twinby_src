package yads;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class zx extends b0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f45577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f45578c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cy f45579d;

    public zx(cy cyVar, int i) {
        this.f45579d = cyVar;
        this.f45577b = cyVar.b(i);
        this.f45578c = i;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f45577b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        Map mapA = this.f45579d.a();
        if (mapA != null) {
            return mapA.get(this.f45577b);
        }
        int i = this.f45578c;
        if (i == -1 || i >= this.f45579d.size() || !n92.a(this.f45577b, this.f45579d.b(this.f45578c))) {
            this.f45578c = this.f45579d.a(this.f45577b);
        }
        int i10 = this.f45578c;
        if (i10 == -1) {
            return null;
        }
        return this.f45579d.c(i10);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map mapA = this.f45579d.a();
        if (mapA != null) {
            return mapA.put(this.f45577b, obj);
        }
        int i = this.f45578c;
        if (i == -1 || i >= this.f45579d.size() || !n92.a(this.f45577b, this.f45579d.b(this.f45578c))) {
            this.f45578c = this.f45579d.a(this.f45577b);
        }
        int i10 = this.f45578c;
        if (i10 == -1) {
            this.f45579d.put(this.f45577b, obj);
            return null;
        }
        Object objC = this.f45579d.c(i10);
        this.f45579d.a(this.f45578c, obj);
        return objC;
    }
}
