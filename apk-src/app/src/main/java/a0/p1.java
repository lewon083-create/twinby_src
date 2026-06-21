package a0;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class p1 extends o0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q1[] f196e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f197f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f198g;

    public p1(r1 r1Var, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i, int i10) {
        super(r1Var);
        this.f196e = new q1[]{new o1(i, byteBuffer), new o1(byteBuffer2, i), new o1(byteBuffer3, i)};
        this.f197f = i;
        this.f198g = i10;
    }

    @Override // a0.o0, a0.r1
    public final q1[] f() {
        return this.f196e;
    }

    @Override // a0.o0, a0.r1
    public final int getHeight() {
        return this.f198g;
    }

    @Override // a0.o0, a0.r1
    public final int getWidth() {
        return this.f197f;
    }
}
