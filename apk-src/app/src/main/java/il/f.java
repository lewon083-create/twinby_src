package il;

import fh.zf;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class f implements n {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e f21374f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f21375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f21376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Method f21377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Method f21378d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Method f21379e;

    static {
        Intrinsics.checkNotNullParameter("com.google.android.gms.org.conscrypt", "packageName");
        f21374f = new e();
    }

    public f(Class sslSocketClass) throws NoSuchMethodException {
        Intrinsics.checkNotNullParameter(sslSocketClass, "sslSocketClass");
        this.f21375a = sslSocketClass;
        Method declaredMethod = sslSocketClass.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        Intrinsics.checkNotNullExpressionValue(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f21376b = declaredMethod;
        this.f21377c = sslSocketClass.getMethod("setHostname", String.class);
        this.f21378d = sslSocketClass.getMethod("getAlpnSelectedProtocol", null);
        this.f21379e = sslSocketClass.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // il.n
    public final boolean a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return this.f21375a.isInstance(sslSocket);
    }

    @Override // il.n
    public final boolean b() {
        boolean z5 = hl.c.f20736e;
        return hl.c.f20736e;
    }

    @Override // il.n
    public final String c(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (a(sslSocket)) {
            try {
                byte[] bArr = (byte[]) this.f21378d.invoke(sslSocket, null);
                if (bArr != null) {
                    return new String(bArr, Charsets.UTF_8);
                }
            } catch (IllegalAccessException e3) {
                throw new AssertionError(e3);
            } catch (InvocationTargetException e7) {
                Throwable cause = e7.getCause();
                if (!(cause instanceof NullPointerException) || !Intrinsics.a(((NullPointerException) cause).getMessage(), "ssl == null")) {
                    throw new AssertionError(e7);
                }
            }
        }
        return null;
    }

    @Override // il.n
    public final void d(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (a(sslSocket)) {
            try {
                this.f21376b.invoke(sslSocket, Boolean.TRUE);
                if (str != null) {
                    this.f21377c.invoke(sslSocket, str);
                }
                Method method = this.f21379e;
                hl.n nVar = hl.n.f20755a;
                method.invoke(sslSocket, zf.q(protocols));
            } catch (IllegalAccessException e3) {
                throw new AssertionError(e3);
            } catch (InvocationTargetException e7) {
                throw new AssertionError(e7);
            }
        }
    }
}
