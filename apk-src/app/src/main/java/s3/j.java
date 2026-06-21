package s3;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.internal.measurement.h5;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f32559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m3.t f32560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public zc.p f32561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public zc.p f32562d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public zc.p f32563e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k3.c f32564f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Looper f32565g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f32566h;
    public final j3.d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f32567j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f32568k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c1 f32569l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b1 f32570m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final d f32571n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f32572o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f32573p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f32574q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f32575r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f32576s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f32577t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f32578u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f32579v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f32580w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f32581x;

    public j(Context context) {
        k3.c cVar = new k3.c(context, 1);
        k3.c cVar2 = new k3.c(context, 2);
        k3.c cVar3 = new k3.c(context, 3);
        k3.c cVar4 = new k3.c(context, 4);
        context.getClass();
        this.f32559a = context;
        this.f32561c = cVar;
        this.f32562d = cVar2;
        this.f32563e = cVar3;
        this.f32564f = cVar4;
        String str = m3.z.f28608a;
        Looper looperMyLooper = Looper.myLooper();
        this.f32565g = looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper;
        this.i = j3.d.f26224c;
        this.f32567j = 1;
        this.f32568k = true;
        this.f32569l = c1.f32471d;
        this.f32570m = b1.f32457b;
        this.f32571n = new d(m3.z.M(20L), m3.z.M(500L));
        this.f32560b = m3.t.f28598a;
        this.f32572o = 500L;
        this.f32573p = 2000L;
        this.f32574q = 600000;
        this.f32575r = l.Z1;
        this.f32576s = 60000;
        this.f32577t = 600000;
        this.f32578u = true;
        this.f32580w = "";
        this.f32566h = -1000;
        new ob.z();
        this.f32581x = true;
    }

    public final y a() {
        h5.r(!this.f32579v);
        this.f32579v = true;
        return new y(this);
    }
}
