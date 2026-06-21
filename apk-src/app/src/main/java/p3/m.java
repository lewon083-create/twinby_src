package p3;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.h5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f31180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f31181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f31182d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public s f31183e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b f31184f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e f31185g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public h f31186h;
    public g0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public f f31187j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b0 f31188k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public h f31189l;

    public m(Context context, h hVar) {
        this.f31180b = context.getApplicationContext();
        hVar.getClass();
        this.f31182d = hVar;
        this.f31181c = new ArrayList();
    }

    public static void b(h hVar, e0 e0Var) {
        if (hVar != null) {
            hVar.addTransferListener(e0Var);
        }
    }

    public final void a(h hVar) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f31181c;
            if (i >= arrayList.size()) {
                return;
            }
            hVar.addTransferListener((e0) arrayList.get(i));
            i++;
        }
    }

    @Override // p3.h
    public final void addTransferListener(e0 e0Var) {
        e0Var.getClass();
        this.f31182d.addTransferListener(e0Var);
        this.f31181c.add(e0Var);
        b(this.f31183e, e0Var);
        b(this.f31184f, e0Var);
        b(this.f31185g, e0Var);
        b(this.f31186h, e0Var);
        b(this.i, e0Var);
        b(this.f31187j, e0Var);
        b(this.f31188k, e0Var);
    }

    @Override // p3.h
    public final void close() {
        h hVar = this.f31189l;
        if (hVar != null) {
            try {
                hVar.close();
            } finally {
                this.f31189l = null;
            }
        }
    }

    @Override // p3.h
    public final Map getResponseHeaders() {
        h hVar = this.f31189l;
        return hVar == null ? Collections.EMPTY_MAP : hVar.getResponseHeaders();
    }

    @Override // p3.h
    public final Uri getUri() {
        h hVar = this.f31189l;
        if (hVar == null) {
            return null;
        }
        return hVar.getUri();
    }

    @Override // p3.h
    public final long open(l lVar) {
        h5.r(this.f31189l == null);
        Uri uri = lVar.f31172a;
        String scheme = uri.getScheme();
        String str = m3.z.f28608a;
        String scheme2 = uri.getScheme();
        boolean zIsEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.f31180b;
        if (zIsEmpty || Objects.equals(scheme2, "file")) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.f31183e == null) {
                    s sVar = new s(false);
                    this.f31183e = sVar;
                    a(sVar);
                }
                this.f31189l = this.f31183e;
            } else {
                if (this.f31184f == null) {
                    b bVar = new b(context);
                    this.f31184f = bVar;
                    a(bVar);
                }
                this.f31189l = this.f31184f;
            }
        } else if ("asset".equals(scheme)) {
            if (this.f31184f == null) {
                b bVar2 = new b(context);
                this.f31184f = bVar2;
                a(bVar2);
            }
            this.f31189l = this.f31184f;
        } else if ("content".equals(scheme)) {
            if (this.f31185g == null) {
                e eVar = new e(context);
                this.f31185g = eVar;
                a(eVar);
            }
            this.f31189l = this.f31185g;
        } else {
            boolean zEquals = "rtmp".equals(scheme);
            h hVar = this.f31182d;
            if (zEquals) {
                if (this.f31186h == null) {
                    try {
                        h hVar2 = (h) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                        this.f31186h = hVar2;
                        a(hVar2);
                    } catch (ClassNotFoundException unused) {
                        m3.b.s("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e3) {
                        throw new RuntimeException("Error instantiating RTMP extension", e3);
                    }
                    if (this.f31186h == null) {
                        this.f31186h = hVar;
                    }
                }
                this.f31189l = this.f31186h;
            } else if ("udp".equals(scheme)) {
                if (this.i == null) {
                    g0 g0Var = new g0(8000);
                    this.i = g0Var;
                    a(g0Var);
                }
                this.f31189l = this.i;
            } else if ("data".equals(scheme)) {
                if (this.f31187j == null) {
                    f fVar = new f(false);
                    this.f31187j = fVar;
                    a(fVar);
                }
                this.f31189l = this.f31187j;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.f31188k == null) {
                    b0 b0Var = new b0(context);
                    this.f31188k = b0Var;
                    a(b0Var);
                }
                this.f31189l = this.f31188k;
            } else {
                this.f31189l = hVar;
            }
        }
        return this.f31189l.open(lVar);
    }

    @Override // j3.h
    public final int read(byte[] bArr, int i, int i10) {
        h hVar = this.f31189l;
        hVar.getClass();
        return hVar.read(bArr, i, i10);
    }
}
