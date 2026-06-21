package ml;

import com.google.android.gms.internal.ads.gn0;
import com.vk.api.sdk.okhttp.LoggingInterceptor$delegate$2;
import dl.j;
import el.e;
import el.f;
import hl.d;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeUnit;
import kotlin.collections.d0;
import kotlin.jvm.internal.Intrinsics;
import nl.g;
import nl.i;
import nl.m;
import zk.b0;
import zk.f0;
import zk.k;
import zk.n;
import zk.o;
import zk.p;
import zk.v;
import zk.x;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile d0 f28955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile a f28956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LoggingInterceptor$delegate$2.AnonymousClass1 f28957c;

    public c(LoggingInterceptor$delegate$2.AnonymousClass1 logger) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f28957c = logger;
        this.f28955a = d0.f27478b;
        this.f28956b = a.f28950b;
    }

    public final void a(k kVar, int i) {
        this.f28955a.contains(kVar.c(i));
        String strF = kVar.f(i);
        log(kVar.c(i) + ": " + strF);
    }

    @Override // zk.o
    public final zk.d0 intercept(n chain) throws Exception {
        String string;
        boolean z5;
        boolean z10;
        String str;
        char c8;
        f0 f0Var;
        String string2;
        String str2;
        String str3;
        String string3;
        Long lValueOf;
        Charset UTF_8;
        Charset UTF_82;
        Intrinsics.checkNotNullParameter(chain, "chain");
        a aVar = this.f28956b;
        f fVar = (f) chain;
        x xVar = fVar.f16440e;
        if (aVar == a.f28950b) {
            return fVar.b(xVar);
        }
        boolean z11 = true;
        boolean z12 = aVar == a.f28953e;
        if (!z12 && aVar != a.f28952d) {
            z11 = false;
        }
        b0 b0Var = xVar.f46514d;
        gn0 gn0Var = fVar.f16439d;
        j jVar = gn0Var != null ? (j) gn0Var.f5878g : null;
        StringBuilder sb2 = new StringBuilder("--> ");
        sb2.append(xVar.f46512b);
        sb2.append(' ');
        sb2.append(xVar.f46511a);
        if (jVar != null) {
            StringBuilder sb3 = new StringBuilder(" ");
            v vVar = jVar.f15857f;
            Intrinsics.b(vVar);
            sb3.append(vVar);
            string = sb3.toString();
        } else {
            string = "";
        }
        sb2.append(string);
        String string4 = sb2.toString();
        if (!z11 && b0Var != null) {
            StringBuilder sbK = pe.a.k(string4, " (");
            sbK.append(b0Var.contentLength());
            sbK.append("-byte body)");
            string4 = sbK.toString();
        }
        log(string4);
        if (z11) {
            k kVar = xVar.f46513c;
            if (b0Var != null) {
                c8 = ' ';
                p pVarContentType = b0Var.contentType();
                if (pVarContentType == null || kVar.a("Content-Type") != null) {
                    z5 = z12;
                    z10 = z11;
                } else {
                    z5 = z12;
                    z10 = z11;
                    log("Content-Type: " + pVarContentType);
                }
                if (b0Var.contentLength() == -1 || kVar.a("Content-Length") != null) {
                    str = "-byte body)";
                } else {
                    LoggingInterceptor$delegate$2.AnonymousClass1 anonymousClass1 = this.f28957c;
                    StringBuilder sb4 = new StringBuilder("Content-Length: ");
                    str = "-byte body)";
                    sb4.append(b0Var.contentLength());
                    anonymousClass1.log(sb4.toString());
                }
            } else {
                z5 = z12;
                z10 = z11;
                str = "-byte body)";
                c8 = ' ';
            }
            int size = kVar.size();
            for (int i = 0; i < size; i++) {
                a(kVar, i);
            }
            if (!z5 || b0Var == null) {
                log("--> END " + xVar.f46512b);
            } else {
                String strA = xVar.f46513c.a("Content-Encoding");
                if (strA != null && !strA.equalsIgnoreCase("identity") && !strA.equalsIgnoreCase("gzip")) {
                    log("--> END " + xVar.f46512b + " (encoded body omitted)");
                } else if (b0Var.isDuplex()) {
                    log("--> END " + xVar.f46512b + " (duplex request body omitted)");
                } else if (b0Var.isOneShot()) {
                    log("--> END " + xVar.f46512b + " (one-shot body omitted)");
                } else {
                    g gVar = new g();
                    b0Var.writeTo(gVar);
                    p pVarContentType2 = b0Var.contentType();
                    if (pVarContentType2 == null || (UTF_82 = pVarContentType2.a(StandardCharsets.UTF_8)) == null) {
                        UTF_82 = StandardCharsets.UTF_8;
                        Intrinsics.checkNotNullExpressionValue(UTF_82, "UTF_8");
                    }
                    log("");
                    if (d.p(gVar)) {
                        log(gVar.u(UTF_82));
                        log("--> END " + xVar.f46512b + " (" + b0Var.contentLength() + str);
                    } else {
                        log("--> END " + xVar.f46512b + " (binary " + b0Var.contentLength() + "-byte body omitted)");
                    }
                }
            }
        } else {
            z5 = z12;
            z10 = z11;
            str = "-byte body)";
            c8 = ' ';
        }
        long jNanoTime = System.nanoTime();
        try {
            zk.d0 d0VarB = ((f) chain).b(xVar);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
            f0 f0Var2 = d0VarB.f46352h;
            Intrinsics.b(f0Var2);
            long jB = f0Var2.b();
            if (jB != -1) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(jB);
                f0Var = f0Var2;
                sb5.append("-byte");
                string2 = sb5.toString();
            } else {
                f0Var = f0Var2;
                string2 = "unknown-length";
            }
            LoggingInterceptor$delegate$2.AnonymousClass1 anonymousClass12 = this.f28957c;
            StringBuilder sb6 = new StringBuilder("<-- ");
            sb6.append(d0VarB.f46349e);
            if (d0VarB.f46348d.length() == 0) {
                str2 = str;
                string3 = "";
                str3 = "-byte body omitted)";
            } else {
                String str4 = d0VarB.f46348d;
                str2 = str;
                StringBuilder sb7 = new StringBuilder();
                str3 = "-byte body omitted)";
                sb7.append(String.valueOf(c8));
                sb7.append(str4);
                string3 = sb7.toString();
            }
            sb6.append(string3);
            sb6.append(c8);
            sb6.append(d0VarB.f46346b.f46511a);
            sb6.append(" (");
            sb6.append(millis);
            sb6.append("ms");
            sb6.append(!z10 ? pe.a.f(", ", string2, " body") : "");
            sb6.append(')');
            anonymousClass12.log(sb6.toString());
            if (z10) {
                k kVar2 = d0VarB.f46351g;
                int size2 = kVar2.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    a(kVar2, i10);
                }
                if (z5 && e.a(d0VarB)) {
                    String strA2 = d0VarB.f46351g.a("Content-Encoding");
                    if (strA2 != null && !strA2.equalsIgnoreCase("identity") && !strA2.equalsIgnoreCase("gzip")) {
                        log("<-- END HTTP (encoded body omitted)");
                        return d0VarB;
                    }
                    i iVarH = f0Var.h();
                    iVarH.z(Long.MAX_VALUE);
                    g gVarE = iVarH.e();
                    if ("gzip".equalsIgnoreCase(kVar2.a("Content-Encoding"))) {
                        lValueOf = Long.valueOf(gVarE.f29540c);
                        m mVar = new m(gVarE.clone());
                        try {
                            gVarE = new g();
                            gVarE.o(mVar);
                            mVar.close();
                        } finally {
                        }
                    } else {
                        lValueOf = null;
                    }
                    p pVarD = f0Var.d();
                    if (pVarD == null || (UTF_8 = pVarD.a(StandardCharsets.UTF_8)) == null) {
                        UTF_8 = StandardCharsets.UTF_8;
                        Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
                    }
                    if (!d.p(gVarE)) {
                        log("");
                        log("<-- END HTTP (binary " + gVarE.f29540c + str3);
                        return d0VarB;
                    }
                    if (jB != 0) {
                        log("");
                        log(gVarE.clone().u(UTF_8));
                    }
                    if (lValueOf == null) {
                        log("<-- END HTTP (" + gVarE.f29540c + str2);
                        return d0VarB;
                    }
                    log("<-- END HTTP (" + gVarE.f29540c + "-byte, " + lValueOf + "-gzipped-byte body)");
                    return d0VarB;
                }
                log("<-- END HTTP");
            }
            return d0VarB;
        } catch (Exception e3) {
            log("<-- HTTP FAILED: " + e3);
            throw e3;
        }
    }
}
