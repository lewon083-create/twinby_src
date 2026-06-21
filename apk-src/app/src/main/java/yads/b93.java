package yads;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class b93 extends Cdo {
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f36969j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f36970k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f36971l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte[] f36972m = lb3.f40471f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f36973n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f36974o;

    @Override // yads.Cdo, yads.bl
    public final ByteBuffer a() {
        int i;
        if (super.isEnded() && (i = this.f36973n) > 0) {
            a(i).put(this.f36972m, 0, this.f36973n).flip();
            this.f36973n = 0;
        }
        ByteBuffer byteBuffer = this.f37856g;
        this.f37856g = bl.f37087a;
        return byteBuffer;
    }

    @Override // yads.Cdo
    public final zk b(zk zkVar) throws al {
        if (zkVar.f45446c != 2) {
            throw new al(zkVar);
        }
        this.f36970k = true;
        return (this.i == 0 && this.f36969j == 0) ? zk.f45443e : zkVar;
    }

    @Override // yads.Cdo
    public final void c() {
        if (this.f36970k) {
            this.f36970k = false;
            int i = this.f36969j;
            int i10 = this.f37851b.f45447d;
            this.f36972m = new byte[i * i10];
            this.f36971l = this.i * i10;
        }
        this.f36973n = 0;
    }

    @Override // yads.Cdo
    public final void d() {
        if (this.f36970k) {
            int i = this.f36973n;
            if (i > 0) {
                this.f36974o += (long) (i / this.f37851b.f45447d);
            }
            this.f36973n = 0;
        }
    }

    @Override // yads.Cdo
    public final void e() {
        this.f36972m = lb3.f40471f;
    }

    @Override // yads.Cdo, yads.bl
    public final boolean isEnded() {
        return super.isEnded() && this.f36973n == 0;
    }

    @Override // yads.bl
    public final void a(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        if (i == 0) {
            return;
        }
        int iMin = Math.min(i, this.f36971l);
        this.f36974o += (long) (iMin / this.f37851b.f45447d);
        this.f36971l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f36971l > 0) {
            return;
        }
        int i10 = i - iMin;
        int length = (this.f36973n + i10) - this.f36972m.length;
        ByteBuffer byteBufferA = a(length);
        int i11 = this.f36973n;
        int i12 = lb3.f40466a;
        int iMax = Math.max(0, Math.min(length, i11));
        byteBufferA.put(this.f36972m, 0, iMax);
        int iMax2 = Math.max(0, Math.min(length - iMax, i10));
        byteBuffer.limit(byteBuffer.position() + iMax2);
        byteBufferA.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i13 = i10 - iMax2;
        int i14 = this.f36973n - iMax;
        this.f36973n = i14;
        byte[] bArr = this.f36972m;
        System.arraycopy(bArr, iMax, bArr, 0, i14);
        byteBuffer.get(this.f36972m, this.f36973n, i13);
        this.f36973n += i13;
        byteBufferA.flip();
    }
}
