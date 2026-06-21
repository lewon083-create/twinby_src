package zk;

import java.io.EOFException;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class s extends b0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p f46442e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p f46443f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f46444g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f46445h;
    public static final byte[] i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nl.j f46446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f46447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f46448c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f46449d;

    static {
        Pattern pattern = p.f46432d;
        f46442e = a.a.h("multipart/mixed");
        a.a.h("multipart/alternative");
        a.a.h("multipart/digest");
        a.a.h("multipart/parallel");
        f46443f = a.a.h("multipart/form-data");
        f46444g = new byte[]{58, 32};
        f46445h = new byte[]{13, 10};
        i = new byte[]{45, 45};
    }

    public s(nl.j boundaryByteString, p type, List parts) {
        Intrinsics.checkNotNullParameter(boundaryByteString, "boundaryByteString");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(parts, "parts");
        this.f46446a = boundaryByteString;
        this.f46447b = parts;
        Pattern pattern = p.f46432d;
        this.f46448c = a.a.h(type + "; boundary=" + boundaryByteString.h());
        this.f46449d = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long a(nl.h hVar, boolean z5) throws EOFException {
        nl.g gVar;
        nl.h gVar2;
        if (z5) {
            gVar2 = new nl.g();
            gVar = gVar2;
        } else {
            gVar = 0;
            gVar2 = hVar;
        }
        List list = this.f46447b;
        int size = list.size();
        long j10 = 0;
        int i10 = 0;
        while (true) {
            nl.j jVar = this.f46446a;
            byte[] bArr = i;
            byte[] bArr2 = f46445h;
            if (i10 >= size) {
                Intrinsics.b(gVar2);
                gVar2.write(bArr);
                gVar2.v(jVar);
                gVar2.write(bArr);
                gVar2.write(bArr2);
                if (!z5) {
                    return j10;
                }
                Intrinsics.b(gVar);
                long j11 = j10 + gVar.f29540c;
                gVar.a();
                return j11;
            }
            r rVar = (r) list.get(i10);
            k kVar = rVar.f46440a;
            b0 b0Var = rVar.f46441b;
            Intrinsics.b(gVar2);
            gVar2.write(bArr);
            gVar2.v(jVar);
            gVar2.write(bArr2);
            int size2 = kVar.size();
            for (int i11 = 0; i11 < size2; i11++) {
                gVar2.t(kVar.c(i11)).write(f46444g).t(kVar.f(i11)).write(bArr2);
            }
            p pVarContentType = b0Var.contentType();
            if (pVarContentType != null) {
                gVar2.t("Content-Type: ").t(pVarContentType.f46434a).write(bArr2);
            }
            long jContentLength = b0Var.contentLength();
            if (jContentLength != -1) {
                gVar2.t("Content-Length: ").F(jContentLength).write(bArr2);
            } else if (z5) {
                Intrinsics.b(gVar);
                gVar.a();
                return -1L;
            }
            gVar2.write(bArr2);
            if (z5) {
                j10 += jContentLength;
            } else {
                b0Var.writeTo(gVar2);
            }
            gVar2.write(bArr2);
            i10++;
        }
    }

    @Override // zk.b0
    public final long contentLength() throws EOFException {
        long j10 = this.f46449d;
        if (j10 != -1) {
            return j10;
        }
        long jA = a(null, true);
        this.f46449d = jA;
        return jA;
    }

    @Override // zk.b0
    public final p contentType() {
        return this.f46448c;
    }

    @Override // zk.b0
    public final void writeTo(nl.h sink) throws EOFException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        a(sink, false);
    }
}
