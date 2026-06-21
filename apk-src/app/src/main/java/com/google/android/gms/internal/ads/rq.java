package com.google.android.gms.internal.ads;

import android.content.Context;
import io.sentry.protocol.User;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class rq implements el.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f10020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f10021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f10022d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f10023e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f10024f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f10025g;

    public rq(Context context, u9.a aVar, String str, bs0 bs0Var) {
        this.f10020b = new Object();
        this.f10019a = 1;
        this.f10022d = str;
        this.f10021c = context.getApplicationContext();
        this.f10023e = aVar;
        this.f10024f = bs0Var;
    }

    public static final void i(rq rqVar, nl.l lVar) {
        nl.z zVar = lVar.f29545e;
        nl.y delegate = nl.z.f29578d;
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        lVar.f29545e = delegate;
        zVar.a();
        zVar.b();
    }

    @Override // el.d
    public void a() {
        ((nl.h) this.f10023e).flush();
    }

    @Override // el.d
    public nl.v b(zk.x request, long j10) throws ProtocolException {
        Intrinsics.checkNotNullParameter(request, "request");
        zk.b0 b0Var = request.f46514d;
        if (b0Var != null && b0Var.isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if ("chunked".equalsIgnoreCase(request.a("Transfer-Encoding"))) {
            if (this.f10019a == 1) {
                this.f10019a = 2;
                return new fl.b(this);
            }
            throw new IllegalStateException(("state: " + this.f10019a).toString());
        }
        if (j10 == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.f10019a == 1) {
            this.f10019a = 2;
            return new fl.e(this);
        }
        throw new IllegalStateException(("state: " + this.f10019a).toString());
    }

    @Override // el.d
    public void c(zk.x request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Proxy.Type proxyType = ((dl.j) this.f10021c).f15853b.f46386b.type();
        Intrinsics.checkNotNullExpressionValue(proxyType, "connection.route().proxy.type()");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(proxyType, "proxyType");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(request.f46512b);
        sb2.append(' ');
        zk.m url = request.f46511a;
        if (url.i || proxyType != Proxy.Type.HTTP) {
            Intrinsics.checkNotNullParameter(url, "url");
            String strB = url.b();
            String strD = url.d();
            if (strD != null) {
                strB = strB + '?' + strD;
            }
            sb2.append(strB);
        } else {
            sb2.append(url);
        }
        sb2.append(" HTTP/1.1");
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        l(request.f46513c, string);
    }

    @Override // el.d
    public void cancel() {
        Socket socket = ((dl.j) this.f10021c).f15854c;
        if (socket != null) {
            al.b.d(socket);
        }
    }

    @Override // el.d
    public long d(zk.d0 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (!el.e.a(response)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(zk.d0.a("Transfer-Encoding", response))) {
            return -1L;
        }
        return al.b.i(response);
    }

    @Override // el.d
    public zk.c0 e(boolean z5) {
        com.google.android.gms.ads.identifier.c cVar = (com.google.android.gms.ads.identifier.c) this.f10024f;
        int i = this.f10019a;
        if (i != 1 && i != 2 && i != 3) {
            throw new IllegalStateException(("state: " + this.f10019a).toString());
        }
        zk.l lVar = null;
        try {
            String strQ = ((nl.i) cVar.f2535d).q(cVar.f2534c);
            cVar.f2534c -= (long) strQ.length();
            ad.m0 m0VarU = com.google.android.gms.internal.measurement.d4.u(strQ);
            int i10 = m0VarU.f839c;
            zk.c0 c0Var = new zk.c0();
            zk.v protocol = (zk.v) m0VarU.f840d;
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            c0Var.f46332b = protocol;
            c0Var.f46333c = i10;
            String message = (String) m0VarU.f841e;
            Intrinsics.checkNotNullParameter(message, "message");
            c0Var.f46334d = message;
            zk.k headers = cVar.b0();
            Intrinsics.checkNotNullParameter(headers, "headers");
            c0Var.f46336f = headers.e();
            if (z5 && i10 == 100) {
                return null;
            }
            if (i10 == 100) {
                this.f10019a = 3;
                return c0Var;
            }
            if (102 > i10 || i10 >= 200) {
                this.f10019a = 4;
                return c0Var;
            }
            this.f10019a = 3;
            return c0Var;
        } catch (EOFException e3) {
            zk.m mVar = ((dl.j) this.f10021c).f15853b.f46385a.f46315h;
            mVar.getClass();
            Intrinsics.checkNotNullParameter("/...", "link");
            try {
                zk.l lVar2 = new zk.l();
                lVar2.d(mVar, "/...");
                lVar = lVar2;
            } catch (IllegalArgumentException unused) {
            }
            Intrinsics.b(lVar);
            Intrinsics.checkNotNullParameter("", User.JsonKeys.USERNAME);
            lVar.f46416b = zk.i.b(0, 0, 251, "", " \"':;<=>@[]^`{}|/\\?#");
            Intrinsics.checkNotNullParameter("", "password");
            lVar.f46417c = zk.i.b(0, 0, 251, "", " \"':;<=>@[]^`{}|/\\?#");
            throw new IOException(om1.k("unexpected end of stream on ", lVar.a().f46431h), e3);
        }
    }

    @Override // el.d
    public dl.j f() {
        return (dl.j) this.f10021c;
    }

    @Override // el.d
    public nl.x g(zk.d0 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (!el.e.a(response)) {
            return k(0L);
        }
        if ("chunked".equalsIgnoreCase(zk.d0.a("Transfer-Encoding", response))) {
            zk.m mVar = response.f46346b.f46511a;
            if (this.f10019a == 4) {
                this.f10019a = 5;
                return new fl.c(this, mVar);
            }
            throw new IllegalStateException(("state: " + this.f10019a).toString());
        }
        long jI = al.b.i(response);
        if (jI != -1) {
            return k(jI);
        }
        if (this.f10019a == 4) {
            this.f10019a = 5;
            ((dl.j) this.f10021c).k();
            return new fl.f(this);
        }
        throw new IllegalStateException(("state: " + this.f10019a).toString());
    }

    @Override // el.d
    public void h() {
        ((nl.h) this.f10023e).flush();
    }

    public boolean j() {
        return this.f10019a < ((List) this.f10024f).size() || !((ArrayList) this.f10025g).isEmpty();
    }

    public fl.d k(long j10) {
        if (this.f10019a == 4) {
            this.f10019a = 5;
            return new fl.d(this, j10);
        }
        throw new IllegalStateException(("state: " + this.f10019a).toString());
    }

    public void l(zk.k headers, String requestLine) {
        nl.h hVar = (nl.h) this.f10023e;
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(requestLine, "requestLine");
        if (this.f10019a != 0) {
            throw new IllegalStateException(("state: " + this.f10019a).toString());
        }
        hVar.t(requestLine).t("\r\n");
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            hVar.t(headers.c(i)).t(": ").t(headers.f(i)).t("\r\n");
        }
        hVar.t("\r\n");
        this.f10019a = 1;
    }

    public qq m() {
        xr0 xr0VarK = xr0.k((Context) this.f10021c, 6);
        xr0VarK.h();
        qq qqVar = new qq();
        t9.c0.m("loadJavascriptEngine > Before UI_THREAD_EXECUTOR");
        hx.f6284f.execute(new l81(7, this, qqVar));
        t9.c0.m("loadNewJavascriptEngine: Promise created");
        qqVar.e(new nq(this, qqVar, xr0VarK), new nq(this, qqVar, xr0VarK));
        return qqVar;
    }

    public pq n() {
        t9.c0.m("getEngine: Trying to acquire lock");
        Object obj = this.f10020b;
        synchronized (obj) {
            try {
                t9.c0.m("getEngine: Lock acquired");
                t9.c0.m("refreshIfDestroyed: Trying to acquire lock");
                synchronized (obj) {
                    try {
                        t9.c0.m("refreshIfDestroyed: Lock acquired");
                        qq qqVar = (qq) this.f10025g;
                        if (qqVar != null && this.f10019a == 0) {
                            qqVar.e(new cf(8, this), fp.f5407c);
                        }
                    } finally {
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        t9.c0.m("refreshIfDestroyed: Lock released");
        qq qqVar2 = (qq) this.f10025g;
        if (qqVar2 != null && ((AtomicInteger) qqVar2.f2254c).get() != -1) {
            int i = this.f10019a;
            if (i == 0) {
                t9.c0.m("getEngine (NO_UPDATE): Lock released");
                return ((qq) this.f10025g).h();
            }
            if (i != 1) {
                t9.c0.m("getEngine (UPDATING): Lock released");
                return ((qq) this.f10025g).h();
            }
            this.f10019a = 2;
            m();
            t9.c0.m("getEngine (PENDING_UPDATE): Lock released");
            return ((qq) this.f10025g).h();
        }
        this.f10019a = 2;
        this.f10025g = m();
        t9.c0.m("getEngine (NULL or REJECTED): Lock released");
        return ((qq) this.f10025g).h();
    }

    public rq(zk.a address, a0.b1 routeDatabase, dl.g call) {
        List proxies;
        zk.i eventListener = zk.i.f46409d;
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(routeDatabase, "routeDatabase");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        this.f10021c = address;
        this.f10022d = routeDatabase;
        this.f10023e = call;
        kotlin.collections.b0 b0Var = kotlin.collections.b0.f27475b;
        this.f10024f = b0Var;
        this.f10020b = b0Var;
        this.f10025g = new ArrayList();
        zk.m url = address.f46315h;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(url, "url");
        URI uriF = url.f();
        if (uriF.getHost() == null) {
            proxies = al.b.j(Proxy.NO_PROXY);
        } else {
            List<Proxy> proxiesOrNull = address.f46314g.select(uriF);
            List<Proxy> list = proxiesOrNull;
            if (list == null || list.isEmpty()) {
                proxies = al.b.j(Proxy.NO_PROXY);
            } else {
                Intrinsics.checkNotNullExpressionValue(proxiesOrNull, "proxiesOrNull");
                proxies = al.b.v(proxiesOrNull);
            }
        }
        this.f10024f = proxies;
        this.f10019a = 0;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(proxies, "proxies");
    }

    public rq(zk.u uVar, dl.j connection, nl.r source, nl.q sink) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f10020b = uVar;
        this.f10021c = connection;
        this.f10022d = source;
        this.f10023e = sink;
        this.f10024f = new com.google.android.gms.ads.identifier.c(source);
    }
}
