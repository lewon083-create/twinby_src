package e4;

import ad.g1;
import ad.m0;
import android.net.Uri;
import android.util.SparseArray;
import com.google.android.gms.internal.measurement.h5;
import java.io.Closeable;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.net.SocketFactory;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements Closeable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f16147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f16148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f16149d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SocketFactory f16150e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayDeque f16151f = new ArrayDeque();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SparseArray f16152g = new SparseArray();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m0 f16153h = new m0(this);
    public Uri i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public z f16154j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public d8.a f16155k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f16156l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f16157m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public l f16158n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public la.m f16159o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f16160p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f16161q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f16162r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f16163s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f16164t;

    public m(p pVar, p pVar2, String str, Uri uri, SocketFactory socketFactory) {
        Uri uriBuild;
        this.f16147b = pVar;
        this.f16148c = pVar2;
        this.f16149d = str;
        this.f16150e = socketFactory;
        Pattern pattern = a0.f16036a;
        if (uri.getUserInfo() == null) {
            uriBuild = uri;
        } else {
            String encodedAuthority = uri.getEncodedAuthority();
            encodedAuthority.getClass();
            h5.h(encodedAuthority.contains("@"));
            String str2 = m3.z.f28608a;
            uriBuild = uri.buildUpon().encodedAuthority(encodedAuthority.split("@", -1)[1]).build();
        }
        this.i = uriBuild;
        this.f16154j = new z(new a1.e(this));
        this.f16157m = 60000L;
        this.f16155k = a0.d(uri);
        this.f16164t = -9223372036854775807L;
        this.f16160p = -1;
    }

    public static void a(m mVar, androidx.datastore.preferences.protobuf.m mVar2) {
        if (mVar.f16161q) {
            mVar.f16148c.c(mVar2);
            return;
        }
        p pVar = mVar.f16147b;
        String message = mVar2.getMessage();
        if (message == null) {
            message = "";
        }
        pVar.f(message, mVar2);
    }

    public final void b() {
        long jZ;
        q qVar = (q) this.f16151f.pollFirst();
        if (qVar == null) {
            s sVar = (s) this.f16148c.f16169c;
            long j10 = sVar.f16192o;
            if (j10 != -9223372036854775807L) {
                jZ = m3.z.Z(j10);
            } else {
                long j11 = sVar.f16193p;
                jZ = j11 != -9223372036854775807L ? m3.z.Z(j11) : 0L;
            }
            sVar.f16183e.i(jZ);
            return;
        }
        Uri uri = qVar.f16171b.f16065c.f16211b;
        qVar.f16172c.getClass();
        String str = qVar.f16172c;
        String str2 = this.f16156l;
        m0 m0Var = this.f16153h;
        ((m) m0Var.f841e).f16160p = 0;
        ad.q.c("Transport", str);
        m0Var.q(m0Var.m(10, str2, g1.b(1, new Object[]{"Transport", str}, null), uri));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        l lVar = this.f16158n;
        if (lVar != null) {
            lVar.close();
            this.f16158n = null;
            Uri uri = this.i;
            String str = this.f16156l;
            str.getClass();
            m0 m0Var = this.f16153h;
            m mVar = (m) m0Var.f841e;
            int i = mVar.f16160p;
            if (i != -1 && i != 0) {
                mVar.f16160p = 0;
                m0Var.q(m0Var.m(12, str, g1.f796h, uri));
            }
        }
        this.f16154j.close();
    }

    public final Socket d(Uri uri) {
        h5.h(uri.getHost() != null);
        int port = uri.getPort() > 0 ? uri.getPort() : 554;
        String host = uri.getHost();
        host.getClass();
        return this.f16150e.createSocket(host, port);
    }

    public final void h(long j10) {
        if (this.f16160p == 2 && !this.f16163s) {
            Uri uri = this.i;
            String str = this.f16156l;
            str.getClass();
            m0 m0Var = this.f16153h;
            m mVar = (m) m0Var.f841e;
            h5.r(mVar.f16160p == 2);
            m0Var.q(m0Var.m(5, str, g1.f796h, uri));
            mVar.f16163s = true;
        }
        this.f16164t = j10;
    }

    public final void i(long j10) {
        Uri uri = this.i;
        String str = this.f16156l;
        str.getClass();
        m0 m0Var = this.f16153h;
        int i = ((m) m0Var.f841e).f16160p;
        h5.r(i == 1 || i == 2);
        c0 c0Var = c0.f16057c;
        Object[] objArr = {Double.valueOf(j10 / 1000.0d)};
        String str2 = m3.z.f28608a;
        m0Var.q(m0Var.m(6, str, g1.b(1, new Object[]{"Range", String.format(Locale.US, "npt=%.3f-", objArr)}, null), uri));
    }
}
