package yads;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class iz2 extends dz2 implements v43 {
    public iz2() {
        super(new z43[2], new a53[2]);
        g();
    }

    public abstract u43 a(byte[] bArr, int i, boolean z5);

    @Override // yads.v43
    public final void a(long j10) {
    }

    @Override // yads.dz2
    public final z43 c() {
        return new z43();
    }

    @Override // yads.dz2
    public final hz2 d() {
        return new hz2(this);
    }

    @Override // yads.dz2
    public final w43 a(sa0 sa0Var, ua0 ua0Var, boolean z5) {
        z43 z43Var = (z43) sa0Var;
        a53 a53Var = (a53) ua0Var;
        try {
            ByteBuffer byteBuffer = z43Var.f42864d;
            byteBuffer.getClass();
            u43 u43VarA = a(byteBuffer.array(), byteBuffer.limit(), z5);
            long j10 = z43Var.f42866f;
            long j11 = z43Var.f45249j;
            a53Var.f43616c = j10;
            a53Var.f36636d = u43VarA;
            if (j11 != Long.MAX_VALUE) {
                j10 = j11;
            }
            a53Var.f36637e = j10;
            a53Var.f43049b &= Integer.MAX_VALUE;
            return null;
        } catch (w43 e3) {
            return e3;
        }
    }
}
