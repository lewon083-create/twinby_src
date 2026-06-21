package gl;

import ad.m0;
import com.google.android.gms.internal.measurement.d4;
import io.sentry.rrweb.RRWebVideoEvent;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class r implements el.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final List f20245g = al.b.j("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", RRWebVideoEvent.JsonKeys.ENCODING, "upgrade", ":method", ":path", ":scheme", ":authority");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final List f20246h = al.b.j("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", RRWebVideoEvent.JsonKeys.ENCODING, "upgrade");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dl.j f20247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final el.f f20248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f20249c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile y f20250d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final zk.v f20251e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f20252f;

    public r(zk.u client, dl.j connection, el.f chain, q http2Connection) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(http2Connection, "http2Connection");
        this.f20247a = connection;
        this.f20248b = chain;
        this.f20249c = http2Connection;
        List list = client.f46491s;
        zk.v vVar = zk.v.H2_PRIOR_KNOWLEDGE;
        this.f20251e = list.contains(vVar) ? vVar : zk.v.HTTP_2;
    }

    @Override // el.d
    public final void a() {
        y yVar = this.f20250d;
        Intrinsics.b(yVar);
        yVar.f().close();
    }

    @Override // el.d
    public final nl.v b(zk.x request, long j10) {
        Intrinsics.checkNotNullParameter(request, "request");
        y yVar = this.f20250d;
        Intrinsics.b(yVar);
        return yVar.f();
    }

    @Override // el.d
    public final void c(zk.x request) throws IOException {
        int i;
        y yVar;
        boolean z5;
        Intrinsics.checkNotNullParameter(request, "request");
        if (this.f20250d != null) {
            return;
        }
        boolean z10 = request.f46514d != null;
        Intrinsics.checkNotNullParameter(request, "request");
        zk.k kVar = request.f46513c;
        ArrayList requestHeaders = new ArrayList(kVar.size() + 4);
        requestHeaders.add(new c(c.f20167f, request.f46512b));
        nl.j jVar = c.f20168g;
        zk.m url = request.f46511a;
        Intrinsics.checkNotNullParameter(url, "url");
        String strB = url.b();
        String strD = url.d();
        if (strD != null) {
            strB = strB + '?' + strD;
        }
        requestHeaders.add(new c(jVar, strB));
        String strA = request.a("Host");
        if (strA != null) {
            requestHeaders.add(new c(c.i, strA));
        }
        requestHeaders.add(new c(c.f20169h, url.f46424a));
        int size = kVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            String strC = kVar.c(i10);
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = strC.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (!f20245g.contains(lowerCase) || (Intrinsics.a(lowerCase, "te") && Intrinsics.a(kVar.f(i10), "trailers"))) {
                requestHeaders.add(new c(lowerCase, kVar.f(i10)));
            }
        }
        q qVar = this.f20249c;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        boolean z11 = !z10;
        synchronized (qVar.f20242x) {
            synchronized (qVar) {
                try {
                    if (qVar.f20225f > 1073741823) {
                        qVar.i(b.REFUSED_STREAM);
                    }
                    if (qVar.f20226g) {
                        throw new a();
                    }
                    i = qVar.f20225f;
                    qVar.f20225f = i + 2;
                    yVar = new y(i, qVar, z11, false, null);
                    z5 = !z10 || qVar.f20239u >= qVar.f20240v || yVar.f20278e >= yVar.f20279f;
                    if (yVar.h()) {
                        qVar.f20222c.put(Integer.valueOf(i), yVar);
                    }
                    Unit unit = Unit.f27471a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            qVar.f20242x.i(z11, i, requestHeaders);
        }
        if (z5) {
            qVar.f20242x.flush();
        }
        this.f20250d = yVar;
        if (this.f20252f) {
            y yVar2 = this.f20250d;
            Intrinsics.b(yVar2);
            yVar2.e(b.CANCEL);
            throw new IOException("Canceled");
        }
        y yVar3 = this.f20250d;
        Intrinsics.b(yVar3);
        x xVar = yVar3.f20283k;
        long j10 = this.f20248b.f16442g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        xVar.g(j10);
        y yVar4 = this.f20250d;
        Intrinsics.b(yVar4);
        yVar4.f20284l.g(this.f20248b.f16443h);
    }

    @Override // el.d
    public final void cancel() {
        this.f20252f = true;
        y yVar = this.f20250d;
        if (yVar != null) {
            yVar.e(b.CANCEL);
        }
    }

    @Override // el.d
    public final long d(zk.d0 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (el.e.a(response)) {
            return al.b.i(response);
        }
        return 0L;
    }

    @Override // el.d
    public final zk.c0 e(boolean z5) throws IOException {
        zk.k headerBlock;
        y yVar = this.f20250d;
        if (yVar == null) {
            throw new IOException("stream wasn't created");
        }
        synchronized (yVar) {
            yVar.f20283k.h();
            while (yVar.f20280g.isEmpty() && yVar.f20285m == null) {
                try {
                    try {
                        yVar.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th2) {
                    yVar.f20283k.k();
                    throw th2;
                }
            }
            yVar.f20283k.k();
            if (yVar.f20280g.isEmpty()) {
                IOException iOException = yVar.f20286n;
                if (iOException != null) {
                    throw iOException;
                }
                b bVar = yVar.f20285m;
                Intrinsics.b(bVar);
                throw new d0(bVar);
            }
            Object objRemoveFirst = yVar.f20280g.removeFirst();
            Intrinsics.checkNotNullExpressionValue(objRemoveFirst, "headersQueue.removeFirst()");
            headerBlock = (zk.k) objRemoveFirst;
        }
        zk.v protocol = this.f20251e;
        Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        ArrayList arrayList = new ArrayList(20);
        int size = headerBlock.size();
        m0 m0VarU = null;
        for (int i = 0; i < size; i++) {
            String name = headerBlock.c(i);
            String value = headerBlock.f(i);
            if (Intrinsics.a(name, ":status")) {
                m0VarU = d4.u("HTTP/1.1 " + value);
            } else if (!f20246h.contains(name)) {
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(value, "value");
                arrayList.add(name);
                arrayList.add(StringsKt.P(value).toString());
            }
        }
        if (m0VarU == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        zk.c0 c0Var = new zk.c0();
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        c0Var.f46332b = protocol;
        c0Var.f46333c = m0VarU.f839c;
        String message = (String) m0VarU.f841e;
        Intrinsics.checkNotNullParameter(message, "message");
        c0Var.f46334d = message;
        zk.k headers = new zk.k((String[]) arrayList.toArray(new String[0]));
        Intrinsics.checkNotNullParameter(headers, "headers");
        c0Var.f46336f = headers.e();
        if (z5 && c0Var.f46333c == 100) {
            return null;
        }
        return c0Var;
    }

    @Override // el.d
    public final dl.j f() {
        return this.f20247a;
    }

    @Override // el.d
    public final nl.x g(zk.d0 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        y yVar = this.f20250d;
        Intrinsics.b(yVar);
        return yVar.i;
    }

    @Override // el.d
    public final void h() {
        this.f20249c.flush();
    }
}
