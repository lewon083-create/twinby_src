package mc;

import android.graphics.Paint;
import android.graphics.Path;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final int[] i = new int[3];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final float[] f28819j = {0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f28820k = new int[4];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final float[] f28821l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f28822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f28823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f28824c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f28825d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f28826e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f28827f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Path f28828g = new Path();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Paint f28829h;

    public a() {
        Paint paint = new Paint();
        this.f28829h = paint;
        Paint paint2 = new Paint();
        this.f28822a = paint2;
        this.f28825d = x1.a.e(-16777216, 68);
        this.f28826e = x1.a.e(-16777216, 20);
        this.f28827f = x1.a.e(-16777216, 0);
        paint2.setColor(this.f28825d);
        paint.setColor(0);
        Paint paint3 = new Paint(4);
        this.f28823b = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.f28824c = new Paint(paint3);
    }
}
