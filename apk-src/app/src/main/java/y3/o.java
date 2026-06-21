package y3;

import j3.c0;
import java.io.EOFException;
import java.util.Arrays;
import java.util.Objects;
import q4.a0;
import q4.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements a0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final j3.o f36394f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final j3.o f36395g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f36396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j3.o f36397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j3.o f36398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f36399d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f36400e;

    static {
        j3.n nVar = new j3.n();
        nVar.f26292m = c0.n("application/id3");
        f36394f = new j3.o(nVar);
        j3.n nVar2 = new j3.n();
        nVar2.f26292m = c0.n("application/x-emsg");
        f36395g = new j3.o(nVar2);
    }

    public o(a0 a0Var, int i) {
        this.f36396a = a0Var;
        if (i == 1) {
            this.f36397b = f36394f;
        } else {
            if (i != 3) {
                throw new IllegalArgumentException(l7.o.i(i, "Unknown metadataType: "));
            }
            this.f36397b = f36395g;
        }
        this.f36399d = new byte[0];
        this.f36400e = 0;
    }

    @Override // q4.a0
    public final void a(j3.o oVar) {
        this.f36398c = oVar;
        this.f36396a.a(this.f36397b);
    }

    @Override // q4.a0
    public final void e(m3.p pVar, int i, int i10) {
        int i11 = this.f36400e + i;
        byte[] bArr = this.f36399d;
        if (bArr.length < i11) {
            this.f36399d = Arrays.copyOf(bArr, (i11 / 2) + i11);
        }
        pVar.k(this.f36399d, this.f36400e, i);
        this.f36400e += i;
    }

    @Override // q4.a0
    public final void f(long j10, int i, int i10, int i11, z zVar) {
        this.f36398c.getClass();
        int i12 = this.f36400e - i11;
        m3.p pVar = new m3.p(Arrays.copyOfRange(this.f36399d, i12 - i10, i12));
        byte[] bArr = this.f36399d;
        System.arraycopy(bArr, i12, bArr, 0, i11);
        this.f36400e = i11;
        String str = this.f36398c.f26335n;
        j3.o oVar = this.f36397b;
        String str2 = oVar.f26335n;
        String str3 = oVar.f26335n;
        if (!Objects.equals(str, str2)) {
            if (!"application/x-emsg".equals(this.f36398c.f26335n)) {
                m3.b.s("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.f36398c.f26335n);
                return;
            }
            b5.a aVarZ = a5.b.Z(pVar);
            j3.o oVarA = aVarZ.a();
            if (oVarA == null || !Objects.equals(str3, oVarA.f26335n)) {
                m3.b.s("HlsSampleStreamWrapper", "Ignoring EMSG. Expected it to contain wrapped " + str3 + " but actual wrapped format: " + aVarZ.a());
                return;
            }
            byte[] bArrC = aVarZ.c();
            bArrC.getClass();
            pVar = new m3.p(bArrC);
        }
        int iA = pVar.a();
        a0 a0Var = this.f36396a;
        a0Var.d(iA, pVar);
        a0Var.f(j10, i, iA, 0, zVar);
    }

    @Override // q4.a0
    public final int g(j3.h hVar, int i, boolean z5) throws EOFException {
        int i10 = this.f36400e + i;
        byte[] bArr = this.f36399d;
        if (bArr.length < i10) {
            this.f36399d = Arrays.copyOf(bArr, (i10 / 2) + i10);
        }
        int i11 = hVar.read(this.f36399d, this.f36400e, i);
        if (i11 != -1) {
            this.f36400e += i11;
            return i11;
        }
        if (z5) {
            return -1;
        }
        throw new EOFException();
    }
}
