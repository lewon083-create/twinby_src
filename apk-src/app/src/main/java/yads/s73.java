package yads;

import android.content.Context;
import android.graphics.Point;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class s73 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f42832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f42833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f42834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f42835d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f42836e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f42837f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f42838g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f42839h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f42840j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f42841k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final r51 f42842l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f42843m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final r51 f42844n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f42845o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f42846p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f42847q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final r51 f42848r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public r51 f42849s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f42850t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f42851u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f42852v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f42853w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f42854x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final HashMap f42855y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final HashSet f42856z;

    public s73() {
        this.f42832a = Integer.MAX_VALUE;
        this.f42833b = Integer.MAX_VALUE;
        this.f42834c = Integer.MAX_VALUE;
        this.f42835d = Integer.MAX_VALUE;
        this.i = Integer.MAX_VALUE;
        this.f42840j = Integer.MAX_VALUE;
        this.f42841k = true;
        this.f42842l = r51.g();
        this.f42843m = 0;
        this.f42844n = r51.g();
        this.f42845o = 0;
        this.f42846p = Integer.MAX_VALUE;
        this.f42847q = Integer.MAX_VALUE;
        this.f42848r = r51.g();
        this.f42849s = r51.g();
        this.f42850t = 0;
        this.f42851u = 0;
        this.f42852v = false;
        this.f42853w = false;
        this.f42854x = false;
        this.f42855y = new HashMap();
        this.f42856z = new HashSet();
    }

    public s73 a(int i, int i10) {
        this.i = i;
        this.f42840j = i10;
        this.f42841k = true;
        return this;
    }

    public void b(Context context) {
        Point pointC = lb3.c(context);
        a(pointC.x, pointC.y);
    }

    public void a(Context context) {
        CaptioningManager captioningManager;
        int i = lb3.f40466a;
        if (i >= 19) {
            if ((i >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                this.f42850t = 1088;
                Locale locale = captioningManager.getLocale();
                if (locale != null) {
                    this.f42849s = r51.a(lb3.a(locale));
                }
            }
        }
    }

    public s73(Context context) {
        this();
        a(context);
        b(context);
    }
}
