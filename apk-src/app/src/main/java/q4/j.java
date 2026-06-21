package q4;

import java.io.EOFException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f31750a = new byte[4096];

    @Override // q4.a0
    public final void e(m3.p pVar, int i, int i10) {
        pVar.N(i);
    }

    @Override // q4.a0
    public final int g(j3.h hVar, int i, boolean z5) throws EOFException {
        byte[] bArr = this.f31750a;
        int i10 = hVar.read(bArr, 0, Math.min(bArr.length, i));
        if (i10 != -1) {
            return i10;
        }
        if (z5) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // q4.a0
    public final void a(j3.o oVar) {
    }

    @Override // q4.a0
    public final void f(long j10, int i, int i10, int i11, z zVar) {
    }
}
