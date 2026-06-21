package hl;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import fh.zf;
import il.o;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f20736e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f20737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final il.i f20738d;

    static {
        boolean z5 = false;
        if (zf.r() && Build.VERSION.SDK_INT < 30) {
            z5 = true;
        }
        f20736e = z5;
    }

    public c() throws NoSuchMethodException {
        o oVar;
        Method method;
        Method method2;
        int i = o.f21387g;
        Intrinsics.checkNotNullParameter("com.android.org.conscrypt", "packageName");
        Method method3 = null;
        try {
            Class<?> sslSocketClass = Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
            Class<?> sslSocketFactoryClass = Class.forName("com.android.org.conscrypt.OpenSSLSocketFactoryImpl");
            Class<?> paramClass = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
            Intrinsics.checkNotNullExpressionValue(paramClass, "paramsClass");
            Intrinsics.checkNotNullParameter(sslSocketClass, "sslSocketClass");
            Intrinsics.checkNotNullParameter(sslSocketFactoryClass, "sslSocketFactoryClass");
            Intrinsics.checkNotNullParameter(paramClass, "paramClass");
            oVar = new o(sslSocketClass);
        } catch (Exception e3) {
            n.f20755a.getClass();
            n.i("unable to load android socket classes", e3, 5);
            oVar = null;
        }
        il.n[] elements = {oVar, new il.m(il.f.f21374f), new il.m(il.k.f21384a), new il.m(il.h.f21380a)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        ArrayList arrayListL = p.l(elements);
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListL) {
            if (((il.n) obj).b()) {
                arrayList.add(obj);
            }
        }
        this.f20737c = arrayList;
        try {
            Class<?> cls = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls.getMethod("get", null);
            method2 = cls.getMethod("open", String.class);
            method = cls.getMethod("warnIfOpen", null);
            method3 = method4;
        } catch (Exception unused) {
            method = null;
            method2 = null;
        }
        this.f20738d = new il.i(method3, method2, method);
    }

    @Override // hl.n
    public final wa.a b(X509TrustManager trustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(trustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        il.b bVar = x509TrustManagerExtensions != null ? new il.b(trustManager, x509TrustManagerExtensions) : null;
        return bVar != null ? bVar : super.b(trustManager);
    }

    @Override // hl.n
    public final ll.d c(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        try {
            Method method = trustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            method.setAccessible(true);
            Intrinsics.checkNotNullExpressionValue(method, "method");
            return new b(trustManager, method);
        } catch (NoSuchMethodException unused) {
            return super.c(trustManager);
        }
    }

    @Override // hl.n
    public final void d(SSLSocket sslSocket, String str, List protocols) {
        Object next;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Iterator it = this.f20737c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((il.n) next).a(sslSocket)) {
                    break;
                }
            }
        }
        il.n nVar = (il.n) next;
        if (nVar != null) {
            nVar.d(sslSocket, str, protocols);
        }
    }

    @Override // hl.n
    public final void e(Socket socket, InetSocketAddress address, int i) throws IOException {
        Intrinsics.checkNotNullParameter(socket, "socket");
        Intrinsics.checkNotNullParameter(address, "address");
        try {
            socket.connect(address, i);
        } catch (ClassCastException e3) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e3;
            }
            throw new IOException("Exception in connect", e3);
        }
    }

    @Override // hl.n
    public final String f(SSLSocket sslSocket) {
        Object next;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Iterator it = this.f20737c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((il.n) next).a(sslSocket)) {
                break;
            }
        }
        il.n nVar = (il.n) next;
        if (nVar != null) {
            return nVar.c(sslSocket);
        }
        return null;
    }

    @Override // hl.n
    public final Object g() {
        Intrinsics.checkNotNullParameter("response.body().close()", "closer");
        il.i iVar = this.f20738d;
        iVar.getClass();
        Intrinsics.checkNotNullParameter("response.body().close()", "closer");
        Method method = iVar.f21381a;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(null, null);
                Method method2 = iVar.f21382b;
                Intrinsics.b(method2);
                method2.invoke(objInvoke, "response.body().close()");
                return objInvoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @Override // hl.n
    public final boolean h(String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }

    @Override // hl.n
    public final void j(Object obj, String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        il.i iVar = this.f20738d;
        iVar.getClass();
        if (obj != null) {
            try {
                Method method = iVar.f21383c;
                Intrinsics.b(method);
                method.invoke(obj, null);
                return;
            } catch (Exception unused) {
            }
        }
        n.i(message, null, 5);
    }
}
