package p0;

import android.util.Size;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Size f30754a = new Size(0, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Size f30755b = new Size(320, 240);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Size f30756c = new Size(640, 480);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Size f30757d = new Size(720, 480);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Size f30758e = new Size(1280, 720);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Size f30759f = new Size(1920, 1080);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Size f30760g = new Size(1920, 1440);

    static {
        new Size(2560, 1440);
        new Size(3840, 2160);
    }

    public static int a(Size size) {
        return size.getHeight() * size.getWidth();
    }
}
