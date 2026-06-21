package yads;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class bu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f37144a = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f37145b = Charset.forName("ISO-8859-1");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Charset f37146c = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Charset f37147d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Charset f37148e;

    static {
        Charset.forName("UTF-16BE");
        f37147d = Charset.forName("UTF-16LE");
        f37148e = Charset.forName("UTF-16");
    }
}
