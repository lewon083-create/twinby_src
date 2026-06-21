package yads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: yads.do, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class Cdo implements bl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public zk f37851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public zk f37852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public zk f37853d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public zk f37854e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ByteBuffer f37855f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ByteBuffer f37856g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f37857h;

    public Cdo() {
        ByteBuffer byteBuffer = bl.f37087a;
        this.f37855f = byteBuffer;
        this.f37856g = byteBuffer;
        zk zkVar = zk.f45443e;
        this.f37853d = zkVar;
        this.f37854e = zkVar;
        this.f37851b = zkVar;
        this.f37852c = zkVar;
    }

    @Override // yads.bl
    public final zk a(zk zkVar) {
        this.f37853d = zkVar;
        this.f37854e = b(zkVar);
        return isActive() ? this.f37854e : zk.f45443e;
    }

    public abstract zk b(zk zkVar);

    @Override // yads.bl
    public final void b() {
        this.f37857h = true;
        d();
    }

    @Override // yads.bl
    public final void flush() {
        this.f37856g = bl.f37087a;
        this.f37857h = false;
        this.f37851b = this.f37853d;
        this.f37852c = this.f37854e;
        c();
    }

    @Override // yads.bl
    public boolean isActive() {
        return this.f37854e != zk.f45443e;
    }

    @Override // yads.bl
    public boolean isEnded() {
        return this.f37857h && this.f37856g == bl.f37087a;
    }

    @Override // yads.bl
    public final void reset() {
        flush();
        this.f37855f = bl.f37087a;
        zk zkVar = zk.f45443e;
        this.f37853d = zkVar;
        this.f37854e = zkVar;
        this.f37851b = zkVar;
        this.f37852c = zkVar;
        e();
    }

    @Override // yads.bl
    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.f37856g;
        this.f37856g = bl.f37087a;
        return byteBuffer;
    }

    public final ByteBuffer a(int i) {
        if (this.f37855f.capacity() < i) {
            this.f37855f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f37855f.clear();
        }
        ByteBuffer byteBuffer = this.f37855f;
        this.f37856g = byteBuffer;
        return byteBuffer;
    }

    public void c() {
    }

    public void d() {
    }

    public void e() {
    }
}
