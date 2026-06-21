package yads;

import android.content.Context;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class xh3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lv0 f44701a = new lv0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final th3 f44702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wh3 f44703c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f44704d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Surface f44705e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f44706f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f44707g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f44708h;
    public float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f44709j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f44710k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f44711l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f44712m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f44713n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f44714o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f44715p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f44716q;

    public xh3(Context context) {
        th3 th3VarA = a(context);
        this.f44702b = th3VarA;
        this.f44703c = th3VarA != null ? wh3.a() : null;
        this.f44710k = -9223372036854775807L;
        this.f44711l = -9223372036854775807L;
        this.f44706f = -1.0f;
        this.i = 1.0f;
        this.f44709j = 0;
    }

    public static th3 a(Context context) {
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        vh3 vh3VarA = lb3.f40466a >= 17 ? vh3.a(applicationContext) : null;
        if (vh3VarA != null) {
            return vh3VarA;
        }
        WindowManager windowManager = (WindowManager) applicationContext.getSystemService("window");
        if (windowManager != null) {
            return new uh3(windowManager);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            r8 = this;
            int r0 = yads.lb3.f40466a
            r1 = 30
            if (r0 < r1) goto L95
            android.view.Surface r0 = r8.f44705e
            if (r0 != 0) goto Lc
            goto L95
        Lc:
            yads.lv0 r0 = r8.f44701a
            yads.kv0 r0 = r0.f40695a
            boolean r0 = r0.a()
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r0 == 0) goto L3b
            yads.lv0 r0 = r8.f44701a
            yads.kv0 r3 = r0.f40695a
            boolean r3 = r3.a()
            if (r3 == 0) goto L39
            yads.kv0 r0 = r0.f40695a
            long r3 = r0.f40352e
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L2d
            goto L30
        L2d:
            long r5 = r0.f40353f
            long r5 = r5 / r3
        L30:
            double r3 = (double) r5
            r5 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            double r5 = r5 / r3
            float r0 = (float) r5
            goto L3d
        L39:
            r0 = r2
            goto L3d
        L3b:
            float r0 = r8.f44706f
        L3d:
            float r3 = r8.f44707g
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r4 != 0) goto L44
            goto L95
        L44:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L86
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L86
            yads.lv0 r1 = r8.f44701a
            yads.kv0 r1 = r1.f40695a
            boolean r1 = r1.a()
            if (r1 == 0) goto L77
            yads.lv0 r1 = r8.f44701a
            yads.kv0 r2 = r1.f40695a
            boolean r2 = r2.a()
            if (r2 == 0) goto L65
            yads.kv0 r1 = r1.f40695a
            long r1 = r1.f40353f
            goto L6a
        L65:
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L6a:
            r3 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 < 0) goto L77
            r1 = 1017370378(0x3ca3d70a, float:0.02)
            goto L79
        L77:
            r1 = 1065353216(0x3f800000, float:1.0)
        L79:
            float r2 = r8.f44707g
            float r2 = r0 - r2
            float r2 = java.lang.Math.abs(r2)
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 < 0) goto L95
            goto L8f
        L86:
            if (r4 == 0) goto L89
            goto L8f
        L89:
            yads.lv0 r2 = r8.f44701a
            int r2 = r2.f40699e
            if (r2 < r1) goto L95
        L8f:
            r8.f44707g = r0
            r0 = 0
            r8.a(r0)
        L95:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.xh3.b():void");
    }

    public final void a() {
        this.f44704d = true;
        this.f44712m = 0L;
        this.f44715p = -1L;
        this.f44713n = -1L;
        if (this.f44702b != null) {
            wh3 wh3Var = this.f44703c;
            wh3Var.getClass();
            wh3Var.f44409c.sendEmptyMessage(1);
            this.f44702b.a(new yi.f0(13, this));
        }
        a(false);
    }

    public final void a(Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            this.f44710k = refreshRate;
            this.f44711l = (refreshRate * 80) / 100;
        } else {
            kh1.d("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            this.f44710k = -9223372036854775807L;
            this.f44711l = -9223372036854775807L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(boolean r4) {
        /*
            r3 = this;
            int r0 = yads.lb3.f40466a
            r1 = 30
            if (r0 < r1) goto L30
            android.view.Surface r0 = r3.f44705e
            if (r0 == 0) goto L30
            int r1 = r3.f44709j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r2) goto L11
            goto L30
        L11:
            boolean r1 = r3.f44704d
            if (r1 == 0) goto L21
            float r1 = r3.f44707g
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 == 0) goto L21
            float r2 = r3.i
            float r1 = r1 * r2
            goto L22
        L21:
            r1 = 0
        L22:
            if (r4 != 0) goto L2b
            float r4 = r3.f44708h
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 != 0) goto L2b
            goto L30
        L2b:
            r3.f44708h = r1
            yads.rh3.a(r0, r1)
        L30:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.xh3.a(boolean):void");
    }
}
