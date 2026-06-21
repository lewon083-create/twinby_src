package yads;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class wy2 extends Cdo {
    public final long i = 150000;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f44520j = 20000;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final short f44521k = 1024;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f44522l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f44523m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public byte[] f44524n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public byte[] f44525o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f44526p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f44527q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f44528r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f44529s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f44530t;

    public wy2(int i) {
        byte[] bArr = lb3.f40471f;
        this.f44524n = bArr;
        this.f44525o = bArr;
    }

    @Override // yads.bl
    public final void a(ByteBuffer byteBuffer) {
        int iLimit;
        int iLimit2;
        int iPosition;
        while (byteBuffer.hasRemaining() && !this.f37856g.hasRemaining()) {
            int i = this.f44526p;
            if (i == 0) {
                int iLimit3 = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit3, byteBuffer.position() + this.f44524n.length));
                int iLimit4 = byteBuffer.limit() - 2;
                while (true) {
                    if (iLimit4 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    } else {
                        if (Math.abs((int) byteBuffer.getShort(iLimit4)) > this.f44521k) {
                            int i10 = this.f44522l;
                            iPosition = ((iLimit4 / i10) * i10) + i10;
                            break;
                        }
                        iLimit4 -= 2;
                    }
                }
                if (iPosition == byteBuffer.position()) {
                    this.f44526p = 1;
                } else {
                    byteBuffer.limit(iPosition);
                    int iRemaining = byteBuffer.remaining();
                    a(iRemaining).put(byteBuffer).flip();
                    if (iRemaining > 0) {
                        this.f44529s = true;
                    }
                }
                byteBuffer.limit(iLimit3);
            } else if (i == 1) {
                int iLimit5 = byteBuffer.limit();
                int iPosition2 = byteBuffer.position();
                while (true) {
                    if (iPosition2 >= byteBuffer.limit()) {
                        iLimit2 = byteBuffer.limit();
                        break;
                    } else {
                        if (Math.abs((int) byteBuffer.getShort(iPosition2)) > this.f44521k) {
                            int i11 = this.f44522l;
                            iLimit2 = (iPosition2 / i11) * i11;
                            break;
                        }
                        iPosition2 += 2;
                    }
                }
                int iPosition3 = iLimit2 - byteBuffer.position();
                byte[] bArr = this.f44524n;
                int length = bArr.length;
                int i12 = this.f44527q;
                int i13 = length - i12;
                if (iLimit2 >= iLimit5 || iPosition3 >= i13) {
                    int iMin = Math.min(iPosition3, i13);
                    byteBuffer.limit(byteBuffer.position() + iMin);
                    byteBuffer.get(this.f44524n, this.f44527q, iMin);
                    int i14 = this.f44527q + iMin;
                    this.f44527q = i14;
                    byte[] bArr2 = this.f44524n;
                    if (i14 == bArr2.length) {
                        if (this.f44529s) {
                            int i15 = this.f44528r;
                            a(i15).put(bArr2, 0, i15).flip();
                            if (i15 > 0) {
                                this.f44529s = true;
                            }
                            this.f44530t += (long) ((this.f44527q - (this.f44528r * 2)) / this.f44522l);
                        } else {
                            this.f44530t += (long) ((i14 - this.f44528r) / this.f44522l);
                        }
                        byte[] bArr3 = this.f44524n;
                        int i16 = this.f44527q;
                        int iMin2 = Math.min(byteBuffer.remaining(), this.f44528r);
                        int i17 = this.f44528r - iMin2;
                        System.arraycopy(bArr3, i16 - i17, this.f44525o, 0, i17);
                        byteBuffer.position(byteBuffer.limit() - iMin2);
                        byteBuffer.get(this.f44525o, i17, iMin2);
                        this.f44527q = 0;
                        this.f44526p = 2;
                    }
                    byteBuffer.limit(iLimit5);
                } else {
                    a(i12).put(bArr, 0, i12).flip();
                    if (i12 > 0) {
                        this.f44529s = true;
                    }
                    this.f44527q = 0;
                    this.f44526p = 0;
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException();
                }
                int iLimit6 = byteBuffer.limit();
                int iPosition4 = byteBuffer.position();
                while (true) {
                    if (iPosition4 >= byteBuffer.limit()) {
                        iLimit = byteBuffer.limit();
                        break;
                    } else {
                        if (Math.abs((int) byteBuffer.getShort(iPosition4)) > this.f44521k) {
                            int i18 = this.f44522l;
                            iLimit = (iPosition4 / i18) * i18;
                            break;
                        }
                        iPosition4 += 2;
                    }
                }
                byteBuffer.limit(iLimit);
                this.f44530t += (long) (byteBuffer.remaining() / this.f44522l);
                byte[] bArr4 = this.f44525o;
                int i19 = this.f44528r;
                int iMin3 = Math.min(byteBuffer.remaining(), this.f44528r);
                int i20 = this.f44528r - iMin3;
                System.arraycopy(bArr4, i19 - i20, this.f44525o, 0, i20);
                byteBuffer.position(byteBuffer.limit() - iMin3);
                byteBuffer.get(this.f44525o, i20, iMin3);
                if (iLimit < iLimit6) {
                    byte[] bArr5 = this.f44525o;
                    int i21 = this.f44528r;
                    a(i21).put(bArr5, 0, i21).flip();
                    if (i21 > 0) {
                        this.f44529s = true;
                    }
                    this.f44526p = 0;
                    byteBuffer.limit(iLimit6);
                }
            }
        }
    }

    @Override // yads.Cdo
    public final zk b(zk zkVar) throws al {
        if (zkVar.f45446c == 2) {
            return this.f44523m ? zkVar : zk.f45443e;
        }
        throw new al(zkVar);
    }

    @Override // yads.Cdo
    public final void c() {
        if (this.f44523m) {
            zk zkVar = this.f37851b;
            int i = zkVar.f45447d;
            this.f44522l = i;
            long j10 = this.i;
            long j11 = zkVar.f45444a;
            int i10 = ((int) ((j10 * j11) / 1000000)) * i;
            if (this.f44524n.length != i10) {
                this.f44524n = new byte[i10];
            }
            int i11 = ((int) ((this.f44520j * j11) / 1000000)) * i;
            this.f44528r = i11;
            if (this.f44525o.length != i11) {
                this.f44525o = new byte[i11];
            }
        }
        this.f44526p = 0;
        this.f44530t = 0L;
        this.f44527q = 0;
        this.f44529s = false;
    }

    @Override // yads.Cdo
    public final void d() {
        int i = this.f44527q;
        if (i > 0) {
            a(i).put(this.f44524n, 0, i).flip();
            if (i > 0) {
                this.f44529s = true;
            }
        }
        if (this.f44529s) {
            return;
        }
        this.f44530t += (long) (this.f44528r / this.f44522l);
    }

    @Override // yads.Cdo
    public final void e() {
        this.f44523m = false;
        this.f44528r = 0;
        byte[] bArr = lb3.f40471f;
        this.f44524n = bArr;
        this.f44525o = bArr;
    }

    @Override // yads.Cdo, yads.bl
    public final boolean isActive() {
        return this.f44523m;
    }
}
