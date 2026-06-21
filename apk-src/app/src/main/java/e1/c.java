package e1;

import android.util.Size;
import com.google.android.gms.internal.ads.em0;
import com.google.android.gms.internal.ads.om0;
import com.google.android.gms.internal.ads.om1;
import com.google.android.gms.internal.ads.rm0;
import com.google.android.gms.internal.ads.ym0;
import g0.s2;
import j3.m0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f15908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f15909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f15910c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f15911d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f15912e = new m0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f15913f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f15914g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f15915h;
    public Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f15916j;

    public c(s3.y yVar, s3.t tVar, m3.t tVar2, int i, int i10, int i11, int i12) {
        this.f15908a = yVar;
        this.f15910c = tVar;
        this.f15911d = tVar2;
        this.f15913f = tVar2.a(yVar.f32715u, new m3.j(1, this));
        this.f15914g = new em0(i, this);
        this.f15915h = new om0(i10, this);
        this.i = new rm0(i11, this);
        this.f15916j = new ym0(i12, this);
        m3.r rVar = new m3.r(this);
        this.f15909b = rVar;
        yVar.f32708n.a(rVar);
    }

    public d a() {
        String strX = ((String) this.f15908a) == null ? " mimeType" : "";
        if (((Integer) this.f15909b) == null) {
            strX = strX.concat(" profile");
        }
        if (((s2) this.f15915h) == null) {
            strX = om1.x(strX, " inputTimebase");
        }
        if (((Size) this.i) == null) {
            strX = om1.x(strX, " resolution");
        }
        if (((Integer) this.f15910c) == null) {
            strX = om1.x(strX, " colorFormat");
        }
        if (((e) this.f15916j) == null) {
            strX = om1.x(strX, " dataSpace");
        }
        if (((Integer) this.f15911d) == null) {
            strX = om1.x(strX, " captureFrameRate");
        }
        if (((Integer) this.f15912e) == null) {
            strX = om1.x(strX, " encodeFrameRate");
        }
        if (((Integer) this.f15913f) == null) {
            strX = om1.x(strX, " IFrameInterval");
        }
        if (((Integer) this.f15914g) == null) {
            strX = om1.x(strX, " bitrate");
        }
        if (strX.isEmpty()) {
            return new d((String) this.f15908a, ((Integer) this.f15909b).intValue(), (s2) this.f15915h, (Size) this.i, ((Integer) this.f15910c).intValue(), (e) this.f15916j, ((Integer) this.f15911d).intValue(), ((Integer) this.f15912e).intValue(), ((Integer) this.f15913f).intValue(), ((Integer) this.f15914g).intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(strX));
    }
}
