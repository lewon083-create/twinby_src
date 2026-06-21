package k3;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l implements k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h f26867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h f26868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h f26869d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public h f26870e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ByteBuffer f26871f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ByteBuffer f26872g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f26873h;

    public l() {
        ByteBuffer byteBuffer = k.f26866a;
        this.f26871f = byteBuffer;
        this.f26872g = byteBuffer;
        h hVar = h.f26859e;
        this.f26869d = hVar;
        this.f26870e = hVar;
        this.f26867b = hVar;
        this.f26868c = hVar;
    }

    @Override // k3.k
    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.f26872g;
        this.f26872g = k.f26866a;
        return byteBuffer;
    }

    @Override // k3.k
    public final void c() {
        this.f26873h = true;
        h();
    }

    @Override // k3.k
    public final h e(h hVar) {
        this.f26869d = hVar;
        this.f26870e = f(hVar);
        return isActive() ? this.f26870e : h.f26859e;
    }

    public abstract h f(h hVar);

    @Override // k3.k
    public final void flush() {
        this.f26872g = k.f26866a;
        this.f26873h = false;
        this.f26867b = this.f26869d;
        this.f26868c = this.f26870e;
        g();
    }

    @Override // k3.k
    public boolean isActive() {
        return this.f26870e != h.f26859e;
    }

    @Override // k3.k
    public boolean isEnded() {
        return this.f26873h && this.f26872g == k.f26866a;
    }

    public final ByteBuffer j(int i) {
        if (this.f26871f.capacity() < i) {
            this.f26871f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f26871f.clear();
        }
        ByteBuffer byteBuffer = this.f26871f;
        this.f26872g = byteBuffer;
        return byteBuffer;
    }

    @Override // k3.k
    public final void reset() {
        ByteBuffer byteBuffer = k.f26866a;
        this.f26872g = byteBuffer;
        this.f26873h = false;
        this.f26871f = byteBuffer;
        h hVar = h.f26859e;
        this.f26869d = hVar;
        this.f26870e = hVar;
        this.f26867b = hVar;
        this.f26868c = hVar;
        i();
    }

    public void g() {
    }

    public void h() {
    }

    public void i() {
    }
}
