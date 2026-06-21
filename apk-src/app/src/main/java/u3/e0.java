package u3;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends k3.l {
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f34100j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f34101k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f34102l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte[] f34103m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f34104n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f34105o;

    @Override // k3.l, k3.k
    public final ByteBuffer a() {
        int i;
        if (super.isEnded() && (i = this.f34104n) > 0) {
            j(i).put(this.f34103m, 0, this.f34104n).flip();
            this.f34104n = 0;
        }
        return super.a();
    }

    @Override // k3.k
    public final void b(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        if (i == 0) {
            return;
        }
        int iMin = Math.min(i, this.f34102l);
        this.f34105o += (long) (iMin / this.f26867b.f26863d);
        this.f34102l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f34102l > 0) {
            return;
        }
        int i10 = i - iMin;
        int length = (this.f34104n + i10) - this.f34103m.length;
        ByteBuffer byteBufferJ = j(length);
        int iJ = m3.z.j(length, 0, this.f34104n);
        byteBufferJ.put(this.f34103m, 0, iJ);
        int iJ2 = m3.z.j(length - iJ, 0, i10);
        byteBuffer.limit(byteBuffer.position() + iJ2);
        byteBufferJ.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i11 = i10 - iJ2;
        int i12 = this.f34104n - iJ;
        this.f34104n = i12;
        byte[] bArr = this.f34103m;
        System.arraycopy(bArr, iJ, bArr, 0, i12);
        byteBuffer.get(this.f34103m, this.f34104n, i11);
        this.f34104n += i11;
        byteBufferJ.flip();
    }

    @Override // k3.k
    public final long d(long j10) {
        return Math.max(0L, j10 - m3.z.S(this.f26867b.f26860a, this.f34100j + this.i));
    }

    @Override // k3.l
    public final k3.h f(k3.h hVar) throws k3.j {
        if (!m3.z.H(hVar.f26862c)) {
            throw new k3.j(hVar);
        }
        this.f34101k = true;
        return (this.i == 0 && this.f34100j == 0) ? k3.h.f26859e : hVar;
    }

    @Override // k3.l
    public final void g() {
        if (this.f34101k) {
            this.f34101k = false;
            int i = this.f34100j;
            int i10 = this.f26867b.f26863d;
            this.f34103m = new byte[i * i10];
            this.f34102l = this.i * i10;
        }
        this.f34104n = 0;
    }

    @Override // k3.l
    public final void h() {
        if (this.f34101k) {
            int i = this.f34104n;
            if (i > 0) {
                this.f34105o += (long) (i / this.f26867b.f26863d);
            }
            this.f34104n = 0;
        }
    }

    @Override // k3.l
    public final void i() {
        this.f34103m = m3.z.f28609b;
    }

    @Override // k3.l, k3.k
    public final boolean isEnded() {
        return super.isEnded() && this.f34104n == 0;
    }
}
