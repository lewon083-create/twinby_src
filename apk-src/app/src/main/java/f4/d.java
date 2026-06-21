package f4;

import com.google.android.gms.internal.ads.om1;
import com.google.android.gms.internal.measurement.h5;
import com.vk.api.sdk.exceptions.VKApiCodes;
import hl.l;
import j3.n;
import j3.o;
import java.util.Locale;
import m3.p;
import m3.z;
import q4.a0;
import q4.m;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4.k f16601c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a0 f16602d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f16603e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f16604f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f16605g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f16606h;
    public long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f16607j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f16608k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f16609l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f16610m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f16611n;

    public d(e4.k kVar, int i) {
        this.f16600b = i;
        switch (i) {
            case 1:
                this.f16601c = kVar;
                this.f16603e = -9223372036854775807L;
                this.f16606h = -1;
                this.i = -9223372036854775807L;
                this.f16604f = 0L;
                this.f16605g = -1;
                this.f16607j = -1;
                this.f16608k = -1;
                break;
            default:
                this.f16601c = kVar;
                this.f16603e = -9223372036854775807L;
                this.f16606h = -1;
                break;
        }
    }

    @Override // f4.i
    public final void a(long j10) {
        switch (this.f16600b) {
            case 0:
                h5.r(this.f16603e == -9223372036854775807L);
                this.f16603e = j10;
                break;
            default:
                h5.r(this.f16603e == -9223372036854775807L);
                this.f16603e = j10;
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // f4.i
    public final void b(p pVar, long j10, int i, boolean z5) {
        int i10;
        int i11;
        int i12 = this.f16600b;
        e4.k kVar = this.f16601c;
        switch (i12) {
            case 0:
                this.f16602d.getClass();
                int i13 = pVar.f28590b;
                int iG = pVar.G();
                byte b2 = (iG & 1024) > 0;
                if ((iG & 512) == 0 && (iG & VKApiCodes.CODE_VK_PAY_NOT_ENOUGH_MONEY) == 0 && (iG & 7) == 0) {
                    if (b2 == true) {
                        if (this.f16611n && this.f16605g > 0) {
                            a0 a0Var = this.f16602d;
                            a0Var.getClass();
                            a0Var.f(this.i, this.f16609l ? 1 : 0, this.f16605g, 0, null);
                            this.f16605g = 0;
                            this.i = -9223372036854775807L;
                            this.f16609l = false;
                            this.f16611n = false;
                        }
                        this.f16611n = true;
                        if ((pVar.j() & 252) < 128) {
                            m3.b.s("RtpH263Reader", "Picture start Code (PSC) missing, dropping packet.");
                        } else {
                            byte[] bArr = pVar.f28589a;
                            bArr[i13] = 0;
                            bArr[i13 + 1] = 0;
                            pVar.M(i13);
                        }
                    } else if (this.f16611n) {
                        int iA = e4.h.a(this.f16606h);
                        if (i < iA) {
                            String str = z.f28608a;
                            Locale locale = Locale.US;
                            m3.b.s("RtpH263Reader", om1.j("Received RTP packet with unexpected sequence number. Expected: ", iA, "; received: ", i, ". Dropping packet."));
                        }
                    } else {
                        m3.b.s("RtpH263Reader", "First payload octet of the H263 packet is not the beginning of a new H263 partition, Dropping current packet.");
                    }
                    if (this.f16605g == 0) {
                        boolean z10 = this.f16610m;
                        int i14 = pVar.f28590b;
                        if (((pVar.B() >> 10) & 63) == 32) {
                            int iJ = pVar.j();
                            int i15 = (iJ >> 1) & 1;
                            if (!z10 && i15 == 0) {
                                int i16 = (iJ >> 2) & 7;
                                if (i16 == 1) {
                                    this.f16607j = 128;
                                    this.f16608k = 96;
                                } else {
                                    int i17 = i16 - 2;
                                    this.f16607j = 176 << i17;
                                    this.f16608k = 144 << i17;
                                }
                            }
                            pVar.M(i14);
                            this.f16609l = i15 == 0;
                        } else {
                            pVar.M(i14);
                            this.f16609l = false;
                        }
                        if (!this.f16610m && this.f16609l) {
                            int i18 = this.f16607j;
                            o oVar = kVar.f16140c;
                            if (i18 != oVar.f26342u || this.f16608k != oVar.f26343v) {
                                a0 a0Var2 = this.f16602d;
                                n nVarA = oVar.a();
                                nVarA.f26299t = this.f16607j;
                                nVarA.f26300u = this.f16608k;
                                pe.a.q(nVarA, a0Var2);
                            }
                            this.f16610m = true;
                        }
                    }
                    int iA2 = pVar.a();
                    this.f16602d.d(iA2, pVar);
                    this.f16605g += iA2;
                    this.i = l.t(this.f16604f, 90000, j10, this.f16603e);
                    if (z5) {
                        a0 a0Var3 = this.f16602d;
                        a0Var3.getClass();
                        a0Var3.f(this.i, this.f16609l ? 1 : 0, this.f16605g, 0, null);
                        this.f16605g = 0;
                        this.i = -9223372036854775807L;
                        this.f16609l = false;
                        this.f16611n = false;
                    }
                    this.f16606h = i;
                } else {
                    m3.b.s("RtpH263Reader", "Dropping packet: video reduncancy coding is not supported, packet header VRC, or PLEN or PEBIT is non-zero");
                }
                break;
            default:
                this.f16602d.getClass();
                int iZ = pVar.z();
                if ((iZ & 8) == 8) {
                    if (this.f16609l && this.f16606h > 0) {
                        a0 a0Var4 = this.f16602d;
                        a0Var4.getClass();
                        a0Var4.f(this.i, this.f16611n ? 1 : 0, this.f16606h, 0, null);
                        this.f16606h = -1;
                        this.i = -9223372036854775807L;
                        this.f16609l = false;
                    }
                    this.f16609l = true;
                } else if (this.f16609l) {
                    int iA3 = e4.h.a(this.f16605g);
                    if (i < iA3) {
                        String str2 = z.f28608a;
                        Locale locale2 = Locale.US;
                        m3.b.s("RtpVp9Reader", om1.j("Received RTP packet with unexpected sequence number. Expected: ", iA3, "; received: ", i, ". Dropping packet."));
                    }
                } else {
                    m3.b.s("RtpVp9Reader", "First payload octet of the RTP packet is not the beginning of a new VP9 partition, Dropping current packet.");
                }
                if ((iZ & 128) == 0 || (pVar.z() & 128) == 0 || pVar.a() >= 1) {
                    int i19 = iZ & 16;
                    h5.g("VP9 flexible mode is not supported.", i19 == 0);
                    if ((iZ & 32) != 0) {
                        pVar.N(1);
                        if (pVar.a() >= 1) {
                            if (i19 == 0) {
                                pVar.N(1);
                            }
                        }
                    }
                    if ((iZ & 2) != 0) {
                        int iZ2 = pVar.z();
                        int i20 = (iZ2 >> 5) & 7;
                        if ((iZ2 & 16) != 0) {
                            int i21 = i20 + 1;
                            if (pVar.a() >= i21 * 4) {
                                for (int i22 = 0; i22 < i21; i22++) {
                                    this.f16607j = pVar.G();
                                    this.f16608k = pVar.G();
                                }
                            }
                        }
                        if ((iZ2 & 8) != 0) {
                            int iZ3 = pVar.z();
                            if (pVar.a() >= iZ3) {
                                for (int i23 = 0; i23 < iZ3; i23++) {
                                    int iG2 = (pVar.G() & 12) >> 2;
                                    if (pVar.a() >= iG2) {
                                        pVar.N(iG2);
                                    }
                                    break;
                                }
                            }
                        }
                    }
                    if (this.f16606h == -1 && this.f16609l) {
                        this.f16611n = (pVar.j() & 4) == 0;
                    }
                    if (!this.f16610m && (i10 = this.f16607j) != -1 && (i11 = this.f16608k) != -1) {
                        o oVar2 = kVar.f16140c;
                        if (i10 != oVar2.f26342u || i11 != oVar2.f26343v) {
                            a0 a0Var5 = this.f16602d;
                            n nVarA2 = oVar2.a();
                            nVarA2.f26299t = this.f16607j;
                            nVarA2.f26300u = this.f16608k;
                            pe.a.q(nVarA2, a0Var5);
                        }
                        this.f16610m = true;
                    }
                    int iA4 = pVar.a();
                    this.f16602d.d(iA4, pVar);
                    int i24 = this.f16606h;
                    if (i24 == -1) {
                        this.f16606h = iA4;
                    } else {
                        this.f16606h = i24 + iA4;
                    }
                    this.i = l.t(this.f16604f, 90000, j10, this.f16603e);
                    if (z5) {
                        a0 a0Var6 = this.f16602d;
                        a0Var6.getClass();
                        a0Var6.f(this.i, this.f16611n ? 1 : 0, this.f16606h, 0, null);
                        this.f16606h = -1;
                        this.i = -9223372036854775807L;
                        this.f16609l = false;
                    }
                    this.f16605g = i;
                }
                break;
        }
    }

    @Override // f4.i
    public final void c(m mVar, int i) {
        switch (this.f16600b) {
            case 0:
                a0 a0VarP = mVar.P(i, 2);
                this.f16602d = a0VarP;
                a0VarP.a(this.f16601c.f16140c);
                break;
            default:
                a0 a0VarP2 = mVar.P(i, 2);
                this.f16602d = a0VarP2;
                a0VarP2.a(this.f16601c.f16140c);
                break;
        }
    }

    @Override // f4.i
    public final void seek(long j10, long j11) {
        switch (this.f16600b) {
            case 0:
                this.f16603e = j10;
                this.f16605g = 0;
                this.f16604f = j11;
                break;
            default:
                this.f16603e = j10;
                this.f16606h = -1;
                this.f16604f = j11;
                break;
        }
    }
}
