package f4;

import com.google.android.gms.internal.ads.om1;
import com.google.android.gms.internal.measurement.h5;
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
public final class k implements i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4.k f16648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a0 f16649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f16650d = -9223372036854775807L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f16651e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f16652f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f16653g = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f16654h = 0;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f16655j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f16656k;

    public k(e4.k kVar) {
        this.f16648b = kVar;
    }

    @Override // f4.i
    public final void a(long j10) {
        h5.r(this.f16650d == -9223372036854775807L);
        this.f16650d = j10;
    }

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
        this.f16649c.getClass();
        int iZ = pVar.z();
        if ((iZ & 16) == 16 && (iZ & 7) == 0) {
            if (this.i && this.f16652f > 0) {
                a0 a0Var = this.f16649c;
                a0Var.getClass();
                a0Var.f(this.f16653g, this.f16655j ? 1 : 0, this.f16652f, 0, null);
                this.f16652f = -1;
                this.f16653g = -9223372036854775807L;
                this.i = false;
            }
            this.i = true;
        } else {
            if (!this.i) {
                m3.b.s("RtpVP8Reader", "RTP packet is not the start of a new VP8 partition, skipping.");
                return;
            }
            int iA = e4.h.a(this.f16651e);
            if (i < iA) {
                String str = z.f28608a;
                Locale locale = Locale.US;
                m3.b.s("RtpVP8Reader", om1.j("Received RTP packet with unexpected sequence number. Expected: ", iA, "; received: ", i, ". Dropping packet."));
                return;
            }
        }
        if ((iZ & 128) != 0) {
            int iZ2 = pVar.z();
            if ((iZ2 & 128) != 0 && (pVar.z() & 128) != 0) {
                pVar.N(1);
            }
            if ((iZ2 & 64) != 0) {
                pVar.N(1);
            }
            if ((iZ2 & 32) != 0 || (iZ2 & 16) != 0) {
                pVar.N(1);
            }
        }
        if (this.f16652f == -1 && this.i) {
            this.f16655j = (pVar.j() & 1) == 0;
        }
        if (!this.f16656k) {
            int i10 = pVar.f28590b;
            pVar.M(i10 + 6);
            int iS = pVar.s() & 16383;
            int iS2 = pVar.s() & 16383;
            pVar.M(i10);
            o oVar = this.f16648b.f16140c;
            if (iS != oVar.f26342u || iS2 != oVar.f26343v) {
                a0 a0Var2 = this.f16649c;
                n nVarA = oVar.a();
                nVarA.f26299t = iS;
                nVarA.f26300u = iS2;
                pe.a.q(nVarA, a0Var2);
            }
            this.f16656k = true;
        }
        int iA2 = pVar.a();
        this.f16649c.d(iA2, pVar);
        int i11 = this.f16652f;
        if (i11 == -1) {
            this.f16652f = iA2;
        } else {
            this.f16652f = i11 + iA2;
        }
        this.f16653g = l.t(this.f16654h, 90000, j10, this.f16650d);
        if (z5) {
            a0 a0Var3 = this.f16649c;
            a0Var3.getClass();
            a0Var3.f(this.f16653g, this.f16655j ? 1 : 0, this.f16652f, 0, null);
            this.f16652f = -1;
            this.f16653g = -9223372036854775807L;
            this.i = false;
        }
        this.f16651e = i;
    }

    @Override // f4.i
    public final void c(m mVar, int i) {
        a0 a0VarP = mVar.P(i, 2);
        this.f16649c = a0VarP;
        a0VarP.a(this.f16648b.f16140c);
    }

    @Override // f4.i
    public final void seek(long j10, long j11) {
        this.f16650d = j10;
        this.f16652f = -1;
        this.f16654h = j11;
    }
}
