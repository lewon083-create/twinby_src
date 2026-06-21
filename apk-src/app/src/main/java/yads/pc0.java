package yads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class pc0 implements p30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f41884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f41885b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p30 f41886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public dv0 f41887d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public zi f41888e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public pz f41889f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p30 f41890g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public da3 f41891h;
    public m30 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public dm2 f41892j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public p30 f41893k;

    public pc0(Context context, p30 p30Var) {
        this.f41884a = context.getApplicationContext();
        this.f41886c = (p30) ni.a(p30Var);
    }

    public final void a(p30 p30Var) {
        for (int i = 0; i < this.f41885b.size(); i++) {
            p30Var.a((u83) this.f41885b.get(i));
        }
    }

    @Override // yads.p30
    public final void close() {
        p30 p30Var = this.f41893k;
        if (p30Var != null) {
            try {
                p30Var.close();
            } finally {
                this.f41893k = null;
            }
        }
    }

    @Override // yads.p30
    public final Map getResponseHeaders() {
        p30 p30Var = this.f41893k;
        return p30Var == null ? Collections.EMPTY_MAP : p30Var.getResponseHeaders();
    }

    @Override // yads.p30
    public final Uri getUri() {
        p30 p30Var = this.f41893k;
        if (p30Var == null) {
            return null;
        }
        return p30Var.getUri();
    }

    @Override // yads.l30
    public final int read(byte[] bArr, int i, int i10) {
        p30 p30Var = this.f41893k;
        p30Var.getClass();
        return p30Var.read(bArr, i, i10);
    }

    @Override // yads.p30
    public final void a(u83 u83Var) {
        u83Var.getClass();
        this.f41886c.a(u83Var);
        this.f41885b.add(u83Var);
        dv0 dv0Var = this.f41887d;
        if (dv0Var != null) {
            dv0Var.a(u83Var);
        }
        zi ziVar = this.f41888e;
        if (ziVar != null) {
            ziVar.a(u83Var);
        }
        pz pzVar = this.f41889f;
        if (pzVar != null) {
            pzVar.a(u83Var);
        }
        p30 p30Var = this.f41890g;
        if (p30Var != null) {
            p30Var.a(u83Var);
        }
        da3 da3Var = this.f41891h;
        if (da3Var != null) {
            da3Var.a(u83Var);
        }
        m30 m30Var = this.i;
        if (m30Var != null) {
            m30Var.a(u83Var);
        }
        dm2 dm2Var = this.f41892j;
        if (dm2Var != null) {
            dm2Var.a(u83Var);
        }
    }

    @Override // yads.p30
    public final long a(u30 u30Var) {
        if (this.f41893k == null) {
            String scheme = u30Var.f43533a.getScheme();
            Uri uri = u30Var.f43533a;
            int i = lb3.f40466a;
            String scheme2 = uri.getScheme();
            if (!TextUtils.isEmpty(scheme2) && !"file".equals(scheme2)) {
                if ("asset".equals(scheme)) {
                    if (this.f41888e == null) {
                        zi ziVar = new zi(this.f41884a);
                        this.f41888e = ziVar;
                        a(ziVar);
                    }
                    this.f41893k = this.f41888e;
                } else if ("content".equals(scheme)) {
                    if (this.f41889f == null) {
                        pz pzVar = new pz(this.f41884a);
                        this.f41889f = pzVar;
                        a(pzVar);
                    }
                    this.f41893k = this.f41889f;
                } else if ("rtmp".equals(scheme)) {
                    if (this.f41890g == null) {
                        try {
                            p30 p30Var = (p30) Class.forName("com.monetization.ads.exo.ext.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                            this.f41890g = p30Var;
                            a(p30Var);
                        } catch (ClassNotFoundException unused) {
                            kh1.d("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                        } catch (Exception e3) {
                            throw new RuntimeException("Error instantiating RTMP extension", e3);
                        }
                        if (this.f41890g == null) {
                            this.f41890g = this.f41886c;
                        }
                    }
                    this.f41893k = this.f41890g;
                } else if ("udp".equals(scheme)) {
                    if (this.f41891h == null) {
                        da3 da3Var = new da3(0);
                        this.f41891h = da3Var;
                        a(da3Var);
                    }
                    this.f41893k = this.f41891h;
                } else if ("data".equals(scheme)) {
                    if (this.i == null) {
                        m30 m30Var = new m30();
                        this.i = m30Var;
                        a(m30Var);
                    }
                    this.f41893k = this.i;
                } else if (!"rawresource".equals(scheme) && !"android.resource".equals(scheme)) {
                    this.f41893k = this.f41886c;
                } else {
                    if (this.f41892j == null) {
                        dm2 dm2Var = new dm2(this.f41884a);
                        this.f41892j = dm2Var;
                        a(dm2Var);
                    }
                    this.f41893k = this.f41892j;
                }
            } else {
                String path = u30Var.f43533a.getPath();
                if (path != null && path.startsWith("/android_asset/")) {
                    if (this.f41888e == null) {
                        zi ziVar2 = new zi(this.f41884a);
                        this.f41888e = ziVar2;
                        a(ziVar2);
                    }
                    this.f41893k = this.f41888e;
                } else {
                    if (this.f41887d == null) {
                        dv0 dv0Var = new dv0();
                        this.f41887d = dv0Var;
                        a(dv0Var);
                    }
                    this.f41893k = this.f41887d;
                }
            }
            return this.f41893k.a(u30Var);
        }
        throw new IllegalStateException();
    }
}
