package e1;

import a0.l1;
import a0.r1;
import ad.b1;
import ad.g1;
import ad.k0;
import ad.m0;
import ad.q1;
import android.app.job.JobParameters;
import android.graphics.Bitmap;
import android.media.MediaFormat;
import android.net.Uri;
import android.util.SparseArray;
import android.view.Surface;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.gms.internal.ads.jx0;
import com.google.android.gms.internal.ads.om1;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.h5;
import com.yandex.varioqub.config.OnFetchCompleteListener;
import com.yandex.varioqub.config.impl.B;
import fh.bz;
import g0.a1;
import g0.l0;
import g0.o1;
import g0.p1;
import g0.s1;
import g0.w0;
import i4.v0;
import io.appmetrica.analytics.impl.Eb;
import io.appmetrica.analytics.impl.V;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f16010d;

    public /* synthetic */ y(int i, Object obj, Object obj2) {
        this.f16008b = i;
        this.f16010d = obj;
        this.f16009c = obj2;
    }

    private final void a() {
        a1 a1Var = (a1) this.f16010d;
        String str = (String) this.f16009c;
        try {
            a1Var.f19513e.get();
            a1Var.e(a1.f19508n.decrementAndGet(), a1.f19507m.get(), "Surface terminated");
        } catch (Exception e3) {
            com.google.android.gms.internal.auth.g.k("DeferrableSurface", "Unexpected surface termination for " + a1Var + "\nStack Trace:\n" + str);
            synchronized (a1Var.f19509a) {
                throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", a1Var, Boolean.valueOf(a1Var.f19511c), Integer.valueOf(a1Var.f19510b)), e3);
            }
        }
    }

    private final void b() {
        bb.e eVar = (bb.e) this.f16010d;
        j1.h hVar = (j1.h) this.f16009c;
        p1 p1Var = (p1) ((androidx.lifecycle.d0) eVar.f2019c).d();
        if (p1Var == null) {
            hVar.d(new IllegalStateException("Observable has not yet been initialized with a value."));
        } else {
            hVar.b(p1Var.f19712a);
        }
    }

    private final void c() {
        bb.e eVar = (bb.e) this.f16010d;
        s1 s1Var = (s1) this.f16009c;
        p1 p1Var = (p1) ((androidx.lifecycle.d0) eVar.f2019c).d();
        if (p1Var == null) {
            return;
        }
        s1Var.a(p1Var.f19712a);
    }

    private final void d() {
        B.a((B) this.f16010d, (OnFetchCompleteListener) this.f16009c);
    }

    private final void e() {
        Object obj;
        i0.p pVar = (i0.p) this.f16010d;
        androidx.lifecycle.d0 d0Var = (androidx.lifecycle.d0) this.f16009c;
        o1 o1Var = new o1(1, new ek.o(1, pVar));
        if (d0Var == null) {
            throw new NullPointerException("source cannot be null");
        }
        androidx.lifecycle.c0 c0Var = new androidx.lifecycle.c0(d0Var, o1Var);
        o.f fVar = pVar.f20807n;
        o.c cVarA = fVar.a(d0Var);
        if (cVarA != null) {
            obj = cVarA.f29587c;
        } else {
            o.c cVar = new o.c(d0Var, c0Var);
            fVar.f29596e++;
            o.c cVar2 = fVar.f29594c;
            if (cVar2 == null) {
                fVar.f29593b = cVar;
                fVar.f29594c = cVar;
            } else {
                cVar2.f29588d = cVar;
                cVar.f29589e = cVar2;
                fVar.f29594c = cVar;
            }
            obj = null;
        }
        androidx.lifecycle.c0 c0Var2 = (androidx.lifecycle.c0) obj;
        if (c0Var2 != null && c0Var2.f1543b != o1Var) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        }
        if (c0Var2 == null && pVar.f1552c > 0) {
            d0Var.f(c0Var);
        }
    }

    private final void f() {
        t.a0 a0Var = (t.a0) this.f16010d;
        CountDownLatch countDownLatch = (CountDownLatch) this.f16009c;
        try {
            a0Var.run();
        } finally {
            countDownLatch.countDown();
        }
    }

    private final void g() {
        ((m3.g) this.f16010d).accept(this.f16009c);
    }

    private final void h() {
        ((v0) this.f16010d).u((q4.t) this.f16009c);
    }

    @Override // java.lang.Runnable
    public final void run() throws Exception {
        n nVar;
        Executor executor;
        String str;
        b1 b1VarA;
        int i = 4;
        Object obj = null;
        int i10 = 0;
        int i11 = 1;
        switch (this.f16008b) {
            case 0:
                a0 a0Var = (a0) this.f16010d;
                MediaFormat mediaFormat = (MediaFormat) this.f16009c;
                if (a0Var.f15892j) {
                    com.google.android.gms.internal.auth.g.O(a0Var.f15894l.f15917a, "Receives onOutputFormatChanged after codec is reset.");
                    return;
                }
                switch (t.z.m(a0Var.f15894l.G)) {
                    case 0:
                    case 7:
                    case 8:
                        return;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        c0 c0Var = a0Var.f15894l;
                        if (c0Var.f15919c && c0Var.c()) {
                            mediaFormat.setInteger("time-lapse-enable", 1);
                            mediaFormat.setInteger("time-lapse-fps", ((d) a0Var.f15894l.f15920d).f15948g);
                        }
                        synchronized (a0Var.f15894l.f15918b) {
                            c0 c0Var2 = a0Var.f15894l;
                            nVar = c0Var2.f15936u;
                            executor = c0Var2.f15937v;
                            break;
                        }
                        try {
                            executor.execute(new y(1, nVar, mediaFormat));
                            return;
                        } catch (RejectedExecutionException e3) {
                            com.google.android.gms.internal.auth.g.l(a0Var.f15894l.f15917a, "Unable to post to the supplied executor.", e3);
                            return;
                        }
                    default:
                        throw new IllegalStateException("Unknown state: ".concat(om1.E(a0Var.f15894l.G)));
                }
            case 1:
                ((n) this.f16010d).f(new a0.a0(12, (MediaFormat) this.f16009c));
                return;
            case 2:
                ((n) this.f16010d).d((j) this.f16009c);
                return;
            case 3:
                ((l) this.f16010d).b((Surface) this.f16009c);
                return;
            case 4:
                a1.e eVar = (a1.e) this.f16010d;
                ad.j0 j0Var = (ad.j0) this.f16009c;
                e4.m mVar = (e4.m) eVar.f324d;
                mVar.getClass();
                m0 m0Var = mVar.f16153h;
                SparseArray sparseArray = mVar.f16152g;
                Pattern pattern = e4.a0.f16037b;
                if (!pattern.matcher((CharSequence) j0Var.get(0)).matches()) {
                    Matcher matcher = e4.a0.f16036a.matcher((CharSequence) j0Var.get(0));
                    h5.h(matcher.matches());
                    String strGroup = matcher.group(1);
                    strGroup.getClass();
                    e4.a0.a(strGroup);
                    String strGroup2 = matcher.group(2);
                    strGroup2.getClass();
                    Uri.parse(strGroup2);
                    int iIndexOf = j0Var.indexOf("");
                    h5.h(iIndexOf > 0);
                    List listSubList = j0Var.subList(1, iIndexOf);
                    a0.b1 b1Var = new a0.b1(9);
                    b1Var.j(listSubList);
                    e4.n nVar2 = new e4.n(b1Var);
                    new d8.k(e4.a0.f16043h).d(j0Var.subList(iIndexOf + 1, j0Var.size()));
                    String strB = nVar2.b("CSeq");
                    strB.getClass();
                    int i12 = Integer.parseInt(strB);
                    e4.m mVar2 = (e4.m) m0Var.f841e;
                    m0 m0Var2 = new m0(405, new e4.n(new a0.b1(mVar2.f16149d, mVar2.f16156l, i12)), "");
                    e4.n nVar3 = (e4.n) m0Var2.f840d;
                    int i13 = m0Var2.f839c;
                    h5.h(nVar3.b("CSeq") != null);
                    ad.g0 g0Var = new ad.g0(4);
                    if (i13 == 200) {
                        str = "OK";
                    } else if (i13 == 461) {
                        str = "Unsupported Transport";
                    } else if (i13 == 500) {
                        str = "Internal Server Error";
                    } else if (i13 == 505) {
                        str = "RTSP Version Not Supported";
                    } else if (i13 == 301) {
                        str = "Move Permanently";
                    } else if (i13 == 302) {
                        str = "Move Temporarily";
                    } else if (i13 == 400) {
                        str = "Bad Request";
                    } else if (i13 == 401) {
                        str = "Unauthorized";
                    } else if (i13 == 404) {
                        str = "Not Found";
                    } else if (i13 != 405) {
                        switch (i13) {
                            case 454:
                                str = "Session Not Found";
                                break;
                            case 455:
                                str = "Method Not Valid In This State";
                                break;
                            case 456:
                                str = "Header Field Not Valid";
                                break;
                            case 457:
                                str = "Invalid Range";
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                    } else {
                        str = "Method Not Allowed";
                    }
                    String str2 = m3.z.f28608a;
                    Locale locale = Locale.US;
                    g0Var.b("RTSP/1.0 " + i13 + " " + str);
                    k0 k0Var = nVar3.f16165a;
                    q1 it = k0Var.f821e.keySet().iterator();
                    while (it.hasNext()) {
                        String str3 = (String) it.next();
                        ad.j0 j0VarG = k0Var.g(str3);
                        for (int i14 = 0; i14 < j0VarG.size(); i14++) {
                            g0Var.b(String.format(Locale.US, "%s: %s", str3, j0VarG.get(i14)));
                        }
                    }
                    g0Var.b("");
                    g0Var.b((String) m0Var2.f841e);
                    mVar2.f16154j.b(g0Var.g());
                    m0Var.f839c = Math.max(m0Var.f839c, i12 + 1);
                    return;
                }
                Matcher matcher2 = pattern.matcher((CharSequence) j0Var.get(0));
                h5.h(matcher2.matches());
                String strGroup3 = matcher2.group(1);
                strGroup3.getClass();
                int i15 = Integer.parseInt(strGroup3);
                int iIndexOf2 = j0Var.indexOf("");
                h5.h(iIndexOf2 > 0);
                List listSubList2 = j0Var.subList(1, iIndexOf2);
                a0.b1 b1Var2 = new a0.b1(9);
                b1Var2.j(listSubList2);
                e4.n nVar4 = new e4.n(b1Var2);
                String strD = new d8.k(e4.a0.f16043h).d(j0Var.subList(iIndexOf2 + 1, j0Var.size()));
                String strB2 = nVar4.b("CSeq");
                strB2.getClass();
                int i16 = Integer.parseInt(strB2);
                e4.p pVar = mVar.f16147b;
                e4.b0 b0Var = (e4.b0) sparseArray.get(i16);
                if (b0Var == null) {
                    return;
                }
                sparseArray.remove(i16);
                int i17 = b0Var.f16054b;
                try {
                    try {
                        if (i15 == 200) {
                            switch (i17) {
                                case 1:
                                case 3:
                                case 7:
                                case 8:
                                case 9:
                                case 11:
                                case 12:
                                    return;
                                case 2:
                                    eVar.Q(new a1.e(17, nVar4, e4.g0.a(strD), false));
                                    return;
                                case 4:
                                    ad.j0 j0VarR = ad.j0.r(e4.a0.b(nVar4.b("Public")));
                                    if (mVar.f16158n != null) {
                                        return;
                                    }
                                    if (!j0VarR.isEmpty() && !j0VarR.contains(2)) {
                                        pVar.f("DESCRIBE not supported.", null);
                                        return;
                                    }
                                    Uri uri = mVar.i;
                                    String str4 = mVar.f16156l;
                                    m0Var.getClass();
                                    m0Var.q(m0Var.m(2, str4, g1.b(1, new Object[]{"Accept", "application/sdp"}, null), uri));
                                    return;
                                case 5:
                                    eVar.R();
                                    return;
                                case 6:
                                    String strB3 = nVar4.b("Range");
                                    e4.c0 c0VarA = strB3 == null ? e4.c0.f16057c : e4.c0.a(strB3);
                                    try {
                                        String strB4 = nVar4.b("RTP-Info");
                                        if (strB4 == null) {
                                            ad.h0 h0Var = ad.j0.f818c;
                                            b1VarA = b1.f768f;
                                        } else {
                                            b1VarA = e4.d0.a(mVar.i, strB4);
                                        }
                                    } catch (j3.d0 unused) {
                                        ad.h0 h0Var2 = ad.j0.f818c;
                                        b1VarA = b1.f768f;
                                    }
                                    ad.j0 j0VarR2 = ad.j0.r(b1VarA);
                                    int i18 = mVar.f16160p;
                                    h5.r(i18 == 1 || i18 == 2);
                                    mVar.f16160p = 2;
                                    if (mVar.f16158n == null) {
                                        long j10 = mVar.f16157m / 2;
                                        e4.l lVar = new e4.l(mVar, j10);
                                        mVar.f16158n = lVar;
                                        if (!lVar.f16145d) {
                                            lVar.f16145d = true;
                                            lVar.f16143b.postDelayed(lVar, j10);
                                        }
                                    }
                                    mVar.f16164t = -9223372036854775807L;
                                    mVar.f16148c.d(m3.z.M(c0VarA.f16059a), j0VarR2);
                                    return;
                                case 10:
                                    String strB5 = nVar4.b("Session");
                                    String strB6 = nVar4.b("Transport");
                                    if (strB5 == null || strB6 == null) {
                                        throw j3.d0.b("Missing mandatory session or transport header", null);
                                    }
                                    jx0 jx0VarC = e4.a0.c(strB5);
                                    h5.r(mVar.f16160p != -1);
                                    mVar.f16160p = 1;
                                    mVar.f16156l = jx0VarC.f6962a;
                                    mVar.f16157m = jx0VarC.f6963b;
                                    mVar.b();
                                    return;
                                default:
                                    throw new IllegalStateException();
                            }
                        }
                        if (i15 == 401) {
                            if (mVar.f16155k == null || mVar.f16162r) {
                                e4.m.a(mVar, new androidx.datastore.preferences.protobuf.m(e4.a0.g(i17) + " " + i15));
                                return;
                            }
                            ad.j0 j0VarG2 = nVar4.f16165a.g(e4.n.a("WWW-Authenticate"));
                            if (j0VarG2.isEmpty()) {
                                throw j3.d0.b("Missing WWW-Authenticate header in a 401 response.", null);
                            }
                            for (int i19 = 0; i19 < j0VarG2.size(); i19++) {
                                la.m mVarE = e4.a0.e((String) j0VarG2.get(i19));
                                mVar.f16159o = mVarE;
                                if (mVarE.f28098c == 2) {
                                    m0Var.p();
                                    mVar.f16162r = true;
                                    return;
                                }
                            }
                            m0Var.p();
                            mVar.f16162r = true;
                            return;
                        }
                        if (i15 == 461) {
                            String str5 = e4.a0.g(i17) + " " + i15;
                            String strB7 = b0Var.f16055c.b("Transport");
                            strB7.getClass();
                            e4.m.a(mVar, (i17 != 10 || strB7.contains("TCP")) ? new androidx.datastore.preferences.protobuf.m(str5) : new e4.u(str5));
                            return;
                        }
                        if (i15 != 301 && i15 != 302) {
                            e4.m.a(mVar, new androidx.datastore.preferences.protobuf.m(e4.a0.g(i17) + " " + i15));
                            return;
                        }
                        if (mVar.f16160p != -1) {
                            mVar.f16160p = 0;
                        }
                        String strB8 = nVar4.b("Location");
                        if (strB8 == null) {
                            pVar.f("Redirection without new location.", null);
                            return;
                        }
                        Uri uri2 = Uri.parse(strB8);
                        mVar.i = uri2;
                        d8.a aVarD = e4.a0.d(uri2);
                        if (aVarD != null) {
                            mVar.f16155k = aVarD;
                        }
                        Uri uri3 = mVar.i;
                        String str6 = mVar.f16156l;
                        m0Var.getClass();
                        m0Var.q(m0Var.m(2, str6, g1.b(1, new Object[]{"Accept", "application/sdp"}, null), uri3));
                        return;
                    } catch (IllegalArgumentException e7) {
                        e = e7;
                        e4.m.a(mVar, new androidx.datastore.preferences.protobuf.m(e));
                        return;
                    }
                } catch (j3.d0 e10) {
                    e = e10;
                    e4.m.a(mVar, new androidx.datastore.preferences.protobuf.m(e));
                    return;
                }
            case 5:
                e4.y yVar = (e4.y) this.f16010d;
                byte[] bArr = (byte[]) this.f16009c;
                yVar.getClass();
                try {
                    yVar.f16216b.write(bArr);
                    return;
                } catch (Exception unused2) {
                    return;
                }
            case 6:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.f16010d;
                JobParameters jobParameters = (JobParameters) this.f16009c;
                int i20 = JobInfoSchedulerService.f2525b;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                return;
            case 7:
                ef.c cVar = (ef.c) this.f16010d;
                HashMap map = (HashMap) this.f16009c;
                ii.g gVar = cVar.f16367g;
                if (gVar != null) {
                    gVar.b(map);
                    return;
                }
                return;
            case 8:
                f0.o oVar = (f0.o) this.f16010d;
                r1 r1Var = (r1) this.f16009c;
                f0.q qVar = oVar.f16536h;
                b4.e();
                if (qVar.f16548g) {
                    r1Var.close();
                    return;
                }
                f2.g.h("onImageCaptured() must be called before onFinalResult()", qVar.f16544c.f26173c.isDone());
                qVar.a();
                f0.f fVar = qVar.f16542a;
                fVar.f16497c.execute(new f0.t(fVar, r1Var, i10));
                return;
            case 9:
                f0.o oVar2 = (f0.o) this.f16010d;
                nc.e eVar2 = (nc.e) this.f16009c;
                f0.q qVar2 = oVar2.f16536h;
                b4.e();
                if (qVar2.f16548g) {
                    return;
                }
                f2.g.h("onImageCaptured() must be called before onFinalResult()", qVar2.f16544c.f26173c.isDone());
                qVar2.a();
                f0.f fVar2 = qVar2.f16542a;
                fVar2.f16497c.execute(new y(14, fVar2, eVar2));
                return;
            case 10:
                f0.o oVar3 = (f0.o) this.f16010d;
                Bitmap bitmap = (Bitmap) this.f16009c;
                f0.q qVar3 = oVar3.f16536h;
                b4.e();
                if (qVar3.f16548g) {
                    return;
                }
                f0.f fVar3 = qVar3.f16542a;
                fVar3.f16497c.execute(new f0.t(fVar3, bitmap, i11));
                return;
            case 11:
                f0.o oVar4 = (f0.o) this.f16010d;
                l1 l1Var = (l1) this.f16009c;
                f0.q qVar4 = oVar4.f16536h;
                b4.e();
                if (qVar4.f16548g) {
                    return;
                }
                f2.g.h("onImageCaptured() must be called before onFinalResult()", qVar4.f16544c.f26173c.isDone());
                qVar4.a();
                b4.e();
                f0.f fVar4 = qVar4.f16542a;
                fVar4.f16497c.execute(new y(13, fVar4, l1Var));
                return;
            case 12:
                ((f0.s) this.f16010d).f16556f.remove((f0.q) this.f16009c);
                return;
            case 13:
                f0.f fVar5 = (f0.f) this.f16010d;
                l1 l1Var2 = (l1) this.f16009c;
                com.google.firebase.messaging.y yVar2 = fVar5.f16498d;
                if (yVar2 == null) {
                    throw new IllegalStateException("One and only one callback is allowed.");
                }
                yVar2.t(l1Var2);
                return;
            case 14:
                f0.f fVar6 = (f0.f) this.f16010d;
                nc.e eVar3 = (nc.e) this.f16009c;
                com.google.firebase.messaging.y yVar3 = fVar6.f16498d;
                Objects.requireNonNull(yVar3);
                Objects.requireNonNull(eVar3);
                ni.l1.c(((File) yVar3.f14899b).getAbsolutePath(), (fj.z) yVar3.f14900c);
                return;
            case 15:
                fj.u pigeon_instanceArg = (fj.u) this.f16010d;
                String messageArg = (String) this.f16009c;
                fj.m mVar3 = pigeon_instanceArg.f19425b;
                ch.a callback = new ch.a(i);
                Intrinsics.checkNotNullParameter(pigeon_instanceArg, "pigeon_instanceArg");
                Intrinsics.checkNotNullParameter(messageArg, "messageArg");
                Intrinsics.checkNotNullParameter(callback, "callback");
                a1.m mVar4 = mVar3.f19374a;
                mVar4.getClass();
                if (((fj.c) mVar4.f363c).d(pigeon_instanceArg)) {
                    new s7.g((ii.f) mVar4.f362b, "dev.flutter.pigeon.webview_flutter_android.JavaScriptChannel.postMessage", mVar4.m(), obj).K(kotlin.collections.s.f(pigeon_instanceArg, messageArg), new bz(6, callback));
                    return;
                } else {
                    ij.k kVar = ij.m.f21341c;
                    om1.r("missing-instance-error", "Callback to `JavaScriptChannel.postMessage` failed because native instance was not in the instance manager.", "");
                    return;
                }
            case 16:
                ((g0.f0) this.f16010d).p().j().j((androidx.lifecycle.e0) this.f16009c);
                return;
            case 17:
                ((g0.d0) this.f16010d).j().f((g0.g0) this.f16009c);
                return;
            case 18:
                l0 l0Var = (l0) this.f16010d;
                g0.f0 f0Var = (g0.f0) this.f16009c;
                synchronized (l0Var.f19646a) {
                    try {
                        l0Var.f19648c.remove(f0Var);
                        if (l0Var.f19648c.isEmpty()) {
                            l0Var.f19650e.getClass();
                            l0Var.f19650e.b(null);
                            l0Var.f19650e = null;
                            l0Var.f19649d = null;
                        }
                    } finally {
                    }
                    break;
                }
                return;
            case 19:
                w0 w0Var = (w0) this.f16010d;
                s1 s1Var = (s1) this.f16009c;
                try {
                    s1Var.a(w0Var.f19789b.f26779c);
                    return;
                } catch (InterruptedException | ExecutionException e11) {
                    s1Var.onError(e11);
                    return;
                }
            case 20:
                a();
                return;
            case 21:
                b();
                return;
            case 22:
                Map.Entry entry = (Map.Entry) this.f16010d;
                p1 p1Var = (p1) this.f16009c;
                s1 s1Var2 = (s1) entry.getKey();
                p1Var.getClass();
                s1Var2.a(p1Var.f19712a);
                return;
            case 23:
                c();
                return;
            case 24:
                d();
                return;
            case 25:
                e();
                return;
            case 26:
                f();
                return;
            case 27:
                g();
                return;
            case 28:
                h();
                return;
            default:
                Eb.a((Eb) this.f16010d, (V) this.f16009c);
                return;
        }
    }

    public /* synthetic */ y(e4.y yVar, byte[] bArr, List list) {
        this.f16008b = 5;
        this.f16010d = yVar;
        this.f16009c = bArr;
    }
}
