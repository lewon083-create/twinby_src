package f4;

import com.google.android.gms.internal.ads.om1;
import hl.l;
import j3.d0;
import java.util.Locale;
import m3.p;
import m3.z;
import n3.n;
import q4.a0;
import q4.m;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f16613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f16614d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e4.k f16615e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a0 f16616f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f16617g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f16618h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f16619j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f16620k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f16621l;

    public e(e4.k kVar, int i) {
        this.f16612b = i;
        switch (i) {
            case 1:
                this.f16613c = new p();
                this.f16614d = new p(n.f29087a);
                this.f16615e = kVar;
                this.f16618h = -9223372036854775807L;
                this.i = -1;
                break;
            default:
                this.f16614d = new p(n.f29087a);
                this.f16615e = kVar;
                this.f16613c = new p();
                this.f16618h = -9223372036854775807L;
                this.i = -1;
                break;
        }
    }

    @Override // f4.i
    public final void a(long j10) {
        int i = this.f16612b;
    }

    @Override // f4.i
    public final void b(p pVar, long j10, int i, boolean z5) throws d0 {
        int i10;
        int i11;
        int i12 = this.f16612b;
        p pVar2 = this.f16613c;
        switch (i12) {
            case 0:
                try {
                    int i13 = pVar.f28589a[0] & 31;
                    this.f16616f.getClass();
                    if (i13 != 28) {
                        this.f16621l = false;
                        this.f16619j = 0;
                    }
                    if (i13 > 0 && i13 < 24) {
                        int iA = pVar.a();
                        this.f16619j = f() + this.f16619j;
                        this.f16616f.d(iA, pVar);
                        this.f16619j += iA;
                        this.f16617g = (pVar.f28589a[0] & 31) == 5 ? 1 : 0;
                    } else if (i13 == 24) {
                        pVar.z();
                        while (pVar.a() > 4) {
                            int iG = pVar.G();
                            this.f16619j = f() + this.f16619j;
                            this.f16616f.d(iG, pVar);
                            this.f16619j += iG;
                        }
                        this.f16617g = 0;
                    } else {
                        if (i13 != 28) {
                            throw d0.b(String.format("RTP H264 packetization mode [%d] not supported.", Integer.valueOf(i13)), null);
                        }
                        byte[] bArr = pVar.f28589a;
                        byte b2 = bArr[0];
                        byte b10 = bArr[1];
                        int i14 = (b2 & 224) | (b10 & 31);
                        boolean z10 = (b10 & 128) > 0;
                        boolean z11 = (b10 & 64) > 0;
                        if (z10) {
                            i11 = 0;
                            this.f16621l = false;
                            this.f16619j = 0;
                            this.f16619j = f();
                            byte[] bArr2 = pVar.f28589a;
                            i10 = 1;
                            bArr2[1] = (byte) i14;
                            pVar2.getClass();
                            pVar2.K(bArr2.length, bArr2);
                            pVar2.M(1);
                        } else {
                            i10 = 1;
                            i11 = 0;
                            if (!this.f16621l) {
                                int iA2 = e4.h.a(this.i);
                                if (i != iA2) {
                                    this.f16621l = true;
                                    String str = z.f28608a;
                                    Locale locale = Locale.US;
                                    m3.b.s("RtpH264Reader", om1.j("Received RTP packet with unexpected sequence number. Expected: ", iA2, "; received: ", i, ". Dropping packet."));
                                } else {
                                    byte[] bArr3 = pVar.f28589a;
                                    pVar2.getClass();
                                    pVar2.K(bArr3.length, bArr3);
                                    pVar2.M(2);
                                }
                            }
                        }
                        int iA3 = pVar2.a();
                        this.f16616f.d(iA3, pVar2);
                        this.f16619j += iA3;
                        if (z11) {
                            if ((i14 & 31) == 5) {
                                i11 = i10;
                            }
                            this.f16617g = i11;
                        }
                    }
                    if (this.f16618h == -9223372036854775807L) {
                        this.f16618h = j10;
                    }
                    if (z5 && !this.f16621l) {
                        this.f16616f.f(l.t(this.f16620k, 90000, j10, this.f16618h), this.f16617g, this.f16619j, 0, null);
                    }
                    this.i = i;
                    return;
                } catch (IndexOutOfBoundsException e3) {
                    throw d0.b(null, e3);
                }
            default:
                byte[] bArr4 = pVar.f28589a;
                if (bArr4.length == 0) {
                    throw d0.b("Empty RTP data packet.", null);
                }
                int i15 = (bArr4[0] >> 1) & 63;
                this.f16616f.getClass();
                if (i15 != 49) {
                    this.f16621l = false;
                    this.f16619j = 0;
                }
                if (i15 >= 0 && i15 < 48) {
                    int iA4 = pVar.a();
                    this.f16619j = g() + this.f16619j;
                    this.f16616f.d(iA4, pVar);
                    this.f16619j += iA4;
                    int i16 = (pVar.f28589a[0] >> 1) & 63;
                    this.f16617g = (i16 == 19 || i16 == 20) ? 1 : 0;
                } else if (i15 == 48) {
                    pVar.M(2);
                    int i17 = 0;
                    while (pVar.a() > 2) {
                        int iG2 = pVar.G();
                        int i18 = (pVar.f28589a[pVar.f28590b] & 126) >> 1;
                        if (pVar.a() < iG2) {
                            throw d0.b("Malformed Aggregation Packet. NAL unit size exceeds packet size.", null);
                        }
                        this.f16619j = g() + this.f16619j;
                        this.f16616f.d(iG2, pVar);
                        this.f16619j += iG2;
                        this.f16617g |= (i18 == 19 || i18 == 20) ? 1 : 0;
                        i17++;
                    }
                    if (pVar.a() > 0) {
                        throw d0.b("Malformed Aggregation Packet. Packet size exceeds NAL unit size.", null);
                    }
                    if (i17 < 2) {
                        throw d0.b("Aggregation Packet must contain at least 2 NAL units.", null);
                    }
                } else {
                    if (i15 != 49) {
                        throw d0.b(String.format("RTP H265 payload type [%d] not supported.", Integer.valueOf(i15)), null);
                    }
                    byte[] bArr5 = pVar.f28589a;
                    if (bArr5.length < 3) {
                        throw d0.b("Malformed FU header.", null);
                    }
                    int i19 = bArr5[1] & 7;
                    byte b11 = bArr5[2];
                    int i20 = b11 & 63;
                    boolean z12 = (b11 & 128) > 0;
                    boolean z13 = (b11 & 64) > 0;
                    if (z12) {
                        this.f16621l = false;
                        this.f16619j = 0;
                        this.f16619j = g();
                        byte[] bArr6 = (byte[]) pVar.f28589a.clone();
                        pVar2.getClass();
                        pVar2.K(bArr6.length, bArr6);
                        byte[] bArr7 = pVar2.f28589a;
                        bArr7[1] = (byte) ((i20 << 1) & 127);
                        bArr7[2] = (byte) i19;
                        pVar2.M(1);
                    } else if (!this.f16621l) {
                        int i21 = (this.i + 1) % 65535;
                        if (i != i21) {
                            this.f16621l = true;
                            String str2 = z.f28608a;
                            Locale locale2 = Locale.US;
                            m3.b.s("RtpH265Reader", om1.j("Received RTP packet with unexpected sequence number. Expected: ", i21, "; received: ", i, ". Dropping packet."));
                        } else {
                            pVar2.getClass();
                            pVar2.K(bArr5.length, bArr5);
                            pVar2.M(3);
                        }
                    }
                    int iA5 = pVar2.a();
                    this.f16616f.d(iA5, pVar2);
                    this.f16619j += iA5;
                    if (z13) {
                        this.f16617g = (i20 == 19 || i20 == 20) ? 1 : 0;
                    }
                }
                if (this.f16618h == -9223372036854775807L) {
                    this.f16618h = j10;
                }
                if (z5 && !this.f16621l) {
                    this.f16616f.f(l.t(this.f16620k, 90000, j10, this.f16618h), this.f16617g, this.f16619j, 0, null);
                }
                this.i = i;
                return;
        }
    }

    @Override // f4.i
    public final void c(m mVar, int i) {
        int i10 = this.f16612b;
        e4.k kVar = this.f16615e;
        switch (i10) {
            case 0:
                a0 a0VarP = mVar.P(i, 2);
                this.f16616f = a0VarP;
                String str = z.f28608a;
                a0VarP.a(kVar.f16140c);
                break;
            default:
                a0 a0VarP2 = mVar.P(i, 2);
                this.f16616f = a0VarP2;
                a0VarP2.a(kVar.f16140c);
                break;
        }
    }

    public int f() {
        p pVar = this.f16614d;
        pVar.M(0);
        int iA = pVar.a();
        a0 a0Var = this.f16616f;
        a0Var.getClass();
        a0Var.d(iA, pVar);
        return iA;
    }

    public int g() {
        p pVar = this.f16614d;
        pVar.M(0);
        int iA = pVar.a();
        a0 a0Var = this.f16616f;
        a0Var.getClass();
        a0Var.d(iA, pVar);
        return iA;
    }

    @Override // f4.i
    public final void seek(long j10, long j11) {
        switch (this.f16612b) {
            case 0:
                this.f16618h = j10;
                this.f16619j = 0;
                this.f16620k = j11;
                break;
            default:
                this.f16618h = j10;
                this.f16619j = 0;
                this.f16620k = j11;
                break;
        }
    }

    private final void d(long j10) {
    }

    private final void e(long j10) {
    }
}
