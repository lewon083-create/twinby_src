package s3;

import a0.r1;
import a0.u1;
import android.location.LocationManager;
import android.util.Log;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.google.android.gms.internal.ads.g2;
import com.google.android.gms.internal.ads.vs1;
import g0.d2;
import g0.j1;
import g0.k1;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.sentry.clientreport.DiscardedEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import t.p2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements m3.k, j1.i, k0.a, j1, FunctionWithThrowable, q4.d, n3.r, d8.r, d8.q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f32630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f32631c;

    public /* synthetic */ q(int i, Object obj) {
        this.f32630b = i;
        this.f32631c = obj;
    }

    @Override // g0.j1
    public void a(k1 k1Var) {
        p2 p2Var = (p2) this.f32631c;
        p2Var.getClass();
        try {
            r1 r1VarAcquireLatestImage = k1Var.acquireLatestImage();
            if (r1VarAcquireLatestImage != null) {
                p2Var.f33222c.o(r1VarAcquireLatestImage);
            }
        } catch (IllegalStateException e3) {
            com.google.android.gms.internal.auth.g.k("ZslControlImpl", "Failed to acquire latest image IllegalStateException = " + e3.getMessage());
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    /* JADX INFO: renamed from: apply, reason: collision with other method in class */
    public Object mo625apply(Object obj) {
        return io.appmetrica.analytics.location.impl.u.a((io.appmetrica.analytics.location.impl.u) this.f32631c, (LocationManager) obj);
    }

    @Override // q4.d
    public long b(long j10) {
        g2 g2Var = (g2) this.f32631c;
        return m3.z.k((j10 * ((long) g2Var.f5608e)) / 1000000, 0L, g2Var.f5612j - 1);
    }

    @Override // n3.r
    public void c(long j10, m3.p pVar) {
        switch (this.f32630b) {
            case 22:
                q4.b.f(j10, pVar, (q4.a0[]) ((bb.e) this.f32631c).f2020d);
                break;
            default:
                q4.b.g(j10, pVar, (q4.a0[]) ((u7.f) this.f32631c).f34323d);
                break;
        }
    }

    public a4.g d(bb.e eVar) {
        w8.b bVar = (w8.b) this.f32631c;
        URL url = (URL) eVar.f2019c;
        String strM = ya.e.m("CctTransportBackend");
        if (Log.isLoggable(strM, 4)) {
            Log.i(strM, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(bVar.f35213g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.1.9 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) eVar.f2021e;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    ni.i iVar = bVar.f35207a;
                    x8.i iVar2 = (x8.i) eVar.f2020d;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    td.d dVar = (td.d) iVar.f29407c;
                    td.e eVar2 = new td.e(bufferedWriter, dVar.f33772a, dVar.f33773b, dVar.f33774c, dVar.f33775d);
                    eVar2.f(iVar2);
                    eVar2.h();
                    eVar2.f33777b.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer numValueOf = Integer.valueOf(responseCode);
                    String strM2 = ya.e.m("CctTransportBackend");
                    if (Log.isLoggable(strM2, 4)) {
                        Log.i(strM2, String.format("Status Code: %d", numValueOf));
                    }
                    ya.e.f("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    ya.e.f("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new a4.g(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new a4.g(responseCode, (URL) null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            a4.g gVar = new a4.g(responseCode, (URL) null, x8.m.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).f36042a);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return gVar;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (ConnectException e3) {
            e = e3;
            ya.e.g("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new a4.g(500, (URL) null, 0L);
        } catch (UnknownHostException e7) {
            e = e7;
            ya.e.g("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new a4.g(500, (URL) null, 0L);
        } catch (IOException e10) {
            e = e10;
            ya.e.g("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new a4.g(400, (URL) null, 0L);
        } catch (rd.b e11) {
            e = e11;
            ya.e.g("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new a4.g(400, (URL) null, 0L);
        }
    }

    public void e(d8.j jVar) {
        ((jh.b) this.f32631c).e(ya.e.h(jVar));
    }

    public void f(d8.j jVar) {
        jh.b bVar = (jh.b) this.f32631c;
        yi.l lVarH = ya.e.h(jVar);
        yi.f fVar = new yi.f();
        fVar.f45654a = lVarH;
        fVar.f45655b = "";
        bVar.e(fVar);
    }

    @Override // m3.k, yads.of1
    public void invoke(Object obj) {
        switch (this.f32630b) {
            case 0:
                ((j3.h0) obj).r(((t) this.f32631c).f32648b.R);
                break;
            case 1:
                ((j3.h0) obj).p((j3.b0) this.f32631c);
                break;
            case 11:
                ((t3.i) obj).f33453o = (j3.e0) this.f32631c;
                break;
            case 12:
                vs1 vs1Var = (vs1) this.f32631c;
                t3.i iVar = (t3.i) obj;
                iVar.f33463y += vs1Var.f11459h;
                iVar.f33464z += vs1Var.f11457f;
                break;
            default:
                f4.g gVar = (f4.g) this.f32631c;
                t3.i iVar2 = (t3.i) obj;
                iVar2.getClass();
                iVar2.f33461w = gVar.f16629b;
                break;
        }
    }

    @Override // j1.i
    public Object m(j1.h completer) {
        switch (this.f32630b) {
            case 4:
                t.h0 h0Var = (t.h0) this.f32631c;
                h0Var.f33059a.f33178h.e(completer);
                h0Var.f33060b.f35494b = true;
                return "AePreCapture";
            case 5:
                ((t.j0) this.f32631c).f33122b.i.c();
                completer.b(null);
                return "invokePostCaptureFuture";
            case 6:
                ((g0.r0) this.f32631c).b(new t.l0(0, completer));
                return "submitStillCapture";
            case 8:
                ((t.o0) this.f32631c).f33196a = completer;
                return "waitFor3AResult";
            case 9:
                u1 u1Var = (u1) this.f32631c;
                Intrinsics.checkNotNullParameter(completer, "completer");
                ((Executor) u1Var.f232h).execute(new t.v0(0, u1Var, completer));
                return "FetchData for CameraAvailability";
            case 20:
                t.m mVar = (t.m) this.f32631c;
                mVar.f33152c = completer;
                return "RequestCompleteListener[" + mVar + "]";
            default:
                d2 d2Var = (d2) this.f32631c;
                ((g0.r1) d2Var.f19527b.f19732g).f19735a.put("androidx.camera.video.VideoCapture.streamUpdate", Integer.valueOf(completer.hashCode()));
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                x0.g0 g0Var = new x0.g0(atomicBoolean, completer, d2Var);
                completer.a(new q0.o(atomicBoolean, d2Var, g0Var, 14), hl.d.j());
                d2Var.f19527b.b(g0Var);
                return String.format("%s[0x%x]", "androidx.camera.video.VideoCapture.streamUpdate", Integer.valueOf(completer.hashCode()));
        }
    }

    @Override // d8.q
    public void onPurchaseHistoryResponse(d8.j jVar, List list) {
        List list2;
        jh.b bVar = (jh.b) this.f32631c;
        yi.l lVarH = ya.e.h(jVar);
        if (list == null) {
            list2 = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                PurchaseHistoryRecord purchaseHistoryRecord = (PurchaseHistoryRecord) it.next();
                JSONObject jSONObject = purchaseHistoryRecord.f2430c;
                JSONObject jSONObject2 = purchaseHistoryRecord.f2430c;
                Long lValueOf = Long.valueOf(jSONObject.optLong("purchaseTime"));
                String strB = purchaseHistoryRecord.b();
                String str = purchaseHistoryRecord.f2429b;
                ArrayList arrayListA = purchaseHistoryRecord.a();
                String strOptString = jSONObject2.optString("developerPayload");
                String str2 = purchaseHistoryRecord.f2428a;
                Long lValueOf2 = Long.valueOf(jSONObject2.optInt(DiscardedEvent.JsonKeys.QUANTITY, 1));
                yi.v vVar = new yi.v();
                vVar.f45732a = lValueOf2;
                vVar.f45733b = lValueOf;
                vVar.f45734c = strOptString;
                if (str2 == null) {
                    throw new IllegalStateException("Nonnull field \"originalJson\" is null.");
                }
                vVar.f45735d = str2;
                if (strB == null) {
                    throw new IllegalStateException("Nonnull field \"purchaseToken\" is null.");
                }
                vVar.f45736e = strB;
                if (str == null) {
                    throw new IllegalStateException("Nonnull field \"signature\" is null.");
                }
                vVar.f45737f = str;
                vVar.f45738g = arrayListA;
                arrayList.add(vVar);
            }
            list2 = arrayList;
        }
        yi.w wVar = new yi.w();
        wVar.f45739a = lVarH;
        if (list2 == null) {
            throw new IllegalStateException("Nonnull field \"purchases\" is null.");
        }
        wVar.f45740b = list2;
        bVar.e(wVar);
    }

    @Override // d8.r
    public void onQueryPurchasesResponse(d8.j jVar, List list) {
        jh.b bVar = (jh.b) this.f32631c;
        yi.l lVarH = ya.e.h(jVar);
        List listI = ya.e.i(list);
        yi.y yVar = new yi.y();
        yVar.f45746a = lVarH;
        if (listI == null) {
            throw new IllegalStateException("Nonnull field \"purchases\" is null.");
        }
        yVar.f45747b = listI;
        bVar.e(yVar);
    }

    public /* synthetic */ q(int i, Object obj, Object obj2) {
        this.f32630b = i;
        this.f32631c = obj2;
    }

    @Override // k0.a
    public ed.d apply(Object obj) {
        switch (this.f32630b) {
            case 7:
                t.m0 m0Var = (t.m0) this.f32631c;
                if (!Boolean.TRUE.equals((Boolean) obj)) {
                    return k0.l.f26777d;
                }
                long j10 = m0Var.f33161g;
                ScheduledExecutorService scheduledExecutorService = m0Var.f33157c;
                t.o oVar = m0Var.f33158d;
                qg.a aVar = new qg.a(22);
                long millis = TimeUnit.NANOSECONDS.toMillis(j10);
                t.o0 o0Var = new t.o0(aVar);
                oVar.a(o0Var);
                m3.c0 c0Var = new m3.c0(29, oVar, o0Var);
                j0.i iVar = oVar.f33173c;
                j1.k kVar = o0Var.f33197b;
                kVar.f26173c.a(c0Var, iVar);
                return i0.o.w(new e9.g(kVar, scheduledExecutorService, millis, 4));
            default:
                return (ed.d) ((ek.o) this.f32631c).invoke(obj);
        }
    }

    public /* synthetic */ q(t3.a aVar, i4.u uVar, f4.g gVar, IOException iOException, boolean z5) {
        this.f32630b = 13;
        this.f32631c = gVar;
    }
}
