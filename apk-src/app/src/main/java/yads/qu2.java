package yads;

import android.util.Log;
import java.net.Socket;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.X509ExtendedTrustManager;
import javax.net.ssl.X509TrustManager;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class qu2 extends X509ExtendedTrustManager implements kw2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mw2 f42395a;

    public qu2(u20 u20Var) {
        this.f42395a = new mw2(u20Var);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        ((X509TrustManager) this.f42395a.f41055b.getValue()).checkClientTrusted(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        this.f42395a.a(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        return ((X509TrustManager) this.f42395a.f41055b.getValue()).getAcceptedIssuers();
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) {
        Unit unit;
        mw2 mw2Var = this.f42395a;
        mw2Var.getClass();
        try {
            X509TrustManager x509TrustManager = (X509TrustManager) mw2Var.f41055b.getValue();
            if (e93.a()) {
                yf.b(x509TrustManager, x509CertificateArr, str, socket);
            } else {
                x509TrustManager.checkServerTrusted(x509CertificateArr, str);
            }
        } catch (CertificateException e3) {
            synchronized (mw2Var.f41058e) {
                try {
                    mw2Var.a();
                    mw2Var.b();
                    X509TrustManager x509TrustManager2 = mw2Var.f41057d;
                    if (x509TrustManager2 != null) {
                        if (e93.a()) {
                            yf.b(x509TrustManager2, x509CertificateArr, str, socket);
                        } else {
                            x509TrustManager2.checkServerTrusted(x509CertificateArr, str);
                        }
                        unit = Unit.f27471a;
                    } else {
                        unit = null;
                    }
                    if (unit != null) {
                        Unit unit2 = Unit.f27471a;
                    } else {
                        Log.w("SdkTrustManager", "Custom TrustManager is null");
                        throw e3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) throws CertificateException {
        mw2 mw2Var = this.f42395a;
        mw2Var.getClass();
        if (e93.a()) {
            yf.a((X509TrustManager) mw2Var.f41055b.getValue(), x509CertificateArr, str, socket);
        } else {
            ((X509TrustManager) mw2Var.f41055b.getValue()).checkClientTrusted(x509CertificateArr, str);
        }
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) throws CertificateException {
        mw2 mw2Var = this.f42395a;
        mw2Var.getClass();
        if (e93.a()) {
            yf.a((X509TrustManager) mw2Var.f41055b.getValue(), x509CertificateArr, str, sSLEngine);
        } else {
            ((X509TrustManager) mw2Var.f41055b.getValue()).checkClientTrusted(x509CertificateArr, str);
        }
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) {
        Unit unit;
        mw2 mw2Var = this.f42395a;
        mw2Var.getClass();
        try {
            X509TrustManager x509TrustManager = (X509TrustManager) mw2Var.f41055b.getValue();
            if (e93.a()) {
                yf.b(x509TrustManager, x509CertificateArr, str, sSLEngine);
            } else {
                x509TrustManager.checkServerTrusted(x509CertificateArr, str);
            }
        } catch (CertificateException e3) {
            synchronized (mw2Var.f41058e) {
                try {
                    mw2Var.a();
                    mw2Var.b();
                    X509TrustManager x509TrustManager2 = mw2Var.f41057d;
                    if (x509TrustManager2 != null) {
                        if (e93.a()) {
                            yf.b(x509TrustManager2, x509CertificateArr, str, sSLEngine);
                        } else {
                            x509TrustManager2.checkServerTrusted(x509CertificateArr, str);
                        }
                        unit = Unit.f27471a;
                    } else {
                        unit = null;
                    }
                    if (unit != null) {
                        Unit unit2 = Unit.f27471a;
                    } else {
                        Log.w("SdkTrustManager", "Custom TrustManager is null");
                        throw e3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
