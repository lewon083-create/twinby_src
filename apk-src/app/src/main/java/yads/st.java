package yads;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class st extends Cdo {
    public int[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f43074j;

    @Override // yads.bl
    public final void a(ByteBuffer byteBuffer) {
        int[] iArr = this.f43074j;
        iArr.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferA = a(((iLimit - iPosition) / this.f37851b.f45447d) * this.f37852c.f45447d);
        while (iPosition < iLimit) {
            for (int i : iArr) {
                byteBufferA.putShort(byteBuffer.getShort((i * 2) + iPosition));
            }
            iPosition += this.f37851b.f45447d;
        }
        byteBuffer.position(iLimit);
        byteBufferA.flip();
    }

    @Override // yads.Cdo
    public final zk b(zk zkVar) throws al {
        int[] iArr = this.i;
        if (iArr == null) {
            return zk.f45443e;
        }
        if (zkVar.f45446c != 2) {
            throw new al(zkVar);
        }
        boolean z5 = zkVar.f45445b != iArr.length;
        int i = 0;
        while (i < iArr.length) {
            int i10 = iArr[i];
            if (i10 >= zkVar.f45445b) {
                throw new al(zkVar);
            }
            z5 |= i10 != i;
            i++;
        }
        return z5 ? new zk(zkVar.f45444a, iArr.length, 2) : zk.f45443e;
    }

    @Override // yads.Cdo
    public final void c() {
        this.f43074j = this.i;
    }

    @Override // yads.Cdo
    public final void e() {
        this.f43074j = null;
        this.i = null;
    }
}
