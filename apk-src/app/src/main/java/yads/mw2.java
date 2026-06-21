package yads;

import android.util.Log;
import com.yandex.mobile.ads.R$raw;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import javax.net.ssl.X509TrustManager;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class mw2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u20 f41054a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public KeyStore f41056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public X509TrustManager f41057d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ij.g f41055b = ij.h.b(lw2.f40708b);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f41058e = new Object();

    public mw2(u20 u20Var) {
        this.f41054a = u20Var;
    }

    public final void a(X509Certificate[] x509CertificateArr, String str) {
        Unit unit;
        try {
            ((X509TrustManager) this.f41055b.getValue()).checkServerTrusted(x509CertificateArr, str);
        } catch (CertificateException e3) {
            synchronized (this.f41058e) {
                try {
                    a();
                    b();
                    X509TrustManager x509TrustManager = this.f41057d;
                    if (x509TrustManager != null) {
                        x509TrustManager.checkServerTrusted(x509CertificateArr, str);
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

    public final void b() {
        if (!Thread.holdsLock(this.f41058e)) {
            throw new IllegalStateException("Operation should be performed under lock");
        }
    }

    public final void a() {
        KeyStore keyStore;
        X509Certificate x509Certificate;
        b();
        b();
        if (this.f41056c == null) {
            ij.g gVar = e93.f38048a;
            KeyStore keyStore2 = null;
            try {
                keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
                try {
                    keyStore.load(null);
                } catch (IOException unused) {
                }
            } catch (GeneralSecurityException unused2) {
                keyStore = null;
            }
            if (keyStore == null) {
                Log.w("SdkTrustManager", "Custom KeyStore is null, failed to add certs");
            } else {
                nt2 nt2Var = (nt2) this.f41054a;
                nt2Var.getClass();
                try {
                    InputStream inputStreamOpenRawResource = nt2Var.f41352b.getResources().openRawResource(R$raw.monetization_ads_sdkinternalca);
                    try {
                        byte[] bArrW = hl.d.w(inputStreamOpenRawResource);
                        inputStreamOpenRawResource.close();
                        try {
                            inputStreamOpenRawResource = nt2Var.f37123a.getResources().openRawResource(R$raw.monetization_ads_bundled_cert);
                            try {
                                byte[] bArrW2 = hl.d.w(inputStreamOpenRawResource);
                                inputStreamOpenRawResource.close();
                                byte[][] bArr = {bArrW2};
                                byte[][] elements = {bArrW};
                                Intrinsics.checkNotNullParameter(bArr, "<this>");
                                Intrinsics.checkNotNullParameter(elements, "elements");
                                Object[] objArrCopyOf = Arrays.copyOf(bArr, 2);
                                System.arraycopy(elements, 0, objArrCopyOf, 1, 1);
                                Intrinsics.b(objArrCopyOf);
                                ArrayList arrayList = new ArrayList();
                                for (byte[] bArr2 : (byte[][]) objArrCopyOf) {
                                    ij.g gVar2 = e93.f38048a;
                                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                    try {
                                        CertificateFactory certificateFactory = (CertificateFactory) e93.f38048a.getValue();
                                        x509Certificate = (X509Certificate) (certificateFactory != null ? certificateFactory.generateCertificate(byteArrayInputStream) : null);
                                    } catch (CertificateException unused3) {
                                        x509Certificate = null;
                                    }
                                    if (x509Certificate != null) {
                                        arrayList.add(x509Certificate);
                                    }
                                }
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    a(keyStore, (X509Certificate) it.next());
                                }
                                keyStore2 = keyStore;
                            } finally {
                            }
                        } catch (IOException e3) {
                            throw new IllegalStateException("Failed to create cert", e3);
                        }
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                } catch (IOException e7) {
                    throw new IllegalStateException("Failed to create cert", e7);
                }
            }
            this.f41056c = keyStore2;
        }
        b();
        if (this.f41057d == null) {
            b();
            if (this.f41056c != null) {
                b();
                this.f41057d = e93.a(this.f41056c);
            }
        }
    }

    public static void a(KeyStore keyStore, X509Certificate x509Certificate) {
        try {
            keyStore.setCertificateEntry("custom_cert_" + keyStore.size(), x509Certificate);
        } catch (KeyStoreException e3) {
            Log.w("SdkTrustManager", "Failed to store certificate", e3);
        }
    }
}
