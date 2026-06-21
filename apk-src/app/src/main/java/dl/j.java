package dl;

import a0.b1;
import com.google.android.gms.internal.ads.rq;
import com.google.android.gms.internal.ads.ur;
import g0.a2;
import gl.c0;
import gl.q;
import gl.y;
import hl.n;
import i0.o;
import io.sentry.MeasurementUnit;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import nl.r;
import nl.z;
import zk.d0;
import zk.e0;
import zk.g0;
import zk.m;
import zk.u;
import zk.v;
import zk.w;
import zk.x;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class j extends gl.i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g0 f15853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Socket f15854c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Socket f15855d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public zk.j f15856e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public v f15857f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public q f15858g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public r f15859h;
    public nl.q i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f15860j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f15861k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f15862l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f15863m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f15864n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f15865o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f15866p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f15867q;

    public j(k connectionPool, g0 route) {
        Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
        Intrinsics.checkNotNullParameter(route, "route");
        this.f15853b = route;
        this.f15865o = 1;
        this.f15866p = new ArrayList();
        this.f15867q = Long.MAX_VALUE;
    }

    public static void d(u client, g0 failedRoute, IOException failure) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(failedRoute, "failedRoute");
        Intrinsics.checkNotNullParameter(failure, "failure");
        if (failedRoute.f46386b.type() != Proxy.Type.DIRECT) {
            zk.a aVar = failedRoute.f46385a;
            aVar.f46314g.connectFailed(aVar.f46315h.f(), failedRoute.f46386b.address(), failure);
        }
        b1 b1Var = client.A;
        synchronized (b1Var) {
            Intrinsics.checkNotNullParameter(failedRoute, "failedRoute");
            ((LinkedHashSet) b1Var.f45c).add(failedRoute);
        }
    }

    @Override // gl.i
    public final synchronized void a(q connection, c0 settings) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.f15865o = (settings.f20173a & 16) != 0 ? settings.f20174b[4] : Integer.MAX_VALUE;
    }

    @Override // gl.i
    public final void b(y stream) {
        Intrinsics.checkNotNullParameter(stream, "stream");
        stream.c(gl.b.REFUSED_STREAM, null);
    }

    public final void c(int i, int i10, int i11, boolean z5, g call) throws Throwable {
        g0 g0Var;
        zk.i eventListener = zk.i.f46409d;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        if (this.f15857f != null) {
            throw new IllegalStateException("already connected");
        }
        List list = this.f15853b.f46385a.f46316j;
        ur urVar = new ur(list);
        zk.a aVar = this.f15853b.f46385a;
        if (aVar.f46310c == null) {
            if (!list.contains(zk.g.f46380f)) {
                throw new l(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.f15853b.f46385a.f46315h.f46427d;
            n nVar = n.f20755a;
            if (!n.f20755a.h(str)) {
                throw new l(new UnknownServiceException(pe.a.f("CLEARTEXT communication to ", str, " not permitted by network security policy")));
            }
        } else if (aVar.i.contains(v.H2_PRIOR_KNOWLEDGE)) {
            throw new l(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        l lVar = null;
        do {
            try {
                g0 g0Var2 = this.f15853b;
                if (g0Var2.f46385a.f46310c != null && g0Var2.f46386b.type() == Proxy.Type.HTTP) {
                    f(i, i10, i11, call);
                    if (this.f15854c == null) {
                    }
                    g0Var = this.f15853b;
                    if (g0Var.f46385a.f46310c == null && g0Var.f46386b.type() == Proxy.Type.HTTP && this.f15854c == null) {
                        throw new l(new ProtocolException("Too many tunnel connections attempted: 21"));
                    }
                    this.f15867q = System.nanoTime();
                    return;
                }
                e(i, i10, call);
                g(urVar, call);
                g0 g0Var3 = this.f15853b;
                InetSocketAddress inetSocketAddress = g0Var3.f46387c;
                Proxy proxy = g0Var3.f46386b;
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
                Intrinsics.checkNotNullParameter(proxy, "proxy");
                g0Var = this.f15853b;
                if (g0Var.f46385a.f46310c == null) {
                }
                this.f15867q = System.nanoTime();
                return;
            } catch (IOException e3) {
                Socket socket = this.f15855d;
                if (socket != null) {
                    al.b.d(socket);
                }
                Socket socket2 = this.f15854c;
                if (socket2 != null) {
                    al.b.d(socket2);
                }
                this.f15855d = null;
                this.f15854c = null;
                this.f15859h = null;
                this.i = null;
                this.f15856e = null;
                this.f15857f = null;
                this.f15858g = null;
                this.f15865o = 1;
                g0 g0Var4 = this.f15853b;
                InetSocketAddress inetSocketAddress2 = g0Var4.f46387c;
                Proxy proxy2 = g0Var4.f46386b;
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(inetSocketAddress2, "inetSocketAddress");
                Intrinsics.checkNotNullParameter(proxy2, "proxy");
                Intrinsics.checkNotNullParameter(e3, "ioe");
                if (lVar == null) {
                    lVar = new l(e3);
                } else {
                    Intrinsics.checkNotNullParameter(e3, "e");
                    ij.d.a(lVar.f15875b, e3);
                    lVar.f15876c = e3;
                }
                if (!z5) {
                    throw lVar;
                }
                Intrinsics.checkNotNullParameter(e3, "e");
                urVar.f11052c = true;
                if (!urVar.f11051b) {
                    throw lVar;
                }
                if (e3 instanceof ProtocolException) {
                    throw lVar;
                }
                if (e3 instanceof InterruptedIOException) {
                    throw lVar;
                }
                if ((e3 instanceof SSLHandshakeException) && (e3.getCause() instanceof CertificateException)) {
                    throw lVar;
                }
                if (e3 instanceof SSLPeerUnverifiedException) {
                    throw lVar;
                }
            }
        } while (e3 instanceof SSLException);
        throw lVar;
    }

    public final void e(int i, int i10, g call) throws IOException {
        Socket socketCreateSocket;
        g0 g0Var = this.f15853b;
        Proxy proxy = g0Var.f46386b;
        zk.a aVar = g0Var.f46385a;
        Proxy.Type type = proxy.type();
        int i11 = type == null ? -1 : h.f15849a[type.ordinal()];
        if (i11 == 1 || i11 == 2) {
            socketCreateSocket = aVar.f46309b.createSocket();
            Intrinsics.b(socketCreateSocket);
        } else {
            socketCreateSocket = new Socket(proxy);
        }
        this.f15854c = socketCreateSocket;
        InetSocketAddress inetSocketAddress = this.f15853b.f46387c;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        socketCreateSocket.setSoTimeout(i10);
        try {
            n nVar = n.f20755a;
            n.f20755a.e(socketCreateSocket, this.f15853b.f46387c, i);
            try {
                this.f15859h = o.g(o.P(socketCreateSocket));
                this.i = o.f(o.N(socketCreateSocket));
            } catch (NullPointerException e3) {
                if (Intrinsics.a(e3.getMessage(), "throw with null exception")) {
                    throw new IOException(e3);
                }
            }
        } catch (ConnectException e7) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f15853b.f46387c);
            connectException.initCause(e7);
            throw connectException;
        }
    }

    public final void f(int i, int i10, int i11, g gVar) throws IOException {
        w wVar = new w();
        g0 g0Var = this.f15853b;
        m url = g0Var.f46385a.f46315h;
        Intrinsics.checkNotNullParameter(url, "url");
        wVar.f46506a = url;
        wVar.c("CONNECT", null);
        zk.a aVar = g0Var.f46385a;
        wVar.b("Host", al.b.u(aVar.f46315h, true));
        wVar.b("Proxy-Connection", "Keep-Alive");
        wVar.b("User-Agent", "okhttp/4.12.0");
        x request = wVar.a();
        a2 a2Var = new a2(2);
        Intrinsics.checkNotNullParameter(request, "request");
        v protocol = v.HTTP_1_1;
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter("Preemptive Authenticate", "message");
        e0 e0Var = al.b.f1043c;
        Intrinsics.checkNotNullParameter("Proxy-Authenticate", "name");
        Intrinsics.checkNotNullParameter("OkHttp-Preemptive", "value");
        Intrinsics.checkNotNullParameter("Proxy-Authenticate", "name");
        Intrinsics.checkNotNullParameter("OkHttp-Preemptive", "value");
        ya.e.c("Proxy-Authenticate");
        ya.e.d("OkHttp-Preemptive", "Proxy-Authenticate");
        a2Var.l("Proxy-Authenticate");
        a2Var.f("Proxy-Authenticate", "OkHttp-Preemptive");
        d0 response = new d0(request, protocol, "Preemptive Authenticate", 407, null, a2Var.g(), e0Var, null, null, null, -1L, -1L, null);
        ((zk.i) aVar.f46313f).getClass();
        Intrinsics.checkNotNullParameter(response, "response");
        m mVar = request.f46511a;
        e(i, i10, gVar);
        String str = "CONNECT " + al.b.u(mVar, true) + " HTTP/1.1";
        r rVar = this.f15859h;
        Intrinsics.b(rVar);
        nl.q qVar = this.i;
        Intrinsics.b(qVar);
        rq rqVar = new rq((u) null, this, rVar, qVar);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        rVar.f29562b.timeout().g(i10);
        qVar.f29559b.timeout().g(i11);
        rqVar.l(request.f46513c, str);
        rqVar.a();
        zk.c0 c0VarE = rqVar.e(false);
        Intrinsics.b(c0VarE);
        Intrinsics.checkNotNullParameter(request, "request");
        c0VarE.f46331a = request;
        d0 response2 = c0VarE.a();
        int i12 = response2.f46349e;
        Intrinsics.checkNotNullParameter(response2, "response");
        long jI = al.b.i(response2);
        if (jI != -1) {
            fl.d dVarK = rqVar.k(jI);
            al.b.s(dVarK, Integer.MAX_VALUE);
            dVarK.close();
        }
        if (i12 == 200) {
            if (!rVar.f29563c.h() || !qVar.f29560c.h()) {
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
        } else {
            if (i12 != 407) {
                throw new IOException(l7.o.i(i12, "Unexpected response code for CONNECT: "));
            }
            ((zk.i) aVar.f46313f).getClass();
            Intrinsics.checkNotNullParameter(response2, "response");
            throw new IOException("Failed to authenticate with proxy");
        }
    }

    public final void g(ur urVar, g call) throws Throwable {
        SSLSocket sSLSocket;
        int i;
        SSLSocket sSLSocket2;
        String strF;
        v vVarH = v.HTTP_1_1;
        zk.a aVar = this.f15853b.f46385a;
        if (aVar.f46310c == null) {
            List list = aVar.i;
            v vVar = v.H2_PRIOR_KNOWLEDGE;
            if (!list.contains(vVar)) {
                this.f15855d = this.f15854c;
                this.f15857f = vVarH;
                return;
            } else {
                this.f15855d = this.f15854c;
                this.f15857f = vVar;
                l();
                return;
            }
        }
        Intrinsics.checkNotNullParameter(call, "call");
        zk.a aVar2 = this.f15853b.f46385a;
        SSLSocketFactory sSLSocketFactory = aVar2.f46310c;
        try {
            Intrinsics.b(sSLSocketFactory);
            Socket socket = this.f15854c;
            m mVar = aVar2.f46315h;
            i = 1;
            Socket socketCreateSocket = sSLSocketFactory.createSocket(socket, mVar.f46427d, mVar.f46428e, true);
            Intrinsics.c(socketCreateSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            sSLSocket2 = (SSLSocket) socketCreateSocket;
        } catch (Throwable th2) {
            th = th2;
            sSLSocket = null;
        }
        try {
            zk.g gVarE = urVar.e(sSLSocket2);
            if (gVarE.f46382b) {
                n nVar = n.f20755a;
                n.f20755a.d(sSLSocket2, aVar2.f46315h.f46427d, aVar2.i);
            }
            sSLSocket2.startHandshake();
            SSLSession sslSocketSession = sSLSocket2.getSession();
            Intrinsics.checkNotNullExpressionValue(sslSocketSession, "sslSocketSession");
            zk.j jVarR = wa.a.r(sslSocketSession);
            HostnameVerifier hostnameVerifier = aVar2.f46311d;
            Intrinsics.b(hostnameVerifier);
            boolean zVerify = hostnameVerifier.verify(aVar2.f46315h.f46427d, sslSocketSession);
            int i10 = 0;
            if (zVerify) {
                zk.d dVar = aVar2.f46312e;
                Intrinsics.b(dVar);
                this.f15856e = new zk.j(jVarR.f46410a, jVarR.f46411b, jVarR.f46412c, new i(dVar, jVarR, aVar2, i10));
                dVar.a(aVar2.f46315h.f46427d, new c7.i(i, this));
                if (gVarE.f46382b) {
                    n nVar2 = n.f20755a;
                    strF = n.f20755a.f(sSLSocket2);
                } else {
                    strF = null;
                }
                this.f15855d = sSLSocket2;
                this.f15859h = o.g(o.P(sSLSocket2));
                this.i = o.f(o.N(sSLSocket2));
                if (strF != null) {
                    vVarH = com.google.android.gms.internal.auth.m.h(strF);
                }
                this.f15857f = vVarH;
                n nVar3 = n.f20755a;
                n.f20755a.a(sSLSocket2);
                Intrinsics.checkNotNullParameter(call, "call");
                if (this.f15857f == v.HTTP_2) {
                    l();
                    return;
                }
                return;
            }
            List listA = jVarR.a();
            if (listA.isEmpty()) {
                throw new SSLPeerUnverifiedException("Hostname " + aVar2.f46315h.f46427d + " not verified (no certificates)");
            }
            Object obj = listA.get(0);
            Intrinsics.c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate certificate = (X509Certificate) obj;
            StringBuilder sb2 = new StringBuilder("\n              |Hostname ");
            sb2.append(aVar2.f46315h.f46427d);
            sb2.append(" not verified:\n              |    certificate: ");
            zk.d dVar2 = zk.d.f46343c;
            sb2.append(k3.f.w(certificate));
            sb2.append("\n              |    DN: ");
            sb2.append(certificate.getSubjectDN().getName());
            sb2.append("\n              |    subjectAltNames: ");
            Intrinsics.checkNotNullParameter(certificate, "certificate");
            sb2.append(CollectionsKt.L(ll.c.a(certificate, 7), ll.c.a(certificate, 2)));
            sb2.append("\n              ");
            throw new SSLPeerUnverifiedException(kotlin.text.u.c(sb2.toString()));
        } catch (Throwable th3) {
            th = th3;
            sSLSocket = sSLSocket2;
            if (sSLSocket != null) {
                n nVar4 = n.f20755a;
                n.f20755a.a(sSLSocket);
            }
            if (sSLSocket != null) {
                al.b.d(sSLSocket);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00be A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean h(zk.a r10, java.util.List r11) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: dl.j.h(zk.a, java.util.List):boolean");
    }

    public final boolean i(boolean z5) {
        long j10;
        byte[] bArr = al.b.f1041a;
        long jNanoTime = System.nanoTime();
        Socket socket = this.f15854c;
        Intrinsics.b(socket);
        Socket socket2 = this.f15855d;
        Intrinsics.b(socket2);
        r source = this.f15859h;
        Intrinsics.b(source);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        q qVar = this.f15858g;
        if (qVar != null) {
            synchronized (qVar) {
                if (qVar.f20226g) {
                    return false;
                }
                if (qVar.f20233o < qVar.f20232n) {
                    if (jNanoTime >= qVar.f20234p) {
                        return false;
                    }
                }
                return true;
            }
        }
        synchronized (this) {
            j10 = jNanoTime - this.f15867q;
        }
        if (j10 < 10000000000L || !z5) {
            return true;
        }
        Intrinsics.checkNotNullParameter(socket2, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        try {
            int soTimeout = socket2.getSoTimeout();
            try {
                socket2.setSoTimeout(1);
                return !source.a();
            } finally {
                socket2.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public final el.d j(u client, el.f chain) throws SocketException {
        int i = chain.f16442g;
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(chain, "chain");
        Socket socket = this.f15855d;
        Intrinsics.b(socket);
        r rVar = this.f15859h;
        Intrinsics.b(rVar);
        nl.q qVar = this.i;
        Intrinsics.b(qVar);
        q qVar2 = this.f15858g;
        if (qVar2 != null) {
            return new gl.r(client, this, chain, qVar2);
        }
        socket.setSoTimeout(i);
        z zVarTimeout = rVar.f29562b.timeout();
        long j10 = i;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        zVarTimeout.g(j10);
        qVar.f29559b.timeout().g(chain.f16443h);
        return new rq(client, this, rVar, qVar);
    }

    public final synchronized void k() {
        this.f15860j = true;
    }

    public final void l() throws SocketException {
        Socket socket = this.f15855d;
        Intrinsics.b(socket);
        r source = this.f15859h;
        Intrinsics.b(source);
        nl.q sink = this.i;
        Intrinsics.b(sink);
        socket.setSoTimeout(0);
        cl.d taskRunner = cl.d.i;
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        q9.o oVar = new q9.o();
        oVar.f31946a = taskRunner;
        oVar.f31951f = gl.i.f20197a;
        String peerName = this.f15853b.f46385a.f46315h.f46427d;
        Intrinsics.checkNotNullParameter(socket, "socket");
        Intrinsics.checkNotNullParameter(peerName, "peerName");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(socket, "<set-?>");
        oVar.f31947b = socket;
        String str = al.b.f1047g + ' ' + peerName;
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        oVar.f31948c = str;
        Intrinsics.checkNotNullParameter(source, "<set-?>");
        oVar.f31949d = source;
        Intrinsics.checkNotNullParameter(sink, "<set-?>");
        oVar.f31950e = sink;
        Intrinsics.checkNotNullParameter(this, "listener");
        oVar.f31951f = this;
        q qVar = new q(oVar);
        this.f15858g = qVar;
        c0 c0Var = q.A;
        this.f15865o = (c0Var.f20173a & 16) != 0 ? c0Var.f20174b[4] : Integer.MAX_VALUE;
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        gl.z zVar = qVar.f20242x;
        synchronized (zVar) {
            try {
                if (zVar.f20291e) {
                    throw new IOException("closed");
                }
                Logger logger = gl.z.f20287g;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(al.b.g(">> CONNECTION " + gl.g.f20193a.b(), new Object[0]));
                }
                zVar.f20288b.v(gl.g.f20193a);
                zVar.f20288b.flush();
            } finally {
            }
        }
        gl.z zVar2 = qVar.f20242x;
        c0 settings = qVar.f20235q;
        synchronized (zVar2) {
            try {
                Intrinsics.checkNotNullParameter(settings, "settings");
                if (zVar2.f20291e) {
                    throw new IOException("closed");
                }
                zVar2.d(0, Integer.bitCount(settings.f20173a) * 6, 4, 0);
                int i = 0;
                while (i < 10) {
                    boolean z5 = true;
                    if (((1 << i) & settings.f20173a) == 0) {
                        z5 = false;
                    }
                    if (z5) {
                        zVar2.f20288b.writeShort(i != 4 ? i != 7 ? i : 4 : 3);
                        zVar2.f20288b.writeInt(settings.f20174b[i]);
                    }
                    i++;
                }
                zVar2.f20288b.flush();
            } finally {
            }
        }
        if (qVar.f20235q.a() != 65535) {
            qVar.f20242x.l(0, r1 - 65535);
        }
        taskRunner.e().c(new cl.b(qVar.f20223d, qVar.f20243y, 0), 0L);
    }

    public final String toString() {
        Object obj;
        StringBuilder sb2 = new StringBuilder("Connection{");
        g0 g0Var = this.f15853b;
        sb2.append(g0Var.f46385a.f46315h.f46427d);
        sb2.append(':');
        sb2.append(g0Var.f46385a.f46315h.f46428e);
        sb2.append(", proxy=");
        sb2.append(g0Var.f46386b);
        sb2.append(" hostAddress=");
        sb2.append(g0Var.f46387c);
        sb2.append(" cipherSuite=");
        zk.j jVar = this.f15856e;
        if (jVar == null || (obj = jVar.f46411b) == null) {
            obj = MeasurementUnit.NONE;
        }
        sb2.append(obj);
        sb2.append(" protocol=");
        sb2.append(this.f15857f);
        sb2.append('}');
        return sb2.toString();
    }
}
